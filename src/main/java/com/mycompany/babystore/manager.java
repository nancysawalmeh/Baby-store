/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.babystore;

import javax.swing.JTextField;

/**
 *
 * @author TestEnv
 */
public class manager extends javax.swing.JFrame {

    /**
     * Creates new form manager
     */
    public manager(){}
    public manager(String id,String nam,String mnam,String lnam,String pho,String ag) {
        initComponents();
       
        jTextField6.setText(id);
         jTextField1.setText(nam);
         jTextField2.setText(mnam);
         jTextField3.setText(lnam);
         jTextField4.setText(pho);
          jTextField5.setText(ag);}
   
    
   
     
       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\in.jpg")); // NOI18N
        jLabel1.setText("Manager Information");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 30, 370, 37);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 160, 220, 27);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manager_ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 120, 100, 21);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 200, 220, 27);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("First name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 160, 100, 21);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(130, 240, 220, 27);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Minit");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 200, 80, 21);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(130, 280, 220, 27);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Last name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 250, 80, 21);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(130, 320, 220, 27);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("phone");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 290, 70, 21);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(130, 120, 220, 27);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Age");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 330, 60, 21);

        jButton1.setBackground(new java.awt.Color(255, 153, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 360, 72, 33);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Desktop\\ccccccccccccccccc.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-3, 0, 430, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
     
    
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
      
         
        this.setVisible(false);
         mainapplication o=new  mainapplication();
        o.setVisible(true);
        o.setBounds(0, 0, 700, 617);
        o.setResizable(false);
        o.setTitle("STORE");
        o.setDefaultCloseOperation(mainapplication.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed
 
    /**
     * @param args the command line arguments
     */
    public  void main(String args[]) {
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
            java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manager().setVisible(true);
              
            }
        });
        
        
    }
 
        
           
           
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
