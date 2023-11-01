package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
		
	
	public Rectangle(double initLength, double initWidth) {
		this.length = initLength;
		this.width = initWidth;
	}
	
	public boolean isSmaller(Rectangle compare) {
		if (this.getArea() < compare.getArea()) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getArea() {
		return this.length * this.width;
	}
	
	public double getPerimeter() {
		return 2*this.length + 2*this.width;
	}
	
	public boolean isSquare() {
		if (this.length == this.width) {
			return true;
		}else {
			return false;
		}
	}
	
	public void draw(Color col) {
		StdDraw.setPenColor(col);
		StdDraw.setPenRadius(0.05);
		StdDraw.rectangle(0.5, 0.5, this.width/2, this.length/2);
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle (0.4, 0.3);
		Rectangle r2 = new Rectangle (0.9, 0.7);
		Rectangle r3 = new Rectangle (0.8, 0.8);
		System.out.println(r2.isSmaller(r1));
		System.out.println(r2.isSquare());
		r1.draw(Color.BLUE);
		r2.draw(Color.PINK);
		r3.draw(Color.cyan);
	}
	
	//getters and setters
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
