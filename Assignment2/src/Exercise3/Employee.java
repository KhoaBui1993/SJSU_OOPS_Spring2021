package Exercise3;

public class Employee extends Person{
    private int Id;
    private String Status;
    private Double Pay_amount;
    public Employee(String firstName, String lastName, int age, int socialSecurity, String address, String gender, Float weight,int id ,String status, double pay_amount ) {
        super(firstName, lastName, age, socialSecurity, address, gender, weight);
        Id = id;
        Status = status;
        Pay_amount = pay_amount;
    }
    public int getId() {
        return Id;
    }
    public String getStatus() {
        return Status;
    }
    public Double getPay_amount() {
        return Pay_amount;
    }
    public void setId(int id) {
        Id = id;
    }
    public void setStatus(String status) {
        Status = status;
    }
    public void setPay_amount(Double pay_amount) {
        Pay_amount = pay_amount;
    }

    @Override
    public void introduce() {
        System.out.println(super.toString()+",id:" + Id + ", status:'" + Status +
                ", Pay Amount:" + Pay_amount );
    }
    public double calculatePay(double unitsWorked)
    {
        if (Status=="full time")
            return (getPay_amount()/52)*unitsWorked;
        else
            return (getPay_amount()*unitsWorked);
    }
}
