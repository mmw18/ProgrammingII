import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;

public class Option2UiMenu extends JFrame {

    private JTextArea userTextDisplayBox;
    private JScrollPane scrollPane;

    public Option2UiMenu() {
        // This is where the frame is being set-up
        setTitle("Module 3 Option 2");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        userTextDisplayBox = new JTextArea();
        scrollPane = new JScrollPane(userTextDisplayBox);
        add(scrollPane, BorderLayout.CENTER);

        JMenuBar customMenuBar = new JMenuBar();
        JMenu actionsMenu = new JMenu("Click Here for Actions!");
        customMenuBar.add(actionsMenu);

        // This is where the menu options are being made, including titles that will make sense to the user
        JMenuItem menuOption1 = new JMenuItem("Print Date and Time");
        JMenuItem menuOption2 = new JMenuItem("Save Content to File");
        JMenuItem menuOption3 = new JMenuItem("Change Background to a Random Orange");
        JMenuItem menuOption4 = new JMenuItem("Exit Application");

        // Here we are adding the actual options to the actions menu
        actionsMenu.add(menuOption1);
        actionsMenu.add(menuOption2);
        actionsMenu.add(menuOption3);
        actionsMenu.add(menuOption4);

        // This is where the listeners are being attached to the specific menu options
        menuOption1.addActionListener(e -> displayCurrentDateTime());
        menuOption2.addActionListener(e -> writeContentToTxtFile());
        menuOption3.addActionListener(e -> randomizeBackgroundColor());
        menuOption4.addActionListener(e -> exitProgram());

        setJMenuBar(customMenuBar);
        setVisible(true);
    }

    // This is a method to show the date and time in the text area
    private void displayCurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        userTextDisplayBox.append("Your timestamp is: " + currentDateTime.toString() + "\n");
    }

    // This is a method that will allow the saving of the text area content to a txt file
private void writeContentToTxtFile() {
    String contentToSave = userTextDisplayBox.getText();
    if (contentToSave.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Sorry, there is no content to save in the text box. ):");
    } else {
        try (FileWriter fileWriter = new FileWriter("text.txt")) {
            fileWriter.write(contentToSave);
            JOptionPane.showMessageDialog(this, "Text has been saved to text.txt successfully!");
        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}


    // This is a method that will change the background color to a random shade of orange
    private void randomizeBackgroundColor() {
        Random randomValueGenerator = new Random();
        float randomHueInOrangeRange = randomValueGenerator.nextFloat() * 0.12f + 0.07f;
        Color generatedOrangeShade = Color.getHSBColor(randomHueInOrangeRange, 1.0f, 1.0f);
        
        // Changing the background color of the text area or scroll pane
        userTextDisplayBox.setBackground(generatedOrangeShade);
        scrollPane.getViewport().setBackground(generatedOrangeShade); // Now this will work
        
        JOptionPane.showMessageDialog(this, "Background color has been changed to a hue of the color orange!");
    }    

    // This is a method to simply exit the program
    private void exitProgram() {
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Option2UiMenu::new);
    }
}
