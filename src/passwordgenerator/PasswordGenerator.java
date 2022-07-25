package src.passwordgenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordGenerator implements ActionListener {
    JFrame jframe;

    PasswordGenerator() {
        jframe = new JFrame("Nimbus Look and Feel");
        Color c = new Color(204, 255, 255);
        // Setting background color for JFrame
        jframe.getContentPane().setBackground(c);
        jframe.setLayout(null);
        jframe.setTitle("Password Generator");
        jframe.setSize(400, 360);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");      // Look and feel
        } catch (Exception e) {
            System.out.println("Hello World");
        }
        PasswordGenerator spgobj = new PasswordGenerator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
