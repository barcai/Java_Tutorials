package logic;

public class BinaryWff extends Wff{
	
	private Operator op = null;
	private Wff left, right;
	

	public BinaryWff(Wff left, Wff right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOp(Operator op) {
		this.op = op;
	}
	
	public Operator getOp() {
		return this.op;
	}
	
	public Wff getLeft() {
		return this.left;
	}
	
	public Wff getRight() {
		return this.right;
	}
	
	@Override
	public String toString()  {
		return "(" + this.left + " " + this.op + " " + this.right + ")";
	}

	@Override
	public boolean eval(Valuation val) {
		return false;
	}

}
