package main.java.view;
import main.java.model.Student;
import main.java.model.enums.Gender;
import main.java.respository.StudentRepository;
//import main.java.view.dashboard.MainFrame.mainContainer;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static main.java.view.Main.mainContainer;


public class RegisterForm extends JInternalFrame {

    private JButton btnLogin;
    private JButton btnRegister;
    private JComboBox<Gender> cmbGender;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTextArea txtAddress;
    private JTextField txtContact;
    private JFormattedTextField txtDob;
    private JTextField txtName;
    private final StudentRepository studentRepository;

    /**
     * Creates new form LoginForm
     */

    public RegisterForm() {
        initComponents();

        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);

        studentRepository = new StudentRepository();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        txtName = new JTextField();
        btnRegister = new JButton();
        btnLogin = new JButton();
        cmbGender = new JComboBox<Gender>(Gender.values());
        jLabel3 = new JLabel();
        txtContact = new JTextField();
        jLabel4 = new JLabel();
        txtDob = new JFormattedTextField();
        jLabel5 = new JLabel();
        jScrollPane1 = new JScrollPane();
        txtAddress = new JTextArea();
        jLabel6 = new JLabel();

        setBackground(new Color(255, 255, 255));

        jLabel1.setFont(new Font("Tahoma", 1, 48));
        jLabel1.setForeground(new Color(19, 164, 172));
        jLabel1.setText("Register");

        jLabel2.setFont(new Font("Tahoma", 0, 18));
        jLabel2.setText("Full Name");

        txtName.setFont(new Font("Tahoma", 0, 18));

        btnRegister.setBackground(new Color(19, 164, 172));
        btnRegister.setFont(new Font("Tahoma", 1, 18));
        btnRegister.setForeground(new Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });

        btnLogin.setBackground(new Color(0, 120, 215));
        btnLogin.setFont(new Font("Tahoma", 1, 18));
        btnLogin.setForeground(new Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        jLabel3.setFont(new Font("Tahoma", 0, 18));
        jLabel3.setText("Gender");

        txtContact.setFont(new Font("Tahoma", 0, 18));

        jLabel4.setFont(new Font("Tahoma", 0, 18));
        jLabel4.setText("Emergency Contact Number");

        txtDob.setFormatterFactory(new DefaultFormatterFactory(new DateFormatter(new java.text.SimpleDateFormat("d/M/yyyy"))));

        jLabel5.setFont(new Font("Tahoma", 0, 18));
        jLabel5.setText("Date of Birth");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jLabel6.setFont(new Font("Tahoma", 0, 18));
        jLabel6.setText("Address");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel5)
                                                .addComponent(btnRegister, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                                .addComponent(txtContact, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel3)
                                                .addComponent(txtName, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel1)
                                                .addComponent(cmbGender, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtDob)
                                                .addComponent(jScrollPane1)))
                                .addGap(140, 140, 140))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbGender, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContact, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel5)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDob, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnRegister, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(24, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnLoginMouseClicked(MouseEvent evt) {
        mainContainer.removeAll();
        studentLogin loginForm = new studentLogin();
        loginForm.setSize(mainContainer.getSize());
        mainContainer.add(loginForm).setVisible(true);
    }

    private void btnRegisterMouseClicked(MouseEvent evt) {
        Student student = studentRepository.registerStudent(txtName.getText(), (Gender) cmbGender.getSelectedItem(), txtAddress.getText(), txtContact.getText(), txtDob.getText());
        JOptionPane.showMessageDialog(this, "Student registered successfully.\n ID is "+student.getId());
        mainContainer.removeAll();
        studentLogin loginForm = new studentLogin();
        loginForm.txtUserId.setText(student.getId());
        loginForm.setSize(mainContainer.getSize());
        mainContainer.add(loginForm).setVisible(true);
    }
}
