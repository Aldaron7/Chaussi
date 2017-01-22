package worldeditor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import framedimageview.FramedImageView;
import javafx.beans.property.MapProperty;
import javafx.beans.property.SimpleMapProperty;
import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import worldeditor.landschaft.Gebirge;
import worldeditor.landschaft.Landschaft;
import worldeditor.landschaft.Lehm;
import worldeditor.landschaft.Wald;
import worldeditor.landschaft.Wiese;

public class RootController
{
    @FXML
    private TextField                  zeilenTF, spaltenTF;
    @FXML
    private Label                      nachrichtL;
    @FXML
    private FramedImageView            gebirgeIV, waldIV, lehmIV, wieseIV;
    @FXML
    private AnchorPane                 editorAP;
    @FXML
    private CheckMenuItem              toggleGridME;

    private FramedImageView            selectedNode;
    private MapProperty<Point2D, Node> landschaftsNodes    = new SimpleMapProperty<>(FXCollections.observableHashMap());
    private Integer                    zeilen              = 15;
    private Integer                    spalten             = 20;
    private Map<Landschaft, Image>     mapLandschaft2Image = new HashMap<>();
    private Landschaft[][]             karte;

    @FXML
    private void initialize()
    {
        this.initLandschaften();
        this.updateSize();
        this.selectedNode = this.wieseIV;
        this.wieseIV.getFrame().setStroke(Color.LIME);
        this.landschaftsNodes.addListener((obs, o, n) -> {
            this.editorAP.getChildren().setAll(n.values());
        });
        this.drawKarte();
    }

    private void initLandschaften()
    {
        this.initLandschaft(new Gebirge(), this.gebirgeIV, "gebirge");
        this.initLandschaft(new Lehm(), this.lehmIV, "lehm");
        this.initLandschaft(new Wald(), this.waldIV, "wald");
        this.initLandschaft(new Wiese(), this.wieseIV, "wiese");
    }

    private void initLandschaft(Landschaft landschaft, FramedImageView framedImageView, String imageName)
    {
        Image image = new Image(Main.TEXTURES_DIR + imageName + ".png");
        framedImageView.setUserData(landschaft);
        framedImageView.setImage(image);
        this.mapLandschaft2Image.put(landschaft, image);
    }

    private void drawKarte()
    {
        this.landschaftsNodes.clear();
        for (int i = 0; i < this.zeilen; i++)
        {
            for (int j = 0; j < this.spalten; j++)
            {
                Landschaft landschaft = this.karte == null ? new Wiese() : this.karte[i][j];
                this.createNode(i, j, landschaft);
            }
        }
        this.toggleGrid();
    }

    private void createNode(int zeile, int spalte, Landschaft landschaft)
    {
        FramedImageView framedimageView = new FramedImageView();
        framedimageView.setLayoutX(spalte * Main.WIDTH);
        framedimageView.setLayoutY(zeile * Main.HEIGHT);
        framedimageView.setFitHeight(Main.HEIGHT);
        framedimageView.setFitWidth(Main.WIDTH);
        framedimageView.setUserData(landschaft);
        framedimageView.setImage(this.mapLandschaft2Image.get(landschaft));
        framedimageView.getFrame().setStroke(null);
        framedimageView.setOnMouseEntered(e -> {
            if (e.isControlDown())
            {
                this.changeLandschaft(framedimageView);
            }
        });
        framedimageView.setOnMouseClicked(e -> {
            if (e.getButton().equals(MouseButton.PRIMARY))
            {
                this.changeLandschaft(framedimageView);
            }
        });
        this.landschaftsNodes.put(new Point2D(zeile, spalte), framedimageView);
    }

    private void changeLandschaft(FramedImageView framedImageView)
    {
        framedImageView.setImage(this.selectedNode.getImageView().getImage());
        framedImageView.setUserData(this.selectedNode.getUserData());
    }

    @FXML
    private void addZeile()
    {
        for (int j = 0; j < this.spalten; j++)
        {
            this.createNode(this.zeilen, j, new Wiese());
        }
        this.zeilen++;
        this.updateSize();
    }

