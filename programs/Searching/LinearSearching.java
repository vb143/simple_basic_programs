package programs.Searching;

public class LinearSearching {

	public static void linearSearch(int array[], int key) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scanner = new Scanner(System.in); int[] array; int i;
		 * System.out.print(" Enter Size Of Array =  "); int n = scanner.nextInt();
		 * array = new int[n]; System.out.print("\nEnter the elements on array= "); for
		 * (i = 0; i < n; i++) { array[i] = scanner.nextInt(); }
		 * 
		 * System.out.println("\nEntered Elements is give below\n ");
		 * System.out.println("\n| Index | " + " Element |");
		 * System.out.println("--------------------"); for (i = 0; i < n; i++) {
		 * System.out.println("|  " + i + "    |    " + array[i] + "     |"); } String
		 * awnser = ""; do { System.out.print("\nEnter the number to be searched = ");
		 * int key = scanner.nextInt();
		 */
		int i;
		for (i = 0; i < array.length; i++) {

			if (array[i] == key) {

				System.out.println("Element " + key + " present in the array at " + i + "  position in index");
				System.out.println("*******************************************");

				break;
			}

			// System.out.println(" The Numbers of comparison Required is " +count);
		}

		if (i == array.length) {
			System.out.println("Element " + key + " is not present in this list");
			System.out.println("Searching Faild ");
			System.out.println("***********************************************");
		}
		System.out.print(" The Numbers of comparison  Required is " + (i + 1));
		System.out.println("\n*************************************************");
		// System.out.print("\nDo you want search again y/n: ");
		// awnser = scanner.next();

	} // while (awnser.equals("y"));
		// scanner.close();

}
