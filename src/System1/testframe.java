package System1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class testframe {
    public static void main(String[] args) {
        // Create and display the test frame on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    private static void createAndShowGUI() {
        // Create the main frame
        JFrame frame = new JFrame("Student Management System - Delete Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create and add your DeletePanel
        DeletePanel deletePanel = new DeletePanel();
        frame.add(deletePanel);
        
        // Set frame properties and make visible
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
        
        System.out.println("DeletePanel is running in a JFrame...");
    }
}