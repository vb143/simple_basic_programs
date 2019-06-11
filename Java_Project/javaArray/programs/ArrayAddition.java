package javaArray.programs;

import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] first = new int[5];
		System.out.print("Enter 5 Number in first Array= ");
		for (int i = 0; i < first.length; i++) {
			first[i] = scanner.nextInt();
		}
		int[] second = new int[5];
		System.out.print("\nEnter 5 Numbers On 2nd Arry= ");
		for (int i = 0; i < second.length; i++) {
			second[i] = scanner.nextInt();
		}
		int[] result = new int[5];
		System.out.println("**********************************");
		System.out.println("Addition Two Array Elements");
		System.out.println("**********************************");
		for (int i = 0; i < result.length; i++) {
			result[i] = first[i] + second[i];
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println("\nAfter addition " + i + " opsiton Store " + result[i] );
		}

		scanner.close();
	}

}