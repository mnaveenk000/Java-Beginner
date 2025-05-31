import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IfCondition {
    private static JTextArea resultArea;
    
    public static void main(String[] args) {
        // Create the main window
        JFrame frame = new JFrame("If Conditions Demo");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        // Create main panel with padding
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Age input
        JPanel agePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JLabel ageLabel = new JLabel("Enter Age: ");
        JTextField ageField = new JTextField(10);
        agePanel.add(ageLabel);
        agePanel.add(ageField);
        mainPanel.add(agePanel);

        // Temperature input
        JPanel tempPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel tempLabel = new JLabel("Enter Temperature (°C): ");
        JTextField tempField = new JTextField(10);
        tempPanel.add(tempLabel);
        tempPanel.add(tempField);
        mainPanel.add(tempPanel);

        // Score input
        JPanel scorePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel scoreLabel = new JLabel("Enter Score (0-100): ");
        JTextField scoreField = new JTextField(10);
        scorePanel.add(scoreLabel);
        scorePanel.add(scoreField);
        mainPanel.add(scorePanel);

        // Button
        JButton checkButton = new JButton("Check Conditions");
        mainPanel.add(checkButton);

        // Result area
        resultArea = new JTextArea(10, 40);
        resultArea.setEditable(false);
        resultArea.setMargin(new Insets(5, 5, 5, 5));
        JScrollPane scrollPane = new JScrollPane(resultArea);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(scrollPane);

        // Add action listener to button
        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int age = Integer.parseInt(ageField.getText());
                    int temperature = Integer.parseInt(tempField.getText());
                    int score = Integer.parseInt(scoreField.getText());
                    
                    StringBuilder result = new StringBuilder();
                    
                    // Age check
                    result.append("Age Check:\n");
                    if (age >= 18) {
                        result.append("You are eligible to vote!\n");
                    } else {
                        result.append("You are not eligible to vote yet.\n");
                    }
                    result.append("\n");

                    // Temperature check
                    result.append("Temperature Check:\n");
                    if (temperature > 30) {
                        result.append("It's a hot day!\n");
                    } else if (temperature > 20) {
                        result.append("The weather is pleasant.\n");
                    } else {
                        result.append("It's a cool day.\n");
                    }
                    result.append("\n");

                    // Score check
                    result.append("Score Check:\n");
                    if (score >= 90) {
                        result.append("Grade: A\n");
                    } else if (score >= 80) {
                        result.append("Grade: B\n");
                    } else if (score >= 70) {
                        result.append("Grade: C\n");
                    } else {
                        result.append("Grade: F\n");
                    }

                    resultArea.setText(result.toString());
                } catch (NumberFormatException ex) {
                    resultArea.setText("Please enter valid numbers in all fields.");
                }
            }
        });

        frame.add(mainPanel);
        frame.setLocationRelativeTo(null); // Center on screen
        frame.setVisible(true);
    }
} 