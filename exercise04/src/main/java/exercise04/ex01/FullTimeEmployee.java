package exercise04.ex01;

public class FullTimeEmployee extends Employee {
	private int monthlySalary;

    public FullTimeEmployee() {
        this.monthlySalary = 3000000;
    }

    @Override
    public int getSalary() {
        return monthlySalary;
    }
}
