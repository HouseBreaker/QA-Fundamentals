import com.sun.deploy.util.StringUtils;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		String name = "Pesho";
		int age = 28;
		double height = 1.84;

		System.out.println("My name is " + name);

		int x = 123;
		int y = 477;

		int result = x + y;
		System.out.println("The result is " + result);

		PrintSeparator();

		System.out.println("The current date is: " + LocalDateTime.now().toLocalDate());

		int hoursToAdd = 20;
		LocalDate dateAfterAddition = LocalDateTime.now().plusHours(hoursToAdd).toLocalDate();
		System.out.printf("The current date after %d hours would be: %s\r\n", hoursToAdd, dateAfterAddition);

		PrintSeparator();

		double first = 2.5;
		double second = 7.5;

		System.out.printf("The result of %.1f and %.1f is %.1f\r\n", first, second, first + second);

		PrintSeparator();

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter a number to add 10 to:");
		System.out.println(Integer.parseInt(in.nextLine()) + 10);

		PrintSeparator();

		System.out.println("Please enter 2 numbers to find the product of:");
		int firstNumber = Integer.parseInt(in.nextLine());
		int secondNumber = Integer.parseInt(in.nextLine());

		System.out.printf("The product of %d and %d is %d\r\n", firstNumber, secondNumber, (firstNumber * secondNumber));

		PrintSeparator();

		int lowerLimit = 1, upperLimit = 1000;
		System.out.printf("Press any key to print the numbers from %d to %d\r\n", lowerLimit, upperLimit);
		System.in.read();

		for (int currentNum = lowerLimit; currentNum <= upperLimit; currentNum++) {
			System.out.println(currentNum);
		}
	}

	public static void PrintSeparator() {
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}

		System.out.println();
	}
}
