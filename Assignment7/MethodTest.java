/*
Author: Khoa Bui
Version: 0.1
Exercise 1: Implement a generic method called count() to count the number of elements in a list of generic elements
 */
import java.util.ArrayList;
import java.util.List;
public class MethodTest {
    public static  <T> int Count(List<T> list) {
        return list.size();
    }

    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();

        //5 strings
        stringList.add("Hello");
        stringList.add("CS151");
        stringList.add("My");
        stringList.add("name");
        stringList.add("Khoa");

        //6 integers
        integerList.add(2);
        integerList.add(3);
        integerList.add(5);
        integerList.add(8);
        integerList.add(10);
        integerList.add(23);

        //8 doubles
        doubleList.add(0.12);
        doubleList.add(0.32);
        doubleList.add(1.4);
        doubleList.add(3.24);
        doubleList.add(4.32);
        doubleList.add(22.3);
        doubleList.add(1.5);
        doubleList.add(14.32);

    //  print the result to command line.

        System.out.println("String List Count: " + Count(stringList));
        System.out.println("Integer List Count: " + Count(integerList));
        System.out.println("Double List Count: " + Count(doubleList));

    }

}
