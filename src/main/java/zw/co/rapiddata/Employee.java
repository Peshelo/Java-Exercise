package zw.co.rapiddata;

public abstract class Employee {

    private double salary;

    public Employee() {
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }


    public void printSalary(Employee employee){
        employee.calculateSalary();
        System.out.println("Salary: " + employee.getSalary());
    }


    public abstract void calculateSalary();
}
