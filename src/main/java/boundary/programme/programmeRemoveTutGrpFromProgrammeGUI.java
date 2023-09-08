/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boundary.programme;

import adt.AdtInterface;
import control.ProgrammeManagement;
import entity.Course;
import entity.Programme;
import entity.TutorialGroup;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import utility.insertData;
import static utility.insertData.tutorialList;

/**
 *
 * @author user
 */
public class programmeRemoveTutGrpFromProgrammeGUI extends javax.swing.JFrame {

    public static AdtInterface<Programme> programmeList = insertData.programmeList;
    public static AdtInterface<Course> courseList = insertData.courseList;
    //public static AdtInterface<TutorialGroup> tutorialList = insertData.tutorialList;

    /**
     * Creates new form programmeRemoveTutGrpFromProgrammeGUI
     */
    public programmeRemoveTutGrpFromProgrammeGUI() {
        initComponents();
    }

    private void setupProgrammeComboBox(String programmeCode) {
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

        // Iterate through the list of programmes
        for (int i = 1; i <= programmeList.getNumberOfEntries(); i++) {
            Programme programme = programmeList.getEntry(i);

            // Check if the current programme's code matches the given programmeCode
            if (programme.getProgrammeCode().equals(programmeCode)) {
                // Get the list of tutorial groups associated with this programme
                AdtInterface<TutorialGroup> tutorialGroups = programme.tutorialGroups;

                // Iterate through the tutorial groups and add their groupIDs to the combo box
                for (int j = 1; j <= tutorialGroups.getNumberOfEntries(); j++) {
                    TutorialGroup tutorialGroup = tutorialGroups.getEntry(j);
                    comboBoxModel.addElement(tutorialGroup.getGroupID());
                }
            }
        }

        Jcombo.setModel(comboBoxModel); // Set the model for the JComboBox
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfProgrammeCode = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtfProgrammeName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Jcombo = new javax.swing.JComboBox<>();
        ConfirmButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        successMessageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitleLabel1.setBackground(new java.awt.Color(255, 255, 255));
        TitleLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        TitleLabel1.setText("REMOVE TUTORIAL GROUP from Programme");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("PROGRAMME CODE :");

        jtfProgrammeCode.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jtfProgrammeCode.setToolTipText("");
        jtfProgrammeCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtfProgrammeCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfProgrammeCodeActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("PROGRAMME NAME :");

        jtfProgrammeName.setEditable(false);
        jtfProgrammeName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jtfProgrammeName.setToolTipText("");
        jtfProgrammeName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("REMOVE TUTORIAL GROUP:");

        Jcombo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Jcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcomboActionPerformed(evt);
            }
        });

        ConfirmButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ConfirmButton.setText("Remove");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        successMessageLabel.setForeground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(TitleLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ConfirmButton)
                        .addGap(30, 30, 30)
                        .addComponent(backButton)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(successMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfProgrammeName, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfProgrammeCode, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(Jcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addComponent(searchButton)))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(TitleLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfProgrammeCode, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtfProgrammeName, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(successMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfirmButton)
                    .addComponent(backButton))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfProgrammeCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfProgrammeCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfProgrammeCodeActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String id = jtfProgrammeCode.getText().trim();
        // Create an instance of ProgrammeManagement to search for the program
        ProgrammeManagement search = new ProgrammeManagement();

        // Call the searchProgram method to find the program
        Programme programMatched = search.searchProgram(id);

        if (programMatched != null) {
            // If the program is found, update the text fields with its details
            jtfProgrammeName.setText(programMatched.getProgrammeName());
            setupProgrammeComboBox(id);
        } else {
            // If the program is not found, display an error message
            JOptionPane.showMessageDialog(
                    null, "Program with ID " + id + " was not found.", "Program Not Found", JOptionPane.INFORMATION_MESSAGE
            );

            // Clear the text fields
            jtfProgrammeName.setText("");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void JcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcomboActionPerformed

    }//GEN-LAST:event_JcomboActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        String selectedTutorialGroup = Jcombo.getSelectedItem().toString(); // Get the selected tutorial group from the combo box
        String inputID = jtfProgrammeCode.getText();

        // Validate input
        if (inputID.isEmpty() || selectedTutorialGroup.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both a Program Code and select a Tutorial Group.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Find the selected tutorial group's object
        TutorialGroup selectedTutorialGroupObject = null;
        for (int i = 1; i <= tutorialList.getNumberOfEntries(); i++) {
            TutorialGroup tutorialGroup = tutorialList.getEntry(i);
            if (tutorialGroup.getGroupID().equals(selectedTutorialGroup)) {
                selectedTutorialGroupObject = tutorialGroup;
                break; // Found the selected tutorial group, exit the loop
            }
        }

        if (selectedTutorialGroupObject == null) {
            JOptionPane.showMessageDialog(this, "Selected Tutorial Group not found.",
                    "Tutorial Group Not Found", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Find and update the program
        for (int j = 1; j <= programmeList.getNumberOfEntries(); j++) {
            Programme program = programmeList.getEntry(j);
            if (program.getProgrammeCode().equals(inputID)) {
                //program.removeTutorialGroup(j);
                program.getTutorialGroups().remove(j);
                

                // Clear the input fields
                jtfProgrammeName.setText("");
                jtfProgrammeCode.setText("");
                String item = Jcombo.getEditor().getItem().toString();
                Jcombo.getEditor().setItem("Text Has Changed");

                // Display a success message
                successMessageLabel.setText("Program updated successfully!");
                successMessageLabel.setForeground(Color.GREEN); // Set the message color

                return; // Exit the loop after updating
            }
        }

        // If the program is not found, display an error message
        JOptionPane.showMessageDialog(this, "Program with Code " + inputID + " was not found.",
                "Program Not Found", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        setVisible(false);
        ProgrammeManagementMenu t = new ProgrammeManagementMenu();
        t.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(programmeRemoveTutGrpFromProgrammeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(programmeRemoveTutGrpFromProgrammeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(programmeRemoveTutGrpFromProgrammeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(programmeRemoveTutGrpFromProgrammeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new programmeRemoveTutGrpFromProgrammeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JComboBox<String> Jcombo;
    private javax.swing.JLabel TitleLabel1;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jtfProgrammeCode;
    private javax.swing.JTextField jtfProgrammeName;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel successMessageLabel;
    // End of variables declaration//GEN-END:variables
}
