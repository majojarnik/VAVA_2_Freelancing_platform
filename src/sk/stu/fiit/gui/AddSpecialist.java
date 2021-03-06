/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.gui;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sk.stu.fiit.controllers.OfferController;
import sk.stu.fiit.controllers.SpecialistController;
import sk.stu.fiit.data.Data;
import sk.stu.fiit.exceptions.BlankFields;
import sk.stu.fiit.models.Employer;
import sk.stu.fiit.models.employees.Administrator;
import sk.stu.fiit.models.employees.Education;
import sk.stu.fiit.models.employees.Programmer;
import sk.stu.fiit.models.employees.Security;
import sk.stu.fiit.models.employees.Specialist;

/**
 *
 * @author jarni
 */
public class AddSpecialist extends javax.swing.JFrame {

    /**
     * Creates new form AddSpecialist
     */
    
    MainWindow parent;
    boolean editing = false;
    boolean offer = false;
    Specialist spec = null;
    
    public AddSpecialist(MainWindow parent) {
        this.parent = parent;
        initComponents();
        
    }
    
    public void initOffer(){
        lblName.setText("Počet voľných miest");
        lblHeading.setText("Pridanie ponuky");
        lblNation.setText("Zamestnávateľ");
        initEmpCombo();
        offer = true;
    }
    
    private void initEmpCombo(){
        List<String> emps = new ArrayList<>();
        
        for (Employer emp : Data.getAllEmployers()) {
            emps.add(emp.getName());
        }
        cmbNation.setModel(new DefaultComboBoxModel<String>(emps.toArray(new String[0])));
        
    }
    
