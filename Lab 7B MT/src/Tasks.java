import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;


public class Tasks extends RecursiveAction {

	int THRESHOLD = 500;

	private int[] nums;

	Tasks(int[] nums) {
		this.nums = nums;
	}

	public static void mergeSort(int[] lists) {
		int len = lists.length;
		if (len > 1) {

			int[] firstHalf = new int[len / 2];
			System.arraycopy(lists, 0, firstHalf, 0, len / 2);
			mergeSort(firstHalf);

			int secondHalfLength = len - len / 2;
			int[] secondHalf = new int[secondHalfLength];
			System.arraycopy(lists, lists.length / 2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);

			merge(firstHalf, secondHalf, lists);
		}
	}

	public static void merge(int[] nums, int[] nums2, int[] temp) {
		int index1 = 0;
		int index12 = 0;
		int tempIndex = 0;

		while (index1 < nums.length && index12 < nums2.length) {
			if (nums[index1] < nums2[index12]) {
				temp[tempIndex++] = nums[index1++];
			} else {
				temp[tempIndex++] = nums2[index12++];
			}
		}

		while (index1 < nums.length) {
			temp[tempIndex++] = nums[index1++];
		}

		while (index12 < nums2.length) {
			temp[tempIndex++] = nums2[index12++];
		}
	}

	@Override
	protected void compute() {
		if (nums.length < THRESHOLD) {
			java.util.Arrays.sort(nums);
		} else {

			int[] firstHalf = new int[nums.length / 2];
			System.arraycopy(nums, 0, firstHalf, 0, nums.length / 2);

			int secondHalfLength = nums.length - nums.length / 2;
			int[] secondHalf = new int[secondHalfLength];
			System.arraycopy(nums, nums.length / 2, secondHalf, 0, secondHalfLength);

			invokeAll(new Tasks(firstHalf), new Tasks(secondHalf));
			Tasks.merge(firstHalf, secondHalf, nums);
		}

	}

}
