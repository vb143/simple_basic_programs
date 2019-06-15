package programs.Searching;

import java.util.Scanner;

public class FindNumber  {

	public static void main(String[] args) {

		// BinarySearching binarySearching = new BinarySearching();
		InsertSort insertSort = new InsertSort();
		Scanner scanner = new Scanner(System.in);
		String awnser = "";

		System.out.print("Enter The Size Of array: ");
		int n = scanner.nextInt();
		int array[] = new int[n];

		System.out.print("Enter the elment in array: ");

		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("\nEntered Elements is give below\n ");
		System.out.println("\n| Index | " + " Element |");
		System.out.println("--------------------");
		for (int i = 0; i < n; i++) {
			System.out.println("|  " + i + "    |    " + array[i] + "     |");
		}

		System.out.print("\nDo Want Sort Element y/n: ");
		awnser = scanner.next();
		if (awnser.equalsIgnoreCase("y")) {
			System.out.println("\n**** After Sorting ***** ");
			insertSort.setSort(array);
			
			//insertSort.getSort();
		}

		do {
			System.out.println("****** Searching Element *******");
			System.out.println("1. Linear Searching\n" + "2. Binary Searching" + "\nEnter the choice 1/2: ");
			byte a = scanner.nextByte();
			System.out.print("Enter the element to be searched: ");
			int key = scanner.nextInt();
			if (a == 2) {

				int last = array.length - 1;
				BinarySearching.binary(array, 0, last, key);
				/*
				 * if (result == -1) System.out.println("Element is not found!"); else
				 * System.out.println("Element is found at index: " + result); break;
				 */
			} else {

				LinearSearching.linearSearch(array, key);

			}

			System.out.print("\nDo you want search again y/n: ");
			awnser = scanner.next();
		} while (awnser.equals("y"));
		System.out.println("You Exit Suceefully....!!");
		scanner.close();
	}

}
