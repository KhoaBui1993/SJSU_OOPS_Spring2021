public class FullTimeHourly extends FullTimeEmployee {
    private Double OvertimePay;

    public FullTimeHourly() {
    }

    public FullTimeHourly(String firstName, String lastName, int age, String ssn, Address address, int id, Double basePay, Double overtimePay) {
        super(firstName, lastName, age, ssn, address, id, basePay);
        OvertimePay = overtimePay;
    }

    public Double getOvertimePay() {
        return OvertimePay;
    }

    public void setOvertimePay(Double overtimePay) {
        OvertimePay = overtimePay;
    }
    public void introduce(boolean displaySSN){
        if(displaySSN){
            System.out.println("SSN:"+this.getSSN());
        }
    }
    @Override
    public String toString() {
        return super.toString()+
                "basePay: "+this.getBasePay()+
                "overtimePay: " + OvertimePay ;
    }
    public Double computePay(int numHrs){
        return this.getBasePay()*(numHrs+this.getOvertimePay());
    }
}