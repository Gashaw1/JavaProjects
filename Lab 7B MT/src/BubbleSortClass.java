
public class BubbleSortClass {

	int[] nums = null;

	public BubbleSortClass(int[] nums) {
		this.nums = nums;
	}

	public void sort() {
		int n = nums.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (nums[j - 1] > nums[j]) {

					temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}

			}
		}

	}

	public void print() {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " : ");
		}
	}

}
