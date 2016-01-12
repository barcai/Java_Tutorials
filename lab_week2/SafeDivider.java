public class SafeDivider {
	public static void main(String[] args) {
		Double numerator = Double.parseDouble(args[0]);
		Double denominator = Double.parseDouble(args[1]);
		if (denominator != 0) {
			System.out.println((numerator/denominator));
		}
		else {
			System.out.println("I can't divide by zero!");
		}
	}
}