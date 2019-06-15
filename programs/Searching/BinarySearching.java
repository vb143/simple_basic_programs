package programs.Searching;

public class BinarySearching extends InsertSort {
	public static int binarySearch(int array[], int first, int last, int key) {
		if (last >= first) {
			int mid = first + (last - first) / 2;
			if (array[mid] == key) {
				return mid;
			}
			if (array[mid] > key) {
				return binarySearch(array, first, mid - 1, key);// search in left subarrayay
			} else {
				return binarySearch(array, mid + 1, last, key);// search in right subarrayay
			}
		}
		return -1;
	}

	public static void binary(int array[], int first, int last, int key) {

		/*
		 * System.out.print("Enter The Size Of array: "); int n = scanner.nextInt(); int
		 * array[] = new int[n];
		 * 
		 * System.out.print("Enter the elment in array: ");
		 * 
		 * for (int i = 0; i < n; i++) { array[i] = scanner.nextInt(); }
		 * 
		 * System.out.println("\nEntered Elements is give below\n ");
		 * System.out.println("\n| Index | " + " Element |");
		 * System.out.println("--------------------"); for (int i = 0; i < n; i++) {
		 * System.out.println("|  " + i + "    |    " + array[i] + "     |"); }
		 */

		// String awnser = "";
		// do {

		// System.out.print("Enter the element to be searched: ");
		// int key = scanner.nextInt();
		// int last = array.length;
		int result = binarySearch(array, 0, last, key);
		if (result == -1)
			System.out.println("Element is not found!");
		else
			System.out.println("Element is found at index: " + result);

		// System.out.print("\nDo you want search again y/n: ");
		// awnser = scanner.next();
		// } while (awnser.equals("y"));
		// System.out.println("You Exit Suceefully....!!");
		/// scanner.close();
	}
}