    @FXML
    private void removeZeile()
    {
        if (this.zeilen > 1)
        {
            this.zeilen--;
            for (int j = 0; j < this.spalten; j++)
            {
                this.landschaftsNodes.remove(new Point2D(this.zeilen, j));
            }
            this.updateSize();
        }
    }

    @FXML
    private void addSpalte()
    {
        for (int i = 0; i < this.zeilen; i++)
        {
            this.createNode(i, this.spalten, new Wiese());
        }
        this.spalten++;
        this.updateSize();
    }

    @FXML
    private void removeSpalte()
    {
        if (this.spalten > 1)
        {
            this.spalten--;
            for (int i = 0; i < this.zeilen; i++)
            {
                this.landschaftsNodes.remove(new Point2D(i, this.spalten));
            }
            this.updateSize();
        }
    }

    @FXML
    private void landschaftClicked(Event event)
    {
        this.selectedNode.getFrame().setStroke(Color.BLACK);
        this.selectedNode = ((FramedImageView) event.getSource());
        this.selectedNode.getFrame().setStroke(Color.LIME);
    }

    @FXML
    private void clearKarte()
    {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setContentText("Wollen Sie die Karte wirklich leeren?");
        alert.showAndWait().ifPresent(c -> {
            if (c.getButtonData().equals(ButtonData.OK_DONE))
            {
                this.karte = null;
                this.drawKarte();
            }
        });
    }

    private void updateSize()
    {
        this.zeilenTF.setText(this.zeilen.toString());
        this.spaltenTF.setText(this.spalten.toString());
        this.toggleGrid();
    }

    @FXML
    private void karteExportieren()
    {
        this.karte = new Landschaft[this.zeilen][this.spalten];
        this.landschaftsNodes.keySet().forEach(p -> {
            int zeile = (int) p.getX();
            int spalte = (int) p.getY();
            this.karte[zeile][spalte] = (Landschaft) this.landschaftsNodes.get(p).getUserData();
        });
        try
        {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setInitialDirectory(Main.MAP_DIRECTORY);
            fileChooser.setSelectedExtensionFilter(new ExtensionFilter("Chaussia Map", "*.map"));
            fileChooser.setInitialFileName("karte" + (Main.MAP_DIRECTORY.listFiles().length + 1) + ".map");
            File file = fileChooser.showSaveDialog(null);
            if (file != null)
            {
                file = file.getName().endsWith(".map") ? file : new File(file.getPath() + ".map");
                Path path = file.toPath();
                OutputStream os = Files.newOutputStream(path);
                ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(os));
                oos.writeObject(this.karte);
                this.nachrichtL.setText("Karte gespeichert unter: " + file);
                oos.flush();
                oos.close();
                os.close();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
            this.nachrichtL.setText("Karte konnte nicht gespeichert werden.");
        }
    }

    @FXML
    private void karteImportieren()
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(Main.MAP_DIRECTORY);
        fileChooser.setSelectedExtensionFilter(new ExtensionFilter("Chaussia Map", "*.map"));
        File file = fileChooser.showOpenDialog(null);
        if (file != null)
        {
            try
            {
                Path path = file.toPath();
                InputStream is = Files.newInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(is));
                this.karte = (Landschaft[][]) ois.readObject();
                this.zeilen = this.karte.length;
                this.spalten = this.karte[0].length;
                this.updateSize();
                this.drawKarte();
                ois.close();
                is.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
                this.nachrichtL.setText("Karte konnte nicht geladen werden.");
            }
        }
    }

    @FXML
    private void toggleGrid()
    {
        Paint paint = this.toggleGridME.isSelected() ? Color.BLACK : null;
        this.landschaftsNodes.values().forEach(c -> ((FramedImageView) c).getFrame().setStroke(paint));
    }

    @SuppressWarnings("unused")
    private void printKarte(Landschaft[][] karte)
    {
        for (int i = 0; i < karte.length; i++)
        {
            for (int j = 0; j < karte[i].length; j++)
            {
                System.out.print(karte[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
