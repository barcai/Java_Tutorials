package week3;

public class ArithmeticSeries {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int counter = 1;
		int sum = 0;
		while (n >= counter) {
			sum += counter;
			counter++;
		}
		System.out.println(sum);
	}
}
