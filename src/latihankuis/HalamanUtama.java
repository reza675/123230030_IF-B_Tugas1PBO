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
public class HalamanUtama extends JFrame implements ActionListener { 
    JLabel labelSelamatDatang = new JLabel();
    JLabel labelPembuka = new JLabel("Silahkan pilih menu di bawah ini untuk membeli majalah");
    JButton buttonMajalahAnak = new JButton("Majalah Anak");
    JButton buttonMajalahRemaja = new JButton("Majalah Remaja");
    JButton buttonMajalahDewasa = new JButton("Majalah Dewasa");
    String username;

    HalamanUtama(String username) {
        this.username = username;
        setVisible(true);
        setSize(480, 360);
        setTitle("Halaman Utama");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(50, 50, 50));

        labelSelamatDatang.setText("Selamat Datang " + username);
        labelSelamatDatang.setFont(new Font("Arial", Font.BOLD, 20));  
        labelSelamatDatang.setForeground(Color.WHITE);
        labelSelamatDatang.setBounds(20,20,300,20);

        labelPembuka.setFont(new Font("Arial", Font.BOLD, 12));  
        labelPembuka.setForeground(Color.WHITE);
        labelPembuka.setBounds(20,60,360,20);

        buttonMajalahAnak.setBounds(20, 120, 400, 40);
        buttonMajalahAnak.setBackground(Color.BLUE);
        buttonMajalahAnak.setForeground(Color.WHITE);
        buttonMajalahAnak.setFont(new Font("Arial", Font.BOLD, 16));

        buttonMajalahRemaja.setBounds(20, 180, 400, 40);
        buttonMajalahRemaja.setBackground(Color.GREEN);
        buttonMajalahRemaja.setForeground(Color.WHITE);
        buttonMajalahRemaja.setFont(new Font("Arial", Font.BOLD, 16));

        buttonMajalahDewasa.setBounds(20, 240, 400, 40);
        buttonMajalahDewasa.setBackground(Color.orange);
        buttonMajalahDewasa.setForeground(Color.WHITE);
        buttonMajalahDewasa.setFont(new Font("Arial", Font.BOLD, 16));

        add(labelSelamatDatang);
        add(labelPembuka);
        add(buttonMajalahAnak);
        add(buttonMajalahDewasa);
        add(buttonMajalahRemaja);

        buttonMajalahAnak.addActionListener(this);
        buttonMajalahRemaja.addActionListener(this);
        buttonMajalahDewasa.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == buttonMajalahAnak) {             
                new HalamanPembelian(username,"Majalah Anak", 10800);
                this.dispose();
            } else if (e.getSource() == buttonMajalahRemaja) {
                new HalamanPembelian(username,"Majalah Remaja",15200);
                this.dispose();
            } else if (e.getSource() == buttonMajalahDewasa) {
                new HalamanPembelian(username,"Majalah Dewasa",25400);
                this.dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
}

