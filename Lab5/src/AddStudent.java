import javax.swing.JOptionPane;
public class AddStudent extends javax.swing.JFrame {

    public AddStudent() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ageLabel = new javax.swing.JLabel();
        idSText = new javax.swing.JTextField();
        nameLable = new javax.swing.JLabel();
        gpaLable = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        idSLable = new javax.swing.JLabel();
        departmentLable = new javax.swing.JLabel();
        saveLable = new javax.swing.JButton();
        ageText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        gpaText = new javax.swing.JTextField();
        departmentText = new javax.swing.JTextField();
        ageComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ageLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(0, 51, 153));
        ageLabel.setText("Age:");

        idSText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idSText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idSTextActionPerformed(evt);
            }
        });

        nameLable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameLable.setForeground(new java.awt.Color(0, 51, 153));
        nameLable.setText("Full Name:");

        gpaLable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        gpaLable.setForeground(new java.awt.Color(0, 51, 153));
        gpaLable.setText("GPA or Grade:");

        genderLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(0, 51, 153));
        genderLabel.setText("Gender:");

        idSLable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idSLable.setForeground(new java.awt.Color(0, 51, 153));
        idSLable.setText("Student ID:");

        departmentLable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        departmentLable.setForeground(new java.awt.Color(0, 51, 153));
        departmentLable.setText("Department:");

        saveLable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saveLable.setForeground(new java.awt.Color(0, 204, 0));
        saveLable.setText("Save");
        saveLable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveLableActionPerformed(evt);
            }
        });

        ageText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextActionPerformed(evt);
            }
        });

        nameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        gpaText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        gpaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpaTextActionPerformed(evt);
            }
        });

        departmentText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        departmentText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentTextActionPerformed(evt);
            }
        });

        ageComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ageComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", "" }));
        ageComboBox.setToolTipText("");
        ageComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLable)
                                    .addComponent(idSLable))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(idSText, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(departmentLable, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gpaLable, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(departmentText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gpaText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ageText, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(ageComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(saveLable)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idSText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idSLable))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departmentText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departmentLable))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gpaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gpaLable))
                .addGap(27, 27, 27)
                .addComponent(saveLable)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idSTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idSTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idSTextActionPerformed

    private void ageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void gpaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpaTextActionPerformed

    private void departmentTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentTextActionPerformed

    private void ageComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageComboBoxActionPerformed

    private void saveLableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveLableActionPerformed
        String strID = idSText.getText().trim();
        
        String strAge = ageText.getText().trim();
        String Department = departmentText.getText().trim();
        String strGPA = gpaText.getText();

        if (strID.isEmpty() || name.isEmpty() || strAge.isEmpty() || strGPA.isEmpty() || Department.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            
        }
        int id;
        double GPA;
        int age;

        try {
            id = Integer.parseInt(strID);
            if (id <= 0) {
                JOptionPane.showMessageDialog(this, "ID must be a positive number.", "Invalid ID", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID must be numeric.", "Invalid ID", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            age = Integer.parseInt(strAge);
            if (age <= 0 || age > 100) {
                JOptionPane.showMessageDialog(this, "Please enter a valid age (1–100).", "Invalid Age", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Age must be a number.", "Invalid Age", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String gender = ageComboBox.getSelectedItem().toString();
        if (gender.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please select a gender!", "Missing Gender", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            GPA = Double.parseDouble(strGPA);
            if (GPA < 0.0 || GPA > 4.0) {
                JOptionPane.showMessageDialog(this, "GPA must be between 0.0 and 4.0.", "Invalid GPA", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "GPA must be a number.", "Invalid GPA", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this, "Student Added Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_saveLableActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ageComboBox;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageText;
    private javax.swing.JLabel departmentLable;
    private javax.swing.JTextField departmentText;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel gpaLable;
    private javax.swing.JTextField gpaText;
    private javax.swing.JLabel idSLable;
    private javax.swing.JTextField idSText;
    private javax.swing.JLabel nameLable;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton saveLable;
    // End of variables declaration//GEN-END:variables
}
