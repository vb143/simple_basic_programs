package javaArray.programs;

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int [] array = new int[10];
		System.out.print("Enter 10 numbers ");
		for (int i = 0; i < 10; i++) {
			
			array[i] = scanner.nextInt();
		}
		
		System.out.println("#######################################");
		System.out.println("the size of array is " + array.length);
		System.out.println("***************************************");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Position " +i+ " Element in array = " + array[i]);
		}
		scanner.close();

	}

}
