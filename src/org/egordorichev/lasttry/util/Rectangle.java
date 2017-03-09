package org.egordorichev.lasttry.util;

public class Rectangle {
	public float x;
	public float y;
	public float width;
	public float height;

	public Rectangle(float x, float y, float width, float height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public Rectangle() {

	}

	public void setPosition(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public void setSize(float width, float height) {
		this.width = width;
		this.height = height;
	}
}