 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.babystore;

import javax.swing.JFrame;

/**
 *
 * @author TestEnv
 */
public class Babystore {
 
    public static void main(String[] args) {
       // System.out.println("Hello World!");
      login o=new  login();
        o.setVisible(true);
        o.setBounds(0, 0, 440, 660);
        o.setResizable(false);
        o.setTitle("Login");
        o.setDefaultCloseOperation(login.EXIT_ON_CLOSE);
        
     
        
        
        
    }
}
