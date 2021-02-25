package sa.gov.nic.frames;

import org.jnbis.api.Jnbis;
import sa.gov.nic.Entity.Applicant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.io.File;

public class Form extends javax.swing.JFrame {


    Toolkit toolkit = getToolkit();

    int pos = 0;

    byte[][] images = new byte[11][];

    public Form(Applicant a) {

        initComponents();


        // fetch data from DB

        try {

            System.out.println(a.getRef());


            applicantName.setText(a.getName());
            applicantRef.setText(a.getRef() + "");

            applicantNationality.setText(a.getNatonality());
            applicantPassport.setText(a.getPassport_num());
            applicantReceiveTime.setText(a.getReceive_time());


            images[0] = a.getFaceimage();
            images[1] = Jnbis.wsq().decode(a.getRthumb()).toJpg().asByteArray();
            images[2] = Jnbis.wsq().decode(a.getRindex()).toJpg().asByteArray();
            images[3] = Jnbis.wsq().decode(a.getRmiddle()).toJpg().asByteArray();
            images[4] = Jnbis.wsq().decode(a.getRring()).toJpg().asByteArray();
            images[5] = Jnbis.wsq().decode(a.getRmiddle()).toJpg().asByteArray();
            images[6] = Jnbis.wsq().decode(a.getLthumb()).toJpg().asByteArray();
            images[7] = Jnbis.wsq().decode(a.getLindex()).toJpg().asByteArray();
            images[8] = Jnbis.wsq().decode(a.getLmiddle()).toJpg().asByteArray();
            images[9] = Jnbis.wsq().decode(a.getLring()).toJpg().asByteArray();
            images[10] = Jnbis.wsq().decode(a.getLlittle()).toJpg().asByteArray();

            showImage(pos);
        } catch (Exception e) {
            // what to do ?
            // Launch.l.setVisible(true);
            // systemExit();

        }

        Launch.l.setVisible(false);


    }


    public String[] getImages() {


        File file = new File(getClass().getResource("/res").getFile());
        String[] imagesList = file.list();

        return imagesList;

    }


    public void showImage(int index) {
        applicantImage.setIcon(new ImageIcon(images[index]));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        receiveTimeLabel = new javax.swing.JLabel();
        applicantReceiveTime = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        applicantImage = new javax.swing.JLabel();
        refLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        applicantName = new javax.swing.JLabel();
        applicantRef = new javax.swing.JLabel();
        applicantPassport = new javax.swing.JLabel();
        //jLabel7 = new javax.swing.JLabel();
        nationalityLabel = new javax.swing.JLabel();
        applicantNationality = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(0, 0));

        jPanel1.setBackground(new java.awt.Color(243, 234, 234));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setDoubleBuffered(false);
        jPanel1.setPreferredSize(new Dimension(1200, 800));

        //BUTTONS :

        nextButton.setBackground(new java.awt.Color(231, 226, 226));
        nextButton.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        nextButton.setText("Next");
        nextButton.setHorizontalTextPosition(SwingConstants.CENTER);
        nextButton.setIconTextGap(0);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                First1_nextActionPerformed(evt);
            }
        });


        previousButton.setBackground(new java.awt.Color(231, 226, 226));
        previousButton.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        previousButton.setText("previous");
        previousButton.setHorizontalTextPosition(SwingConstants.CENTER);
        previousButton.setIconTextGap(0);
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(231, 226, 226));
        backButton.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBACKActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(231, 226, 226));
        exitButton.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonexitActionPerformed(evt);
            }
        });

        // Title Labels :
        nameLabel.setFont(new java.awt.Font("Candara Light", 1, 20)); // NOI18N
        nameLabel.setText("Name :");

        refLabel.setFont(new java.awt.Font("Candara Light", 1, 20)); // NOI18N
        refLabel.setText("Reference # :");

        passLabel.setFont(new java.awt.Font("Candara Light", 1, 20)); // NOI18N
        passLabel.setText("Passport # :");

        nationalityLabel.setFont(new java.awt.Font("Candara Light", 1, 20)); // NOI18N
        nationalityLabel.setText("Nationality");

        receiveTimeLabel.setFont(new java.awt.Font("Candara Light", 1, 20)); // NOI18N
        receiveTimeLabel.setText("Recieve time");

        //applicants
        applicantImage.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        applicantName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N


        applicantRef.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        applicantPassport.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N


        applicantNationality.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        applicantReceiveTime.setFont(new java.awt.Font("Tahoma", 0,20)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(////
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)

                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(50, 50, 50) //1st change

                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(refLabel)
                                                .addComponent(nameLabel)
                                                .addComponent(receiveTimeLabel)
                                                .addComponent(nationalityLabel)
                                                .addComponent(passLabel))
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(applicantRef)
                                                .addComponent(applicantPassport)
                                                .addComponent(applicantName)
                                                .addComponent(applicantNationality)
                                                .addComponent(applicantReceiveTime)))

                                .addGap(170, 220, 220)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGap(60, 60, 60)
                                        .addComponent(applicantImage, javax.swing.GroupLayout.PREFERRED_SIZE, 1191, javax.swing.GroupLayout.PREFERRED_SIZE)

                                ))
                        // .addGroup(jPanel1Layout.createParallelGroup()

                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(730, 750, 750)
                                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(previousButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))

                        .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(700, 700, 700)
                                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)//)
                                //     )

                        ));

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup()
                                        .addComponent(applicantImage, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)

                                        .addGroup(jPanel1Layout.createSequentialGroup()

                                                .addGroup(jPanel1Layout.createParallelGroup() //name
                                                        .addComponent(nameLabel)
                                                        .addComponent(applicantName))
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING) // ref
                                                        .addComponent(applicantRef)
                                                        .addComponent(refLabel))
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING) //pass
                                                        .addComponent(passLabel)
                                                        .addComponent(applicantPassport))
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING) //nation
                                                        .addComponent(applicantNationality)
                                                        .addComponent(nationalityLabel))
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING) //date
                                                        .addComponent(receiveTimeLabel)
                                                        .addComponent(applicantReceiveTime))
                                        ))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 45, 45)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(previousButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                )
                                                .addGap(100, 100, 100)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        ))


                            //  .addGap(20, 20, 20)
                                )
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

        setSize(new Dimension(900, 800));
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //GEN-LAST:event_FirstActionPerformed

    private void First1_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_First1_nextActionPerformed
        pos = (pos + 1) % images.length;


        showImage(pos);
    }//GEN-LAST:event_First1_nextActionPerformed

    private void PrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_First1_nextActionPerformed
        pos = (pos - 1) % images.length;
        if (pos < 0) {
            pos += 11;
        }


        showImage(pos);
    }

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
    private javax.swing.JPanel jPanel1;

    private javax.swing.JButton nextButton;
    private javax.swing.JButton previousButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton exitButton;

    private javax.swing.JLabel applicantName;
    private javax.swing.JLabel applicantRef;
    private javax.swing.JLabel applicantPassport;
    private javax.swing.JLabel applicantNationality;
    private javax.swing.JLabel applicantReceiveTime;

    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel refLabel;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel nationalityLabel;
    private javax.swing.JLabel receiveTimeLabel;

    private javax.swing.JLabel applicantImage;

    private javax.swing.JLabel jLabel7;

    //  private javax.swing.JPanel jPanel1;

    // End of variables declaration//GEN-END:variables

    private void systemExit() {
        WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);


    }


}
