/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 *
 * @author ASUS
 */
public class HalamanLogin extends JFrame implements ActionListener {
    JLabel usernameLabel = new JLabel("Username: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JLabel labelLogin = new JLabel("Login Page");

    JTextField usernameTextField = new JTextField();
    JPasswordField passwordTextField = new JPasswordField();

    JButton buttonLogin = new JButton("Login");
    JButton resetLogin = new JButton("Reset");

    HalamanLogin() {
        setVisible(true);
        setSize(480, 360);
        setTitle("Halaman Login");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(50, 50, 50));

        labelLogin.setForeground(Color.WHITE);
        usernameLabel.setForeground(Color.WHITE);
        passwordLabel.setForeground(Color.WHITE);
        
        labelLogin.setFont(new Font("Arial", Font.BOLD, 20));
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 14));

        add(labelLogin);
        add(usernameLabel);
        add(passwordLabel);
        add(usernameTextField);
        add(passwordTextField);
        add(buttonLogin);
        add(resetLogin);

        labelLogin.setBounds(180, 20, 160, 30);
        usernameLabel.setBounds(20, 80, 100, 20);
        usernameTextField.setBounds(20, 105, 420, 32);

        passwordLabel.setBounds(20, 150, 100, 20);
        passwordTextField.setBounds(20, 175, 420, 32);

        buttonLogin.setBounds(120, 230, 100, 40);
        resetLogin.setBounds(240, 230, 100, 40);

        buttonLogin.setBackground(new Color(0, 150, 0));
        buttonLogin.setForeground(Color.WHITE);
        buttonLogin.setFont(new Font("Arial", Font.BOLD, 14));
        
        resetLogin.setBackground(new Color(200, 0, 0));
        resetLogin.setForeground(Color.WHITE);
        resetLogin.setFont(new Font("Arial", Font.BOLD, 14));

        buttonLogin.addActionListener(this);
        resetLogin.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == buttonLogin) {
                String username = usernameTextField.getText();
                String password = new String(passwordTextField.getPassword());

                if (username.equals("123230030") && password.equals("pass12345")) {
                    JOptionPane.showMessageDialog(this, "Login Berhasil!");
                    new HalamanUtama(username);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this,"username atau password tidak valid");
                }
            } else if (e.getSource() == resetLogin) {
                usernameTextField.setText("");
                passwordTextField.setText("");
                
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
}
