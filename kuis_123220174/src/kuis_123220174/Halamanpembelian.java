/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220174;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class Halamanpembelian extends JFrame implements ActionListener{
    
    JLabel labelhalaman = new JLabel ("Halaman Pembelian");
    JLabel labelkategori = new JLabel ("Kategori");
    JLabel labelharga = new JLabel ("Harga");
    JLabel labeljumlah = new JLabel ("Jumlah");
    JTextField inputjumlah = new JTextField ();
    JButton buttonbeli = new JButton ("Beli");
    JButton buttonkembali = new JButton ("Kembali");
    JLabel labelhasil = new JLabel ("Hasil");
    JLabel labelhargasatuan = new JLabel ("Harga satuan");
    JLabel labeljumlahhasil = new JLabel ("Jumlah");
    JLabel labeltotalharga = new JLabel ("Total harga");
    private Object majalahanak;
    private Object majalahremaja;
    private Object majalahdewasa;
    Halamanpembelian (){
        setVisible (true);
        setSize (720,550);
        setTitle ("Halaman Pembelian");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add (labelhalaman);
        labelhalaman.setBounds (40,20,300,35);
        labelhalaman.setFont(new Font ("Arial", Font.PLAIN,20));
        
        add (labelkategori);
        labelkategori.setBounds (40,60,300,35);
        labelkategori.setFont(new Font ("Arial", Font.PLAIN,20));
        
       
        add (labelharga);
        labelharga.setBounds (40,100,300,35);
        labelharga.setFont(new Font ("Arial", Font.PLAIN,20));
        
        
        add (labeljumlah);
        labeljumlah.setBounds (40,140,300,35);
        labeljumlah.setFont(new Font ("Arial", Font.PLAIN,20));
                
        add (inputjumlah);
        inputjumlah.setBounds(40,120,500,35);
        
        add (buttonbeli);
        buttonkembali.setBounds(40,200,500,35);
        buttonkembali.addActionListener(this);
        
        add (buttonkembali);
        buttonkembali.setBounds(40,240,500,35);
        buttonkembali.addActionListener(this);
        
        add (labelhasil);
        labelhasil.setBounds (40,280,300,35);
        labelhasil.setFont(new Font ("Arial", Font.PLAIN,20));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {     
            if(e.getSource ()== buttonkembali){
                new Halamanutama ();
                this.dispose();
            }else if (e.getSource() == buttonbeli){
                int jumlah = Integer.parseInt (inputjumlah.getText());
                
            }
         if(e.getSource ()== majalahanak){
                labelkategori.setText ("Majalah Anak");
                this.dispose();
            } else if (e.getSource ()== majalahremaja){
                labelkategori.setText ("Majalah Remaja");
                this.dispose();
            }else if (e.getSource ()== majalahdewasa){
                labelkategori.setText ("Majalah Dewasa");
                this.dispose();
            }
         if(e.getSource ()== majalahanak){
                labelkategori.setText ("Rp.12.700/pcs");
                this.dispose();
            } else if (e.getSource ()== majalahremaja){
                labelkategori.setText ("Rp.15.200/pcs");
                this.dispose();
            }else if (e.getSource ()== majalahdewasa){
                labelkategori.setText ("Rp.26.900/pcs");
                this.dispose();
            }
         double jumlah =Double.parseDouble(inputjumlah.getText());
        }catch (Exception error){
            
        }
    }
}

