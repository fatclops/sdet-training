package basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		// Declare a variable
		String career;
		System.out.println("Program is starting");
		
		// Define a variable
		career = ("Software Developer");
		System.out.println("My career: " + career);
		
		// Declar and Define
		int hoursPerWeek = 40;
		int weeeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year");
		

	}
}
