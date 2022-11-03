
public class Fibonacci {
	
	
	static int FibonacciCalculate(int count) {
		int inputusers1 = 0;
		int inputusers2 = 1;
		int inputusers3;
		System.out.print(inputusers1 + " " + inputusers2);// printing 0 and 1
		for (int m = 2; m < count; ++m) {

			inputusers3 = inputusers1 + inputusers2;
			if (inputusers3 <= 100) {
				System.out.print(" " + inputusers3 + " ");
				inputusers1 = inputusers2;
				inputusers2 = inputusers3;
	}

}
		return count;
		}
}
