package UI;

import controller.PasswordGeneratorUIControl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class PasswordGeneratorBox implements ActionListener {
    DialogBox dialogBox;
    ComboBox comboBox;
    UI.textArea textArea;
    Button button;
    Label label;
    RadioBox lcbox, ucbox, numbox, spcbox;
    Icon icon;


    public void createPasswordGeneratorBox() {

        // Generating a DialogBox object
        dialogBox = new DialogBox();
        dialogBox.createDialogBox("Password Generator", 400, 360);
        dialogBox.jframe.setVisible(true);
        dialogBox.jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dialogBox.jframe.setResizable(false);
        Color c = new Color(204,255,255);
        dialogBox.jframe.getContentPane().setBackground(c);

        // Create a label
        label = new Label();
        label.createLabel(90,40,150,20,dialogBox.jframe, "Password Length:", Color.blue);

        //creating a Combobox to get the password length from the user
        comboBox = new ComboBox();
        String[] comboBoxItems = {"8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
        comboBox.createComboBox(dialogBox.jframe, comboBoxItems, Color.white,230,40,50,20);
        comboBox.comboBox.setForeground(Color.black);

        //Creating radio checkboxes to get the password type from the user
        //Creating radiobox for Lowercase letters
        lcbox = new RadioBox();
        lcbox.createRadioButton(dialogBox.jframe, "Lowercase", Color.white,110,70,170,30);
        lcbox.radioButton.setForeground(Color.black);
        lcbox.radioButton.setBackground(c);
        //Creating radiobox for Uppercase letters
        ucbox = new RadioBox();
        ucbox.createRadioButton(dialogBox.jframe, "Uppercase", Color.white,110,100,170,30);
        ucbox.radioButton.setForeground(Color.black);
        ucbox.radioButton.setBackground(c);
        //Creating radiobox for numbox
        numbox = new RadioBox();
        numbox.createRadioButton(dialogBox.jframe, "Numbers", Color.white,110,130,150,30);
        numbox.radioButton.setForeground(Color.black);
        numbox.radioButton.setBackground(c);
        //Creating radiobox for Special characters
        spcbox = new RadioBox();
        spcbox.createRadioButton(dialogBox.jframe, "Special Characters", Color.white,110,160,150,30);
        spcbox.radioButton.setForeground(Color.black);
        spcbox.radioButton.setBackground(c);

        //Creating Button to generate the password
        icon = new Icon();
        icon.createIcon("../resources/icons/password.png");

        button = new Button();
        button.createButtonWithIcon(dialogBox.getJframe(), "Generate Password",icon.icon,130,195,100,30 );
        button.button.addActionListener(this);
        button.button.setForeground(Color.blue);
        button.button.setBackground(Color.white);

        //Creating a text Area to display the generated password
        textArea = new textArea();
        textArea.createTextArea(dialogBox.jframe, "", Color.blue,40,240,310,35);
        textArea.TextArea.setEditable(false);
        textArea.TextArea.setAlignmentX(SwingConstants.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int passwordlen = Integer.parseInt(Objects.requireNonNull(comboBox.comboBox.getSelectedItem()).toString());
        String choices = "";
        //concatinating the choices based on the checkboxes selected
        if(lcbox.isSelected()){
            choices += "L";
        }
        if(ucbox.isSelected()){
            choices += "U";
        }
        if(numbox.isSelected()){
            choices += "N";
        }
        if(spcbox.isSelected()){
            choices += "S";
        }
        if(choices.equals("")){
            JOptionPane.showMessageDialog(dialogBox.jframe, "Please select atleast one option");
        }

        PasswordGeneratorUIControl passwordGeneratorUIControl = new PasswordGeneratorUIControl();
        passwordGeneratorUIControl.performPasswordGeneration(passwordlen, choices);
        textArea.TextArea.setFont(new Font("Serif",Font.PLAIN,20));
        textArea.TextArea.setText(passwordGeneratorUIControl.getResult());
    }
}
