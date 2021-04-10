/**
 * 
 */
package geometric;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color; 
import static java.lang.Math.PI;

/**
 * @author Alaa Alajmy
 *
 */
public class Circle extends TwoDimShape {
	// Define radius 
	private int radius;
	
	// Getters and Setters 
	public int getRadius() {
		return radius;}
	
	protected void setRadius(int r) {
		radius = r; 
	}
	
	// Constructors
	Circle(int x, int y, int r, Color c){
		super.setCenterX(x);
		super.setCenterY(y);
		super.setColor(c);
		radius = r; 
		
	}
	
    Circle(int x, int y, int r){
		super.setCenterX(x);
		super.setCenterY(y);
		super.setColor(Color.white);
		radius = r; 	
	}

    
    //Overridden methods 
	@Override
	public double getArea() {
		return PI * radius * radius; 		
	}

	@Override
	public void paintComponent(Graphics g) {
	     Graphics2D g2d = (Graphics2D) g;
	     g2d.setColor(super.getColor());
	     g2d.fillOval(getCenterX(), getCenterY(), radius, radius);
	}

	@Override
	public double getParameter() {
		return PI * radius * 2;
		
	}

	@Override
	public void resize(int factor) {
		radius = radius * (int)(factor * 0.01); 
		repaint(); 
		
	} 
	

}
