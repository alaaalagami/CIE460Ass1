/**
 * 
 */
package geometric;

import java.awt.Graphics;

/**
 * @author Alaa Alajmy
 *
 */
public abstract class ThreeDimShape extends Shape{
	// Define abstract methods of all Shapes
	public abstract double getSurfaceArea(); // Calculate surface area of 3D shape
	public abstract double getVolume(); // Calculate volume of 3D shape 
}
