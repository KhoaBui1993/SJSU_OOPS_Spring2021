public class BusinessTest {
    public static void main(String[] args) {
        // 2 Executive person
        Address address = new Address(123, "Sessions Dr", "San Jose", "95119", "CA");
        Executive executive = new Executive("John", "Smith", 40, "001", address, 1000, 14000.0, 800.0);
        System.out.println(executive);
        executive.introduce(false);
        executive.computePay();
        System.out.println("=======================================");
        Address address1 = new Address(124, "Sessions Dr", "San Jose", "95117", "CA");
        Executive executive1 = new Executive("Micheal", "Duong", 28, "002", address1, 1001, 9000.0, 700.0);
        System.out.println(executive1);
        executive1.introduce(false);
        executive1.computePay();
        System.out.println("=======================================");
        Address address2 = new Address(125, "Sessions Dr", "San Jose", "95113", "CA");
        // 2 Full time hourly person
        FullTimeHourly fullTimeHourly1 = new FullTimeHourly("Michell", "Yon", 30, "003", address2, 1002, 13.0, 20.0);
        System.out.println(fullTimeHourly1);
        fullTimeHourly1.introduce(true);
        System.out.println("Pay amount:" + fullTimeHourly1.computePay(36));
        System.out.println("=======================================");
        Address address3 = new Address(126, "Sessions Dr", "San Jose", "95114", "CA");
        FullTimeHourly fullTimeHourly2 = new FullTimeHourly("Yiang", "Ho", 31, "004", address3, 1003, 15.0, 22.0);
        System.out.println(fullTimeHourly2);
        fullTimeHourly2.introduce(true);
        System.out.println("Pay amount:" + fullTimeHourly2.computePay(33));
        System.out.println("=======================================");
        //2 Full time salary person
        Address address4 = new Address(127, "Sessions Dr", "San Jose", "95112", "CA");
        FullTimeSalaried fullTimeSalaried1 = new FullTimeSalaried("Joe", "Burger", 34, "005", address4, 1004, 70000.0);
        System.out.println(fullTimeSalaried1);
        fullTimeSalaried1.introduce(true);
        System.out.println("Pay amount:" + fullTimeSalaried1.computePay(40));
        System.out.println("=======================================");
        Address address5 = new Address(128, "Sessions Dr", "San Jose", "95111", "CA");
        FullTimeSalaried fullTimeSalaried2 = new FullTimeSalaried("Jose", "San", 33, "006", address5, 1005, 80000.0);
        System.out.println(fullTimeSalaried2);
        fullTimeSalaried2.introduce(true);
        System.out.println("Pay amount:" + fullTimeSalaried2.computePay(32));
        System.out.println("=======================================");
        //2 part-time hourly
        Address address6 = new Address(129, "Sessions Dr", "San Jose", "95133", "CA");
        PartTimeHourly partTimeHourly1 = new PartTimeHourly("Barbara", "Santa", 40, "007", address6, 15.0);
        System.out.println(partTimeHourly1);
        partTimeHourly1.introduce(true);
        System.out.println("Pay amount:" + partTimeHourly1.computePay(20));
        System.out.println("=======================================");
        Address address7 = new Address(111, "Sessions Dr", "San Jose", "95121", "CA");
        PartTimeHourly partTimeHourly2 = new PartTimeHourly("Clara", "Santa", 22, "008", address7, 15.0);
        System.out.println(partTimeHourly2);
        partTimeHourly2.introduce(true);
        System.out.println("Pay amount:" + partTimeHourly2.computePay(20));
        System.out.println("=======================================");
        //2 part-time contractor
        Address address8 = new Address(3232, "Sessions Dr", "San Jose", "95121", "CA");
        Contractor contractor1 = new Contractor("Selena", "Bui", 27, "009", address8, 15.0, 1011);
        System.out.println(contractor1);
        contractor1.introduce(true);
        System.out.println("Pay amount:" + contractor1.computePay(12));
        System.out.println("=======================================");
        Address address9 = new Address(4343, "Sessions Dr", "San Jose", "95121", "CA");
        Contractor contractor2 = new Contractor("Chrome", "Google", 32, "101", address9, 12.0, 1012);
        System.out.println(contractor2);
        contractor2.introduce(true);
        System.out.println("Pay amount:" + contractor2.computePay(18));
        System.out.println("=======================================");
        //2 Customer
        Address address10 = new Address(3243, "Sessions Dr", "San Jose", "95121", "CA");
        Customer customer1 = new Customer("Samsung", "Korea", 42, "252", address10, 10011);
        customer1.setPaymentPreference("1010101");
        customer1.introduce();
        System.out.println("=======================================");
        Address address11 = new Address(2817, "Sessions Dr", "San Jose", "95121", "CA");
        Customer customer2 = new Customer("Apple", "USA", 32, "1032", address11, 12031);
        customer2.setPaymentPreference("32123123");
        customer2.introduce();
        System.out.println("=======================================");

    }
}
