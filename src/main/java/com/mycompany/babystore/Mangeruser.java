/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.babystore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getInt;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TestEnv
 */
public class Mangeruser extends javax.swing.JFrame {

    /**
     * Creates new form Mangeruser
     */
    
    public Mangeruser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\qqqqqqqqqqqq.png")); // NOI18N
        jLabel1.setText(" users");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 15, 994, 28);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setText("show all user");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(6, 57, 246, 32);

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setText("search for a user");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 110, 246, 32);

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User_ID", "Fname", "Minit", "Lname", "phone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(270, 49, 620, 270);

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("user_ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(6, 157, 68, 29);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(80, 158, 172, 29);

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 320, 90, 40);

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(20, 370, 90, 40);

        jButton5.setBackground(new java.awt.Color(255, 204, 204));
        jButton5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton5.setText("count of users");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(10, 260, 116, 44);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 260, 124, 44);

        jButton6.setBackground(new java.awt.Color(255, 204, 204));
        jButton6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton6.setText("Remove for a user");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(10, 200, 246, 32);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\nnbc.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-3, 0, 1040, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          try {
           DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
           String ur1="jdbc:oracle:thin:@localhost:1521:xe";
          Connection con=DriverManager.getConnection(ur1, "c##nancysawa", "654321");
              con.setAutoCommit(false);
             Statement stmt=con.createStatement();
             String sql="select * from userr";
             ResultSet rs= stmt.executeQuery(sql);
             while(rs.next()){
                String user_ID= String.valueOf(rs.getInt("user_ID"));
                String Fname=rs.getString("Fname");
                String Minit=rs.getString("Minit");
                String Lname=rs.getString("Lname");
                String phone= String.valueOf(rs.getInt("phone"));
                String Email=rs.getString("Email");
               String tbdata[] = {user_ID,Fname,Minit,Lname,phone,Email};
                DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
                tblModel.addRow(tbdata);
                 
             }
             
       } 
       catch (SQLException ex) {
           Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try {
           DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
           String ur1="jdbc:oracle:thin:@localhost:1521:xe";
          Connection con=DriverManager.getConnection(ur1, "c##nancysawa", "654321");
              //con.setAutoCommit(false);
             Statement stmt=con.createStatement();
            int number = Integer.parseInt(jTextField1.getText());
             String sql="select * from userr where user_ID= "+number+"";
            
             ResultSet rs= stmt.executeQuery(sql);
             if(!"null".equals(sql)){
             while(rs.next()){
                String user_ID= String.valueOf(rs.getInt("user_ID"));
                String Fname=rs.getString("Fname");
                String Minit=rs.getString("Minit");
                String Lname=rs.getString("Lname");
                String phone= String.valueOf(rs.getInt("phone"));
                String Email=rs.getString("Email");
               String tbdata[] = {user_ID,Fname,Minit,Lname,phone,Email}; 
                DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
                tblModel.addRow(tbdata);}
                 
             }
             else{
               JOptionPane.showMessageDialog(null,"This user does not exist ");

             }
             
       } 
       catch (SQLException ex) {
           Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       // int count=0;
         try {
              int cotn=0;
           DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
           String ur1="jdbc:oracle:thin:@localhost:1521:xe";
          Connection con=DriverManager.getConnection(ur1, "c##nancysawa", "654321");
              con.setAutoCommit(false);
             Statement stmt=con.createStatement();
             String sql="select * from userr";
             ResultSet rs= stmt.executeQuery(sql);
             
             while(rs.next()){
              cotn++;
                 
             }
              String countt= String.valueOf((cotn));
              jTextField2.setText(countt);
          
       } 
       catch (SQLException ex) {
           Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
         mainapplication o=new  mainapplication();
        o.setVisible(true);
        o.setBounds(0, 0, 700, 617);
        o.setResizable(false);
        o.setTitle("STORE");
        o.setDefaultCloseOperation(mainapplication.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTable1.setModel(new DefaultTableModel(null,new String[]{"user_ID","Fname","Minit","Lname","phone","Email"}));
         jTextField1.setText("");
          jTextField2.setText("");
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
         try {
           DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
           String ur1="jdbc:oracle:thin:@localhost:1521:xe";
          Connection con=DriverManager.getConnection(ur1, "c##nancysawa", "654321");
             Statement stmt=con.createStatement();
             int number = Integer.parseInt(jTextField1.getText());
             System.out.print(number);
              String sql="delete  from has where user_ID='"+number+"'";
              PreparedStatement pstmt=con.prepareStatement(sql);
                String ssql="delete  from shop where user_ID='"+number+"' ";
              PreparedStatement pstmtt=con.prepareStatement(ssql);
               String sqql="delete  from address where user_ID='"+number+"' ";
              PreparedStatement pstmmt=con.prepareStatement(sqql);
                String sqll="select USERNAME from verifyu where user_ID='"+number+"' ";
                     ResultSet rs= stmt.executeQuery(sqll);
                     while(rs.next()){
                     String uname=rs.getString("USERNAME");
                      String sqlv="delete  from login where user_ID='"+uname+"' ";
                        PreparedStatement pstmtv=con.prepareStatement(sqlv);
                         pstmtv.execute();
                     }
              String sqlv="delete  from verifyu where user_ID='"+number+"' ";
              PreparedStatement pstmtv=con.prepareStatement(sqlv);
              String sqlr="delete  from userr where user_ID='"+number+"' ";
              PreparedStatement pstmtr=con.prepareStatement(sqlr);
               pstmt.execute();
               pstmtt.execute();
               pstmmt.execute();
                pstmtv.execute();
                 pstmtr.execute();
             JOptionPane.showMessageDialog(null,"DONE to detete bill  ");
              
            // ResultSet rs= stmt.executeQuery(sql);
            
             
       } 
       catch (SQLException ex) {
           Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Mangeruser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mangeruser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mangeruser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mangeruser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mangeruser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
