package Day08.Ex02_Shape;

public class Point {
	// 맴버변수 x,y
	int x,y;

	// alt + shift + s
	public Point() {
	}

	// 매개변수가 있는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// alt + shift + s -> generate tostring()...
	@Override
	public String toString() {
		return "Poing [x=" + x + ", y=" + y + "]";
	}
	
}


