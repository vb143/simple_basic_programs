package javaPattern.Programes;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows= ");
		int number = scanner.nextInt();
		System.out.print("\nEnter the Symbol= ");
		String symbol = scanner.next();
		
		// loop for printing rows
		for (int row = 1; row <= number; row++) {
			
			// to print column
			for (int column = 1; column < row; column++) {
				System.out.print(" ");
			}
			
			// to drown symbol
			for (int drown = number; drown >= row; drown--) {
				System.out.print(symbol);
			}
			System.out.println();
		}

		scanner.close();
	}


}
