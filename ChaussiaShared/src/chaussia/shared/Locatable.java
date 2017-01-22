package chaussia.shared;

import javafx.geometry.Point2D;

public interface Locatable
{
    int getX();

    void setX(int x);

    int getY();

    void setY(int y);

    Point2D getCoordinates();

    void setCoordinates(int x, int y);

    void setCoordinates(Point2D coordinates);

}
