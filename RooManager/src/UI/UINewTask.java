/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Entity.Task;
import GestioneEntita.GestioneAnagDip;
import GestioneEntita.GestioneDitte;
import GestioneEntita.GestioneStanza;
import GestioneEntita.GestioneTask;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author emanuelegargiulo
 */
public class UINewTask extends javax.swing.JFrame {

    private Vector stanze = null;
    private Vector ditte = null;
    private Vector dipendenti = null;
    private int mode = 1;
    
    /**
     * Creates new form UINewTask
     */
    public UINewTask() {
        initComponents();
        
        //Aggiungo i tre tipi di task alla jComboBox relativa
        jComboTipoTask.addItem("Quotidiano");
        jComboTipoTask.addItem("Straordinario");
        
        //Inizialmente è attiva solo la combo dei dipendenti
        jComboDittaEsterna.setEnabled(false);
        
        //Carico le stanze
        try {
            stanze = new GestioneStanza().leggiStanze();
        } catch (SQLException ex) {
            Logger.getLogger(UINewTask.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Aggiungo le stanze alla combobox
        jComboStanza.setModel(new DefaultComboBoxModel<>(stanze));
        
        //Leggo l'elenco delle ditte esterne
        try {
            ditte = new GestioneDitte().leggiDitte();
        } catch (SQLException ex) {
            Logger.getLogger(UINewTask.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Aggiungo le ditte esterne alla combobox
       jComboDittaEsterna.setModel(new DefaultComboBoxModel<>(ditte));
       
        //Leggo l'elenco dei dipendenti
        try {
            dipendenti = new GestioneAnagDip().leggiDipendenti();
        } catch (SQLException ex) {
            Logger.getLogger(UINewTask.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      //Aggiungo i dipendenti alla combobox
       jComboDipendente.setModel(new DefaultComboBoxModel<>(dipendenti));
    }
    
    
    
  /*  public void loadStanze() throws SQLException {
       stanze = (Array[]) new GestioneStanza().leggiStanze().toArray();
       System.out.println(Arrays.toString(stanze));
    } */

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextOperazione = new javax.swing.JTextArea();
        jLabelOperazione = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNuovo.setText("Nuovo Task");

        jComboStanza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboStanzaActionPerformed(evt);
            }
        });

        jComboTipoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTipoTaskActionPerformed(evt);
            }
        });

        jLabelStanza.setText("Stanza");

        jLabelTipoTask.setText("TipoTask ");

        jLabel4.setText("Dipendente");

        jComboDipendente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboDipendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboDipendenteActionPerformed(evt);
            }
        });

        jLabel5.setText("Ditta Esterna");

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

        jTextOperazione.setColumns(20);
        jTextOperazione.setRows(5);
        jScrollPane1.setViewportView(jTextOperazione);

        jLabelOperazione.setText("Operazione");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOperazione)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelNuovo)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButtonStoricoTask)
                            .addGap(147, 147, 147)
                            .addComponent(jButtonRichiedi)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboDipendente, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelStanza)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboStanza, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabelTipoTask)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboTipoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboDittaEsterna, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboDipendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboDittaEsterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabelOperazione)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
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
        mode = jComboTipoTask.getSelectedIndex()+1;
        if (mode == 1) {
            jComboDittaEsterna.setEnabled(false);
            jComboDipendente.setEnabled(true);
        }
        if (mode == 2) {
            jComboDittaEsterna.setEnabled(true);
            jComboDipendente.setEnabled(false);
        }
    }//GEN-LAST:event_jComboTipoTaskActionPerformed

    private void jComboDipendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDipendenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboDipendenteActionPerformed

    private void jComboDittaEsternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDittaEsternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboDittaEsternaActionPerformed

    private void jButtonRichiediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRichiediActionPerformed
        Task task = new Task();
        Random randomGenerator = new Random();
        task.setID(randomGenerator.nextInt(999999999));
        task.setOperazione(jTextOperazione.getText());
        task.setStanza(Integer.parseInt(jComboStanza.getSelectedItem().toString()));
        task.setTipo(jComboTipoTask.getSelectedIndex()+1);
        System.out.println(task.getTipo());
        GestioneTask.aggiungiTask(task);
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
    private javax.swing.JLabel jLabelOperazione;
    private javax.swing.JLabel jLabelStanza;
    private javax.swing.JLabel jLabelTipoTask;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextOperazione;
    // End of variables declaration//GEN-END:variables
}
