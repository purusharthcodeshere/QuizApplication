package application.quiz;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    JLabel loginPageImage, heading;

    Login () {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon loginPageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        this.loginPageImage = new JLabel(loginPageIcon);
        loginPageImage.setBounds(0, 0, 600, 500);
        add(loginPageImage);

        this.heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(104, 0, 161));
        add(heading);


        setSize(1200, 500);
        setLocation(200, 150);


        setVisible(true);
    }

    public static void main(String[] args) {
        //Anonymous Class object
        new Login();
    }
}
