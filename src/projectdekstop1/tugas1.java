/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdekstop1;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ardya
 */
public class tugas1 {
      public static void main(String[] args) {
        
        JFrame j = new JFrame("latihan 1");
        
        JLabel Register = new JLabel();
        Register.setText("Register");
        Register.setBounds(50, 50, 100, 30);
        j.add(Register);
       
        JLabel nama= new JLabel();
        nama.setText("nama");
        nama.setBounds(50, 100, 100, 30);
        j.add(nama);
        
         JTextField namaTxt = new JTextField();
        namaTxt.setBounds(150, 100 , 200, 30);
        j.add(namaTxt);
              
        JLabel username = new JLabel();
        username.setText("username");
        username.setBounds(50, 150, 100, 30);
        j.add(username);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(150, 150, 200, 30);
        j.add(usernameTxt);
        
        JLabel password = new JLabel();
        password.setText("password");
        password.setBounds(50, 200, 100, 30);
        j.add(password);
        
         JPasswordField passwordTxt = new JPasswordField();
        passwordTxt.setBounds(150, 200, 200, 30);
        j.add(passwordTxt);
        
         JLabel email = new JLabel();
        email.setText("email");
        email.setBounds(50, 250, 100, 30);
        j.add(email);
        
         JTextField emailTxt = new JTextField();
        emailTxt.setBounds(150, 250, 200, 30);
        j.add(emailTxt);
        
        
         JLabel nohp = new JLabel();
        nohp.setText("nohp");
        nohp.setBounds(50, 300, 100, 30);
        j.add(nohp);
        
         JTextField nohpTxt = new JTextField();
        nohpTxt.setBounds(150, 300, 200, 30);
        j.add(nohpTxt);
        
  
   
        JButton loginButton = new JButton();
        loginButton.setText("Login");
        loginButton.setBounds(150, 350, 200, 50);
        j.add(loginButton);
                
                
        j.setSize(800, 800);
        j.setLayout(null);
        j.setVisible(true);
        
    
    }
}
