/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.babystore;

import static com.mycompany.babystore.gameJfram.id;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author TestEnv
 */
public class accessoriesJfram extends javax.swing.JFrame {

    /**
     * Creates new form accessoriesJfram
     */
     mainappuser D=new mainappuser();
    public static String id;
    public accessoriesJfram(String pc1,String pc2,String pc3,String pc4,String pc5,String pc6) {
        initComponents();
          price_a1.setText(pc1);
          price_a2.setText(pc2);
          price_a3.setText(pc3);
           price_a4.setText(pc4);
            price_a5.setText(pc5);
             price_a6.setText(pc6);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        shoppingcart = new javax.swing.JButton();
        a3 = new javax.swing.JLabel();
        price_a3 = new javax.swing.JTextField();
        add_to_carta3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        add_to_carta6 = new javax.swing.JButton();
        price_a6 = new javax.swing.JTextField();
        id_a6 = new javax.swing.JLabel();
        id_a3 = new javax.swing.JLabel();
        id_a2 = new javax.swing.JLabel();
        price_a2 = new javax.swing.JTextField();
        add_to_carta2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        price_a5 = new javax.swing.JTextField();
        id_a5 = new javax.swing.JLabel();
        add_to_carta5 = new javax.swing.JButton();
        add_to_carta4 = new javax.swing.JButton();
        price_a4 = new javax.swing.JTextField();
        a4 = new javax.swing.JLabel();
        id_a4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        add_to_carta1 = new javax.swing.JButton();
        a1 = new javax.swing.JLabel();
        price_a1 = new javax.swing.JTextField();
        id_a1 = new javax.swing.JLabel();
        price_g7 = new javax.swing.JTextField();
        g7 = new javax.swing.JLabel();
        g8 = new javax.swing.JLabel();
        id_g9 = new javax.swing.JLabel();
        price_g8 = new javax.swing.JTextField();
        add_to_cartc8 = new javax.swing.JButton();
        g9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\22.jpeg")); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 150, 150));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\33.jpeg")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 150, 150));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\66.jpeg")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 150, 150));

        shoppingcart.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\cart.jpg")); // NOI18N
        shoppingcart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoppingcartActionPerformed(evt);
            }
        });
        getContentPane().add(shoppingcart, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 60, -1));

        a3.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N
        a3.setText("Boy Game1");
        getContentPane().add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 150, 30));

        price_a3.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        price_a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_a3ActionPerformed(evt);
            }
        });
        getContentPane().add(price_a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 80, 30));

        add_to_carta3.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\add to cart.png")); // NOI18N
        add_to_carta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_carta3ActionPerformed(evt);
            }
        });
        getContentPane().add(add_to_carta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 50, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\11.jpeg")); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 150, 150));

        add_to_carta6.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\add to cart.png")); // NOI18N
        add_to_carta6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_carta6ActionPerformed(evt);
            }
        });
        getContentPane().add(add_to_carta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 50, 50));

        price_a6.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        price_a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_a6ActionPerformed(evt);
            }
        });
        getContentPane().add(price_a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 80, 30));

        id_a6.setText("330011");
        getContentPane().add(id_a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 50, -1));

        id_a3.setText("290011");
        getContentPane().add(id_a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 50, -1));

        id_a2.setText("280011");
        getContentPane().add(id_a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 50, -1));

        price_a2.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        price_a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_a2ActionPerformed(evt);
            }
        });
        getContentPane().add(price_a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 80, 30));

        add_to_carta2.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\add to cart.png")); // NOI18N
        add_to_carta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_carta2ActionPerformed(evt);
            }
        });
        getContentPane().add(add_to_carta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 50, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\55.jpeg")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 150, 150));

        price_a5.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        price_a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_a5ActionPerformed(evt);
            }
        });
        getContentPane().add(price_a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 80, 30));

        id_a5.setText("320011");
        getContentPane().add(id_a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 50, -1));

        add_to_carta5.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\add to cart.png")); // NOI18N
        add_to_carta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_carta5ActionPerformed(evt);
            }
        });
        getContentPane().add(add_to_carta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 50, 50));

        add_to_carta4.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\add to cart.png")); // NOI18N
        add_to_carta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_carta4ActionPerformed(evt);
            }
        });
        getContentPane().add(add_to_carta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 50, 50));

        price_a4.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        price_a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_a4ActionPerformed(evt);
            }
        });
        getContentPane().add(price_a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 80, 30));

        a4.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N
        a4.setText("Parby");
        getContentPane().add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 150, 30));

        id_a4.setText("310011");
        getContentPane().add(id_a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 50, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\44.jpeg")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 150, 150));

        add_to_carta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\add to cart.png")); // NOI18N
        add_to_carta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_carta1ActionPerformed(evt);
            }
        });
        getContentPane().add(add_to_carta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 50, 50));

        a1.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N
        a1.setText("Car & Remote");
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 150, 30));

        price_a1.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        price_a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_a1ActionPerformed(evt);
            }
        });
        getContentPane().add(price_a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 80, 30));

        id_a1.setText("270011");
        getContentPane().add(id_a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 50, -1));

        price_g7.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        price_g7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_g7ActionPerformed(evt);
            }
        });
        getContentPane().add(price_g7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 80, 30));

        g7.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N
        g7.setText("Girl Game1");
        getContentPane().add(g7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 150, 30));

        g8.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N
        g8.setText("Spiner");
        getContentPane().add(g8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 150, 30));

        id_g9.setText("200011");
        getContentPane().add(id_g9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 50, -1));

        price_g8.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        price_g8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_g8ActionPerformed(evt);
            }
        });
        getContentPane().add(price_g8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 80, 30));

        add_to_cartc8.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\add to cart.png")); // NOI18N
        getContentPane().add(add_to_cartc8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 50, 50));

        g9.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N
        g9.setText("Girl Bike");
        getContentPane().add(g9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 150, 30));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\back.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\nnbc.jpg")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -60, 1280, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void price_a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_a3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_a3ActionPerformed

    private void price_a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_a6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_a6ActionPerformed

    private void price_a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_a2ActionPerformed

    private void price_a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_a5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_a5ActionPerformed

    private void price_a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_a4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_a4ActionPerformed

    private void price_a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_a1ActionPerformed

    private void price_g7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_g7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_g7ActionPerformed

    private void price_g8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_g8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_g8ActionPerformed

    private void shoppingcartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoppingcartActionPerformed
        // TODO add your handling code here:
        shoppingCart c = new shoppingCart();
        c.setVisible(true);
        c.setBounds(0, 0, 800, 750);
        c.setResizable(false);
        c.setTitle("Shopping Cart");
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setVisible(false);
    }//GEN-LAST:event_shoppingcartActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        mainappuser o=new  mainappuser();
        o.setVisible(true);
        o.setBounds(0, 0, 650, 520);
        o.setResizable(false);
        o.setTitle("product");
        o.setDefaultCloseOperation(product.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        jLabel6.setToolTipText("Helps the child to walk, suitable for children from the age of eight months");
        
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
                jLabel3.setToolTipText("perfume sutiable for baby more than one year");

    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
         jLabel4.setToolTipText("Baby milk bottle Helps maintain milk and proper volume");
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
         jLabel5.setToolTipText("A dining chair suitable for children over the age of seven months");
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
                 jLabel2.setToolTipText("sleeper  moves comfortably suitable for use in the winter season and Suitable for all ages");

    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
              jLabel7.setToolTipText("car seat suitable for baby less than two years");

    }//GEN-LAST:event_jLabel7MouseEntered

    private void add_to_carta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_carta1ActionPerformed
        // TODO add your handling code here:
         try {
           id=D.ID1;
           
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                String ur1="jdbc:oracle:thin:@localhost:1521:xe";
                Connection con=DriverManager.getConnection(ur1, "c##nancysawa", "654321");
             Statement stmt=con.createStatement();
             String sql="select * from product where PRODUCT_ID="+270011+"";
             ResultSet rs= stmt.executeQuery(sql);
             while(rs.next()){
                 String pro_ID= String.valueOf(rs.getInt("PRODUCT_ID"));
                  String name=rs.getString("PRODUCT_NAME");
                 String price= String.valueOf(rs.getDouble("PRODUCT_PRICE"));
                  String teyp=rs.getString("PROD_TYPE");
                  String sqlc="insert into cart values(S1.nextval,"+pro_ID+",'"+name+"',"+ price+",'"+teyp+"',"+id+")";
                  PreparedStatement pstmt=con.prepareStatement(sqlc);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null,"DONE TO ADD ");
             }
             
       } 
       catch (SQLException ex) {
           Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_add_to_carta1ActionPerformed

    private void add_to_carta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_carta2ActionPerformed
        // TODO add your handling code here:
         try {
           id=D.ID1;
           
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                String ur1="jdbc:oracle:thin:@localhost:1521:xe";
                Connection con=DriverManager.getConnection(ur1, "c##nancysawa", "654321");
             Statement stmt=con.createStatement();
             String sql="select * from product where PRODUCT_ID="+280011+"";
             ResultSet rs= stmt.executeQuery(sql);
             while(rs.next()){
                 String pro_ID= String.valueOf(rs.getInt("PRODUCT_ID"));
                  String name=rs.getString("PRODUCT_NAME");
                 String price= String.valueOf(rs.getDouble("PRODUCT_PRICE"));
                  String teyp=rs.getString("PROD_TYPE");
                  String sqlc="insert into cart values(S1.nextval,"+pro_ID+",'"+name+"',"+ price+",'"+teyp+"',"+id+")";
                  PreparedStatement pstmt=con.prepareStatement(sqlc);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null,"DONE TO ADD ");
             }
             
       } 
       catch (SQLException ex) {
           Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_add_to_carta2ActionPerformed

    private void add_to_carta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_carta3ActionPerformed
        // TODO add your handling code here:
         try {
           id=D.ID1;
           
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                String ur1="jdbc:oracle:thin:@localhost:1521:xe";
                Connection con=DriverManager.getConnection(ur1, "c##nancysawa", "654321");
             Statement stmt=con.createStatement();
             String sql="select * from product where PRODUCT_ID="+290011+"";
             ResultSet rs= stmt.executeQuery(sql);
             while(rs.next()){
                 String pro_ID= String.valueOf(rs.getInt("PRODUCT_ID"));
                  String name=rs.getString("PRODUCT_NAME");
                 String price= String.valueOf(rs.getDouble("PRODUCT_PRICE"));
                  String teyp=rs.getString("PROD_TYPE");
                  String sqlc="insert into cart values(S1.nextval,"+pro_ID+",'"+name+"',"+ price+",'"+teyp+"',"+id+")";
                  PreparedStatement pstmt=con.prepareStatement(sqlc);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null,"DONE TO ADD ");
             }
             
       } 
       catch (SQLException ex) {
           Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_add_to_carta3ActionPerformed

    private void add_to_carta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_carta4ActionPerformed
        // TODO add your handling code here:
         try {
           id=D.ID1;
           
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                String ur1="jdbc:oracle:thin:@localhost:1521:xe";
                Connection con=DriverManager.getConnection(ur1, "c##nancysawa", "654321");
             Statement stmt=con.createStatement();
             String sql="select * from product where PRODUCT_ID="+310011+"";
             ResultSet rs= stmt.executeQuery(sql);
             while(rs.next()){
                 String pro_ID= String.valueOf(rs.getInt("PRODUCT_ID"));
                  String name=rs.getString("PRODUCT_NAME");
                 String price= String.valueOf(rs.getDouble("PRODUCT_PRICE"));
                  String teyp=rs.getString("PROD_TYPE");
                  String sqlc="insert into cart values(S1.nextval,"+pro_ID+",'"+name+"',"+ price+",'"+teyp+"',"+id+")";
                  PreparedStatement pstmt=con.prepareStatement(sqlc);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null,"DONE TO ADD ");
             }
             
       } 
       catch (SQLException ex) {
           Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_add_to_carta4ActionPerformed

    private void add_to_carta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_carta5ActionPerformed
        // TODO add your handling code here:
         try {
           id=D.ID1;
           
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                String ur1="jdbc:oracle:thin:@localhost:1521:xe";
                Connection con=DriverManager.getConnection(ur1, "c##nancysawa", "654321");
             Statement stmt=con.createStatement();
             String sql="select * from product where PRODUCT_ID="+320011+"";
             ResultSet rs= stmt.executeQuery(sql);
             while(rs.next()){
                 String pro_ID= String.valueOf(rs.getInt("PRODUCT_ID"));
                  String name=rs.getString("PRODUCT_NAME");
                 String price= String.valueOf(rs.getDouble("PRODUCT_PRICE"));
                  String teyp=rs.getString("PROD_TYPE");
                  String sqlc="insert into cart values(S1.nextval,"+pro_ID+",'"+name+"',"+ price+",'"+teyp+"',"+id+")";
                  PreparedStatement pstmt=con.prepareStatement(sqlc);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null,"DONE TO ADD ");
             }
             
       } 
       catch (SQLException ex) {
           Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_add_to_carta5ActionPerformed

    private void add_to_carta6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_carta6ActionPerformed
        // TODO add your handling code here:
         try {
           id=D.ID1;
           
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                String ur1="jdbc:oracle:thin:@localhost:1521:xe";
                Connection con=DriverManager.getConnection(ur1, "c##nancysawa", "654321");
             Statement stmt=con.createStatement();
             String sql="select * from product where PRODUCT_ID="+330011+"";
             ResultSet rs= stmt.executeQuery(sql);
             while(rs.next()){
                 String pro_ID= String.valueOf(rs.getInt("PRODUCT_ID"));
                  String name=rs.getString("PRODUCT_NAME");
                 String price= String.valueOf(rs.getDouble("PRODUCT_PRICE"));
                  String teyp=rs.getString("PROD_TYPE");
                  String sqlc="insert into cart values(S1.nextval,"+pro_ID+",'"+name+"',"+ price+",'"+teyp+"',"+id+")";
                  PreparedStatement pstmt=con.prepareStatement(sqlc);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null,"DONE TO ADD ");
             }
             
       } 
       catch (SQLException ex) {
           Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_add_to_carta6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(accessoriesJfram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accessoriesJfram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accessoriesJfram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accessoriesJfram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new accessoriesJfram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JButton add_to_carta1;
    private javax.swing.JButton add_to_carta2;
    private javax.swing.JButton add_to_carta3;
    private javax.swing.JButton add_to_carta4;
    private javax.swing.JButton add_to_carta5;
    private javax.swing.JButton add_to_carta6;
    private javax.swing.JButton add_to_cartc8;
    private javax.swing.JLabel g7;
    private javax.swing.JLabel g8;
    private javax.swing.JLabel g9;
    private javax.swing.JLabel id_a1;
    private javax.swing.JLabel id_a2;
    private javax.swing.JLabel id_a3;
    private javax.swing.JLabel id_a4;
    private javax.swing.JLabel id_a5;
    private javax.swing.JLabel id_a6;
    private javax.swing.JLabel id_g9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField price_a1;
    private javax.swing.JTextField price_a2;
    private javax.swing.JTextField price_a3;
    private javax.swing.JTextField price_a4;
    private javax.swing.JTextField price_a5;
    private javax.swing.JTextField price_a6;
    private javax.swing.JTextField price_g7;
    private javax.swing.JTextField price_g8;
    private javax.swing.JButton shoppingcart;
    // End of variables declaration//GEN-END:variables
}
