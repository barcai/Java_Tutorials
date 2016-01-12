public class QuadraticSolver {
	public static void main(String[] args) {
		Double a = Double.parseDouble(args[0]);
		Double b = Double.parseDouble(args[1]);
		Double c = Double.parseDouble(args[2]);
		System.out.println(((-b + Math.sqrt((Math.pow(b, 2) - 4*a*c)))/2*a));
		System.out.println(((-b - Math.sqrt((Math.pow(b, 2) - 4*a*c)))/2*a));
	}
}