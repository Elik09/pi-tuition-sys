package main.java.view;

import main.java.view.dashboard.bookDash;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bookeeperLogin extends JPanel implements ActionListener {

    final JTextField tf;
    JButton p3;
    JLabel label2;
    JPasswordField password;
    public bookeeperLogin() {
        JFrame f = new JFrame("Teacher login");
        f.setSize(1000, 1000);
        f.setVisible(true);


        password = new JPasswordField();
        password.setBounds(400, 400, 200, 40);
        password.setForeground(Color.BLACK);
        password.setMargin(new Insets(0, 0, 0, 40));

        tf = new JPasswordField(10);
        tf.setBounds(400, 400, 200, 40);

        label2 = new JLabel("User ID:");
        label2.setBounds(250, 400, 100, 40);
        label2.setFont(new Font("Tahoma", Font.ITALIC, 20));

        p3 = new JButton("Login");
        p3.setBounds(410, 500, 180, 40);

        f.add(password);
        f.add(label2);
        f.add(p3);
        f.add(tf);


        p3.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter
    {
        String passValue = password.getText();        //get user entered password from the tf

        //check whether the credentials are authentic or not
        if (passValue.equals("test1234")) {  //if authentic, navigate user to a new page

            //create instance of the NewPage
            bookDash page = new bookDash();

            //make page visible to the user
            page.setVisible(true);

            //create a welcome label and set it to the new page
            JLabel wel_label = new JLabel("Welcome: ");
            page.getContentPane().add(wel_label);
        }
        else{
            //show error message
            JOptionPane.showMessageDialog(this,"Please enter valid user ID");
        }
    }
}
