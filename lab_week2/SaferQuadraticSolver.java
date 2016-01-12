public class SaferQuadraticSolver {
	public static void main(String[] args) {
		Double a = Double.parseDouble(args[0]);
		Double b = Double.parseDouble(args[1]);
		Double c = Double.parseDouble(args[2]);
		if ((Math.pow(b, 2) -4*a*c) < 0) {
			System.out.println("Equation is not solvable for real x.");
		}
		else if (a == 0.0) {
			System.out.println("A = 0. Cannot solve equation.");
		}
		else {
			System.out.println(((-b + Math.sqrt((Math.pow(b, 2) - 4*a*c)))/2*a));
			System.out.println(((-b - Math.sqrt((Math.pow(b, 2) - 4*a*c)))/2*a));
		}
	}
}