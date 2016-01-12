public class Multiplier {
	public static void main( String[] args) {
		int result = 1;
		String beautiful_result = "";
		for (int i=0; i < args.length; i++) {
			result *= Integer.parseInt(args[i]);
			if (i < args.length - 1) {
				beautiful_result += (args[i] + " * ");
			}
			else {
				beautiful_result += (args[i]);
			}
		}
		beautiful_result = beautiful_result + " = " + result;
		System.out.println(beautiful_result);
	}
}