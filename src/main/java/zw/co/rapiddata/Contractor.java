package zw.co.rapiddata;

public class Contractor extends Employee{

    private double rate;
    private double hours;

    public Contractor(double rate, double hours) {
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public void calculateSalary() {
        double salary = rate * hours;
        setSalary(salary);
    }


}
