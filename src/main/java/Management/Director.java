package Management;

import Staff.Employee;

public class Director extends Manager{

    private double budget;

    public Director(String name, String ni_number, Double salary, String deptName, Double budget) {
        super(name, ni_number, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void payBonus() { this.bonus = this.salary*0.02; }

}
