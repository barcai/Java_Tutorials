package week6;

public class Vector3D {
	
	private double x, y, z;
	
	public Vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getR() {
		return Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z);
	}
	
	public double getTheta() {
		return Math.acos(this.z/getR());
	}
	
	public double getPhi() {
		if (Math.atan(this.y/this.x) == 0 && this.x < 0) return Math.PI;
		return Math.atan(this.y/this.x);
	}
	/*
	public static Vector3D add(Vector3D lhs, Vector3D rhs){
		
	}
	
	public static Vector3D subtract(Vector3D lhs, Vector3D rhs) {
		
	}
	
	public static Vector3D scale( Vector3D v, double scaleFactor) {
		
	}
	*/
	
	public static void main(String[] args) {
		System.out.println(new Vector3D(-1.0, 0.0, 0.0).getPhi());
	}
	
}
