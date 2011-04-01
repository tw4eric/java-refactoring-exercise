package com.eric4tw.pair2;
public class Cordinate {
	int x;
	int y;
	public Cordinate(int aX, int aY) {
		x = aX;
		y = aY;
	}
	
	public  void  add(Cordinate cordinate){
		x += cordinate.x;
		y += cordinate.y;
	}

	private int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	private int getX() {
		// TODO Auto-generated method stub
		return x;
	}
}
