package zw.co.rapiddata;

public class Manager extends Fulltime{

    private double bonus;

    public Manager(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        double salary = 1000 + bonus;
        setSalary(salary);
    }



}
