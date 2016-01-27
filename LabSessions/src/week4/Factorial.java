package week4;

public class Factorial {
	public static int factorial(int N) {
		int product = 1;
		int currentNumber = N;
		while (currentNumber > 1) {
			product *= currentNumber;
			currentNumber--;
		}
		return product;
	}
	
	public static void main(String[] args) {
        System.out.println(" 2! (Should be: 2) returned: " + factorial(2) );
        System.out.println(" 5! (Should be: 120) returned: " + factorial(5) );
        System.out.println(" 10! (Should be: 3628800) returned: " + factorial(10) );
    }
}
