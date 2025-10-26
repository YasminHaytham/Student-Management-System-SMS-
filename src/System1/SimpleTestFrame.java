package System1;

import javax.swing.*;

/**
 *
 * @author User
 */
public class SimpleTestFrame extends javax.swing.JFrame {

    public SimpleTestFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        HomePage homePage = new HomePage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management System - Home");
        setPreferredSize(new java.awt.Dimension(900, 500));

        getContentPane().add(homePage);

        pack();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleTestFrame().setVisible(true);
            }
        });
    }
}
