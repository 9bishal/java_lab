// package cr23ci016;

import java.util.Scanner;

public class employee {

	private double raisalary(double percent, double salary) {
		return percent > 0 ? salary + salary * (percent / 100) : salary;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee id:");
		int id = sc.nextInt();
        
		sc.nextLine(); // consume the newline
		System.out.println("Enter name of employee:");
		String name = sc.nextLine();

		System.out.println("Enter employee salary:");
		double salary = sc.nextDouble();

		System.out.println("Enter raise percentage:");
		double raisePercentage = sc.nextDouble();

		employee e1 = new employee();
		double updatedSalary = e1.raisalary(raisePercentage, salary);

		System.out.printf("\nEmployee after raise:\nID: %d\nName: %s\nUpdated Salary: %.2f\n", id, name, updatedSalary);

		sc.close();
	}
}
