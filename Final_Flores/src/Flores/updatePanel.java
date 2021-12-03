/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flores;

import java.awt.Window;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author andres
 */
public class updatePanel extends javax.swing.JPanel {

    /**
     * Creates new form updatePanel
     */
    private ContactFrame parent; // reference to the main contact frame

    public updatePanel(String name, String phone, String email, String street, String city, String state, String zip, ContactFrame ref, Contact.ContactType type, String txtDepInfo) {
        initComponents();

//        Contact.ContactType type = Contact.ContactType.BUSINESS;
        if (type == Contact.ContactType.BUSINESS) {
            cbxContactType.setSelectedIndex(0);
            lblDependentInfo.setText("Company");
        } else if (type == Contact.ContactType.FAMILY) {
            lblDependentInfo.setText("Relationship");
            cbxContactType.setSelectedIndex(1);
        } else if (type == Contact.ContactType.FRIEND) {
            lblDependentInfo.setText("Year Met");
            cbxContactType.setSelectedIndex(2);
        }

        txtName.setText(name);
        txtPhone.setText(phone);
        txtEmail.setText(email);
        txtStreet.setText(street);
        txtCity.setText(city);
        txtState.setText(state);
        txtZip.setText(zip);
        txtDependentInfo.setText(txtDepInfo);

        this.parent = ref;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblStreet = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblZip = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        cbxContactType = new javax.swing.JComboBox<>();
        txtDependentInfo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblDependentInfo = new javax.swing.JLabel();

        lblName.setText("Name:");

        lblPhone.setText("Phone");

        lblEmail.setText("Email");

        lblStreet.setText("Street");

        lblCity.setText("City");

        lblState.setText("State");

        lblZip.setText("Zip");

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        cbxContactType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Business", "Family", "Friend" }));
        cbxContactType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxContactTypeActionPerformed(evt);
            }
        });

        jLabel1.setText("Type");

        lblDependentInfo.setText("Company");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancel)
                        .addGap(75, 75, 75)
                        .addComponent(btnDone))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblState)
                            .addComponent(lblZip)
                            .addComponent(lblCity)
                            .addComponent(lblStreet)
                            .addComponent(lblEmail)
                            .addComponent(lblPhone)
                            .addComponent(lblName)
                            .addComponent(jLabel1)
                            .addComponent(lblDependentInfo))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtStreet, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addComponent(txtState, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addComponent(txtZip, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addComponent(txtDependentInfo)
                                .addComponent(cbxContactType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStreet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZip))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxContactType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDependentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDependentInfo))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDone)
                    .addComponent(btnCancel))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void closeDialog(java.awt.event.ActionEvent evt) {
        JComponent comp = (JComponent) evt.getSource();
        Window win = SwingUtilities.getWindowAncestor(comp);
        win.dispose();
    }

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        closeDialog(evt);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        String name = txtName.getText();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();
        String street = txtStreet.getText();
        String city = txtCity.getText();
        String state = txtState.getText();
        String zip = txtZip.getText();
        String depInfo = txtDependentInfo.getText();

        int selectedType = cbxContactType.getSelectedIndex();
        Contact.ContactType newType = Contact.ContactType.BUSINESS;

        if (selectedType == 0) {
            newType = Contact.ContactType.BUSINESS;
        } else if (selectedType == 1) {
            newType = Contact.ContactType.FAMILY;
        } else if (selectedType == 2) {
            newType = Contact.ContactType.FRIEND;
        }

        parent.updateInPlace(name, phone, email, street, city, state, zip, newType, depInfo);
        closeDialog(evt);

    }//GEN-LAST:event_btnDoneActionPerformed

    private void cbxContactTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxContactTypeActionPerformed
// determine which was selected
        switch (cbxContactType.getSelectedIndex()) {
            case 0:
                lblDependentInfo.setText("Company");
                break;
            case 1:
                lblDependentInfo.setText("Relationship");
                break;
            case 2:
                lblDependentInfo.setText("Year Met");
                break;
        }

        // clear the textbox
        txtDependentInfo.setText("");
    }//GEN-LAST:event_cbxContactTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JComboBox<String> cbxContactType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDependentInfo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDependentInfo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}