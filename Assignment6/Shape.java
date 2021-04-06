/*
Assignment 6
Author: Khoa Bui
Version: 1.0
 */
import java.io.Serializable;

public abstract class Shape extends Thread implements Serializable {

    private double Width;

    protected Shape(double width) {
        setWidth(width);
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public abstract double computeArea();

}
