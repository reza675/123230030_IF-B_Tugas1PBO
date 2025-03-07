/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;  
/**
 *
 * @author ASUS
 */
public class HalamanPembelian extends JFrame implements ActionListener{
    JLabel labelPembuka = new JLabel("Halaman Pembelian");
    JLabel labelKategori = new JLabel("Kategori");
    JLabel namaKategori = new JLabel();
    JLabel labelJumlahPembelian = new JLabel("Jumlah");
    JLabel labelhargaKategori = new JLabel("Harga");
    JLabel hargaKategori = new JLabel();
    JTextField jumlahPembelianTextField = new JTextField();
    JButton buttonBeli = new JButton("Beli");
    JButton buttonKembali = new JButton("Kembali");

    JLabel labelTotalPembelian = new JLabel("Total Pembelian");
    JLabel labelHargaSatuan = new JLabel("Harga Satuan");
    JLabel nilaiHargaSatuan = new JLabel();
    JLabel labelTotalJumlah = new JLabel("Jumlah");
    JLabel nilaiTotalJumlah = new JLabel();
    JLabel labelTotalHarga = new JLabel("Total Harga");
    JLabel nilaiTotalHarga = new JLabel();

    String parsingHargatoString;
    int hargaMajalah;
    String username;

    

    HalamanPembelian(String username,String jenisMajalah, int hargaMajalah){
        this.username = username;
        this.hargaMajalah = hargaMajalah;
        setVisible(true);
        setSize(480, 720);
        setTitle("Halaman Pembelian");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(50, 50, 50));

        DecimalFormatSymbols simbol = new DecimalFormatSymbols();
        simbol.setGroupingSeparator('.'); // Pemisah ribuan menjadi titik
        DecimalFormat formatRupiah = new DecimalFormat("#,###", simbol);
        
        labelPembuka.setFont(new Font("Arial", Font.BOLD, 20));  
        labelPembuka.setForeground(Color.WHITE);
        labelPembuka.setBounds(20,20,360,20);

        labelKategori.setFont(new Font("Arial", Font.BOLD,  16));  
        labelKategori.setForeground(Color.WHITE);
        labelKategori.setBounds(20,80,80,20);
        namaKategori.setText(jenisMajalah);
        namaKategori.setFont(new Font("Arial", Font.BOLD,  16));  
        namaKategori.setForeground(Color.WHITE);
        namaKategori.setBounds(220,80,200,20);

        labelhargaKategori.setFont(new Font("Arial", Font.BOLD,  16));  
        labelhargaKategori.setForeground(Color.WHITE);
        labelhargaKategori.setBounds(20,110,100,20);
        hargaKategori.setText("Rp"+formatRupiah.format(hargaMajalah)+" /pcs");
        hargaKategori.setFont(new Font("Arial", Font.BOLD,  16));  
        hargaKategori.setForeground(Color.WHITE);
        hargaKategori.setBounds(220,110,210,20);

        labelJumlahPembelian.setFont(new Font("Arial", Font.BOLD,  16));  
        labelJumlahPembelian.setForeground(Color.WHITE);
        labelJumlahPembelian.setBounds(20,140,100,20);
        jumlahPembelianTextField.setBounds(220, 140, 200, 25);

        buttonKembali.setBounds( 20, 180, 190, 40);
        buttonKembali.setBackground(Color.RED);
        buttonKembali.setForeground(Color.WHITE);
        buttonKembali.setFont(new Font("Arial", Font.BOLD, 14));

        buttonBeli.setBounds(230, 180, 190, 40);
        buttonBeli.setBackground(Color.GREEN);
        buttonBeli.setForeground(Color.WHITE);
        buttonBeli.setFont(new Font("Arial", Font.BOLD, 14));

        buttonBeli.addActionListener(this);
        buttonKembali.addActionListener(this);

        add(labelPembuka);
        add(labelKategori); 
        add(namaKategori);
        add(hargaKategori);
        add(labelhargaKategori);
        add(labelJumlahPembelian);
        add(jumlahPembelianTextField);
        add(buttonBeli);
        add(buttonKembali);

        add(labelTotalPembelian);
        add(labelHargaSatuan);
        add(nilaiHargaSatuan);
        add(labelTotalJumlah);
        add(nilaiTotalJumlah);
        add(labelTotalHarga);
        add(nilaiTotalHarga);
    }

    @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == buttonBeli) {
        try {
            int jumlahPembelian = Integer.parseInt(jumlahPembelianTextField.getText());
            int totalHarga = hargaMajalah * jumlahPembelian;

            DecimalFormatSymbols simbol = new DecimalFormatSymbols();
            simbol.setGroupingSeparator('.'); // Pemisah ribuan menjadi titik
            DecimalFormat formatRupiah = new DecimalFormat("#,###", simbol);

            labelTotalPembelian.setFont(new Font("Arial", Font.BOLD, 18));
            labelTotalPembelian.setForeground(Color.WHITE);
            labelTotalPembelian.setBounds(20, 240, 200, 20);

            labelHargaSatuan.setFont(new Font("Arial", Font.BOLD, 16));
            labelHargaSatuan.setForeground(Color.WHITE);
            labelHargaSatuan.setBounds(20, 270, 120, 20);
            nilaiHargaSatuan.setText("Rp" + formatRupiah.format(hargaMajalah));
            nilaiHargaSatuan.setFont(new Font("Arial", Font.BOLD, 16));
            nilaiHargaSatuan.setForeground(Color.WHITE);
            nilaiHargaSatuan.setBounds(220, 270, 200, 20);

            labelTotalJumlah.setFont(new Font("Arial", Font.BOLD, 16));
            labelTotalJumlah.setForeground(Color.WHITE);
            labelTotalJumlah.setBounds(20, 300, 120, 20);
            nilaiTotalJumlah.setFont(new Font("Arial", Font.BOLD, 16));
            nilaiTotalJumlah.setForeground(Color.WHITE);
            nilaiTotalJumlah.setBounds(220, 300, 200, 20);

            labelTotalHarga.setFont(new Font("Arial", Font.BOLD, 16));
            labelTotalHarga.setForeground(Color.WHITE);
            labelTotalHarga.setBounds(20, 330, 120, 20);
            nilaiTotalHarga.setFont(new Font("Arial", Font.BOLD, 16));
            nilaiTotalHarga.setForeground(Color.WHITE);
            nilaiTotalHarga.setBounds(220, 330, 200, 20);
            nilaiTotalJumlah.setText(jumlahPembelian + " pcs");
            nilaiTotalHarga.setText("Rp" + formatRupiah.format(totalHarga));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan jumlah yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else if (e.getSource() == buttonKembali) {
        new HalamanUtama(username);
        this.dispose();
    }
}
}

