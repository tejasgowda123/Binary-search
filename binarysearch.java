// Java implementation of recursive Binary Search
class BinarySearch {
	// Returns index of x if it is present in a[l..r], else return -1
	int binarySearch(int a[], int l, int r, int x)
	{
		if (r >= l) {
			int mid = l + (r - l) / 2;

			// If the element is present at the middle itself
			if (a[mid] == x)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (a[mid] > x)
				return binarySearch(a, l, mid - 1, x);

			// Else the element can only be present
			// in right subarray
			return binarySearch(a, mid + 1, r, x);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

	//Main program driver
	public static void main(String args[])
	{
		BinarySearch ob = new BinarySearch();
		int a[] = { 2, 3, 4, 10, 40 };
		int n = a.length;
		int x = 10;
		int result = ob.binarySearch(a, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element is not found");
		else
			System.out.println("Element is found at index "
							+ result);
	}
}
