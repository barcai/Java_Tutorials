package week7;

public class Rectangle {
	
	private Point2DDouble topLeft;
	private Point2DDouble bottomRight;
	
	public Rectangle(Point2DDouble topLeft, Point2DDouble bottomRight) {
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}
	
	public Rectangle(){
		this.topLeft = new Point2DDouble(0,0);
		this.bottomRight = new Point2DDouble(1,1);
	}
	
	public boolean isPointInside(Point2DDouble pt) {
		if (topLeft.getX() <= pt.getX() && bottomRight.getX() >= pt.getX()){
			if (topLeft.getY() <= pt.getY() && bottomRight.getY() >= pt.getY()) {
				return true;
			}
		}
		return false;
	}
	
}
