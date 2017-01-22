package worldeditor;

import java.io.File;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application
{
    public static final double WIDTH         = 64.0;
    public static final double HEIGHT        = 64.0;
    public static final File   MAP_DIRECTORY = new File("maps");
    public static final String TEXTURES_DIR  = "file:textures/";

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Scene scene = new Scene(this.createContent());
        scene.getStylesheets().add(this.getClass().getResource("application.css").toExternalForm());
        primaryStage.setTitle("World Editor");
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    private Parent createContent()
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("Root.fxml"));
        Pane pane = new Pane();
        try
        {
            pane = loader.load();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return pane;
    }

    public static void main(String[] args)
    {
        Application.launch(args);
    }

}
