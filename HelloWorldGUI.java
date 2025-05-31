import javax.swing.*;
import java.awt.*;

public class HelloWorldGUI {
    public static void main(String[] args) {
        // Create the window on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            // Create a window
            JFrame frame = new JFrame("Hello World Application");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            
            // Create a label with Hello World text
            JLabel label = new JLabel("Hello World!");
            label.setFont(new Font("Arial", Font.BOLD, 50));
            label.setHorizontalAlignment(SwingConstants.CENTER);
            
            // Add the label to the window
            frame.add(label);
            
            // Center the window on the screen
            frame.setLocationRelativeTo(null);
            
            // Make the window visible
            frame.setVisible(true);
        });
    }
} 