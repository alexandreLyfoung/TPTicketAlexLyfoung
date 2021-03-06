/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Entity.Tickets;
import Entity.Users;
import Tools.ConnectionBDD;
import Tools.FonctionsMetier;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex
 */
public class frmAdmin extends javax.swing.JFrame {
    
    ConnectionBDD bdd;
    FonctionsMetier fm;
    Vector v;
    DefaultTableModel dtmUser;
    DefaultTableModel dtmTicket;
    /**
     * Creates new form frmAdmin
     */
    public frmAdmin() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTicket = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumTicket = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNomTicket = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxEtatTicket = new javax.swing.JComboBox<>();
        btnTicket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("ADMINISTRATEUR");

        tblTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nom", "Date", "Etat"
            }
        ));
        jScrollPane1.setViewportView(tblTicket);

        jLabel2.setText("Liste des Utilisateurs");

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nom"
            }
        ));
        tblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblUser);

        jLabel3.setText("Liste des Tickets");

        jLabel4.setText("Numero Ticket");

        jLabel5.setText("Nom Ticket");

        jLabel6.setText("Etat Ticket");

        cbxEtatTicket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bloquant", "Majeur", "Mineur", "Termin??" }));

        btnTicket.setText("Inserer un Ticket");
        btnTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTicketMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtNomTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(16, 16, 16)
                                .addComponent(cbxEtatTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxEtatTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtNumTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtNomTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(30, 30, 30)
                .addComponent(btnTicket)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        bdd = new ConnectionBDD();
        fm = new FonctionsMetier();
        
        dtmUser = (DefaultTableModel) tblUser.getModel();
        dtmTicket = (DefaultTableModel) tblTicket.getModel();
        
        for(Users u: fm.GetAllUsers())
        {
            v = new Vector();
            
            v.add(u.getIdUser());
            v.add(u.getNomUser());
            dtmUser.addRow(v);
        }
        tblUser.setModel(dtmUser);
        txtNumTicket.setText(String.valueOf(fm.GetMaxNumeroTicket()));
    }//GEN-LAST:event_formWindowOpened

    private void tblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserMouseClicked
        // TODO add your handling code here:
        while(tblTicket.getRowCount() != 0)
        {
            dtmTicket.removeRow(0);
        }
        for(Tickets t : fm.GetAllTicket(Integer.parseInt(tblUser.getValueAt(tblUser.getSelectedRow(), 0).toString())))
        {
            
            v = new Vector();
            v.add(t.getIdTicket());
            v.add(t.getNomTicket());
            v.add(t.getDateTicket().toString());
            v.add(fm.GetEtatTicket(t.getNumEtat()));
            dtmTicket.addRow(v);            
        }
        tblTicket.setModel(dtmTicket);
    }//GEN-LAST:event_tblUserMouseClicked

    private void btnTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicketMouseClicked
        // TODO add your handling code here:
        int numTicket = Integer.parseInt(txtNumTicket.getText());
        String nomTicket = txtNomTicket.getText();
        String etatTicket = cbxEtatTicket.getSelectedItem().toString();
        int selectedRow = tblUser.getSelectedRow();
        if (nomTicket.isBlank() || nomTicket.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Veuillez entrer un nom de ticket", "Erreur Nom Ticket", JOptionPane.ERROR_MESSAGE);
        }
        if (selectedRow < 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Veuillez selectionner un utilisateur", "Erreur Nom utilisateur", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            int numUser = Integer.parseInt(tblUser.getValueAt(selectedRow, 0).toString());
            fm.InsererTicket(numTicket, nomTicket, etatTicket, numUser);
            while(tblTicket.getRowCount() != 0)
            {
                dtmTicket.removeRow(0);
            }
            for(Tickets t : fm.GetAllTicket(Integer.parseInt(tblUser.getValueAt(selectedRow, 0).toString())))
            {
            
                v = new Vector();
                v.add(t.getIdTicket());
                v.add(t.getNomTicket());
                v.add(t.getDateTicket().toString());
                v.add(fm.GetEtatTicket(t.getNumEtat()));
                dtmTicket.addRow(v);            
            }
            tblTicket.setModel(dtmTicket);
            txtNumTicket.setText(String.valueOf(fm.GetMaxNumeroTicket()));
        }
        
    }//GEN-LAST:event_btnTicketMouseClicked

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
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTicket;
    private javax.swing.JComboBox<String> cbxEtatTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTicket;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtNomTicket;
    private javax.swing.JTextField txtNumTicket;
    // End of variables declaration//GEN-END:variables
}
