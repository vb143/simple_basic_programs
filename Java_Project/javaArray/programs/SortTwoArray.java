package javaArray.programs;


import java.util.Scanner;

import programs.Searching.InsertSort;

public class SortTwoArray extends InsertSort {

	public int[] addArray(int array1[], int array2[]) {
		// merge two arrays
		// create 3rd array add array1+array2 length
		int[] merge = new int[array1.length + array2.length];
		// count variable use for position count 3rd array elements
		int count = 0;

		// add first array elements to the 3rd array
		for (int i = 0; i < array1.length; i++) {
			merge[i] = array1[i];
			count++;
		}
		// add second array element to the 3rd array
		for (int j = 0; j < array2.length; j++) {
			merge[count++] = array2[j];
		}

		// after merge show all elements in 3rd array
		System.out.println("\n Combine Arrays elements \n ");
		System.out.println("\n| Index | " + " Element |");
		System.out.println("--------------------");
		for (int i = 0; i < merge.length; i++) {
			System.out.println("|  " + i + "    |    " + merge[i] + "     |");
		}
		// sort 3rd array
		InsertSort insertSort = new InsertSort();
		System.out.println("\n**** After Sorting Final Result ***** ");
		insertSort.setSort(merge);

		return merge;

	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter The Size Of First Array: ");
		int size1 = scanner.nextInt();

		int array1[] = new int[size1];
		System.out.print("Enter the " + array1.length + " elment in array: ");

		for (int i = 0; i < size1; i++) {
			array1[i] = scanner.nextInt();
		}
		System.out.print("Enter The Size Of Second Array: ");
		int size2 = scanner.nextInt();
		int array2[] = new int[size2];
		System.out.print("Enter the " + array2.length + " elment in second array: ");

		for (int i = 0; i < size2; i++) {
			array2[i] = scanner.nextInt();
		}

		System.out.println("\nBefore sorting first array elements give below\n ");
		System.out.println("\n| Index | " + " Element |");
		System.out.println("--------------------");
		for (int i = 0; i < size1; i++) {
			System.out.println("|  " + i + "    |    " + array1[i] + "     |");

		}

		System.out.println("\nBefore sorting second array elements give below\n ");
		System.out.println("\n| Index | " + " Element |");
		System.out.println("--------------------");
		for (int i = 0; i < size2; i++) {
			System.out.println("|  " + i + "    |    " + array2[i] + "     |");
		}

		// make object of class InsertSort
		InsertSort insertSort = new InsertSort();
		System.out.println("\n**** After Sorting First Arrray ***** ");
		insertSort.setSort(array1);
		// insertSort.getSort();

		System.out.println("\n**** After Sorting Second Array ***** ");
		insertSort.setSort(array2);
		// insertSort.getSort();

		SortTwoArray sortTwoArray = new SortTwoArray();
		sortTwoArray.addArray(array1, array2);

		scanner.close();
	}

}
