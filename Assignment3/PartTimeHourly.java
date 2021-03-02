public class PartTimeHourly extends Employee {
    private Double BaseHourlyPay;

    public PartTimeHourly() {
    }

    public PartTimeHourly(String firstName, String lastName, int age, String ssn, Address address, Double baseHourlyPay) {
        super(firstName, lastName, age, ssn, address, 0);
        BaseHourlyPay = baseHourlyPay;
    }

    public Double getBaseHourlyPay() {
        return BaseHourlyPay;
    }

    public void setBaseHourlyPay(Double baseHourlyPay) {
        BaseHourlyPay = baseHourlyPay;
    }

    @Override
    public String toString() {
        return super.toString() +
                "baseHourlyPay=" + BaseHourlyPay;
    }

    public void introduce(boolean displaySSN) {
        if (displaySSN) {
            System.out.println("SSN:"+this.getSSN());
        }
    }

    public Double computePay(int numHrs) {
        return numHrs * BaseHourlyPay;
    }
}