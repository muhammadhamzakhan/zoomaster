/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import security.PasswordManager;

/**
 *
 * @author hamza
 */
public class PasswordChangeScreen extends javax.swing.JPanel {

    /**
     * Creates new form PasswordChangeScreen
     */
    public PasswordChangeScreen() {
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

        oldPassL = new javax.swing.JLabel();
        newPassL = new javax.swing.JLabel();
        changeB = new javax.swing.JButton();
        newPassAgainL = new javax.swing.JLabel();
        newPassFieldAgain = new javax.swing.JPasswordField();
        newPassField = new javax.swing.JPasswordField();
        oldPassField = new javax.swing.JPasswordField();
        lblNewLabel = new javax.swing.JLabel();

        oldPassL.setText("Old Password:");

        newPassL.setText("New Password:");

        changeB.setText("Change Password");
        changeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBActionPerformed(evt);
            }
        });

        newPassAgainL.setText("New Password Again:");

        newPassFieldAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPassFieldAgainActionPerformed(evt);
            }
        });

        oldPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldPassFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newPassL)
                                    .addComponent(oldPassL)))
                            .addComponent(newPassAgainL))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oldPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newPassFieldAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeB, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblNewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lblNewLabel)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldPassL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPassL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newPassFieldAgain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPassAgainL))
                .addGap(18, 18, 18)
                .addComponent(changeB)
                .addContainerGap(212, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBActionPerformed
        PasswordManager ps = PasswordManager.getInstance();
				boolean b = ps.isCorrect(new String(oldPassField.getPassword()));
                                String a = new String(newPassField.getPassword());
                                String c = new String(newPassFieldAgain.getPassword());
				if(b){
					if( a.equals(c) ){
						ps.changePassword(new String(newPassField.getPassword()));
						lblNewLabel.setText("Your password have been successfully changed!");
						lblNewLabel.setForeground(Color.GREEN);
						lblNewLabel.setVisible(true);
					}else{
						lblNewLabel.setForeground(Color.RED);
						lblNewLabel.setText("Entered passwords don't match!");
						lblNewLabel.setVisible(true);
					}
				}else{
					lblNewLabel.setForeground(Color.RED);
					lblNewLabel.setText("Wrong old password!");
					lblNewLabel.setVisible(true);
				}
    }//GEN-LAST:event_changeBActionPerformed

    private void newPassFieldAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPassFieldAgainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPassFieldAgainActionPerformed

    private void oldPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldPassFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeB;
    private javax.swing.JLabel lblNewLabel;
    private javax.swing.JLabel newPassAgainL;
    private javax.swing.JPasswordField newPassField;
    private javax.swing.JPasswordField newPassFieldAgain;
    private javax.swing.JLabel newPassL;
    private javax.swing.JPasswordField oldPassField;
    private javax.swing.JLabel oldPassL;
    // End of variables declaration//GEN-END:variables
}
