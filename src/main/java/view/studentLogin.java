package main.java.view;

import main.java.model.Student;
import main.java.respository.StudentRepository;
import main.java.util.Data;
import main.java.view.dashboard.MainFrame;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class studentLogin extends JInternalFrame {


    private JButton btnLogin;
    private JButton btnRegister;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    public JTextField txtUserId;
    private final StudentRepository studentRepository;

    /**
     * Creates new form LoginForm
     */

    public studentLogin() {
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
        txtUserId = new JTextField();
        btnRegister = new JButton();
        btnLogin = new JButton();

        setBackground(new Color(255, 255, 255));

        jLabel1.setFont(new Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new Color(0, 120, 215));
        jLabel1.setText("Login");

        jLabel2.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("User ID");

        txtUserId.setFont(new Font("Tahoma", 0, 18)); // NOI18N

        btnRegister.setBackground(new Color(19, 164, 172));
        btnRegister.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        btnRegister.setForeground(new Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });

        btnLogin.setBackground(new Color(0, 120, 215));
        btnLogin.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setForeground(new Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(jLabel1)
                                .addContainerGap(209, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addComponent(txtUserId)
                                        .addComponent(btnRegister, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel1)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUserId, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegister, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(279, Short.MAX_VALUE)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(250, 250, 250))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(174, Short.MAX_VALUE)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131))
        );

        pack();
    }


        private void btnLoginMouseClicked(MouseEvent evt) {
            if(txtUserId.getText().trim().equals("")){
                JOptionPane.showMessageDialog(this, "User ID cannot be empty.");
            }
            else {
                Student student = studentRepository.findById(txtUserId.getText().trim());

               if(student != null){
                    Data.user = student.getId();
                    MainFrame.mainContainer.removeAll();
                    MainFrame mainFrame = new MainFrame();
                    mainFrame.setSize(MainFrame.mainContainer.getSize());
                    MainFrame.mainContainer.add(mainFrame).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(this, "User does not exist.");
                }
            }
        }

        private void btnRegisterMouseClicked(MouseEvent evt) {
            MainFrame.mainContainer.removeAll();
            RegisterForm registerForm = new RegisterForm();
            registerForm.setSize(MainFrame.mainContainer.getSize());
            MainFrame.mainContainer.add(registerForm).setVisible(true);
        }
}







