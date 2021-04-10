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
public class Square extends TwoDimShape {
	// Define side 
	private int side;
	
	// Getters and Setters 
	public int getSide() {
		return side;}
	
	protected void setSide(int s) {
		side = s; 
	}
	
	// Constructors
	Square(int x, int y, int s, Color c){
		super.setCenterX(x);
		super.setCenterY(y);
		super.setColor(c);
	    side = s; 
		
	}
	
    Square(int x, int y, int s){
		super.setCenterX(x);
		super.setCenterY(y);
		super.setColor(Color.white);
		side = s; 	
	}

    
    //Overridden methods 
	@Override
	public double getArea() {
		return side * side; 		
	}

	@Override
	public void paintComponent(Graphics g) {
	     Graphics2D g2d = (Graphics2D) g;
	     g2d.setColor(super.getColor());
	     g2d.fillRect(getCenterX(), getCenterY(), side, side);
	}

	@Override
	public double getParameter() {
		return 4 * side;
		
	}

	@Override
	public void resize(int factor) {
		side = side * (int)(factor * 0.01); 
		repaint(); 
		
	} 
	

}
