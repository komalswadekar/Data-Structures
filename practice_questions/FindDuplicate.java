/*
 * Find duplicate element in an array of positive integers
 * Author: Komal Soham Wadekar
 */
public class FindDuplicate {
	void printDuplicate(int arr[]) {
		System.out.println("The repeating elements are : ");
		boolean flag;
		for (int i = 0; i < arr.length; i++) {
			flag = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > 0 && arr[i] == arr[j]) {
					if (flag == false) {
						System.out.println(arr[i]);
						flag = true;
						arr[j] = -arr[j];
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		FindDuplicate duplicate = new FindDuplicate();
		int arr[] = { 3, 2, 3, 2, 3, 8, 8, 2 };

		duplicate.printDuplicate(arr);
	}
}
