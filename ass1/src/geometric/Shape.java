/**
 * 
 */
package geometric;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color; 

/**
 * @author Alaa Alajmy
 *
 */
public abstract class Shape extends Component{

	// Define Shape attributes
	private int centerX; // Center point horizontal coordinate
	private int centerY; // Center point vertical coordinate
	private Color color; // Shape color
	
	// Getters and Setters
	public int getCenterX(){
		return centerX;}
	
	public int getCenterY(){
		return centerY;}
	
	public Color getColor(){
		return color;}
	
	protected void setCenterX(int x){
		centerX = x;}
	
	protected void setCenterY(int y){
		centerY = y;}
	
	protected void setColor(Color c){
		color = c;}
		
	
	// Define abstract methods of all Shapes
	public abstract void paint(Graphics g); // Draw component when added to frame
	public abstract double getParameter(); // Calculate shape parameter 
	public abstract void resize(int factor); // Resize by a factor (in percent)
	
	// Define general motion methods of all shapes
	public void goUp(int steps){
		centerY = centerY - steps; 
		repaint(); 
	}
	
	public void goDown(int steps){
		centerY = centerY + steps;
		repaint(); 
	}
	
	public void goRight(int steps){
		centerX = centerX + steps;
		repaint(); 
	}
	
	public void goLeft(int steps){
		centerX = centerX - steps;
		repaint(); 
	}
	
}
