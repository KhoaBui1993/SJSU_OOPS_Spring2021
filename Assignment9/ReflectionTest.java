/*
Homework 9
Version: 0.1
Author: Khoa Bui
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;


public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Method[] publicMethod_person = Class.forName("Person").getDeclaredMethods();
    //prints declare methods
        System.out.println("Display all the declare method of person class:");
        for (Method s:publicMethod_person) {
            Class[] parameters = s.getParameterTypes();
            if (parameters.length == 0)
                System.out.println(s + " has 0 parameters");
            else {
                System.out.println(s + " has " + parameters.length + " parameter(s) of the following types:");
                System.out.println(" +" + s.toString() + " has parameter type: " + Arrays.toString(s.getParameterTypes()));
            }
        }
    //prints all methods
        Method[] publicMethod_address = Class.forName("Address").getMethods();
        System.out.println("Display all the method of Address class:");
        for (Method s:publicMethod_address){
            Class[] parameters = s.getParameterTypes();
        if (parameters.length == 0)
            System.out.println(s + " has 0 parameters");
        else {
            System.out.println(s + " has " + parameters.length + " parameter(s) of the following types:");
            System.out.println(" +" + s.toString() + " has parameter type: " + Arrays.toString(s.getParameterTypes()));
        }
    }
    //prints all fields declared
        Field[] Field_person = Class.forName("Address").getDeclaredFields();
        System.out.println("Display all the Declare field of Address class:");
        for (Field s:Field_person)
            System.out.println(" +"+s.toString());
    //Create 3 new instances of class Person
        try {
            Constructor<Address> addressConstructor= Address.class.getConstructor(int.class,String.class,String.class,String.class,String.class);
            Constructor<Person> personConstructor=Person.class.getConstructor(String.class,String.class,int.class,String.class,Address.class);
            Address Address1= addressConstructor.newInstance(1,"Sessions dr","SanJose","CA","95111");
            Person personInstance1= personConstructor.newInstance("A","Bui",12,"123",Address1);
            Address Address2= addressConstructor.newInstance(2,"Sessions dr","SanJose","CA","95112");
            Person personInstance2= personConstructor.newInstance("B","Bui",13,"456",Address2);
            Address Address3= addressConstructor.newInstance(3,"Sessions dr","SanJose","CA","95113");
            Person personInstance3= Person.class.newInstance();
            personInstance3.setFirstName("C");
            personInstance3.setLastName("Bui");
            personInstance3.setAge(32);
            personInstance3.setSSN("789");
            personInstance3.setAddress(Address3);
            System.out.println("Information of 3 instance person:");
            System.out.println("1st Person: "+personInstance1.toString());
            System.out.println("2nd Person: "+personInstance2.toString());
            System.out.println("3rd Person: "+personInstance3.toString());
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }



    }
}
