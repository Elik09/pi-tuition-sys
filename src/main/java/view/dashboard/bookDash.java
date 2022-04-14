package main.java.view.dashboard;

import javax.swing.*;
import java.awt.*;

public class bookDash extends JFrame{
    public static JPanel mainContainer;

    public bookDash() {
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




        JButton viewBookedCourses = new JButton("Available Books");
        viewBookedCourses.setBounds(0, 150, 300, 50);
        viewBookedCourses.setBackground(new Color(255, 255, 255));;
        viewBookedCourses.setForeground(Color.BLACK);
        viewBookedCourses.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewBookedCourses.setMargin(new Insets(0, 0, 0, 30));
        p2.add(viewBookedCourses);


        JButton addBooks = new JButton("Add Books");
        addBooks.setBounds(0, 200, 300, 50);
        addBooks.setBackground(new Color(255, 255, 255));;
        addBooks.setForeground(Color.BLACK);
        addBooks.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addBooks.setMargin(new Insets(0, 0, 0, 30));
        p2.add(addBooks);


        JButton availableBooks = new JButton("View/Amend Bookings");
        availableBooks.setBounds(0, 250, 300, 50);
        availableBooks.setBackground(new Color(255, 255, 255));;
        availableBooks.setForeground(Color.BLACK);
        availableBooks.setFont(new Font("Tahoma", Font.PLAIN, 20));
        availableBooks.setMargin(new Insets(0, 0, 0, 30));
        p2.add(availableBooks);





        setVisible(true);
    }

}




