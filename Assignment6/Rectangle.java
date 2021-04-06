/*
Assignment 6
Author: Khoa Bui
Version: 1.0
 */
public class Rectangle extends Shape{
    private double Height;
    protected Rectangle(double width, double height) {
        super(width);
        Height=height;
    }
    public void setHeight(double height)
    {
        Height=height;
    }
    public double getHeight()
    {
        return Height;
    }

    @Override
    public double computeArea() {
        return getWidth()*getHeight();
    }
    @Override
    public String toString()
    {
        return "rectangle with width: "+getWidth()+" and height: "+getHeight();
    }
    public void run()
    {
        System.out.println("The area of "+toString()+" is:" +computeArea());
    }
}
