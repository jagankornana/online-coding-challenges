package com.hackerrank.problems;

public class Point2D {

	private int x;
	private int y;

    Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double dist2D(Point2D p) {

		double var1 = Math.pow(p.getX() - this.getX(), 2);
		double var2 = Math.pow(p.getY() - this.getY(), 2);
        return Math.sqrt(var1 + var2);
	}

	public void printDistance(double d) {
		System.out.println("2D distance = " + (long) Math.ceil(d));
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

    int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
