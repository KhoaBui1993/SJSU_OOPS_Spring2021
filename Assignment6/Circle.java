/*
Assignment 6
Author: Khoa Bui
Version: 1.0
 */
public class Circle extends Shape{
    protected Circle(double width) {
        super(width);
    }

    @Override
    public String toString() {
        return "The circle radius is: "+ getWidth();
    }

    @Override
    public double computeArea() {
        return Math.PI*Math.pow(getWidth(),2);
    }
    @Override
    public void run()
    {
        System.out.println("The area of "+toString()+" is: "+computeArea());
    }

}
