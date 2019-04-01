package Staff;

public class Employee {

    private String name;
    private String ni_number;
    protected double salary;
    protected double bonus;

    public Employee(String name, String ni_number, double salary) {
        this.name = name;
        this.ni_number = ni_number;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public String getNi_number() {
        return ni_number;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() { return this.bonus;}

    public void setName(String name) {
        if (name != "")
        {
            this.name = name;
        }
    }

    public void setNi_number(String ni_number) {
        this.ni_number = ni_number;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double salaryRaise) {
        if (salaryRaise > 0) {
            this.salary += salaryRaise;
        }
    }

    public void payBonus() { this.bonus = this.salary*0.01; }



}
