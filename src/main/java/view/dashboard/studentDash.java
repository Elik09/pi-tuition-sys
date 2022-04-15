package main.java.view.dashboard;

import javax.swing.*;
import java.awt.*;

public class studentDash extends JFrame{
    public static JPanel mainContainer;

    public studentDash() {
        //  setBounds(0, 0, 1600, 1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);

        JLabel heading = new JLabel("Lesson Booking");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);


        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(255, 255, 255));;
        p2.setBounds(0, 65, 300, 900);
        add(p2);




        JButton stuDent = new JButton("My Details");
        stuDent.setBounds(0, 150, 300, 50);
        stuDent.setBackground(new Color(255, 255, 255));;
        stuDent.setForeground(Color.BLACK);
        stuDent.setFont(new Font("Tahoma", Font.PLAIN, 20));
        stuDent.setMargin(new Insets(0, 0, 0, 30));
        p2.add(stuDent);


        JButton studentCourse = new JButton("Book Course");
        studentCourse.setBounds(0, 250, 300, 50);
        studentCourse.setBackground(new Color(255, 255, 255));;
        studentCourse.setForeground(Color.BLACK);
        studentCourse.setFont(new Font("Tahoma", Font.PLAIN, 20));
        studentCourse.setMargin(new Insets(0, 0, 0, 30));
        p2.add(studentCourse);

        JButton stuBook = new JButton("Book a Book");
        stuBook.setBounds(0, 200, 300, 50);
        stuBook.setBackground(new Color(255, 255, 255));;
        stuBook.setForeground(Color.BLACK);
        stuBook.setFont(new Font("Tahoma", Font.PLAIN, 20));
        stuBook.setMargin(new Insets(0, 0, 0, 30));
        p2.add(stuBook);


        JButton studentAmend = new JButton("View/Amend Course");
        studentAmend.setBounds(0, 250, 300, 50);
        studentAmend.setBackground(new Color(255, 255, 255));;
        studentAmend.setForeground(Color.BLACK);
        studentAmend.setFont(new Font("Tahoma", Font.PLAIN, 20));
        studentAmend.setMargin(new Insets(0, 0, 0, 30));
        p2.add(studentAmend);





        setVisible(true);
    }

}
