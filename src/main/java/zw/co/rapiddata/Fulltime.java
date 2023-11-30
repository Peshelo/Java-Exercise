package zw.co.rapiddata;

public class Fulltime extends Employee{


    public Fulltime(double salary) {
            super(salary);
    }

    @Override
    public void calculateSalary() {
        double salary = getSalary();
        setSalary(salary);
    }

}
