public class BinarySearchRecursive {

	static int binarySearch(int[] arr, int num, int low, int high) {
		if ( high >= low) {
			int mid = low + (high-low)/2;

			if(arr[mid]==num) {
				return mid;
			}

			if(arr[mid]>num) {
				return binarySearch(arr, num, low, mid-1);
			} else {
				return binarySearch(arr, num, mid+1, high);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = new int[]{3,4, 6, 8, 11, 20};
		int num1 = 21;
		int num2 = 8;
		System.out.println("Index of num " + num1 + " is " + binarySearch(arr, num1, 0, arr.length-1));

		System.out.println("Index of num " + num2 + " is " + binarySearch(arr, num2, 0, arr.length-1));

	}
}