package javaPattern.Programes;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// User input for number of row
		System.out.print("Enter the numbers of row = ");
		int row = scanner.nextInt();

		// User input for drown symbol
		System.out.print("\nEnter the symbol = ");
		String symbol = scanner.next();

		// print row
		for (int i = 1; i <= row; i++) {

			// Print Column
			for (int j = row; j >= i; j--) {
				System.out.print(symbol);
			}
			System.out.println();
		}
		scanner.close();

	}

}
