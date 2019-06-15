package programs.Searching;

public class InsertSort {

	private static int[] arr;

	public void setSort(int array[]) {
		arr = array;

		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < arr[j - 1]) {
					temp = array[j];
					array[j] = arr[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		// System.out.println("\nEntered Elements is give below\n ");
		System.out.println("\n| Index | " + " Element |");
		System.out.println("--------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("|  " + i + "    |    " + array[i] + "     |");
		}
	}
	/*
	 * public int[] getSort() { return arr;
	 * 
	 * }
	 */
}
