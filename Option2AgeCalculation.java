import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class Option2AgeCalculation {

    // These are all the GUI components in this program
    private JFrame windowFrame;
    private JPanel inputPanel;
    private JPanel outputPanel;
    private JLabel birthLabel;
    private JTextField dateEntryField;
    private JButton ageBtn;
    private JLabel ageCalculationLabel;

    // This is a constructor that will set up the GUI
    public Option2AgeCalculation() {
        windowFrame = new JFrame("Age Calculation");
        // This first panel will be asking the user for their birthday, and will include the 'calculate' button
        inputPanel = new JPanel();
        birthLabel = new JLabel("Pleas enter your birth date, in format YYYY-MM-DD:");
        dateEntryField = new JTextField(10);
        ageBtn = new JButton("Calculate");
        // This second panel will be where the result of their age is shown
        outputPanel = new JPanel();
        ageCalculationLabel = new JLabel("Your age will appear here.");

        inputPanel.add(birthLabel);
        inputPanel.add(dateEntryField);
        inputPanel.add(ageBtn);
        outputPanel.add(ageCalculationLabel);
        // This is the listener for the calculate button, to take action when it's clicked
        ageBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateAndDisplayAge();
            }
        });
        // Here is where the organization of the 2 panels is described (how they will be laid out in the jframe)
        windowFrame.setLayout(new BoxLayout(windowFrame.getContentPane(), BoxLayout.Y_AXIS));
        windowFrame.add(inputPanel);
        windowFrame.add(outputPanel);
        windowFrame.setSize(400, 300);
        windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowFrame.setVisible(true);
    }
    // This is a nethod that will calculate the age based on the entered birthdate
    private void calculateAndDisplayAge() {
        try {
            LocalDate birthDate = LocalDate.parse(dateEntryField.getText());
            LocalDate todayDate = LocalDate.now();
            Period ageGap = Period.between(birthDate, todayDate);
            // This is the display of the age after calculation has been done. Will appear in the second panel.
            ageCalculationLabel.setText("As of now it seems you are " + ageGap.getYears() + " years old.");
        } catch (Exception e) {
            ageCalculationLabel.setText("There seems to be an error. Please only enter a valid date");
        }
    }
    // This is the main method to officially launch the application (:
    public static void main(String[] args) {
        new Option2AgeCalculation(); 
}