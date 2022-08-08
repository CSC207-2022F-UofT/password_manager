package src.controller;

import src.UI.DialogBox;
import src.UI.Label;
import src.UI.TextArea;
import src.UI.ComboBox;
import src.UI.RadioBox;
import src.UI.Button;
import src.UI.TextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIController implements ActionListener {
    public void createPasswordGeneratorBox() {

    // Generating a DialogBox object
        DialogBox dialogBox = new DialogBox();
        dialogBox.createDialogBox("Password Generator", 400, 360);
        dialogBox.jframe.setVisible(true);
        dialogBox.jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dialogBox.jframe.setResizable(false);

    // Create a label
        Label label = new Label();
        label.createLabel(dialogBox.jframe, "Password Length:", Color.blue, 90,40,150,20);

    //creating a Combobox to get the password length from the user
    String[] comboBoxItems = {"8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
        ComboBox comboBox = new ComboBox();
        comboBox.createComboBox(dialogBox.jframe, comboBoxItems, Color.blue,230,40,50,20);

    //Creating radio checkboxes to get the password type from the user
        RadioBox radioBox = new RadioBox();
        //Creating radiobox for Lowercase letters
        radioBox.createRadioButton(dialogBox.jframe, "Lowercase", Color.blue,110,70,170,30);
        //Creating radiobox for Uppercase letters
        radioBox.createRadioButton(dialogBox.jframe, "Uppercase", Color.blue,110,100,170,30);
        //Creating radiobox for Numbers
        radioBox.createRadioButton(dialogBox.jframe, "Numbers", Color.blue,110,130,150,30);
        //Creating radiobox for Special characters
        radioBox.createRadioButton(dialogBox.jframe, "Special Characters", Color.blue,110,160,150,30);


    //Creating Button to generate the password
        Button button = new Button();
        button.createButton(dialogBox.jframe, "Generate Password", Color.blue,130,195,100,30);
        button.button.addActionListener(this);
        button.button.setForeground(Color.blue);
        button.button.setBackground(Color.white);

    //Creating a text Area to display the generated password
        TextArea textArea = new TextArea();
        textArea.createTextArea(dialogBox.jframe, "", Color.blue,40,240,310,35);
        textArea.textArea.setEditable(false);
        textArea.textArea.setAlignmentX(SwingConstants.CENTER);
    }

    public void createStrengthCheckerBox() {
        DialogBox dialogBox = new DialogBox();
        dialogBox.createDialogBox("Strength Checker", 400, 360);
        Label label = new Label();
        label.createLabel(dialogBox.jframe, "Enter your password to check its strength", Color.blue,70,60,260,30);
        TextField passwordTextField = new TextField();
        passwordTextField.createTextField(dialogBox.jframe);
    }

    /**
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Generate Password")) {
            createPasswordGeneratorBox();
        } else if (e.getActionCommand().equals("Strength Checker")) {
            createStrengthCheckerBox();
        }

    }
}
