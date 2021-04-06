/*
Assignment 6
Author: Khoa Bui
Version: 1.0
 */
public class Hexagon extends Shape{
    protected Hexagon(double width) {
        super(width);
    }
    @Override
    public String toString()
    {
        return "The hexagon with width "+getWidth();
    }

    @Override
    public double computeArea() {
        return 3*Math.sqrt(3)*Math.pow(getWidth(),2)/2;
    }
    @Override
    public void run()
    {
        System.out.println("The area of "+toString()+" is: "+computeArea() );
    }
}
