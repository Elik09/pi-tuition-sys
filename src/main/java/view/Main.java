package main.java.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;


public class Main extends JFrame{

    public static JPanel mainContainer;
    Main() {
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


        JLabel heading = new JLabel("Lesson Booking System");
        heading.setBounds(80, 10, 3000, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        heading.setAlignmentY(Component.CENTER_ALIGNMENT);
        p1.add(heading);


        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(255, 255, 255));
        p2.setBounds(0, 65, 3000, 900);
        add(p2);

        JButton student = new JButton("STUDENT");
        student.setBounds(100, 300, 300, 50);
        student.setBackground(new Color(0, 0, 102));
        student.setForeground(Color.BLACK);
        student.setFont(new Font("Tahoma", Font.PLAIN, 20));
        student.setMargin(new Insets(0, 0, 0, 30));
        p2.add(student);

        JButton admin = new JButton("TEACHER");
        admin.setBounds(560, 300, 300, 50);
        admin.setBackground(new Color(0, 0, 102));
        admin.setForeground(Color.BLACK);
        admin.setFont(new Font("Tahoma", Font.PLAIN, 20));
        admin.setMargin(new Insets(0, 0, 0, 30));
        p2.add(admin);


        JButton bookKeeper = new JButton("LIBRARIAN");
        bookKeeper.setBounds(1050, 300, 300, 50);
        bookKeeper.setBackground(new Color(0, 0, 102));
        bookKeeper.setForeground(Color.BLACK);
        bookKeeper.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookKeeper.setMargin(new Insets(0, 0, 0, 30));
        p2.add(bookKeeper);

        setVisible(true);


   // admin to login
        student.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new studentLogin();
            }
        });

        admin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new teacherLogin();
            }
        });

        // bookkeeper login
        bookKeeper.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new bookeeperLogin();
            }
        });
    }










    public static void main(String[] args) {
        new Main();


    }
}
