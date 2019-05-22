package test;

/**
 * 建立自己的类Point
 */
class Point implements Cloneable, Comparable<Point>{
	public Point() {
		x = 0;
		y = 0;
	}
 
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
 
	public void setX(int x) {
		this.x = x;
	}
 
	public void setY(int y) {
		this.y = y;
	}
 
	public int getX() {
		return x;
	}
 
	public int getY() {
		return y;
	}
 
	private int x;
	private int y;
 
	@Override
	public int compareTo(Point o) {
		if(x == o.getX() && y == o.getY())
			return 0;
		else 
			return 1;
	}
}

