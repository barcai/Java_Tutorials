public class ImQuadraticSolver {
	public static void main(String[] args) {
		Double a = Double.parseDouble(args[0]);
		Double b = Double.parseDouble(args[1]);
		Double c = Double.parseDouble(args[2]);
		Double discriminant = Math.pow(b, 2) - 4*a*c;
		if (discriminant < 0) {
			System.out.println((-b/2.0*a) + " + "  + Math.sqrt(Math.abs(discriminant))/2.0*a + "i");
			System.out.println((-b/2.0*a) + " - "  + Math.sqrt(Math.abs(discriminant))/2.0*a + "i");
		} else if (a == 0.0) {	
			System.out.println(-c/b);
		} else {	
			System.out.println(((-b + Math.sqrt((Math.pow(b, 2) - 4*a*c)))/2*a));
			System.out.println(((-b - Math.sqrt((Math.pow(b, 2) - 4*a*c)))/2*a));
		}
	}
}