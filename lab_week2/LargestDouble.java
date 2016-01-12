public class LargestDouble {
	public static void main(String[] args) {
		Double num1 = Double.parseDouble(args[0]);
		Double num2 = Double.parseDouble(args[1]);
		if (num1 > num2) {
			System.out.println(num1);
		}
		else {
			System.out.println(num2);
		}
	}
}