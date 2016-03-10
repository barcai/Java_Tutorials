package week8;

public class BinaryWff {
	
	private Operator op = null;
	private PropVar left, right;
	

	public BinaryWff(PropVar left, PropVar right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOp(Operator op) {
		this.op = op;
	}
	
	public Operator getOp() {
		return this.op;
	}
	
	public PropVar getLeft() {
		return this.left;
	}
	
	public PropVar getRight() {
		return this.right;
	}
	
	public String toString()  {
		return "(" + this.left + " " + this.op + " " + this.right + ")";
	}

}
