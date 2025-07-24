package exercise04.ex01;

public class PartTimeEmployee extends Employee {
	private int hourlyPay;
	private int hoursWorked;
	
	public PartTimeEmployee() {
		this.hourlyPay = 10000;
		this.hoursWorked = 12;
		
	}

	@Override
	public int getSalary() {
		return hourlyPay * hoursWorked;
	}
}
