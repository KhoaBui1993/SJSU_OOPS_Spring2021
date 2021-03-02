public class FullTimeEmployee extends Employee {
    private Double BasePay;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String firstName, String lastName, int age, String ssn, Address address, int id, Double basePay) {
        super(firstName, lastName, age, ssn, address, id);
        BasePay = basePay;
    }

    public Double getBasePay() {
        return BasePay;
    }

    public void setBasePay(Double basePay) {
        BasePay = basePay;
    }
    public void introduce(boolean displaySSN){
        if(displaySSN){
            System.out.println("SSN"+this.getSSN());

        }
    }
}