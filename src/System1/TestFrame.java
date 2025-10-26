package System1;

import javax.swing.*;
import java.awt.*;

public class TestFrame extends JFrame {
    
    public TestFrame() {
        // Set up the main window
        setTitle("Student Search - TEST FRAME 🧪");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 500);
        setLocationRelativeTo(null); // Center the window
        
        // Create your SAUPanel and add it to the frame
        SAUPanel searchPanel = new SAUPanel();
        add(searchPanel);
        
        System.out.println("🚀 Test Frame Started!"); // Debug message
    }
    
    public static void main(String[] args) {
        System.out.println("🎯 Starting Student Search Test...");
        
        // This makes sure the GUI runs properly
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TestFrame frame = new TestFrame();
                frame.setVisible(true);
                System.out.println("✅ Frame is now visible!");
            }
        });
    }
}