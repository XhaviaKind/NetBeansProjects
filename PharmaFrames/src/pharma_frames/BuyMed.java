/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharma_frames;

import java.awt.Dimension;
import java.awt.Toolkit;
import pharmacy_classes.Allergies;

/**
 *
 * @author but-anonju_sd2022
 */
public class BuyMed extends javax.swing.JFrame {

    /**
     * Creates new form BuyMed
     */
    public BuyMed() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
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
        buyLabel = new javax.swing.JLabel();
        AllergyRB = new javax.swing.JRadioButton();
        BodyPainRB = new javax.swing.JRadioButton();
        CoughRB = new javax.swing.JRadioButton();
        HeadAcheRB = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buyLabel.setText("Choose Medicines To Buy");

        AllergyRB.setText("Allergies");
        AllergyRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllergyRBMouseClicked(evt);
            }
        });

        BodyPainRB.setText("Body Pain");
        BodyPainRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BodyPainRBMouseClicked(evt);
            }
        });

        CoughRB.setText("Cough");
        CoughRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CoughRBMouseClicked(evt);
            }
        });

        HeadAcheRB.setText("Headache");
        HeadAcheRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeadAcheRBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(buyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BodyPainRB)
                            .addComponent(AllergyRB)
                            .addComponent(CoughRB)
                            .addComponent(HeadAcheRB))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(AllergyRB)
                .addGap(18, 18, 18)
                .addComponent(BodyPainRB)
                .addGap(18, 18, 18)
                .addComponent(CoughRB)
                .addGap(18, 18, 18)
                .addComponent(HeadAcheRB)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AllergyRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllergyRBMouseClicked
        // TODO add your handling code here:
        Allergies allergies = new Allergies();
        allergies.addAllergyMedicinesList();
//        System.out.println(allergies.getAlergy1());
//        System.out.println(allergies.getAlergy2());
        System.out.println(allergies.getAlergy3());
//        allergies.getAllergyMedicinesList();
    }//GEN-LAST:event_AllergyRBMouseClicked

    private void BodyPainRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BodyPainRBMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BodyPainRBMouseClicked

    private void CoughRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoughRBMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CoughRBMouseClicked

    private void HeadAcheRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadAcheRBMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_HeadAcheRBMouseClicked

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
            java.util.logging.Logger.getLogger(BuyMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyMed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AllergyRB;
    private javax.swing.JRadioButton BodyPainRB;
    private javax.swing.JRadioButton CoughRB;
    private javax.swing.JRadioButton HeadAcheRB;
    private javax.swing.JLabel buyLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
