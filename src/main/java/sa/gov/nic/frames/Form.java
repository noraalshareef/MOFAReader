package main.java.sa.gov.nic.frames;

import java.awt.Dimension;
import java.io.File;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.Date;
import java.util.jar.Attributes.Name;
import javax.swing.JOptionPane;
import java.awt.Color;
import main.java.sa.gov.nic.Entity.Applicant;
import main.java.sa.gov.nic.db.AfisBroker;
import org.jnbis.api.Jnbis;

public class Form extends javax.swing.JFrame {


Toolkit toolkit = getToolkit();

    int pos = 0;
  
byte[][] images = new byte[11][];
 
    public Form(String ref) {
    
        Launch.l.setVisible(false);
        initComponents();

 
        long reference = 0;
        Applicant a = null ;
        try{
         reference = Long.parseLong(ref.trim());
        }catch (Exception e)
        {
           JOptionPane.showMessageDialog(this, "Wrong Ref#");
           
           return;
        }
        
        a = AfisBroker.getApplicants(reference);
        // fetch data from DB

        System.out.println(reference);
        try {

            System.out.println(a.getRef());


            applicantName.setText(a.getName());
            applicantRef.setText(a.getRef() + "");

            applicantNationality.setText(a.getNatonality());
            applicantPassport.setText(a.getPassport_num());


            images[0] = a.getFaceimage();
            images[1] = Jnbis.wsq().decode(a.getRthumb()).toJpg().asByteArray();
            images[2] = Jnbis.wsq().decode(a.getRindex()).toJpg().asByteArray();
            images[3] = a.getRmiddle();
            images[4] = a.getRring();
            images[5] = a.getRmiddle();
            images[6] = a.getLthumb();
            images[7] = a.getLindex();
            images[8] = a.getLmiddle();
            images[9] = a.getLring();
            images[10] = a.getLlittle();

            showImage(pos);
        }catch (Exception e)
        {
            // what to do ?
        }
        
        
       
    }
    
    
    void showDate(){
    
    Date d=new Date();
    SimpleDateFormat s=new SimpleDateFormat("dd-M-yyyy");
    dateLab.setText(s.format(d));
    
    }

public String [] getImages() {
 
     
       File file = new File (getClass().getResource("/res").getFile());
       String[] imagesList = file.list();

      return imagesList;

}

   
    
public void showImage(int index)
    {
       /* String[] imagesList = getImages();

        String imageName = imagesList[index];

        ImageIcon icon = new ImageIcon(getClass().getResource("/res/"+imageName));

        Image image = icon.getImage().getScaledInstance(jLabel_imge.getWidth(), jLabel_imge.getHeight(), Image.SCALE_REPLICATE);
*/
        jLabel_imge.setIcon(new ImageIcon(images[index]));
    }

 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dateLab = new javax.swing.JLabel();
        First1_next = new javax.swing.JButton();
        jLabel_imge = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        applicantName = new javax.swing.JLabel();
        applicantRef = new javax.swing.JLabel();
        applicantPassport = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        applicantNationality = new javax.swing.JLabel();
        jButtonBACK = new javax.swing.JButton();
        jButtonexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(0, 0));

        jPanel1.setBackground(new java.awt.Color(243, 234, 234));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setDoubleBuffered(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1772, 1239));

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        jLabel1.setText("Recive time");

        dateLab.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateLab.setText("Date");

        First1_next.setBackground(new java.awt.Color(231, 226, 226));
        First1_next.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        First1_next.setText("Next");
        First1_next.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        First1_next.setIconTextGap(0);
        First1_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                First1_nextActionPerformed(evt);
            }
        });


        jLabel_imge.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel3.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        jLabel3.setText("Referance");

        jLabel2.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        jLabel2.setText("Name");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel4.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        jLabel4.setText("PassportNumber");

        applicantName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        applicantName.setText("jLabel6");

        applicantRef.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        applicantRef.setText("jLabel7");

        applicantPassport.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        applicantPassport.setText("jLabel8");

        x.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        x.setText("Nationality");

        applicantNationality.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        applicantNationality.setText("jLabel5");

        jButtonBACK.setBackground(new java.awt.Color(231, 226, 226));
        jButtonBACK.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        jButtonBACK.setText("BACK");
        jButtonBACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBACKActionPerformed(evt);
            }
        });

        jButtonexit.setBackground(new java.awt.Color(231, 226, 226));
        jButtonexit.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        jButtonexit.setText("EXIT");
        jButtonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(x)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(applicantRef)
                            .addComponent(applicantPassport)
                            .addComponent(applicantName)
                            .addComponent(applicantNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(1214, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dateLab, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel_imge, javax.swing.GroupLayout.PREFERRED_SIZE, 1191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(463, 463, 463)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonBACK, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(First1_next, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonexit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(463, 463, 463))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(735, 735, 735)
                    .addComponent(jLabel7)
                    .addContainerGap(2137, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel_imge, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(applicantName))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(applicantRef)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel4)
                            .addComponent(applicantPassport))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(applicantNationality)
                            .addComponent(x))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1)
                            .addComponent(dateLab))
                        .addGap(301, 301, 301))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(First1_next, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonexit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBACK, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(165, 165, 165))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(1388, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(216, 216, 216)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  //GEN-LAST:event_FirstActionPerformed

    private void First1_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_First1_nextActionPerformed
        //pos= (pos +1) % images.length;

        pos++;
        showImage(pos);
    }//GEN-LAST:event_First1_nextActionPerformed

    private void jButtonBACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBACKActionPerformed
     Launch.l.setVisible(true);
     this.setVisible(false);
 
    }//GEN-LAST:event_jButtonBACKActionPerformed

    private void jButtonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonexitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButtonexitActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton First1_next;
    private javax.swing.JLabel applicantName;
    private javax.swing.JLabel applicantNationality;
    private javax.swing.JLabel applicantPassport;
    private javax.swing.JLabel applicantRef;
    private javax.swing.JLabel dateLab;
    private javax.swing.JButton jButtonBACK;
    private javax.swing.JButton jButtonexit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_imge;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables

private void systemExit(){
WindowEvent winClosing = new WindowEvent (this , WindowEvent.WINDOW_CLOSING);


}



}
