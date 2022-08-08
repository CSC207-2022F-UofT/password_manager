package src.controller;

import src.UI.Button;
import src.UI.Label;
import src.UI.TextArea;
import src.UI.TextField;
import src.UI.*;

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
        Color c = new Color(204,255,255);
        dialogBox.jframe.getContentPane().setBackground(c);

    // Create a label
        Label label = new Label();
        label.createLabel(dialogBox.jframe, "Password Length:", Color.blue, 90,40,150,20);

    //creating a Combobox to get the password length from the user
    String[] comboBoxItems = {"8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
        ComboBox comboBox = new ComboBox();
        comboBox.createComboBox(dialogBox.jframe, comboBoxItems, Color.black,230,40,50,20);
        comboBox.comboBox.setForeground(Color.black);

    //Creating radio checkboxes to get the password type from the user
        RadioBox radioBox = new RadioBox();
        //Creating radiobox for Lowercase letters
        radioBox.createRadioButton(dialogBox.jframe, "Lowercase", Color.black,110,70,170,30);
        radioBox.radioButton.setForeground(Color.black);
        radioBox.radioButton.setBackground(c);
        //Creating radiobox for Uppercase letters
        radioBox.createRadioButton(dialogBox.jframe, "Uppercase", Color.black,110,100,170,30);
        radioBox.radioButton.setForeground(Color.black);
        radioBox.radioButton.setBackground(c);
        //Creating radiobox for Numbers
        radioBox.createRadioButton(dialogBox.jframe, "Numbers", Color.black,110,130,150,30);
        radioBox.radioButton.setForeground(Color.black);
        radioBox.radioButton.setBackground(c);
        //Creating radiobox for Special characters
        radioBox.createRadioButton(dialogBox.jframe, "Special Characters", Color.black,110,160,150,30);
        radioBox.radioButton.setForeground(Color.black);
        radioBox.radioButton.setBackground(c);

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

    public static void main(String[] args) {
        // TODO code application logic here
        UIController BaseUI = new UIController();
        BaseUI.createPasswordGeneratorBox();
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
