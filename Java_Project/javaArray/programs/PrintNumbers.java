package javaArray.programs;

public class PrintNumbers {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("#######################################");
		System.out.println("the size of array is " + array.length);
		System.out.println("***************************************");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Position " +i+ " Element in array= " + array[i]);
		}

	}

}
