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
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TestEnv
 */
public class shoppingCart extends javax.swing.JFrame {

    /**
     * Creates new form shoppingCart
     */
    mainappuser D=new mainappuser();
   public static String X1;
    public shoppingCart() {
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

        jLabel2 = new javax.swing.JLabel();
        checkout = new javax.swing.JButton();
        table = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        totalafterDicount = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        total2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\cart.jpg")); // NOI18N
        jLabel2.setText("Shopping Cart");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 590, -1));

        checkout.setBackground(new java.awt.Color(0, 153, 204));
        checkout.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        checkout.setForeground(new java.awt.Color(255, 255, 255));
        checkout.setText("CheckOut");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });
        getContentPane().add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 350, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cart ID", "Product ID", "Poduct Name", "Price", "Poduct_Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setViewportView(jTable1);

        getContentPane().add(table, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 740, 400));

        jLabel4.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel4.setText("name_Bill:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        name.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 120, 40));

        jLabel5.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel5.setText(" Price after Discount :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, -1, -1));

        totalafterDicount.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        getContentPane().add(totalafterDicount, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 120, 40));

        back.setBackground(new java.awt.Color(0, 153, 204));
        back.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 660, 90, 40));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\up.png")); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 50, 40));

        jLabel6.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel6.setText("date_Bill:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 110, -1));

        date.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 120, 40));

        jLabel7.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel7.setText("Total Price :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, -1));

        total2.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        getContentPane().add(total2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\nnbc.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -220, -1, 1100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
                                this.setVisible(false); 
                                 mainappuser o=new  mainappuser();
                                  o.setVisible(true);
                                 o.setBounds(0, 0, 650, 520);
                                       o.setResizable(false);
                               o.setTitle("Login");
                              o.setDefaultCloseOperation(login.EXIT_ON_CLOSE);
                                   
    }//GEN-LAST:event_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try {
             
            Double count =0.0;
           DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
           String ur1="jdbc:oracle:thin:@localhost:1521:xe";
          Connection con=DriverManager.getConnection(ur1, "c##nancysawa", "654321");
              
             Statement stmt=con.createStatement();
              ResultSet resc= stmt.executeQuery( "select * from cart where HASUSER_ID="+D.ID1+" ");
               while(resc.next()){
                 String cart= String.valueOf(resc.getInt("PRICE"));
                 double d = Double.parseDouble(cart);
                 if(d==0.0){
                     JOptionPane.showMessageDialog(null,"the chopping cart is null ");
                 }
               }
               
               
               
             String sql="select * from cart where HASUSER_ID="+D.ID1+"";
             ResultSet rs= stmt.executeQuery(sql);
             while(rs.next()){
                String cart_ID= String.valueOf(rs.getInt("cart_ID"));
                 String pro_ID= String.valueOf(rs.getInt("PRO_ID"));
                 String name=rs.getString("NAME_PRO");
                String price= String.valueOf(rs.getDouble("PRICE"));
                String tayp=rs.getString("TYAP_PRO");
                 double number1 = Double.parseDouble(price);
                count=count+number1;
                 String tbdata[] = {cart_ID,pro_ID,name,price,tayp};
                DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
                tblModel.addRow(tbdata);
                 
             }
             String pri= String.valueOf((count));
             total2.setText(pri);
             if(count>=200){
             count=count*.1;
             String pr= String.valueOf((count));
             totalafterDicount.setText(pr);
               
             }
             else{
             count=0.0;
             String pr= String.valueOf((count));
             totalafterDicount.setText(pr);
               
             }
             
       } 
       catch (SQLException ex) {
           Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
               jButton1.setToolTipText("show all product in the cart");

    }//GEN-LAST:event_jButton1MouseEntered

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        // TODO add your handling code here:
          
       
         try {
            
           DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
           String ur1="jdbc:oracle:thin:@localhost:1521:xe";
          Connection con=DriverManager.getConnection(ur1, "c##nancysawa", "654321");
             Statement stmt=con.createStatement();
              ResultSet res= stmt.executeQuery( "select Bill_ID from Bill ");
               int count=0;
              while(res.next()){
               String  ID= String.valueOf(res.getInt("bill_ID"));
                  
                   count++;}
                  count=count+10;
                      String Xb1=String.valueOf(count);
                     String sqlc="insert into BILL values("+Xb1+",'"+name.getText()+"','"+date.getText()+"',"+ total2.getText()+","+totalafterDicount.getText()+")";
                     PreparedStatement pstt=con.prepareStatement(sqlc);
                     pstt.execute();
                    String sqlhas="insert into has values("+D.ID1+","+Xb1+")";
                  PreparedStatement pst=con.prepareStatement(sqlhas);
                    pst.executeUpdate();
                    ResultSet re= stmt.executeQuery( "select * from cart where HASUSER_ID="+D.ID1+" ");
                  while(re.next()){
                     String pro_ID= String.valueOf(re.getInt("PRO_ID"));
                    String sqlco="insert into contain values("+pro_ID+","+Xb1+")";
                   PreparedStatement ps=con.prepareStatement(sqlco);
                   ps.executeUpdate();
                  String sq="insert into shop values(B1.nextval,"+pro_ID+","+D.ID1+")";
                  PreparedStatement p=con.prepareStatement(sq);
                   p.executeUpdate();
                  
                  }
                    String sql="delete  from cart where HASUSER_ID="+D.ID1+"";
                    PreparedStatement pstmt=con.prepareStatement(sql);
                     pstmt.execute();
                  
               JOptionPane.showMessageDialog(null,"DONE CHEKOUT THINK YOU ");
               
                jTable1.setModel(new DefaultTableModel(null,new String[]{"user_ID","Fname","Minit","Lname","phone","Email"}));
                 name.setText("");
                 date.setText("");
                 total2.setText("");
                 totalafterDicount.setText("");
       } 
    
       catch (SQLException ex) {
           Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }//GEN-LAST:event_checkoutActionPerformed

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
            java.util.logging.Logger.getLogger(shoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shoppingCart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton checkout;
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private javax.swing.JScrollPane table;
    private javax.swing.JTextField total2;
    private javax.swing.JTextField totalafterDicount;
    // End of variables declaration//GEN-END:variables
}
