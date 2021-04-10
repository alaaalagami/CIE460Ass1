package ass1;

/**
 * @author Alaa Alajmy
 */
import geometric.*; 
import javax.swing.JFrame;
import javax.swing.JPanel;
public class TestClass {

	public static void main(String[] args) {
		// Create a frame
		JFrame frame = new JFrame();
		// Create a panel
		JPanel panel = new JPanel();
		// Add panel to frame
		frame.add(panel); 
		// Set exit on close operation
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    // Set frame size
	    frame.setSize(600, 600);
	    // Center frame on screen
	    frame.setLocationRelativeTo(null);
	    // Display frame
	    frame.setVisible(true);		 
	}

}
