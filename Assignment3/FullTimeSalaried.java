public class FullTimeSalaried extends  FullTimeEmployee {
    public FullTimeSalaried() {
    }

    public FullTimeSalaried(String firstName, String lastName, int age, String ssn, Address address, int id, Double basePay) {
        super(firstName, lastName, age, ssn, address, id, basePay);
    }

    @Override
    public String toString() {
        return super.toString()+"\nbasePay ="+this.getBasePay();
    }
    public void introduce(boolean displaySSN){
        if(displaySSN){
            System.out.println("SSN"+this.getSSN());
        }
    }
    public Double computePay(int numWeeks){
        return +this.getBasePay()*(1/52.0)*numWeeks;
    }
}