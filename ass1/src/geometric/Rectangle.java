/**
 * 
 */
package geometric;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color; 

/**
 * @author Alaa Alajmy
 *
 */
public class Rectangle extends TwoDimShape {
	// Define length 
	private int length;
	// Define Width
	private int width; 
	
	// Getters and Setters 
	public int getLength() {
		return length;}
	
	public int getWidth() {
		return width;}
	
	protected void setLength(int l) {
		length = l; 
	}
	
	protected void setWidth(int w) {
		width = w; 
	}
	
	// Constructors
	public Rectangle(int x, int y, int l, int w, Color c){
		super.setCenterX(x);
		super.setCenterY(y);
		super.setColor(c);
	    length = l;
	    width = w; 
		
	}
	
    public Rectangle(int x, int y, int l, int w){
		super.setCenterX(x);
		super.setCenterY(y);
		super.setColor(Color.white);
		length = l;
	    width = w;	}

    
    //Overridden methods 
	@Override
	public double getArea() {
		return length * width; 		
	}

	@Override
	public void paint(Graphics g) {
	     Graphics2D g2d = (Graphics2D) g;
	     g2d.setColor(super.getColor());
	     g2d.fillRect(getCenterX(), getCenterY(), length, width);
	}

	@Override
	public double getParameter() {
		return 2 * length + 2 * width;
		
	}

	@Override
	public void resize(int factor) {
		length = length * (int)(factor * 0.01); 
		width = width * (int)(factor * 0.01); 
		repaint(); 
		
	} 
	

}
