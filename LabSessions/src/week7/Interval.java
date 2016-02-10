package week7;

public class Interval {
	
	private double left, right;
	
	public Interval(double left, double right) {
		this.left = left;
		this.right = right;
	}
	
	public boolean doesContain(double x){
		if (this.isEmpty()) return false;
		if (this.left < x && this.right > x) return true;
		return false;
	}
	
	public boolean isEmpty() {
		if (this.left > this.right) return true;
		return false;
	}
	
	public boolean intersects(Interval b){
		if (this.isEmpty() || b.isEmpty()) {
			return false;
		}
		if (left > b.right) {
            return false;
        }
        if (right < b.left) {
            return false;
        }
        return true;
	}
	
	@Override
    public String toString() {
        if (isEmpty()) {
            return "Interval: (EMPTY)";
        }
        return "Interval: [" + left + ", " + right + "]";
    }
}