    public void initEdit(Specialist spec){
        this.spec = spec;
        editing = true;
        
        lblHeading.setText("Editovať špecialistu");
        btnAdd.setText("Uložiť");
        txfName.setText(spec.getName());
        cmbNation.setSelectedItem(spec.getNationality());
        cmbType.setSelectedItem(spec.getType());
        cmbEdu.setSelectedItem(spec.getEducation().toString());
        txfManDay.setText(String.valueOf(spec.getManDay()));
        txfExper.setText(String.valueOf(spec.getExperience()));
        
        pnlCert.removeAll();
        for (String cer : spec.getCertificates()) {
            JTextField txfNew = new JTextField();
            txfNew.setText(cer);
            pnlCert.add(txfNew); 
        }
        
        pnlCert.revalidate();
        pnlCert.repaint();
        
        cmbType.setEnabled(false);
        
        switch (String.valueOf(cmbType.getSelectedItem())) {
            case "Programátor":
                System.out.println("Vybraty programator");
                lblArea.setVisible(true);
                Programmer pr = (Programmer) spec;
                txfArea.setText(pr.getArea());
                txfArea.setVisible(true);
                ckbNBU.setVisible(false);
                lblPlatform.setVisible(false);
                txfPlatform.setVisible(false);
                break;
            case "Bezpečnostný konzultant":
                System.out.println("Vybraty bezpečák");
                lblArea.setVisible(false);
                txfArea.setVisible(false);
                Security sec = (Security) spec;
                ckbNBU.setSelected(sec.isNBU());
                ckbNBU.setVisible(true);
                lblPlatform.setVisible(false);
                txfPlatform.setVisible(false);
                break;
            case "Administrátor":
                System.out.println("Vybraty administrátor");
                lblArea.setVisible(true);
                Administrator ad = (Administrator) spec;
                txfArea.setText(ad.getArea());
                txfArea.setVisible(true);
                ckbNBU.setVisible(false);
                lblPlatform.setVisible(true);
                txfPlatform.setText(ad.getPlatform());
                txfPlatform.setVisible(true);
                break;
            default:
                System.out.println("Nejaka chybička");
                break;
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        lblManDay = new javax.swing.JLabel();
        txfManDay = new javax.swing.JTextField();
        lblExper = new javax.swing.JLabel();
        txfExper = new javax.swing.JTextField();
        lblEdu = new javax.swing.JLabel();
        cmbEdu = new javax.swing.JComboBox<>();
        lblCertificates = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        txfArea = new javax.swing.JTextField();
        ckbNBU = new javax.swing.JCheckBox();
        lblPlatform = new javax.swing.JLabel();
        txfPlatform = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlCert = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        btnAddCert = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txfName = new javax.swing.JTextField();
        lblNation = new javax.swing.JLabel();
        cmbNation = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(390, 780));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeading.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblHeading.setText("Pridanie špecialistu");
        getContentPane().add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        lblType.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblType.setText("Typ špecialistu");
        getContentPane().add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programátor", "Bezpečnostný konzultant", "Administrátor" }));
        cmbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTypeActionPerformed(evt);
            }
        });
        getContentPane().add(cmbType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 330, 30));

        lblManDay.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblManDay.setText("Cena za deň");
        getContentPane().add(lblManDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        getContentPane().add(txfManDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 330, -1));

        lblExper.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblExper.setText("Dĺžka praxe");
        getContentPane().add(lblExper, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));
        getContentPane().add(txfExper, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 330, -1));

        lblEdu.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblEdu.setText("Najvyššie dosiahnuté vzdelanie");
        getContentPane().add(lblEdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        List<String> names = new ArrayList<String>();
        for (Education edu: Education.values()){
            names.add(edu.toString());
        }

        String[] array = names.toArray(new String[0]);
        cmbEdu.setModel(new DefaultComboBoxModel(array));
        getContentPane().add(cmbEdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 330, 30));

        lblCertificates.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblCertificates.setText("Certifikáty");
        getContentPane().add(lblCertificates, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        lblArea.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblArea.setText("Zaradenie");
        getContentPane().add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));
        getContentPane().add(txfArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 330, -1));

        ckbNBU.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        ckbNBU.setText("Autor kybernetickej bezpečnosti NBU");
        ckbNBU.setVisible(false);
        getContentPane().add(ckbNBU, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        lblPlatform.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblPlatform.setText("Preferovaná platforma");
        lblPlatform.setVisible(false);
        getContentPane().add(lblPlatform, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));

        txfPlatform.setVisible(false);
        getContentPane().add(txfPlatform, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 330, -1));

        btnAdd.setText("Pridať");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAddMouseReleased(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, -1, -1));

        btnCancel.setText("Zrušiť");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelMouseReleased(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 700, -1, -1));

        pnlCert.setLayout(new javax.swing.BoxLayout(pnlCert, javax.swing.BoxLayout.Y_AXIS));
        pnlCert.add(jTextField1);
        pnlCert.add(jTextField3);

        jScrollPane1.setViewportView(pnlCert);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 330, 70));

        btnAddCert.setText("Pridať certifikát");
        btnAddCert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAddCertMouseReleased(evt);
            }
        });
        getContentPane().add(btnAddCert, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, -1, -1));

        lblName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblName.setText("Meno a priezvisko");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        getContentPane().add(txfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 330, -1));

        lblNation.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblNation.setText("Národnosť");
        getContentPane().add(lblNation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        cmbNation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Slovenská", "Česká", "Iná" }));
        getContentPane().add(cmbNation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 330, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private SpecialistController specCon = new SpecialistController();

    private void cmbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTypeActionPerformed
        switch (String.valueOf(cmbType.getSelectedItem())) {
            case "Programátor":
                System.out.println("Vybraty programator");
                lblArea.setVisible(true);
                txfArea.setVisible(true);
                ckbNBU.setVisible(false);
                lblPlatform.setVisible(false);
                txfPlatform.setVisible(false);
                break;
            case "Bezpečnostný konzultant":
                System.out.println("Vybraty bezpečák");
                lblArea.setVisible(false);
                txfArea.setVisible(false);
                ckbNBU.setVisible(true);
                lblPlatform.setVisible(false);
                txfPlatform.setVisible(false);
                break;
            case "Administrátor":
                System.out.println("Vybraty administrátor");
                lblArea.setVisible(true);
                txfArea.setVisible(true);
                ckbNBU.setVisible(false);
                lblPlatform.setVisible(true);
                txfPlatform.setVisible(true);
                break;
            default:
                System.out.println("Nejaka chyba");
                break;
        }
          
    }//GEN-LAST:event_cmbTypeActionPerformed

    private void btnAddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseReleased
        List<String> certif = new ArrayList<>();
        for (Component txf : pnlCert.getComponents()) {
            if (txf instanceof JTextField) { 
                if (! "".equals(((JTextField)txf).getText())){ 
                    certif.add(((JTextField)txf).getText());
                }
               
            }
        }
        OfferController offCon = new OfferController();
        try {
            if (cmbNation.getSelectedIndex() < 0)
                throw new BlankFields();
            switch (String.valueOf(cmbType.getSelectedItem())) {
                case "Programátor":
                    if (editing)
                        specCon.editProgrammer((Programmer) spec, txfName.getText(), cmbNation.getItemAt(cmbNation.getSelectedIndex()), txfManDay.getText(), txfExper.getText(), String.valueOf(cmbEdu.getSelectedItem()), txfArea.getText(), certif);
                    else if (offer)
                        offCon.addProgrammer(txfName.getText(), cmbNation.getSelectedIndex(), txfManDay.getText(), txfExper.getText(), String.valueOf(cmbEdu.getSelectedItem()), txfArea.getText(), certif);
                    else
                        specCon.addProgrammer(txfName.getText(), cmbNation.getItemAt(cmbNation.getSelectedIndex()), txfManDay.getText(), txfExper.getText(), String.valueOf(cmbEdu.getSelectedItem()), txfArea.getText(), certif);
                    break;
                case "Bezpečnostný konzultant":
                    if (editing)
                        specCon.editSecurity((Security) spec, txfName.getText(), cmbNation.getItemAt(cmbNation.getSelectedIndex()), txfManDay.getText(), txfExper.getText(), String.valueOf(cmbEdu.getSelectedItem()), ckbNBU.isSelected(), certif);
                    else if (offer)
                        offCon.addSecurity(txfName.getText(), cmbNation.getSelectedIndex(), txfManDay.getText(), txfExper.getText(), String.valueOf(cmbEdu.getSelectedItem()), ckbNBU.isSelected(), certif);
                    else
                        specCon.addSecurity(txfName.getText(), cmbNation.getItemAt(cmbNation.getSelectedIndex()), txfManDay.getText(), txfExper.getText(), String.valueOf(cmbEdu.getSelectedItem()), ckbNBU.isSelected(), certif);
                    break;
                case "Administrátor":
                    if (editing)
                        specCon.editAdministrator((Administrator) spec, txfName.getText(), cmbNation.getItemAt(cmbNation.getSelectedIndex()), txfManDay.getText(), txfExper.getText(), String.valueOf(cmbEdu.getSelectedItem()), txfArea.getText(), certif, txfPlatform.getText());
                    else if (offer)
                        offCon.addAdministrator(txfName.getText(), cmbNation.getSelectedIndex(), txfManDay.getText(), txfExper.getText(), String.valueOf(cmbEdu.getSelectedItem()), txfArea.getText(), certif, txfPlatform.getText());
                    else   
                        specCon.addAdministrator(txfName.getText(), cmbNation.getItemAt(cmbNation.getSelectedIndex()), txfManDay.getText(), txfExper.getText(), String.valueOf(cmbEdu.getSelectedItem()), txfArea.getText(), certif, txfPlatform.getText());
                    break;
                default:
                    break;   
            }
            parent.initSpecTables();
            parent.initOfferTable();
            dispose();
        } catch (BlankFields ex) {
            JOptionPane.showMessageDialog(rootPane, "Vyplňte všetky povinné polia.", "Nevyplnené údaje", JOptionPane.ERROR_MESSAGE);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Cena za deň a dĺžka praxe musia byť kladné reálne čísla", "Nesprávny formát", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAddMouseReleased

    private void btnCancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseReleased
        dispose();
    }//GEN-LAST:event_btnCancelMouseReleased

    private void btnAddCertMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCertMouseReleased
        pnlCert.add(new JTextField());
        pnlCert.revalidate();
        pnlCert.repaint();
    }//GEN-LAST:event_btnAddCertMouseReleased

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddSpecialist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddSpecialist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddSpecialist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddSpecialist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddSpecialist().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddCert;
    private javax.swing.JButton btnCancel;
    private javax.swing.JCheckBox ckbNBU;
    private javax.swing.JComboBox<String> cmbEdu;
    private javax.swing.JComboBox<String> cmbNation;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblCertificates;
    private javax.swing.JLabel lblEdu;
    private javax.swing.JLabel lblExper;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblManDay;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNation;
    private javax.swing.JLabel lblPlatform;
    private javax.swing.JLabel lblType;
    private javax.swing.JPanel pnlCert;
    private javax.swing.JTextField txfArea;
    private javax.swing.JTextField txfExper;
    private javax.swing.JTextField txfManDay;
    private javax.swing.JTextField txfName;
    private javax.swing.JTextField txfPlatform;
    // End of variables declaration//GEN-END:variables
}
