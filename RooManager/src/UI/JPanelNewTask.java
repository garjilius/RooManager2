
package UI;

import Entity.Task;
import GestioneEntita.GestioneAnagDip;
import GestioneEntita.GestioneDitte;
import GestioneEntita.GestioneStanza;
import GestioneEntita.GestioneTask;
import java.sql.SQLException;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;


public class JPanelNewTask extends javax.swing.JPanel {

    private Vector stanze = null;
    private Vector ditte = null;
    private Vector dipendenti = null;
    private int mode = 1;
     //Gestione Anagrafiche Dipendenti
    private GestioneAnagDip gestioneDipendenti = new GestioneAnagDip();
        //Gestione Ditte
    private GestioneDitte gestioneDitte = new GestioneDitte();
   
    
    public JPanelNewTask() {
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
            Logger.getLogger(getName()).log(Level.SEVERE, null, ex);
        }
        
        //Aggiungo le stanze alla combobox
        jComboStanza.setModel(new DefaultComboBoxModel<>(stanze));
        
        //Leggo l'elenco delle ditte esterne
        try {
            ditte = gestioneDitte.leggiDitte();
        } catch (SQLException ex) {
            Logger.getLogger(this.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Aggiungo le ditte esterne alla combobox
       jComboDittaEsterna.setModel(new DefaultComboBoxModel<>(ditte));
       
        //Leggo l'elenco dei dipendenti
        try {
            dipendenti = gestioneDipendenti.leggiDipendenti();
        } catch (SQLException ex) {
            Logger.getLogger(getName()).log(Level.SEVERE, null, ex);
        }
        
      //Aggiungo i dipendenti alla combobox
       jComboDipendente.setModel(new DefaultComboBoxModel<>(dipendenti));
    }


    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jComboDittaEsterna = new javax.swing.JComboBox<>();
        jButtonRichiedi = new javax.swing.JButton();
        jButtonStoricoTask = new javax.swing.JButton();
        jLabelNuovo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextOperazione = new javax.swing.JTextArea();
        jComboStanza = new javax.swing.JComboBox<>();
        jComboTipoTask = new javax.swing.JComboBox<>();
        jLabelOperazione = new javax.swing.JLabel();
        jLabelStanza = new javax.swing.JLabel();
        jLabelTipoTask = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboDipendente = new javax.swing.JComboBox<>();

        setMaximumSize(new java.awt.Dimension(0, 0));

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

        jLabelNuovo.setText("Nuovo Task");

        jTextOperazione.setColumns(20);
        jTextOperazione.setRows(5);
        jScrollPane1.setViewportView(jTextOperazione);

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

        jLabelOperazione.setText("Operazione");

        jLabelStanza.setText("Stanza");

        jLabelTipoTask.setText("TipoTask ");

        jLabel4.setText("Dipendente");

        jComboDipendente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboDipendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboDipendenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonStoricoTask)
                        .addGap(312, 312, 312)
                        .addComponent(jButtonRichiedi))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelStanza)
                                    .addGap(249, 249, 249))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jComboStanza, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(52, 52, 52)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelTipoTask)
                                .addComponent(jComboTipoTask, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jComboDipendente, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(52, 52, 52)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboDittaEsterna, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addComponent(jLabelOperazione)
                        .addComponent(jLabelNuovo)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelNuovo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStanza)
                    .addComponent(jLabelTipoTask))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboTipoTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboDipendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboDittaEsterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabelOperazione)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonStoricoTask)
                    .addComponent(jButtonRichiedi))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboDittaEsternaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDittaEsternaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboDittaEsternaActionPerformed

    private void jButtonRichiediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRichiediActionPerformed
        Task task = new Task();
        task.setDataInizio(new GregorianCalendar());
        //Random randomGenerator = new Random();
        try {
            task.setID(GestioneTask.ultimoID());
        } catch (SQLException ex) {
            Logger.getLogger(JPanelNewTask.class.getName()).log(Level.SEVERE, null, ex);
        }
        task.setOperazione(jTextOperazione.getText());
        task.setStanza(Integer.parseInt(jComboStanza.getSelectedItem().toString()));
        //Se siamo in modalità compito straordinario, crea TaskEseguitoDa
        if(mode == 2) {
          
        /*    GregorianCalendar dataFine = new GregorianCalendar();
            dataFine.add(GregorianCalendar.DAY_OF_MONTH, randomGenerator.nextInt(60));
            esecuzioneTask.setDataFine(dataFine); */
            task.setPIVA(gestioneDitte.getPIVAs().get(jComboDittaEsterna.getSelectedIndex()).toString());
            GestioneTask.aggiungiTaskStraordinario(task);
        }
        //Se siamo in modalità compito standard, crea SvolgeTask
        if (mode == 1) {      
            task.setCF(gestioneDipendenti.getCFs().get(jComboDipendente.getSelectedIndex()).toString());
            GestioneTask.aggiungiTaskOrdinario(task);           
        }

    }//GEN-LAST:event_jButtonRichiediActionPerformed

    private void jButtonStoricoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStoricoTaskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonStoricoTaskActionPerformed

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
