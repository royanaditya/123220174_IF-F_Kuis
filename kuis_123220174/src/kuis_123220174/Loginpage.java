/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220174;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class Loginpage extends JFrame implements ActionListener{

    
    JLabel welcome = new JLabel ("Welcome !");
    JLabel labelmasuk = new JLabel ("Silakan Masuk Untuk Lanjutkan");
    JLabel labelusername = new JLabel ("Username");
    JTextField inputusername = new JTextField ();
    JLabel labelpassword = new JLabel ("Password");
    JTextField inputpassword = new JTextField ();
    JButton buttonlogin = new JButton ("Login");
    
    Loginpage(){
        setVisible (true);
        setSize (720,550);
        setTitle ("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add (welcome);
        welcome.setBounds (40,20,300,35);
        welcome.setFont(new Font ("Arial", Font.PLAIN,30));
        
        add (labelmasuk);
        labelmasuk.setBounds (40,55,300,35);
        labelmasuk.setFont(new Font ("Arial", Font.PLAIN,15));
        
        add (labelusername);
        labelusername.setBounds (40,90,300,35);
        labelusername.setFont(new Font ("Arial", Font.PLAIN,15));
        
        add (inputusername);
        inputusername.setBounds(40,120,500,35);
        
        add (labelpassword);
        labelpassword.setBounds (40,170,300,35);
        labelpassword.setFont(new Font ("Arial", Font.PLAIN,15));
        
        add (inputpassword);
        inputpassword.setBounds(40,200,500,35);
        
        add (buttonlogin);
        buttonlogin.setBounds(40,340,500,35);
        buttonlogin.addActionListener(this);
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
        String username = inputusername.getText();
        String password = inputpassword.getText();
        if (!username.equals ("123220174") || !password.equals("12345")){
            
                throw new Exception ("USERNAME / PASSWORD ANDA SALAH !");
           
        }
        new Halamanutama ();
        this.dispose();
         } catch (Exception error) {
               JOptionPane.showMessageDialog(this,error.getMessage());
            }
        
    }
}
