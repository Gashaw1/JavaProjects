
class SampleClass {
	public void add(int i) {
		System.out.print(i + 10);
	}

	public static void BubleSor(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}

}

class SampleClass2 extends SampleClass {
	String instanceName;
	SampleClass samp;

	public SampleClass2(SampleClass samp, String instanceName) {
		this.samp = samp;
		this.instanceName = instanceName;
	}

}

public class Test {

	int r = 30;

	public static void main(String[] args) {
		int[] x = { 1, 3, 2, 0 };
		SampleClass.BubleSor(x);
		// new SampleClass2(new SampleClass(){ }, null).add(3);

		// System.out.print("this");

	}

}
