package kr.ac.sejong.Java1;

public class Circle {
	//data 추상화 : x, y, r값 원 설명
	// 멤버변수
	private int x; 
	private int y;
	private int r;

	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public Circle() {
		
	}
	/** 
	 * 
	 * @param x1
	 * @param y1
	 * @param r1
	 */
	
	//procedure 추상화 : 넓이 반환
	public double getArea() {
		return 3.14*r*r;
	}
	//get method
	public int getX() {
		return x;
	}
	//set method
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	
}
