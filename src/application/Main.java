package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measures of triangle X: ");
		x.a = input.nextDouble();
		x.b = input.nextDouble();
		x.c = input.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = input.nextDouble();
		y.b = input.nextDouble();
		y.c = input.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Large area: X");
		}
		else {
			System.out.println("Large are: Y");
		}

		input.close();

	}

}
