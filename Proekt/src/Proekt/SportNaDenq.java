/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Proekt;

/**
 *
 * @author Виктория Стефанова
 */
public class SportNaDenq extends javax.swing.JFrame {

    /**
     * Creates new form SportNaDenq
     */
    public SportNaDenq() {
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

        btngrSportove = new javax.swing.ButtonGroup();
        pnlSportNaDenq = new javax.swing.JPanel();
        btnSuzdaiPlaylist = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rbFitness = new javax.swing.JRadioButton();
        rbSpinning = new javax.swing.JRadioButton();
        rbHipHop = new javax.swing.JRadioButton();
        rbBallroom = new javax.swing.JRadioButton();
        rbTrack = new javax.swing.JRadioButton();
        rbBallet = new javax.swing.JRadioButton();
        rbLatinDance = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 153));

        pnlSportNaDenq.setBackground(new java.awt.Color(0, 102, 153));

        btnSuzdaiPlaylist.setBackground(new java.awt.Color(255, 204, 0));
        btnSuzdaiPlaylist.setText("Създай плейлист");
        btnSuzdaiPlaylist.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSuzdaiPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuzdaiPlaylistActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Изберете желаният от вас спорт");

        rbFitness.setBackground(new java.awt.Color(0, 102, 153));
        btngrSportove.add(rbFitness);
        rbFitness.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        rbFitness.setForeground(new java.awt.Color(255, 255, 255));
        rbFitness.setText("Фитнес");

        rbSpinning.setBackground(new java.awt.Color(0, 102, 153));
        btngrSportove.add(rbSpinning);
        rbSpinning.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        rbSpinning.setForeground(new java.awt.Color(255, 255, 255));
        rbSpinning.setText("Спининг");
        rbSpinning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSpinningActionPerformed(evt);
            }
        });

        rbHipHop.setBackground(new java.awt.Color(0, 102, 153));
        btngrSportove.add(rbHipHop);
        rbHipHop.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        rbHipHop.setForeground(new java.awt.Color(255, 255, 255));
        rbHipHop.setText("Хип Хоп");

        rbBallroom.setBackground(new java.awt.Color(0, 102, 153));
        btngrSportove.add(rbBallroom);
        rbBallroom.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        rbBallroom.setForeground(new java.awt.Color(255, 255, 255));
        rbBallroom.setText("Бални танци");

        rbTrack.setBackground(new java.awt.Color(0, 102, 153));
        btngrSportove.add(rbTrack);
        rbTrack.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        rbTrack.setForeground(new java.awt.Color(255, 255, 255));
        rbTrack.setText("Тичане");

        rbBallet.setBackground(new java.awt.Color(0, 102, 153));
        btngrSportove.add(rbBallet);
        rbBallet.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        rbBallet.setForeground(new java.awt.Color(255, 255, 255));
        rbBallet.setText("Балет");

        rbLatinDance.setBackground(new java.awt.Color(0, 102, 153));
        btngrSportove.add(rbLatinDance);
        rbLatinDance.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        rbLatinDance.setForeground(new java.awt.Color(255, 255, 255));
        rbLatinDance.setText("Латино танци");

        javax.swing.GroupLayout pnlSportNaDenqLayout = new javax.swing.GroupLayout(pnlSportNaDenq);
        pnlSportNaDenq.setLayout(pnlSportNaDenqLayout);
        pnlSportNaDenqLayout.setHorizontalGroup(
            pnlSportNaDenqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSportNaDenqLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlSportNaDenqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSportNaDenqLayout.createSequentialGroup()
                        .addComponent(rbFitness, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addGap(58, 58, 58)
                        .addGroup(pnlSportNaDenqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbBallet, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbTrack, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbLatinDance, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))))
            .addGroup(pnlSportNaDenqLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnSuzdaiPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSportNaDenqLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSportNaDenqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbSpinning, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSportNaDenqLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(pnlSportNaDenqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbHipHop, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbBallroom, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(224, 224, 224))
        );
        pnlSportNaDenqLayout.setVerticalGroup(
            pnlSportNaDenqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSportNaDenqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlSportNaDenqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFitness)
                    .addComponent(rbTrack))
                .addGap(18, 18, 18)
                .addGroup(pnlSportNaDenqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbBallet)
                    .addComponent(rbSpinning))
                .addGap(18, 18, 18)
                .addGroup(pnlSportNaDenqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLatinDance)
                    .addComponent(rbHipHop))
                .addGap(18, 18, 18)
                .addComponent(rbBallroom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnSuzdaiPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSportNaDenq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSportNaDenq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuzdaiPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuzdaiPlaylistActionPerformed

        String sport = null;
        if (rbBallet.isSelected()==true){
         sport = "ballet";   
        }
        if (rbBallroom.isSelected()==true){
         sport = "ballroom";   
        }
        if (rbFitness.isSelected()==true){
         sport = "fitness";   
        }
        if (rbHipHop.isSelected()==true){
         sport = "hipHop";   
        }
        if (rbLatinDance.isSelected()==true){
         sport = "latin";   
        }
        if (rbSpinning.isSelected()==true){
         sport = "spinning";   
        }
        if (rbTrack.isSelected()==true){
         sport = "track";   
        }
        this.dispose();
        new PlaylistOfTheDay(sport).setVisible(true);
    }//GEN-LAST:event_btnSuzdaiPlaylistActionPerformed

    private void rbSpinningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSpinningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSpinningActionPerformed

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
            java.util.logging.Logger.getLogger(SportNaDenq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SportNaDenq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SportNaDenq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SportNaDenq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SportNaDenq().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuzdaiPlaylist;
    private javax.swing.ButtonGroup btngrSportove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlSportNaDenq;
    private javax.swing.JRadioButton rbBallet;
    private javax.swing.JRadioButton rbBallroom;
    private javax.swing.JRadioButton rbFitness;
    private javax.swing.JRadioButton rbHipHop;
    private javax.swing.JRadioButton rbLatinDance;
    private javax.swing.JRadioButton rbSpinning;
    private javax.swing.JRadioButton rbTrack;
    // End of variables declaration//GEN-END:variables
}
