import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;

public class window {
   public static void main(String[] args) {
        JFrame newFrame = new JFrame("My First GUI");
        newFrame.setSize(300, 300);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel for better layout
        JPanel panel = new JPanel(new BorderLayout());

        // Create a label with Hello World text
        JLabel label = new JLabel("Hello Naveen kumar!");
        label.setFont(new Font("Arial", Font.BOLD, 50));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Create a button
        JButton button = new JButton("Click Me!");
        button.setBackground(Color.RED);   
        button.setSize(100, 100);    
        // Add components to panel
        panel.add(label, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);

        // Add panel to frame
        newFrame.add(panel);
        newFrame.setVisible(true);
    }
}