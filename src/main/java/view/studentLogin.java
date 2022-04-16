package main.java.view;

import main.java.view.dashboard.studentDash;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class studentLogin extends JFrame implements ActionListener {

    JButton btnLogin;
    JButton btnRegister;
    JButton reg;
    JLabel heading;
    JLabel heading2;
    final JTextField txtUserId;

    JPasswordField pass;

    public studentLogin() {
        JFrame f = new JFrame("Student login");
        f.setSize(1000, 1000);
        f.setVisible(true);

        heading = new JLabel("Login");
        heading.setBounds(500, 100, 300, 65);
        heading.setForeground(Color.BLACK);
        heading.setFont(new Font("Tahoma", Font.BOLD, 50));

        heading2 = new JLabel("User Id");
        heading2.setBounds(400, 220, 300, 40);
        heading2.setForeground(Color.BLACK);
        heading2.setFont(new Font("Tahoma", Font.ITALIC, 20));


        pass = new JPasswordField();
        pass.setBounds(410, 280, 250, 60);
        pass.setForeground(Color.BLACK);
        pass.setMargin(new Insets(0, 0, 0, 0));

        txtUserId = new JPasswordField(10);
        txtUserId.setBounds(410, 280, 250, 60);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(410, 390, 250, 60);


        reg = new JButton("Register");
        reg.setBounds(410, 480, 250, 60);

        btnRegister = new JButton("Login");
        btnRegister.setBounds(410, 430, 250, 60);


        f.add(heading2);
        f.add(heading);
        f.add(txtUserId);
        f.add(pass);
        f.add(btnLogin);
        f.add(reg);
        f.add(btnRegister);
        f.setVisible(true);

        btnLogin.addActionListener(this);
        reg.addActionListener(this);

        reg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new RegisterForm();
            }
        });

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter
            {
                String passValue = txtUserId.getText();        //get user entered password from the tf

                //check whether the credentials are authentic or not
                if (passValue.equals("test1234")) {  //if authentic, navigate user to a new page

                    //create instance of the NewPage
                    studentDash page = new studentDash();

                    //make page visible to the user
                    page.setVisible(true);

                    //create a welcome label and set it to the new page
                    //  JLabel wel_label = new JLabel("Welcome: ");
                    // page.getContentPane().add(wel_label);
                } else {
                    //show error message
                    JOptionPane.showMessageDialog( null, "Please enter valid user ID");
                }

            }
        });



        }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}






