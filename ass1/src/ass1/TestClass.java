package ass1;

/**
 * @author Alaa Alajmy
 */
import geometric.*; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color; 
public class TestClass {

	public static void main(String[] args) {
		// Create a frame
		JFrame frame = new JFrame();
		// Set exit on close operation
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    // Set frame size
	    frame.setSize(600, 600);
	    // Center frame on screen
	    frame.setLocationRelativeTo(null);
	    // Make a shape (circle will be drawn at top left)
	    Circle myCircle = new Circle(0, 0, 100, Color.black); 
	    // Test motion	(circle will be drawn a little below top)     
	    myCircle.goDown(10);
	    // Text resizing (Circle doubled in size)
	    myCircle.resize(200);
	    // Add shape
	    frame.add(myCircle);
	    
	    // Display frame
	    frame.setVisible(true);		 
	}

}
