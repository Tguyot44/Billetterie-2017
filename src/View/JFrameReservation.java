/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Metier.Representation;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ttnguyen
 */
public class JFrameReservation extends javax.swing.JFrame {

    /**
     * Creates new form JFrameReservation
     */
    public JFrameReservation() {
        initComponents();
    }

    public JButton getjButtonReserver() {
        return jButtonReserver;
    }

    public void setjButtonReserver(JButton jButtonReserver) {
        this.jButtonReserver = jButtonReserver;
    }

    public JComboBox<String> getjComboBoxNbPlaceSouhaite() {
        return jComboBoxNbPlaceSouhaite;
    }

    public void setjComboBoxNbPlaceSouhaite(JComboBox<String> jComboBoxNbPlaceSouhaite) {
        this.jComboBoxNbPlaceSouhaite = jComboBoxNbPlaceSouhaite;
    }

    public JButton getJButtonBack() {
        return JButtonBack;
    }

    public void setJButtonBack(JButton BackButton) {
        this.JButtonBack = BackButton;
    }

    public JLabel getjLabelDate() {
        return jLabelDate;
    }

    public void setjLabelDate(JLabel jLabelDate) {
        this.jLabelDate = jLabelDate;
    }

    public JLabel getjLabelGroupe() {
        return jLabelGroupe;
    }

    public void setjLabelGroupe(JLabel jLabelGroupe) {
        this.jLabelGroupe = jLabelGroupe;
    }

    public JLabel getjLabelHeureDebut() {
        return jLabelHeureDebut;
    }

    public void setjLabelHeureDebut(JLabel jLabelHeureDebut) {
        this.jLabelHeureDebut = jLabelHeureDebut;
    }

    public JLabel getjLabelHeureFin() {
        return jLabelHeureFin;
    }

    public void setjLabelHeureFin(JLabel jLabelHeureFin) {
        this.jLabelHeureFin = jLabelHeureFin;
    }

    public JLabel getjLabelLieu() {
        return jLabelLieu;
    }

    public void setjLabelLieu(JLabel jLabelLieu) {
        this.jLabelLieu = jLabelLieu;
    }

    public JLabel getjLabelNbPlaceDispo() {
        return jLabelNbPlaceDispo;
    }

    public void setjLabelNbPlaceDispo(JLabel jLabelNbPlaceDispo) {
        this.jLabelNbPlaceDispo = jLabelNbPlaceDispo;
    }

    public JLabel getjLabelNbPlaceSouhaite() {
        return jLabelNbPlaceSouhaite;
    }

    public void setjLabelNbPlaceSouhaite(JLabel jLabelNbPlaceSouhaite) {
        this.jLabelNbPlaceSouhaite = jLabelNbPlaceSouhaite;
    }

    public JLabel getjLabelNbPlaceTotal() {
        return jLabelNbPlaceTotal;
    }

    public void setjLabelNbPlaceTotal(JLabel jLabelNbPlaceTotal) {
        this.jLabelNbPlaceTotal = jLabelNbPlaceTotal;
    }

    public JLabel getjLabelTitre() {
        return jLabelTitre;
    }

    public void setjLabelTitre(JLabel jLabelTitre) {
        this.jLabelTitre = jLabelTitre;
    }

    public JTextField getjTextFieldDate() {
        return jTextFieldDate;
    }

    public void setjTextFieldDate(JTextField jTextFieldDate) {
        this.jTextFieldDate = jTextFieldDate;
    }

    public JTextField getjTextFieldGroupe() {
        return jTextFieldGroupe;
    }

    public void setjTextFieldGroupe(JTextField jTextFieldGroupe) {
        this.jTextFieldGroupe = jTextFieldGroupe;
    }

    public JTextField getjTextFieldHeureDebut() {
        return jTextFieldHeureDebut;
    }

    public void setjTextFieldHeureDebut(JTextField jTextFieldHeureDebut) {
        this.jTextFieldHeureDebut = jTextFieldHeureDebut;
    }

    public JTextField getjTextFieldHeureFin() {
        return jTextFieldHeureFin;
    }

    public void setjTextFieldHeureFin(JTextField jTextFieldHeureFin) {
        this.jTextFieldHeureFin = jTextFieldHeureFin;
    }

    public JTextField getjTextFieldLieu() {
        return jTextFieldLieu;
    }

    public void setjTextFieldLieu(JTextField jTextFieldLieu) {
        this.jTextFieldLieu = jTextFieldLieu;
    }

    public JTextField getjTextFieldNbPlaceDispo() {
        return jTextFieldNbPlaceDispo;
    }

