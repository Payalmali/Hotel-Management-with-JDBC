/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel.management.system;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class ThirdThird extends javax.swing.JFrame {

    Connection con =null;
    PreparedStatement psmt = null;
    public ThirdThird() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        location = new javax.swing.JTextField();
        txtdrive = new javax.swing.JTextField();
        agetxt = new javax.swing.JTextField();
        car1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        combo2 = new javax.swing.JComboBox<>();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        car2 = new javax.swing.JTextField();
        combo1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 239, 241));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel2.setText("Location");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 400, 160, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setText("ADD DRIVERS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(180, 30, 170, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel4.setText("Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 100, 170, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel5.setText("Age");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 150, 170, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 200, 170, 30);
        jPanel1.add(location);
        location.setBounds(230, 400, 190, 30);

        txtdrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdriveActionPerformed(evt);
            }
        });
        jPanel1.add(txtdrive);
        txtdrive.setBounds(230, 100, 190, 30);
        jPanel1.add(agetxt);
        agetxt.setBounds(230, 150, 190, 30);
        jPanel1.add(car1);
        car1.setBounds(230, 250, 190, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel7.setText("Car Company");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 250, 150, 30);

        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Occupied" }));
        jPanel1.add(combo2);
        combo2.setBounds(230, 350, 190, 30);

        btn2.setBackground(new java.awt.Color(0, 0, 0));
        btn2.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("Cancel");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);
        btn2.setBounds(270, 460, 150, 30);

        btn1.setBackground(new java.awt.Color(0, 0, 0));
        btn1.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Submit");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);
        btn1.setBounds(40, 460, 140, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel8.setText("Car Model");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 300, 160, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel9.setText("Available");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 350, 160, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot 2024-05-14 010542.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(500, 60, 690, 430);
        jPanel1.add(car2);
        car2.setBounds(230, 300, 190, 30);

        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        jPanel1.add(combo1);
        combo1.setBounds(230, 200, 190, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1211, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtdriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdriveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdriveActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
         String driver= txtdrive.getText();
         String ag = agetxt.getText();
         String box1= (String) combo1.getSelectedItem();
         String caco = car1.getText();         
         String camo = car2.getText();
         String box2= (String) combo2.getSelectedItem();
         String loca = location.getText();

        if(driver.isEmpty() || ag.isEmpty() || caco.isEmpty() || camo.isEmpty() || loca.isEmpty()){
        JOptionPane.showMessageDialog(this, "Incomplete registration details please fill the form completely");
    }
        else{
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "admin");
                psmt=con.prepareStatement("insert into driver values(?,?,?,?,?,?,?)");
                psmt.setString(1, txtdrive.getText());                
                psmt.setString(2, agetxt.getText());
                psmt.setString(3, (String) combo1.getSelectedItem());
                psmt.setString(4, car1.getText());
                psmt.setString(5, car2.getText());  
                psmt.setString(6, (String) combo2.getSelectedItem());
                psmt.setString(7, location.getText());               
                psmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Saved Successfully !!");
                psmt.close();
                con.close();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ThirdTwo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
         txtdrive.setText("");
       agetxt.setText("");
        car1.setText("");
        car2.setText("");
        location.setText("");
    }//GEN-LAST:event_btn2ActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo1ActionPerformed

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
            java.util.logging.Logger.getLogger(ThirdThird.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThirdThird.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThirdThird.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThirdThird.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThirdThird().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agetxt;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JTextField car1;
    private javax.swing.JTextField car2;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField location;
    private javax.swing.JTextField txtdrive;
    // End of variables declaration//GEN-END:variables
}
