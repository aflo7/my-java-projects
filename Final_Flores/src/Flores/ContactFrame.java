// Project:		Final
// Class:               ContactFrame.java
// Date:                November 30, 2021
// Author:              Flores
// Description:         final
package Flores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ContactFrame extends javax.swing.JFrame {

    DefaultListModel<String> model;

    ArrayList<Contact> contactArrayList = new ArrayList<Contact>();

    // clear text fields
    public void clearTextFields() {
        txtName.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtStreet.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtZip.setText("");
        txtDependentInfo.setText("");

        cbxContactType.setSelectedIndex(0); // the default
    }

    // sort the arraylist
    public void sortContacts() {
        // sort the arrayList with no comparator, use the compareTo method.
        contactArrayList.sort(null);

        // clear out the model for the list box
        model.removeAllElements();

        // use for loop to add each element in the Array to the model
        for (Contact so : contactArrayList) {
            model.addElement(so.toString());
        }
    }

    public void addContact() {
        // create variable of type ContactType
        Contact.ContactType type = Contact.ContactType.BUSINESS;

        // Lab 11: declare a reference to a Contact object
        Contact contact = null;

        try {
            // determine what the contact type is
            switch (cbxContactType.getSelectedIndex()) {
                case 0:
                    type = Contact.ContactType.BUSINESS;

                    // Create the ContactBusiness object from input
                    contact = new ContactBusiness(txtName.getText(), txtEmail.getText(),
                            txtPhone.getText(), txtStreet.getText(), txtCity.getText(),
                            txtState.getText(), txtZip.getText(), type, txtDependentInfo.getText());

                    // Add the ContactBusiness info to the model for the listbox
                    model.addElement(contact.toString());

                    // add the object to the arrayList
                    contactArrayList.add(contact);
                    break;
                case 1:
                    type = Contact.ContactType.FAMILY;

                    // Create the ContactFamily object from input
                    contact = new ContactFamily(txtName.getText(), txtEmail.getText(),
                            txtPhone.getText(), txtStreet.getText(), txtCity.getText(),
                            txtState.getText(), txtZip.getText(), type, txtDependentInfo.getText());

                    // Add the ContactFamily info to the model for the listbox
                    model.addElement(contact.toString());

                    // add the object to the arrayList
                    contactArrayList.add(contact);
                    break;
                case 2:
                    type = Contact.ContactType.FRIEND;

                    // Create the ContactFamily object from input
                    contact = new ContactFriend(txtName.getText(), txtEmail.getText(),
                            txtPhone.getText(), txtStreet.getText(), txtCity.getText(),
                            txtState.getText(), txtZip.getText(), type,
                            Integer.parseInt(txtDependentInfo.getText()));

                    // Add the ContactFamily info to the model for the listbox
                    model.addElement(contact.toString());

                    // add the object to the arrayList
                    contactArrayList.add(contact);
                    break;
            }
// Get the current count from the Contact class and display it in the label
            lblCount.setText("Count: " + Contact.getCount());
        } catch (ContactException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Contact Creation Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Contact Creation Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deleteContact() {

        // get the name by finding the characters starting at 0 upto but not including the ,
//        String strName = strSelected.substring(0, strSelected.indexOf(','));
        // remove contact using selected index from list box 
        contactArrayList.remove(lstContacts.getSelectedIndex());

        // remove the selected value from the model by using the selected index
        model.remove(lstContacts.getSelectedIndex());

        // decrement the count
        Contact.decrementCount();

        // Get the current count from the Contact class and display it in the label
        lblCount.setText("Count: " + Contact.getCount());
    }

    public ContactFrame() {
        initComponents();

        model = new DefaultListModel<String>();

        lstContacts.setModel(model);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        lblCount = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstContacts = new javax.swing.JList<>();
        cbxContactType = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        lblDependentInfo = new javax.swing.JLabel();
        txtDependentInfo = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Final Project by Flores"));

        jLabel1.setText("Name");

        jLabel2.setText("Phone");

        jLabel3.setText("Email");

        jLabel4.setText("Street");

        jLabel5.setText("City");

        jLabel6.setText("State");

        jLabel7.setText("Zip");

        lblCount.setText("Count: 0");

        lstContacts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstContactsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstContacts);

        cbxContactType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Business", "Family", "Friend" }));
        cbxContactType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxContactTypeActionPerformed(evt);
            }
        });

        jLabel8.setText("Type");

        lblDependentInfo.setText("Company");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnClear.setText("Clear All Fields");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnUpdate)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(lblDependentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDependentInfo)
                                    .addComponent(cbxContactType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(14, 14, 14)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtStreet)
                                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnClear)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblCount, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbxContactType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDependentInfo)
                            .addComponent(txtDependentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(47, 47, 47)
                        .addComponent(btnClear)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCount)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoad)
                    .addComponent(btnSave))
                .addContainerGap())
        );

        btnAdd.setBackground(new java.awt.Color(204, 255, 204));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 153, 153));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 153, 153));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSort)
                    .addComponent(btnDelete)
                    .addComponent(btnExit))
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExitActionPerformed
    {//GEN-HEADEREND:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddActionPerformed
    {//GEN-HEADEREND:event_btnAddActionPerformed
        addContact();
        clearTextFields();
        sortContacts();

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSortActionPerformed
    {//GEN-HEADEREND:event_btnSortActionPerformed

        sortContacts();

    }//GEN-LAST:event_btnSortActionPerformed


    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteActionPerformed
    {//GEN-HEADEREND:event_btnDeleteActionPerformed
        // get the selected item in the list box.
        String strSelected = lstContacts.getSelectedValue();

        // if nothing is selected display error message
        if (strSelected == null) {
            JOptionPane.showMessageDialog(this, "Nothing Seleced in List Box",
                    "Deletion Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        strSelected = strSelected.split(",")[0];

        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete " + strSelected + "?");
        // 0=yes, 1=no, 2=cancel

        if (choice == 0) {
            deleteContact();
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        // TODO add your handling code here:
        try {
            // create JFileChooser
            JFileChooser fc = new JFileChooser();

            // display save dialog
            fc.showOpenDialog(this);

            // get selected file
            File file = fc.getSelectedFile();

            // create the BufferedReader
            // The try-with-resources statement is a try statement that declares one or more resources.
            // A resource is an object that must be closed after the program is finished with it.
            // The try-with-resources statement ensures that each resource is closed at the end of the statement.
            try (BufferedReader myReader = new BufferedReader(new FileReader(file))) {

                // create reference to String to hold line from file
                String line;

                // Create reference to array to hold individual fields from the string.
                String[] fields;

                // read the first line
                line = myReader.readLine();

                // create reference to Employee object.
                Contact contact;

                model.removeAllElements(); // clear the current model
                contactArrayList.clear(); // clear the arraylist

                // if line not null
                while (line != null) {

                    // split line it into its fields.
                    fields = line.split(",");

                    // get the type from field 7
                    Contact.ContactType type = Contact.ContactType.valueOf(fields[7]);

                    // decide which type it is
                    switch (type) {
                        case BUSINESS:
                            contact = new ContactBusiness(fields[0], fields[1], fields[2], fields[3],
                                    fields[4], fields[5], fields[6], type, fields[8]);

                            // Add the ContactBusiness to the model for the listbox
                            model.addElement(contact.toString());

                            // add the object to the arrayList
                            contactArrayList.add(contact);
                            break;
                        case FAMILY:
                            contact = new ContactFamily(fields[0], fields[1], fields[2], fields[3],
                                    fields[4], fields[5], fields[6], type, fields[8]);

                            // Add the ContactBusiness to the model for the listbox
                            model.addElement(contact.toString());

                            // add the object to the arrayList
                            contactArrayList.add(contact);
                            break;
                        case FRIEND:
                            contact = new ContactFriend(fields[0], fields[1], fields[2], fields[3],
                                    fields[4], fields[5], fields[6], type, Integer.parseInt(fields[8]));

                            // Add the ContactBusiness to the model for the listbox
                            model.addElement(contact.toString());

                            // add the object to the arrayList
                            contactArrayList.add(contact);
                            break;
                        default:
                            System.out.println("Error: number of fields not 8");
                            break;
                    }

                    // read the next line.
                    line = myReader.readLine();
                }
            }

            Contact.setCount(contactArrayList.size()); // change number of contacts to arrayList size

            // Get the current count from the Contact class and display it in the label
            lblCount.setText("Count: " + Contact.getCount());

        } catch (IOException | ContactException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "File Read Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // create a BufferedWriter and use it to write to the file.
        try {
            // create JFileChooser
            JFileChooser fc = new JFileChooser();

            // display save dialog
            fc.showSaveDialog(this);

            // get selected file
            File file = fc.getSelectedFile();

            // open the file
            // The try-with-resources statement is a try statement that declares one or more resources.
            // A resource is an object that must be closed after the program is finished with it.
            // The try-with-resources statement ensures that each resource is closed at the end of the statement.
            try (BufferedWriter myWriter = new BufferedWriter(new FileWriter(file))) {
                // use a for loop to write all the employees to the file
                for (Contact contact : contactArrayList) {
                    myWriter.write(contact.toFile() + System.getProperty("line.separator"));
                }
            }
        } catch (IOException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage(), "File Write Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clearTextFields();

    }//GEN-LAST:event_btnClearActionPerformed

    private void lstContactsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstContactsMouseClicked

        String strSelected = lstContacts.getSelectedValue();

        if (strSelected != null) {

            String[] selectedStringArr;

            // create an array from string that has been split [name, phone, etc.]
            selectedStringArr = strSelected.split(", ");

            txtName.setText(selectedStringArr[0]);
            txtPhone.setText(selectedStringArr[1]);
            txtEmail.setText(selectedStringArr[2]);
            txtStreet.setText(selectedStringArr[3]);
            txtCity.setText(selectedStringArr[4]);
            txtState.setText(selectedStringArr[5]);
            txtZip.setText(selectedStringArr[6]);

            if (selectedStringArr[7].equals("BUSINESS")) {
                cbxContactType.setSelectedIndex(0);
            } else if (selectedStringArr[7].equals("FAMILY")) {
                cbxContactType.setSelectedIndex(1);
            } else if (selectedStringArr[7].equals("FRIEND")) {
                cbxContactType.setSelectedIndex(2);
            } else {
                cbxContactType.setSelectedIndex(0); // the default
            }

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

            if (selectedStringArr.length < 9) {
                txtDependentInfo.setText("");
            } else {
                txtDependentInfo.setText(selectedStringArr[8]);
            }

        }


    }//GEN-LAST:event_lstContactsMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String selectedString = lstContacts.getSelectedValue();

        if (selectedString == null) {
            JOptionPane.showMessageDialog(null, "No contact was selected!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String name = txtName.getText();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();
        String street = txtStreet.getText();
        String city = txtCity.getText();
        String state = txtState.getText();
        String zip = txtZip.getText();
        String txtDepInfo = txtDependentInfo.getText();

        int type = cbxContactType.getSelectedIndex();
        Contact.ContactType currType = Contact.ContactType.BUSINESS;
        if (type == 0) {
            currType = Contact.ContactType.BUSINESS;
        } else if (type == 1) {
            currType = Contact.ContactType.FAMILY;
        } else {
            currType = Contact.ContactType.FRIEND;
        }

        JPanel panel = new updatePanel(name, phone, email, street, city, state, zip, this, currType, txtDepInfo);

        JDialog frame = new JDialog(this, "Edit", true);

        frame.getContentPane().add(panel);
        frame.pack();

        // center the JDialog on the screen
        frame.setLocationRelativeTo(this);

        frame.setVisible(true);


    }//GEN-LAST:event_btnUpdateActionPerformed

   
    public void updateInPlace(String name, String phone, String email, String street, String city, String state, String zip, Contact.ContactType type, String txtDepInfo) {

        if (type == Contact.ContactType.BUSINESS) {

            cbxContactType.setSelectedIndex(0);
        } else if (type == Contact.ContactType.FAMILY) {

            cbxContactType.setSelectedIndex(1);
        } else if (type == Contact.ContactType.FRIEND) {

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

        deleteContact();
        addContact();
        sortContacts();

    }

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
            java.util.logging.Logger.getLogger(ContactFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ContactFrame().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSort;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxContactType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblDependentInfo;
    private javax.swing.JList<String> lstContacts;
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
