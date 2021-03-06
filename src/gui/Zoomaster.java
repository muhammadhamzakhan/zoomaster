/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.DatabaseManager;
import java.awt.Dimension;
import javax.swing.JFrame;
import repository.NotificationManager;

/**
 *
 * @author hamza
 */
public class Zoomaster extends javax.swing.JFrame {   
  
    
    /**
     * Creates new form MainScreen
     */
    public Zoomaster() {      
        
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        mainScreen1 = new gui.MainScreen();
        addScreen1 = new gui.AddScreen();
        firstPage1 = new gui.FirstPage();
        passwordChangeScreen1 = new gui.PasswordChangeScreen();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("mainFrame");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        mainScreen1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mainScreen1MouseMoved(evt);
            }
        });
        jTabbedPane1.addTab("Main", mainScreen1);
        jTabbedPane1.addTab("Add", addScreen1);
        jTabbedPane1.addTab("Search", firstPage1);
        jTabbedPane1.addTab("Change Password", passwordChangeScreen1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainScreen1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainScreen1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_mainScreen1MouseMoved

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
            java.util.logging.Logger.getLogger(Zoomaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Zoomaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Zoomaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zoomaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>           
                        
        // Setting up the database        
        boolean b;
        if(DatabaseManager.exists() == false)
        {
            DatabaseManager dm = DatabaseManager.getInstance();
            b = dm.createDatabase();
            System.out.println(b);
            b=dm.createTables();
            System.out.println(b);    
            b = dm.setID();
            System.out.println(b);    
            b = dm.setPassword("12345");
            System.out.println("Password Set: " + b);
        }
        else
        {
            DatabaseManager dm = DatabaseManager.getInstance();
            b = dm.setID();
        }         
        
        // Password Authentication
        JFrame passFrame = new JFrame();
        passFrame.setPreferredSize(new Dimension(500,250));
        passFrame.pack();           
        PasswordScreen pass = new PasswordScreen();
        passFrame.add(pass);                
        passFrame.setVisible(true);    
        
        boolean passCheck = false;
        
        do
        {
            passCheck = pass.getPassCheck();
            System.out.println(passCheck);
        } while (passCheck == false);
        
        System.out.println("loop Exited");
        passFrame.dispose();
        
        NotificationManager note = new NotificationManager();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Zoomaster().setVisible(true);
            }
        });
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.AddScreen addScreen1;
    private gui.FirstPage firstPage1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private gui.MainScreen mainScreen1;
    private gui.PasswordChangeScreen passwordChangeScreen1;
    // End of variables declaration//GEN-END:variables
}
