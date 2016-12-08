/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author emanuelegargiulo
 */
public class UINewTask extends javax.swing.JFrame {

    /**
     * Creates new form UINewTask
     */
    public UINewTask() {
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

        jLabelNuovo = new javax.swing.JLabel();
        jComboStanza = new javax.swing.JComboBox<>();
        jComboTipoTask = new javax.swing.JComboBox<>();
        jLabelStanza = new javax.swing.JLabel();
        jLabelTipoTask = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboDipendente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboDittaEsterna = new javax.swing.JComboBox<>();
        jButtonRichiedi = new javax.swing.JButton();
        jButtonStoricoTask = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNuovo.setText("Nuovo Task");

        jComboStanza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboStanza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboStanzaActionPerformed(evt);
            }
        });

        jComboTipoTask.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboTipoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTipoTaskActionPerformed(evt);
            }
        });

        jLabelStanza.setText("Stanza");

        jLabelTipoTask.setText("TipoTask ");

        jLabel4.setText("Dipendente");

        jComboDipendente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboDipendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboDipendenteActionPerformed(evt);
            }
        });

        jLabel5.setText("Ditta Esterna");

        jComboDittaEsterna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboDittaEsterna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboDittaEsternaActionPerformed(evt);
            }
        });

        jButtonRichiedi.setText("Richiedi");
        jButtonRichiedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRichiediActionPerformed(evt);
            }
        });

        jButtonStoricoTask.setText("Storico Task");
        jButtonStoricoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStoricoTaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNuovo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelStanza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabelTipoTask)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboTipoTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboDipendente, 0, 238, Short.MAX_VALUE)
                            .addComponent(jComboDittaEsterna, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonStoricoTask)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRichiedi)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelNuovo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStanza)
                    .addComponent(jComboTipoTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipoTask))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboDipendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboDittaEsterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRichiedi)
                    .addComponent(jButtonStoricoTask))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboStanzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboStanzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboStanzaActionPerformed

    private void jComboTipoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTipoTaskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboTipoTaskActionPerformed

    private void jComboDipendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDipendenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboDipendenteActionPerformed

    private void jComboDittaEsternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDittaEsternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboDittaEsternaActionPerformed

    private void jButtonRichiediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRichiediActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRichiediActionPerformed

    private void jButtonStoricoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStoricoTaskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonStoricoTaskActionPerformed

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
            java.util.logging.Logger.getLogger(UINewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UINewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UINewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UINewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UINewTask().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRichiedi;
    private javax.swing.JButton jButtonStoricoTask;
    private javax.swing.JComboBox<String> jComboDipendente;
    private javax.swing.JComboBox<String> jComboDittaEsterna;
    private javax.swing.JComboBox<String> jComboStanza;
    private javax.swing.JComboBox<String> jComboTipoTask;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelNuovo;
    private javax.swing.JLabel jLabelStanza;
    private javax.swing.JLabel jLabelTipoTask;
    // End of variables declaration//GEN-END:variables
}
