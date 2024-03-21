/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220174;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Lab Informatika
 */
public class Halamanutama extends JFrame implements ActionListener {

    public String username;
    JLabel welcome = new JLabel ("Selamat Datang!,[username]");
    JLabel labelmasuk = new JLabel ("Silakan Pilih Menu Di Bawah untuk Membeli Majalah");
    JButton majalahanak = new JButton ("Majalah Anak");
    JButton majalahremaja = new JButton ("Majalah Remaja");
    JButton majalahdewasa = new JButton ("Majalah Dewasa");
    
    Halamanutama (){
        setVisible (true);
        setSize (720,550);
        setTitle ("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add (welcome);
        welcome.setBounds (40,20,300,35);
        welcome.setFont(new Font ("Arial", Font.PLAIN,20));
        welcome.setText ("Welcome,"+ username);
        
        add (labelmasuk);
        labelmasuk.setBounds (40,60,300,35);
        labelmasuk.setFont(new Font ("Arial", Font.PLAIN,15));
        
        ButtonGroup pilihmajalah = new ButtonGroup ();
        pilihmajalah.add (majalahanak);
        pilihmajalah.add (majalahremaja);
        pilihmajalah.add (majalahdewasa);
        
        add (majalahanak);
        majalahanak.setBounds(40,80,500,35);
        majalahanak.addActionListener(this);
        
        add (majalahremaja);
        majalahremaja.setBounds(40,120,500,35);
        majalahremaja.addActionListener(this);
        
        add (majalahdewasa);
        majalahdewasa.setBounds(40,160,500,35);
        majalahdewasa.addActionListener(this);
    }

//    Halamanutama() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource ()== majalahanak){
                new Halamanpembelian ();
                this.dispose();
            } else if (e.getSource ()== majalahremaja){
                new Halamanpembelian ();
                this.dispose();
            }else if (e.getSource ()== majalahdewasa){
                new Halamanpembelian ();
                this.dispose();
            }
            
        }catch (Exception error){
            
        }
    }
}

