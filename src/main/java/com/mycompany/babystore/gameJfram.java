/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.babystore;

import static com.mycompany.babystore.clothesJfram.id;
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
public class gameJfram extends javax.swing.JFrame {

    /**
     * Creates new form gameJfram
     */
     mainappuser D=new mainappuser();
    public static String id;
    public gameJfram(String pc1,String pc2,String pc3,String pc4,String pc5,String pc6) {
        initComponents();
        price_g1.setText(pc1);
         price_g2.setText(pc2);
          price_g3.setText(pc3);
           price_g4.setText(pc4);
            price_g5.setText(pc5);
             price_g6.setText(pc6);
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
        g3 = new javax.swing.JLabel();
        id_g3 = new javax.swing.JLabel();
        id_g2 = new javax.swing.JLabel();
        id_g1 = new javax.swing.JLabel();
        g1 = new javax.swing.JLabel();
        price_g1 = new javax.swing.JTextField();
        add_to_cartg1 = new javax.swing.JButton();
        price_g2 = new javax.swing.JTextField();
        g2 = new javax.swing.JLabel();
        add_to_cartg2 = new javax.swing.JButton();
        price_g3 = new javax.swing.JTextField();
        add_to_cartg3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        g4 = new javax.swing.JLabel();
        id_g4 = new javax.swing.JLabel();
        price_g4 = new javax.swing.JTextField();
        add_to_cartg4 = new javax.swing.JButton();
        id_g5 = new javax.swing.JLabel();
        g5 = new javax.swing.JLabel();
        price_g5 = new javax.swing.JTextField();
        add_to_cartg5 = new javax.swing.JButton();
        price_g6 = new javax.swing.JTextField();
        g6 = new javax.swing.JLabel();
        id_g6 = new javax.swing.JLabel();
        add_to_cartg6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\111.jpeg")); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 150, 150));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\666.jpeg")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 150, 150));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\555.jpeg")); // NOI18N
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
        getContentPane().add(shoppingcart, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 60, -1));

        g3.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N
        g3.setText("Boy Game1");
        getContentPane().add(g3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 150, 30));

        id_g3.setText("210011");
        getContentPane().add(id_g3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 50, -1));

        id_g2.setText("200011");
        getContentPane().add(id_g2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 50, -1));

        id_g1.setText("190011");
        getContentPane().add(id_g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 50, -1));

        g1.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N
        g1.setText("Car & Remote");
        getContentPane().add(g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 150, 30));

        price_g1.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        price_g1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_g1ActionPerformed(evt);
            }
        });
        getContentPane().add(price_g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 80, 30));

        add_to_cartg1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\add to cart.png")); // NOI18N
        add_to_cartg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_cartg1ActionPerformed(evt);
            }
        });
        getContentPane().add(add_to_cartg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 50, 50));

        price_g2.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        price_g2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_g2ActionPerformed(evt);
            }
        });
        getContentPane().add(price_g2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 80, 30));

        g2.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N
        g2.setText("Spiner");
        getContentPane().add(g2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 150, 30));

        add_to_cartg2.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\add to cart.png")); // NOI18N
        add_to_cartg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_cartg2ActionPerformed(evt);
            }
        });
        getContentPane().add(add_to_cartg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 50, 50));

        price_g3.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        price_g3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_g3ActionPerformed(evt);
            }
        });
        getContentPane().add(price_g3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 80, 30));

        add_to_cartg3.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\add to cart.png")); // NOI18N
        add_to_cartg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_cartg3ActionPerformed(evt);
            }
        });
        getContentPane().add(add_to_cartg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 50, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\333.jpeg")); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 150, 150));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\444.jpeg")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 150, 150));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\222.jpeg")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 150, 150));

        g4.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N
        g4.setText("Parby");
        getContentPane().add(g4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 150, 30));

        id_g4.setText("230011");
        getContentPane().add(id_g4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 50, -1));

        price_g4.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        price_g4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_g4ActionPerformed(evt);
            }
        });
        getContentPane().add(price_g4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 80, 30));

        add_to_cartg4.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\add to cart.png")); // NOI18N
        add_to_cartg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_cartg4ActionPerformed(evt);
            }
        });
        getContentPane().add(add_to_cartg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 50, 50));

        id_g5.setText("240011");
        getContentPane().add(id_g5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 50, -1));

        g5.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N
        g5.setText("Girl Bike");
        getContentPane().add(g5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 150, 30));

        price_g5.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        price_g5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_g5ActionPerformed(evt);
            }
        });
        getContentPane().add(price_g5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 80, 30));

        add_to_cartg5.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\add to cart.png")); // NOI18N
        add_to_cartg5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_cartg5ActionPerformed(evt);
            }
        });
        getContentPane().add(add_to_cartg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 50, 50));

        price_g6.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        price_g6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_g6ActionPerformed(evt);
            }
        });
        getContentPane().add(price_g6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 80, 30));

        g6.setFont(new java.awt.Font("Serif", 2, 24)); // NOI18N
        g6.setText("Girl Game1");
        getContentPane().add(g6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 150, 30));

        id_g6.setText("250011");
        getContentPane().add(id_g6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 50, -1));

        add_to_cartg6.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\add to cart.png")); // NOI18N
        add_to_cartg6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_cartg6ActionPerformed(evt);
            }
        });
        getContentPane().add(add_to_cartg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 50, 50));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\back.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\nnbc.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -50, 1230, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void price_g1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_g1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_g1ActionPerformed

    private void price_g2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_g2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_g2ActionPerformed

    private void price_g3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_g3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_g3ActionPerformed

    private void price_g4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_g4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_g4ActionPerformed

    private void price_g5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_g5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_g5ActionPerformed

    private void price_g6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_g6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_g6ActionPerformed

    private void shoppingcartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoppingcartActionPerformed
        // TODO add your handling code here:
        shoppingCart c = new shoppingCart();
        c.show(true);
        c.setBounds(0, 0, 800, 750);
        c.setResizable(false);
        c.setTitle("Shopping Cart");
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setVisible(false);
    }//GEN-LAST:event_shoppingcartActionPerformed

    private void add_to_cartg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_cartg1ActionPerformed
        // TODO add your handling code here:
        try {
           id=D.ID1;
           
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                String ur1="jdbc:oracle:thin:@localhost:1521:xe";
                Connection con=DriverManager.getConnection(ur1, "c##nancysawa", "654321");
             Statement stmt=con.createStatement();
             String sql="select * from product where PRODUCT_ID="+190011+"";
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
        
        
               
    }//GEN-LAST:event_add_to_cartg1ActionPerformed

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
         jLabel6.setToolTipText("An entertaining game for boys, suitable for children over the age of two");
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
                 jLabel3.setToolTipText("Made of plastic, harmless to children and entertaining");

    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
                         jLabel4.setToolTipText("Kids game to learn colors and shapes");

    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
         jLabel5.setToolTipText("A small girl game , suitable for all ages");
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setToolTipText("bicycle for girls");
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
         jLabel7.setToolTipText("Girl game consisting of a hairdresser and makup");
    }//GEN-LAST:event_jLabel7MouseEntered

    private void add_to_cartg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_cartg2ActionPerformed
        // TODO add your handling code here:
        try {
           id=D.ID1;
           
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                String ur1="jdbc:oracle:thin:@localhost:1521:xe";
                Connection con=DriverManager.getConnection(ur1, "c##nancysawa", "654321");
             Statement stmt=con.createStatement();
             String sql="select * from product where PRODUCT_ID="+200011+"";
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
        
        
               
    }//GEN-LAST:event_add_to_cartg2ActionPerformed

    private void add_to_cartg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_cartg3ActionPerformed
        // TODO add your handling code here:
         try {
           id=D.ID1;
           
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                String ur1="jdbc:oracle:thin:@localhost:1521:xe";
                Connection con=DriverManager.getConnection(ur1, "c##nancysawa", "654321");
             Statement stmt=con.createStatement();
             String sql="select * from product where PRODUCT_ID="+210011+"";
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
    }//GEN-LAST:event_add_to_cartg3ActionPerformed

    private void add_to_cartg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_cartg4ActionPerformed
        // TODO add your handling code here:
         try {
           id=D.ID1;
           
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                String ur1="jdbc:oracle:thin:@localhost:1521:xe";
                Connection con=DriverManager.getConnection(ur1, "c##nancysawa", "654321");
             Statement stmt=con.createStatement();
             String sql="select * from product where PRODUCT_ID="+230011+"";
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
    }//GEN-LAST:event_add_to_cartg4ActionPerformed

    private void add_to_cartg5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_cartg5ActionPerformed
        // TODO add your handling code here:
         try {
           id=D.ID1;
           
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                String ur1="jdbc:oracle:thin:@localhost:1521:xe";
                Connection con=DriverManager.getConnection(ur1, "c##nancysawa", "654321");
             Statement stmt=con.createStatement();
             String sql="select * from product where PRODUCT_ID="+240011+"";
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
    }//GEN-LAST:event_add_to_cartg5ActionPerformed

    private void add_to_cartg6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_cartg6ActionPerformed
        // TODO add your handling code here:
         try {
           id=D.ID1;
           
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                String ur1="jdbc:oracle:thin:@localhost:1521:xe";
                Connection con=DriverManager.getConnection(ur1, "c##nancysawa", "654321");
             Statement stmt=con.createStatement();
             String sql="select * from product where PRODUCT_ID="+250011+"";
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
    }//GEN-LAST:event_add_to_cartg6ActionPerformed

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
            java.util.logging.Logger.getLogger(gameJfram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameJfram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameJfram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameJfram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new gameJfram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_to_cartg1;
    private javax.swing.JButton add_to_cartg2;
    private javax.swing.JButton add_to_cartg3;
    private javax.swing.JButton add_to_cartg4;
    private javax.swing.JButton add_to_cartg5;
    private javax.swing.JButton add_to_cartg6;
    private javax.swing.JLabel g1;
    private javax.swing.JLabel g2;
    private javax.swing.JLabel g3;
    private javax.swing.JLabel g4;
    private javax.swing.JLabel g5;
    private javax.swing.JLabel g6;
    private javax.swing.JLabel id_g1;
    private javax.swing.JLabel id_g2;
    private javax.swing.JLabel id_g3;
    private javax.swing.JLabel id_g4;
    private javax.swing.JLabel id_g5;
    private javax.swing.JLabel id_g6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField price_g1;
    private javax.swing.JTextField price_g2;
    private javax.swing.JTextField price_g3;
    private javax.swing.JTextField price_g4;
    private javax.swing.JTextField price_g5;
    private javax.swing.JTextField price_g6;
    private javax.swing.JButton shoppingcart;
    // End of variables declaration//GEN-END:variables
}
