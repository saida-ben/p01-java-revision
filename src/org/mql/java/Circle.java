package org.mql.java;

import java.awt.Color;
import java.awt.Graphics;

public class Circle implements Shape{
	private int x, y;
	private int ray;
	private Color color = Color.black;
	
	
	public Circle(int x, int y, int ray) {
		super();
		this.x = x;
		this.y = y;
		this.ray = ray;
	}
	
	public Circle(int x, int y, int ray, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.ray = ray;
		this.color = color;
	}
	
	@Override
	public void draw(Graphics g) {
		//draw: designer le contour
		//draw: designer le contour et le colorer
        g.setColor(color);
		g.drawOval(x - ray, y - ray, 2 * ray, 2 * ray);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRay() {
		return ray;
	}

	public void setRay(int ray) {
		this.ray = ray;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}


	
	

} 
