package sa.gov.nic.frames;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import sa.gov.nic.Entity.Applicant;
import sa.gov.nic.db.AfisBroker;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import static java.awt.Toolkit.*;

public class Launch extends javax.swing.JFrame {

    public static Launch l;
    Applicant a = null;

    public Launch() {
        initComponents();


    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jbtnLogin = new JButton();
        refFeild = new JTextField();
        jbtnExit = new JButton();
        refOp = new JRadioButton("search by REFERENCE   ");
        passOp = new JRadioButton("search by PASSPORT  ");
        passFeild = new JTextField();
        nationalitylabel = new JLabel();

        nationality = new JTextField();
        ButtonGroup group = new ButtonGroup();

        group.add(passOp);
        group.add(refOp);


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(102, 102, 255));
        setForeground(Color.pink);
        nationalitylabel.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        nationalitylabel.setText("NATIONALITY");
        jPanel1.setBackground(new Color(243, 234, 234));
        jPanel1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
////
        refOp.setSelected(true);
        refOp.setFont(new Font("Candara Light", 1, 24));

        passOp.setSelected(false);
        passOp.setFont(new Font("Candara Light", 1, 24));

        //nationalitylabel.set
//////////
        jbtnLogin.setBackground(new Color(231, 226, 226));
        jbtnLogin.setFont(new Font("Candara Light", 1, 24)); // NOI18N
        jbtnLogin.setText("Search");
        jbtnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });

        refFeild.setFont(new Font("Tahoma", 1, 24)); // NOI18N

        jbtnExit.setBackground(new Color(231, 226, 226));
        jbtnExit.setFont(new Font("Candara Light", 1, 24)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        //////
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)///445
                                .addComponent(jbtnLogin, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                                .addGap(400, 400, 400)
                                .addComponent(jbtnExit, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))//
                        .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(100, 200, 200)
                                .addComponent(refOp)

                                .addGap(30, 70, 70)
                                .addComponent(refFeild, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE))

                        .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(100, 200, 200)
                                .addComponent(passOp)
                                .addGap(30, 87, 87)
                                .addComponent(passFeild, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE))

                        .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(100, 270, 295)
                                .addComponent(nationalitylabel)
                                .addGap(0, 102, 102)
                                .addComponent(nationality, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE)));
                ;
        ///////
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.CENTER)

                                        .addComponent(refOp)
                                        .addComponent(refFeild, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(passOp)
                                        .addComponent(passFeild, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                        )
                                .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(nationalitylabel)
                                        .addComponent(nationality, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                       )
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 469, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbtnExit, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtnLogin, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                        .addGap(201, 201, 201))
                        ));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new Dimension(1200, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLoginActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed


       if(refOp.isSelected()){

           final String ref = refFeild.getText();

           long reference = 0;

           try {
               reference = Long.parseLong(ref.trim());
           } catch (Exception e) {
               JOptionPane.showMessageDialog(this, "Wrong Ref#");

               return;
           }

           try {
               a = AfisBroker.getApplicants(reference);
           } catch (SQLException s) {
               JOptionPane.showMessageDialog(this, "Cannot connect to db!!");
               return;
           }

       }
       else
       {
           final String passport = passFeild.getText();
           final String nationalityText = nationality.getText();


           if(passport.length()<1 || passport.length()>12){



                   JOptionPane.showMessageDialog(this, "wrong passport!");
                   return;
           }
        if(nationalityText.length()!=3){

            JOptionPane.showMessageDialog(this, "wrong nationality format");
            return;
                }
           try {
               a = AfisBroker.getApplicants(passport,nationalityText);
           } catch (SQLException s) {
               JOptionPane.showMessageDialog(this, "Cannot connect to db!!");
               return;
           }
       }




        if (a == null) {
            JOptionPane.showMessageDialog(this, "No Applicant found!");
            return;
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form(a).setVisible(true);
            }
        });
    }//GEN-LAST:event_jbtnLoginActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

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
            java.util.logging.Logger.getLogger(Launch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Launch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Launch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Launch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        l = new Launch();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              l.setVisible(true); }
                                        }

        );//


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnLogin;
    private javax.swing.JTextField refFeild;
    private javax.swing.JTextField passFeild;
    private javax.swing.JRadioButton refOp;
    private javax.swing.JRadioButton passOp;
    private javax.swing.JLabel nationalitylabel;
    private javax.swing.JTextField nationality;
    private javax.swing.JLabel jLabel;
    // End of variables declaration//GEN-END:variables

    private void systemExit() {
        WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);


    }

}
