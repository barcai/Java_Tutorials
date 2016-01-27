package week4;

public class CoordinateConverter {
	
	public static double convertXYtoR(double x, double y) {
        return Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static double convertXYtoT(double x, double y) {
        return Math.atan2(y, x);
    }

    public static double convertRTtoX(double r, double theta) {
        return Math.cos(theta)*r;
    }

    public static double convertRTtoY(double r, double theta) {
        return Math.sin(theta)*r;
    }

    public static double convertDegToRad(double deg) {
        return deg/180*Math.PI;
    }

    public static double convertRadToDeg(double rad) {
        return rad/Math.PI*180;
    }
	
}
