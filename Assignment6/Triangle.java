/*
Assignment 6
Author: Khoa Bui
Version: 1.0
 */
public class Triangle extends Shape{
    private double Height;
    protected Triangle(double width,double height) {
        super(width);
        Height=height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public double getHeight() {
        return Height;
    }

    @Override
    public double computeArea() {
        return (getHeight()*getWidth())/2;
    }
    @Override
    public String toString()
    {
        return "the triangle with width "+getWidth()+ " height "+getHeight();
    }
    @Override
    public void run()
    {
        System.out.println("The area of "+toString()+" is:"+computeArea());
    }

}
