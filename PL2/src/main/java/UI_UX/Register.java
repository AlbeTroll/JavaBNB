/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI_UX;

/**
 *
 * @author alber
 */
public class Register extends javax.swing.JPanel {

    /**
     * Creates new form Register
     */
    public Register() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        createaccLabel = new javax.swing.JLabel();
        subtitleLabel = new javax.swing.JLabel();
        photoLabel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        selectComboBox = new javax.swing.JComboBox<>();
        existaccLabel = new javax.swing.JLabel();
        statementLabel = new javax.swing.JLabel();
        userLabel1 = new javax.swing.JLabel();
        userTextField3 = new javax.swing.JTextField();
        userTextField4 = new javax.swing.JTextField();
        userTextField2 = new javax.swing.JTextField();
        userTextField1 = new javax.swing.JTextField();
        userLabel2 = new javax.swing.JLabel();
        userLabel3 = new javax.swing.JLabel();
        userLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 250, 248));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 250, 248));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        createaccLabel.setBackground(new java.awt.Color(255, 90, 95));
        createaccLabel.setFont(new java.awt.Font("Serif", 0, 48)); // NOI18N
        createaccLabel.setForeground(new java.awt.Color(255, 90, 95));
        createaccLabel.setText("Cree su cuenta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(16, 0, 0, 0);
        jPanel1.add(createaccLabel, gridBagConstraints);

        subtitleLabel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        subtitleLabel.setForeground(new java.awt.Color(255, 90, 95));
        subtitleLabel.setText("Anfitrión o cliente: ¡elija su función!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel1.add(subtitleLabel, gridBagConstraints);

        photoLabel.setBackground(new java.awt.Color(255, 90, 95));
        photoLabel.setBorderPainted(false);
        photoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        photoLabel.setDefaultCapable(false);
        photoLabel.setFocusPainted(false);
        photoLabel.setFocusable(false);
        photoLabel.setRequestFocusEnabled(false);
        photoLabel.setRolloverEnabled(false);
        photoLabel.setVerifyInputWhenFocusTarget(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel1.add(photoLabel, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("REGISTRO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(22, 0, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        userTextField.setText("Introduzca el usuario");
        userTextField.setToolTipText("");
        userTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        userTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTextFieldMousePressed(evt);
            }
        });
        userTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.ipadx = 301;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 12, 2, 0);
        jPanel1.add(userTextField, gridBagConstraints);

        userLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(102, 102, 102));
        userLabel.setText("Nombre completo *");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        jPanel1.add(userLabel, gridBagConstraints);

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(102, 102, 102));
        passwordLabel.setText("Contraseña *");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 30);
        jPanel1.add(passwordLabel, gridBagConstraints);

        passwordTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        passwordTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordTextFieldMousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.ipadx = 354;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 12, 2, 0);
        jPanel1.add(passwordTextField, gridBagConstraints);

        registerButton.setBackground(new java.awt.Color(255, 90, 95));
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Registrarse");
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 38;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.insets = new java.awt.Insets(16, 0, 0, 0);
        jPanel1.add(registerButton, gridBagConstraints);

        selectComboBox.setBackground(new java.awt.Color(255, 90, 95));
        selectComboBox.setEditable(true);
        selectComboBox.setForeground(new java.awt.Color(255, 255, 255));
        selectComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione entre:", "Anfitrión", "Cliente" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        jPanel1.add(selectComboBox, gridBagConstraints);

        existaccLabel.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        existaccLabel.setForeground(new java.awt.Color(255, 90, 95));
        existaccLabel.setText("¿Ya tiene una cuenta?");
        existaccLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        existaccLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                existaccLabelMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 39;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 19, 0);
        jPanel1.add(existaccLabel, gridBagConstraints);

        statementLabel.setForeground(new java.awt.Color(102, 102, 102));
        statementLabel.setText("Nota: se deben rellenar todos los campos obligatorios (marcados con *)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 37;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 0);
        jPanel1.add(statementLabel, gridBagConstraints);

        userLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userLabel1.setForeground(new java.awt.Color(102, 102, 102));
        userLabel1.setText("DNI *");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 30);
        jPanel1.add(userLabel1, gridBagConstraints);

        userTextField3.setText("Introduzca el usuario");
        userTextField3.setToolTipText("");
        userTextField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        userTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTextField3MousePressed(evt);
            }
        });
        userTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextField3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.ipadx = 301;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 12, 2, 0);
        jPanel1.add(userTextField3, gridBagConstraints);

        userTextField4.setText("Introduzca el usuario");
        userTextField4.setToolTipText("");
        userTextField4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        userTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTextField4MousePressed(evt);
            }
        });
        userTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextField4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.ipadx = 301;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 12, 2, 0);
        jPanel1.add(userTextField4, gridBagConstraints);

        userTextField2.setText("Introduzca el usuario");
        userTextField2.setToolTipText("");
        userTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        userTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTextField2MousePressed(evt);
            }
        });
        userTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextField2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.ipadx = 301;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 12, 2, 0);
        jPanel1.add(userTextField2, gridBagConstraints);

        userTextField1.setText("Introduzca el usuario");
        userTextField1.setToolTipText("");
        userTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        userTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTextField1MousePressed(evt);
            }
        });
        userTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextField1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.ipadx = 301;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 12, 2, 0);
        jPanel1.add(userTextField1, gridBagConstraints);

        userLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userLabel2.setForeground(new java.awt.Color(102, 102, 102));
        userLabel2.setText("Usuario *");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 30);
        jPanel1.add(userLabel2, gridBagConstraints);

        userLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userLabel3.setForeground(new java.awt.Color(102, 102, 102));
        userLabel3.setText("Usuario *");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 30);
        jPanel1.add(userLabel3, gridBagConstraints);

        userLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userLabel4.setForeground(new java.awt.Color(102, 102, 102));
        userLabel4.setText("Usuario *");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 30);
        jPanel1.add(userLabel4, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void userTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextFieldMousePressed
        userTextField.setText("");
    }//GEN-LAST:event_userTextFieldMousePressed

    private void userTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextFieldActionPerformed

    }//GEN-LAST:event_userTextFieldActionPerformed

    private void passwordTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextFieldMousePressed
        passwordTextField.setText("");
    }//GEN-LAST:event_passwordTextFieldMousePressed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed

    private void existaccLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_existaccLabelMouseClicked
        Aplicacion.cardLayout.show(Aplicacion.cards, "Pantalla login");
    }//GEN-LAST:event_existaccLabelMouseClicked

    private void userTextField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextField1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextField1MousePressed

    private void userTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextField1ActionPerformed

    private void userTextField2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextField2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextField2MousePressed

    private void userTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextField2ActionPerformed

    private void userTextField3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextField3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextField3MousePressed

    private void userTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextField3ActionPerformed

    private void userTextField4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextField4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextField4MousePressed

    private void userTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextField4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createaccLabel;
    private javax.swing.JLabel existaccLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton photoLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JComboBox<String> selectComboBox;
    private javax.swing.JLabel statementLabel;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    private javax.swing.JLabel userLabel2;
    private javax.swing.JLabel userLabel3;
    private javax.swing.JLabel userLabel4;
    private javax.swing.JTextField userTextField;
    private javax.swing.JTextField userTextField1;
    private javax.swing.JTextField userTextField2;
    private javax.swing.JTextField userTextField3;
    private javax.swing.JTextField userTextField4;
    // End of variables declaration//GEN-END:variables
}
