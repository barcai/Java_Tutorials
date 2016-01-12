public class PolarCoordinates {
	public static void main(String[] args) {
		Double x = Double.parseDouble(args[0]);
		Double y = Double.parseDouble(args[1]);
		Double r = Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2));
		Double theta = Math.atan2(y, x);
		System.out.println(r);
		System.out.println(theta);
	}
}