import java.time.*;
import javax.swing.*;

public class CalculateAgeProgram {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame ("Age Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        JPanel panel = new JPanel();
        JButton button = new JButton("Click Here to Calculate Age");

        button.addActionListener(e -> {
            try {
                String birthYear = JOptionPane.showInputDialog(frame, "Enter birth year (e.g., 2001):");
                String birthMonth = JOptionPane.showInputDialog(frame, "Enter birth month (1-12):");
                String birthDay = JOptionPane.showInputDialog(frame, "Enter birth day (1-31):");

                int year = Integer.parseInt(birthYear);
                int month = Integer.parseInt(birthMonth);
                int day = Integer.parseInt(birthDay);

                LocalDate birthDate = LocalDate.of(year, month, day);
                LocalDate today = LocalDate.now();

                int age = java.time.Period.between(birthDate, today).getYears();

                JOptionPane.showMessageDialog(frame, "Your age is: " + age);
                button.setText("Click Here to Try Another Date");
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Please enter only valid integers.");
            }
        });

        panel.add(button);
        frame.add(panel);
        frame.setVisible(true); 
    }
    
}