package PastPapers;

public class Lucas {

	private static long[] lucas;
	private static double phiPlus =  (Math.sqrt(5) + 1) / 2;
	private static double phiMinus =  (Math.sqrt(5) - 1) / 2;
	
	private static boolean isPrime(long n) {
		if (n < 2) {
			return false;
		}else if (n == 2) {
			return true;
		}
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0 && n != i) {
				return false;
			}
		}
		return true;
	}
	
	public static void upto(int n) {
		lucas = new long[n];
		lucas[0] = 2l;
		lucas[1] = 1l;
		for (int i = 2; i < n; i++) {
			lucas[i] = lucas[i-1] + lucas[i-2];
		}
	}
	
	public static void primes() {
		for (int i = 0; i < lucas.length; i ++) {
			if (Lucas.isPrime(lucas[i])) {
				System.out.println("L(" + i + ")=" + lucas[i]);
			}
		}
	}
	
	public static double maxDiffClosedForm() {
		double maxDiff = 0;
		for (int i = 0; i < lucas.length; i++) {
			double closedForm = Math.pow(phiPlus, i) + (Math.pow(-phiMinus, i));
			double diff = Math.abs(closedForm - lucas[i]);
			if (diff > maxDiff) {
				maxDiff = diff;
				// For seeing the differences
				//System.out.println("abs(" + lucas[i] + " - " + closedForm + ") = " + diff);
			}
		}
		return maxDiff;
	}
	
	
	public static void main (String[] args) {
		Lucas.upto(Integer.parseInt(args[0]));
		double d = Lucas.maxDiffClosedForm();
		System.out.println(String.format( "%.15f", d ));
	}
}
