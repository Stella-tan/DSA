/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boundary.tutor;

import adt.AdtInterface;
import entity.Tutor;
import utility.insertData;

/**
 *
 * @author kenne
 */
public class tutorSearch extends javax.swing.JFrame {

    public static AdtInterface<Tutor> tutorList = insertData.tutorList;

    /**
     * Creates new form tutorAdd
     */
    public tutorSearch() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        positionTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        backTextField = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        salaryTextField = new javax.swing.JTextField();
        tutorIDTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        add2 = new javax.swing.JButton();
        addressTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("TUTOR - REMOVE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        nameTextField.setEditable(false);
        nameTextField.setBackground(new java.awt.Color(255, 255, 255));
        nameTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(0, 0, 0));
        nameTextField.setToolTipText("");
        nameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 340, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NAME : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ADDRESS : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        positionTextField.setEditable(false);
        positionTextField.setBackground(new java.awt.Color(255, 255, 255));
        positionTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        positionTextField.setForeground(new java.awt.Color(0, 0, 0));
        positionTextField.setToolTipText("");
        positionTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(positionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 340, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("COURSE : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("POSITION :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("PROGRAMME : ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, 40));

        backTextField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        backTextField.setText("BACK");
        backTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(backTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 670, 140, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 720, -1, -1));

        searchButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 80, 100, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("SALARY :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        salaryTextField.setEditable(false);
        salaryTextField.setBackground(new java.awt.Color(255, 255, 255));
        salaryTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salaryTextField.setForeground(new java.awt.Color(0, 0, 0));
        salaryTextField.setToolTipText("");
        salaryTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(salaryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 340, 40));

        tutorIDTextField.setBackground(new java.awt.Color(255, 255, 255));
        tutorIDTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tutorIDTextField.setForeground(new java.awt.Color(0, 0, 0));
        tutorIDTextField.setToolTipText("");
        tutorIDTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tutorIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorIDTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(tutorIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 80, 160, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ENTER TUTOR ID : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 80, -1, -1));

        add2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        add2.setText("REMOVE");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });
        jPanel1.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 670, 140, 40));

        addressTextField1.setEditable(false);
        addressTextField1.setBackground(new java.awt.Color(255, 255, 255));
        addressTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addressTextField1.setForeground(new java.awt.Color(0, 0, 0));
        addressTextField1.setToolTipText("");
        addressTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(addressTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 340, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backTextFieldActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        tutorUI t = new tutorUI();
        t.setVisible(true);
    }//GEN-LAST:event_backTextFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String temp = tutorIDTextField.getText();
        String id = "";
        for (int i = 0; i < temp.length(); i++) {
            if (Character.isLetter(temp.charAt(i))) {
                id += Character.toUpperCase(temp.charAt(i));
            } else {
                id += temp.charAt(i);
            }
        }
        tutorIDTextField.setText(id);
        tutorIDTextField.setEditable(false);
        for (int i = 0; i < tutorList.getNumberOfEntries(); i++) {

            if (id.equals(tutorList.getEntry(i + 1).getTutorID())) {
                nameTextField.setText(tutorList.getEntry(i + 1).getName());
                addressTextField1.setText(tutorList.getEntry(i + 1).getAddress());
                salaryTextField.setText("" + tutorList.getEntry(i + 1).getSalary());
                positionTextField.setText(tutorList.getEntry(i + 1).getPosition());

            }

        }

    }//GEN-LAST:event_searchButtonActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void tutorIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tutorIDTextFieldActionPerformed

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        // TODO add your handling code here:
        String id = tutorIDTextField.getText();

        for (int i = 0; i < tutorList.getNumberOfEntries(); i++) {

            if (id.equals(tutorList.getEntry(i + 1).getTutorID())) {
                tutorList.remove(i + 1);
            }

        }

        nameTextField.setText("");
        addressTextField1.setText("");
        salaryTextField.setText("");
        positionTextField.setText("");
        jLabel1.setText("Removed");


    }//GEN-LAST:event_add2ActionPerformed

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
            java.util.logging.Logger.getLogger(tutorSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tutorSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tutorSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tutorSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tutorSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add2;
    private javax.swing.JTextField addressTextField1;
    private javax.swing.JButton backTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField positionTextField;
    private javax.swing.JTextField salaryTextField;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField tutorIDTextField;
    // End of variables declaration//GEN-END:variables
}
