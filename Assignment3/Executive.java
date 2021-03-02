public class Executive extends Employee {
    private Double yearlyBonus;
    private Double yearlyCompensation;

    public Executive() {
    }

    public Executive(String firstName, String lastName, int age, String ssn, Address address, int id, Double pay, Double yearlyBonus) {
        super(firstName, lastName, age, ssn, address, id);
        this.yearlyCompensation=pay;
        this.yearlyBonus = yearlyBonus;
    }

    public Double getBonus() {
        return yearlyBonus;
    }

    public void setBonus(Double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nyearlyBonus:" + yearlyBonus +
                "\nyearlyCompensation=" + yearlyCompensation ;
    }
    public void introduce(boolean displaySSN){
        if(displaySSN){
            System.out.println("SSN:"+this.getSSN());
        }
    }
    public Double computePay(){
        return this.yearlyCompensation+this.getBonus();
    }
}