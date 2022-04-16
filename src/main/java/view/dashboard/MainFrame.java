package main.java.view.dashboard;

import main.java.view.controls.studentLogins;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    public static JPanel mainContainer;

    public MainFrame() {
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

        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBackground(new Color(255, 255, 255));
        p3.setBounds(300, 65, 1500, 900);
        add(p3);

        JLabel heading1 = new JLabel("Welcome To PI Lesson Booking");
        heading1.setBounds(200, 20, 600, 40);
        heading1.setForeground(Color.BLACK);
        heading1.setFont(new Font("Tahoma", Font.BOLD, 30));
        p3.add(heading1);


        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);

        JButton registerStudent = new JButton("Register Student");
        registerStudent.setBounds(0, 0, 300, 50);
        registerStudent.setBackground(new Color(255, 255, 255));
        registerStudent.setForeground(Color.BLACK);
        registerStudent.setFont(new Font("Tahoma", Font.PLAIN, 20));
        registerStudent.setMargin(new Insets(0, 0, 0, 30));
        p2.add(registerStudent);

        JButton registeredStudent = new JButton("View Students");
        registeredStudent.setBounds(0, 50, 300, 50);
        registeredStudent.setBackground(new Color(255, 255, 255));
        registeredStudent.setForeground(Color.BLACK);
        registeredStudent.setFont(new Font("Tahoma", Font.PLAIN, 20));
        registeredStudent.setMargin(new Insets(0, 0, 0, 30));
        p2.add(registeredStudent);

        JButton bookCourses = new JButton("Book Courses");
        bookCourses.setBounds(0, 100, 300, 50);
        bookCourses.setBackground(new Color(255, 255, 255));
        bookCourses.setForeground(Color.BLACK);
        bookCourses.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookCourses.setMargin(new Insets(0, 0, 0, 30));
        p2.add(bookCourses);

        JButton viewBookedCourses = new JButton("View Booked Courses");
        viewBookedCourses.setBounds(0, 150, 300, 50);
        viewBookedCourses.setBackground(new Color(255, 255, 255));
        bookCourses.setForeground(Color.BLACK);
        viewBookedCourses.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewBookedCourses.setMargin(new Insets(0, 0, 0, 30));
        p2.add(viewBookedCourses);


        JButton changeCourses = new JButton("Change Booking");
        changeCourses.setBounds(0, 200, 300, 50);
        changeCourses.setBackground(new Color(255, 255, 255));
        bookCourses.setForeground(Color.BLACK);
        changeCourses.setFont(new Font("Tahoma", Font.PLAIN, 20));
        changeCourses.setMargin(new Insets(0, 0, 0, 30));
        p2.add(changeCourses);

        JButton availableBooks = new JButton("View/Amend Books");
        availableBooks.setBounds(0, 250, 300, 50);
        availableBooks.setBackground(new Color(255, 255, 255));
        bookCourses.setForeground(Color.BLACK);
        availableBooks.setFont(new Font("Tahoma", Font.PLAIN, 20));
        availableBooks.setMargin(new Insets(0, 0, 0, 30));
        p2.add(availableBooks);

        JButton courseRating = new JButton("Rate Lesson");
        courseRating.setBounds(0, 300, 300, 50);
        courseRating.setBackground(new Color(255, 255, 255));
        bookCourses.setForeground(Color.BLACK);
        courseRating.setFont(new Font("Tahoma", Font.PLAIN, 20));
        courseRating.setMargin(new Insets(0, 0, 0, 30));
        p2.add(courseRating);

        JButton endLessonReport = new JButton("Reports");
        endLessonReport.setBounds(0, 350, 300, 50);
        endLessonReport.setBackground(new Color(255, 255, 255));
        bookCourses.setForeground(Color.BLACK);
        endLessonReport.setFont(new Font("Tahoma", Font.PLAIN, 20));
        endLessonReport.setMargin(new Insets(0, 0, 0, 30));
        p2.add(endLessonReport);


        setVisible(true);


        registerStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
              studentLogins login =  new studentLogins();
              login.setVisible(true);

            }
        });


    }




        }




