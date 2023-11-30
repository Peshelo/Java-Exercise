package zw.co.rapiddata;

public class Main {
    public static void main(String[] args) {
        System.out.println("CompanyX Payroll System");
        System.out.println("************************");

        Employee employee1 = new Contractor(1000,20);
        employee1.printSalary(employee1);

        Employee employee2 = new Fulltime(1000);
        employee2.printSalary(employee2);

        Employee employee3 = new Manager(1000, 100);
        employee3.printSalary(employee3);

    }
}