/*
Assignment 6
Author: Khoa Bui
Version: 1.0
 */
import java.util.ArrayList;

public class Shapes {
    //exercise 1
    public ArrayList<Shape> shapeArrayList ;
    public Shapes()
    {
        shapeArrayList= new ArrayList<>();
    }
    public Shapes(ArrayList<Shape> shapeList)
    {
        shapeArrayList = shapeList;
    }
    public void add(Shape shape)
    {
        shapeArrayList.add(shape);
    }
    public void remove(Shape shape)
    {
        shapeArrayList.remove(shape);
    }
    public ArrayList<Shape> getShapeArrayList()
    {
        return shapeArrayList;
    }
    public void setShapeArrayList(ArrayList<Shape> shapeList)
    {
        shapeArrayList=shapeList;
    }
    synchronized public void compute()
    {
        System.out.println("Shape of arraylist is:");
        for (Shape s:shapeArrayList)
            s.start();
    }
    //exercise 2
    public Shape max()
    {
        double maxArea=0;
        Shape maxShape=null;
        for (Shape s: shapeArrayList)
        {
            if (s.computeArea()>= maxArea) {
                maxArea = s.computeArea();
                maxShape= s;
            }
        }
        return maxShape;
    }
    public Shape min()
    {
        double minArea= shapeArrayList.get(0).computeArea();
        Shape minShape=null;
        for (Shape s: shapeArrayList)
        {
            if (s.computeArea() <minArea) {
                minArea = s.computeArea();
                minShape= s;
                }
        }
        return minShape;
    }


}