    public void setjTextFieldNbPlaceDispo(JTextField jTextFieldNbPlaceDispo) {
        this.jTextFieldNbPlaceDispo = jTextFieldNbPlaceDispo;
    }

    public JTextField getjTextFieldNbPlaceTotal() {
        return jTextFieldNbPlaceTotal;
    }

    public void setjTextFieldNbPlaceTotal(JTextField jTextFieldNbPlaceTotal) {
        this.jTextFieldNbPlaceTotal = jTextFieldNbPlaceTotal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNbPlaceTotal = new javax.swing.JLabel();
        jLabelNbPlaceDispo = new javax.swing.JLabel();
        jComboBoxNbPlaceSouhaite = new javax.swing.JComboBox<>();
        jButtonReserver = new javax.swing.JButton();
        jLabelHeureFin = new javax.swing.JLabel();
        jLabelHeureDebut = new javax.swing.JLabel();
        jLabelGroupe = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelLieu = new javax.swing.JLabel();
        jLabelNbPlaceSouhaite = new javax.swing.JLabel();
        jTextFieldGroupe = new javax.swing.JTextField();
        jTextFieldLieu = new javax.swing.JTextField();
        jTextFieldDate = new javax.swing.JTextField();
        jTextFieldNbPlaceTotal = new javax.swing.JTextField();
        jTextFieldHeureFin = new javax.swing.JTextField();
        jTextFieldHeureDebut = new javax.swing.JTextField();
        jTextFieldNbPlaceDispo = new javax.swing.JTextField();
        jLabelTitre = new javax.swing.JLabel();
        JButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNbPlaceTotal.setText("Nombre de place total:");

        jLabelNbPlaceDispo.setText("Nombre de place disponible:");

        jComboBoxNbPlaceSouhaite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxNbPlaceSouhaite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNbPlaceSouhaiteActionPerformed(evt);
            }
        });

        jButtonReserver.setText("Réserver");

        jLabelHeureFin.setText("Heure de fin:");

        jLabelHeureDebut.setText("Heure de début:");

        jLabelGroupe.setText("Groupe:");

        jLabelDate.setText("Date:");

        jLabelLieu.setText("Lieu:");

        jLabelNbPlaceSouhaite.setText("Nombre de place souhaités:");

        jTextFieldGroupe.setEnabled(false);

        jTextFieldLieu.setEnabled(false);

        jTextFieldDate.setEnabled(false);

        jTextFieldNbPlaceTotal.setEnabled(false);

        jTextFieldHeureFin.setEnabled(false);

        jTextFieldHeureDebut.setEnabled(false);

        jTextFieldNbPlaceDispo.setEnabled(false);

        jLabelTitre.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTitre.setText("REPRESENTATION:");

        JButtonBack.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabelTitre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNbPlaceTotal)
                            .addComponent(jLabelHeureFin)
                            .addComponent(jLabelNbPlaceDispo)
                            .addComponent(jLabelHeureDebut)
                            .addComponent(jLabelLieu)
                            .addComponent(jLabelDate)
                            .addComponent(jLabelGroupe)
                            .addComponent(jLabelNbPlaceSouhaite)
                            .addComponent(JButtonBack))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldLieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldHeureDebut, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldHeureFin)
                                .addComponent(jTextFieldNbPlaceTotal)
                                .addComponent(jTextFieldNbPlaceDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxNbPlaceSouhaite, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButtonReserver, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelTitre)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGroupe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLieu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldHeureDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHeureDebut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldHeureFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHeureFin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNbPlaceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNbPlaceTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNbPlaceDispo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNbPlaceDispo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxNbPlaceSouhaite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNbPlaceSouhaite))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReserver)
                    .addComponent(JButtonBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxNbPlaceSouhaiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNbPlaceSouhaiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNbPlaceSouhaiteActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonBack;
    private javax.swing.JButton jButtonReserver;
    private javax.swing.JComboBox<String> jComboBoxNbPlaceSouhaite;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelGroupe;
    private javax.swing.JLabel jLabelHeureDebut;
    private javax.swing.JLabel jLabelHeureFin;
    private javax.swing.JLabel jLabelLieu;
    private javax.swing.JLabel jLabelNbPlaceDispo;
    private javax.swing.JLabel jLabelNbPlaceSouhaite;
    private javax.swing.JLabel jLabelNbPlaceTotal;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldGroupe;
    private javax.swing.JTextField jTextFieldHeureDebut;
    private javax.swing.JTextField jTextFieldHeureFin;
    private javax.swing.JTextField jTextFieldLieu;
    private javax.swing.JTextField jTextFieldNbPlaceDispo;
    private javax.swing.JTextField jTextFieldNbPlaceTotal;
    // End of variables declaration//GEN-END:variables
}
