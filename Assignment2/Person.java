/*
Author: Khoa Bui
Version: 0.1
Description: Exercise 3, Person class. this file create the person class with all attribute and make the Employee class
inherited all attribute and method from this class.
*/
public class Person {
    private String FirstName;
    private String LastName;
    private int Age;
    private int SSN;
    private String Address;
    private String Gender;
    private float Weight;
    public Person(String firstName, String lastName,int age,int socialSecurity,String address,String gender,Float weight)
    {
        FirstName=firstName;
        LastName=lastName;
        Age=age;
        SSN=socialSecurity;
        Address=address;
        Gender=gender;
        Weight=weight;
    }
    public String getFirstName()
    {
        return FirstName;
    }
    public String getLastName()
    {
        return LastName;
    }
    public int getAge()
    {
        return Age;
    }
    public int getSSN(){ return SSN;}
    public String getAddress(){return Address;}
    public String getGender(){return Gender;}
    public float getWeight() { return Weight; }

    public void setFirstName(String firstName)
    {
        FirstName= firstName;
    }
    public void setLastName(String lastName)
    {
        LastName=lastName;
    }
    public void setAge(int age)
    {
        Age=age;
    }
    public void setSSN(int socialSecurity)
    {
       SSN=socialSecurity;
    }
    public void setAddress(String address)
    {
        Address=address;
    }
    public void setGender(String gender)
    {
        Gender=gender;
    }
    public void setWeight(float weight)
    {
        Weight=weight;
    }
    // the introduce method for the inherited class override
    public void introduce()
    {
    }
    @Override
    public String toString() {
        return "FirstName: " +FirstName+ "\n " + "LastName:'" +LastName+ "\n " + "Age:" +Age+"\n"+ "SocialSecurity number:" +SSN+ "\n" +
                "Gender:"+Gender+"\n"+"weight:" + Weight ;
    }
}
