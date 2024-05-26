package UI_UX;

import Logica.Anfitrion;
import Logica.Cliente;
import Logica.Inmueble;
import Logica.JavaBNB;
import Logica.Particular;
import Logica.Reserva;
import Logica.Validacion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import javax.swing.JOptionPane;

/**
 * La clase AdminConsultarUser permite al administrador consultar y gestionar
 * los usuarios registrados en la aplicación.
 */
public class AdminCheckUser extends javax.swing.JPanel {

    private ArrayList<Cliente> clientesaux; // Referencia al ArrayList de personas de la clase JavaBNB
    private ListIterator<Cliente> li; // Iterador para recorrer el ArrayList en ambas direcciones
    private Cliente objcli; // Referencia a un objeto de tipo cliente del ArrayList

    /**
     * Crea un nuevo formulario AdminConsultarUser.
     */
    public AdminCheckUser() {
        initComponents();
        errorNoSig.setVisible(false);
        errorNoAnt.setVisible(false);
        nameTextField.setEditable(false);
        dniTextField.setEditable(false);
        emailTextField.setEditable(false);
        passTextField.setEditable(false);
        tlfTextField.setEditable(false);
        consultarTodo();
    }

    /**
     * Actualiza la vista y los datos de los usuarios.
     */
    public void actualizar() {
        errorNoSig.setVisible(false);
        errorNoAnt.setVisible(false);
        consultarTodo();
    }

    /**
     * Consulta y carga todos los usuarios de JavaBNB en la lista local.
     */
    private void consultarTodo() {
        try {
            errorNoSig.setVisible(false);
            errorNoAnt.setVisible(false);

            if (JavaBNB.getClientes() != null) {
                clientesaux = JavaBNB.getClientes();

                li = clientesaux.listIterator();
                if (clientesaux.size() < 1) {
                    jButtonSig.setEnabled(false);
                    jButtonAnt.setEnabled(false);
                    deleteUserButton.setEnabled(false);
                    editUserButton.setEnabled(false);
                    return;
                } else {
                    jButtonSig.setEnabled(true);
                    jButtonAnt.setEnabled(true);
                    deleteUserButton.setEnabled(true);
                    editUserButton.setEnabled(true);
                }

                if (li.hasNext()) {
                    objcli = li.next();
                } else {
                    errorNoSig.setVisible(true);
                }
                if (objcli != null) {
                    presenta(objcli);
                } else {
                    errorNoSig.setVisible(true);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }

    /**
     * Presenta los detalles del usuario en los campos de texto
     * correspondientes.
     *
     * @param per el usuario cuyos detalles se van a mostrar
     */
    private void presenta(Cliente per) {
        String tipo = per.getClass().getSimpleName();
        dniTextField.setText(objcli.getDni());
        nameTextField.setText(objcli.getNombre());
        emailTextField.setText(objcli.getCorreo());
        passTextField.setText(objcli.getClave());
        tlfTextField.setText(objcli.getTelefono());
        if (tipo.equals("Anfitrion")) {
            typeLabel.setText(tipo);
        } else {
            typeLabel.setText(tipo);
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        barraarriba1 = new javax.swing.JPanel();
        logo1 = new javax.swing.JButton();
        titleLabel1 = new javax.swing.JLabel();
        mainscr = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        dniLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        dniTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        typeLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        passTextField = new javax.swing.JTextField();
        tlfLabel = new javax.swing.JLabel();
        tlfTextField = new javax.swing.JTextField();
        deleteUserButton = new javax.swing.JButton();
        editUserButton = new javax.swing.JButton();
        jButtonAnt = new javax.swing.JButton();
        jButtonSig = new javax.swing.JButton();
        errorNoSig = new javax.swing.JLabel();
        errorNoAnt = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 250, 248));

        barraarriba1.setBackground(new java.awt.Color(255, 250, 248));
        barraarriba1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        barraarriba1.setLayout(new java.awt.GridBagLayout());

        logo1.setBackground(new java.awt.Color(255, 153, 153));
        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/airbnb logo - 100x100.png"))); // NOI18N
        logo1.setBorderPainted(false);
        logo1.setContentAreaFilled(false);
        logo1.setDefaultCapable(false);
        logo1.setFocusPainted(false);
        logo1.setFocusable(false);
        logo1.setRequestFocusEnabled(false);
        logo1.setRolloverEnabled(false);
        logo1.setVerifyInputWhenFocusTarget(false);
        logo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logo1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -35;
        gridBagConstraints.ipady = -32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 69, 7, 0);
        barraarriba1.add(logo1, gridBagConstraints);

        titleLabel1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        titleLabel1.setForeground(new java.awt.Color(255, 90, 95));
        titleLabel1.setText("JavaBNB");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 18, 0, 0);
        barraarriba1.add(titleLabel1, gridBagConstraints);

        mainscr.setBackground(new java.awt.Color(255, 90, 95));
        mainscr.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        mainscr.setForeground(new java.awt.Color(255, 255, 255));
        mainscr.setText("Volver");
        mainscr.setBorderPainted(false);
        mainscr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainscr.setPreferredSize(new java.awt.Dimension(80, 30));
        mainscr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainscrActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 479, 0, 175);
        barraarriba1.add(mainscr, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 250, 248));

        jPanel2.setBackground(new java.awt.Color(255, 250, 248));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setMinimumSize(new java.awt.Dimension(325, 400));
        jPanel2.setPreferredSize(new java.awt.Dimension(325, 400));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        dniLabel.setText("DNI:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 16, 0, 0);
        jPanel2.add(dniLabel, gridBagConstraints);

        nameLabel.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 16, 0, 0);
        jPanel2.add(nameLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 144;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 38);
        jPanel2.add(dniTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 144;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 12, 0, 38);
        jPanel2.add(nameTextField, gridBagConstraints);

        typeLabel.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        typeLabel.setText("var1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 118;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 27, 0, 0);
        jPanel2.add(typeLabel, gridBagConstraints);

        emailLabel.setText("Correo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 16, 0, 0);
        jPanel2.add(emailLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 144;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 38);
        jPanel2.add(emailTextField, gridBagConstraints);

        passLabel.setText("Clave:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 16, 0, 0);
        jPanel2.add(passLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 144;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 38);
        jPanel2.add(passTextField, gridBagConstraints);

        tlfLabel.setText("Telefono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 12, 0, 0);
        jPanel2.add(tlfLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 144;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 38);
        jPanel2.add(tlfTextField, gridBagConstraints);

        deleteUserButton.setBackground(new java.awt.Color(255, 153, 153));
        deleteUserButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteUserButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteUserButton.setText("Eliminar usuario");
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.insets = new java.awt.Insets(17, 25, 0, 0);
        jPanel2.add(deleteUserButton, gridBagConstraints);

        editUserButton.setBackground(new java.awt.Color(255, 90, 95));
        editUserButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editUserButton.setForeground(new java.awt.Color(255, 255, 255));
        editUserButton.setText("Editar usuario");
        editUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.insets = new java.awt.Insets(17, 25, 0, 0);
        jPanel2.add(editUserButton, gridBagConstraints);

        jButtonAnt.setBackground(new java.awt.Color(255, 153, 153));
        jButtonAnt.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jButtonAnt.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAnt.setText("Anterior");
        jButtonAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAntActionPerformed(evt);
            }
        });

        jButtonSig.setBackground(new java.awt.Color(255, 153, 153));
        jButtonSig.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jButtonSig.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSig.setText("Siguiente");
        jButtonSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSigActionPerformed(evt);
            }
        });

        errorNoSig.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        errorNoSig.setForeground(new java.awt.Color(255, 102, 102));
        errorNoSig.setText("No hay un siguiente usuario");

        errorNoAnt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        errorNoAnt.setForeground(new java.awt.Color(255, 102, 102));
        errorNoAnt.setText("No hay un usuario anterior");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jButtonAnt)
                        .addGap(54, 54, 54)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButtonSig))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(errorNoSig))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(errorNoAnt)))
                .addGap(255, 255, 255))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAnt)
                            .addComponent(jButtonSig)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(errorNoSig)
                .addGap(6, 6, 6)
                .addComponent(errorNoAnt))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraarriba1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barraarriba1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSigActionPerformed
        if (li.hasNext()) {
            objcli = li.next();
            errorNoSig.setVisible(false);
            errorNoAnt.setVisible(false);
            presenta(objcli);

        } else {
            errorNoSig.setVisible(true);
        }
    }//GEN-LAST:event_jButtonSigActionPerformed

    private void jButtonAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAntActionPerformed
        if (li.hasPrevious()) {
            objcli = li.previous();
            errorNoSig.setVisible(false);
            errorNoAnt.setVisible(false);
            presenta(objcli);

        } else {
            errorNoAnt.setVisible(true);
        }
    }//GEN-LAST:event_jButtonAntActionPerformed

    private void logo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logo1ActionPerformed

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
        if (objcli != null) {
            if (objcli instanceof Particular) {
                Particular particular = (Particular) objcli;
                JavaBNB.eliminarParticular(objcli);

                //Tengo que eliminar las reservas asociadas a ese particuar
                ArrayList<Inmueble> inmuebles = JavaBNB.getInmuebles();
                for (Inmueble i : inmuebles) {
                    ArrayList<Reserva> reservas = i.getReservas();
                    Iterator<Reserva> iterator = reservas.iterator();
                    while (iterator.hasNext()) {
                        Reserva reserva = iterator.next();
                        if (reserva.getParticular().getDni().equals(objcli.getDni())) {
                            iterator.remove();
                        }
                    }
                }

            } else if (objcli instanceof Anfitrion) {
                Anfitrion anfitrion = (Anfitrion) objcli;
                ArrayList<Inmueble> inmuebles = JavaBNB.getInmuebles();

                JavaBNB.eliminarAnfitrion(objcli);

                JavaBNB.getInmuebles().removeAll(inmuebles);
            }

            try {
                // Eliminar el cliente de la lista
                li.remove();

                // Guardar los datos actualizados
                JavaBNB.guardarDatos();

                // Actualizar las vistas
                App.adminconsultarreservas.actualizar();
                App.admincheckbuildings.actualizar();
                App.adminconsultaruser.actualizar();
            } catch (Exception e) {
                System.out.println("Está vacío, no se puede eliminar más");
            }

        }


    }//GEN-LAST:event_deleteUserButtonActionPerformed

    private void mainscrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainscrActionPerformed
        App.cardLayout.show(App.cards, "Pantalla adminscreen");
    }//GEN-LAST:event_mainscrActionPerformed

    private void editUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserButtonActionPerformed
        // Verificar el texto actual del botón
        if (editUserButton.getText().equals("Editar datos")) {
            // Si el botón está en modo "Editar datos"
            // Establecer los campos de texto como editables
            emailTextField.setEditable(true);
            passTextField.setEditable(true);
            tlfTextField.setEditable(true);

            // Cambiar el texto del botón a "Aceptar"
            editUserButton.setText("Aceptar");
        } else {
            // Si el botón está en modo "Aceptar"
            // Establecer los campos de texto como no editables
            emailTextField.setEditable(false);
            passTextField.setEditable(false);
            tlfTextField.setEditable(false);

            // Cambiar el texto del botón a "Editar datos"
            editUserButton.setText("Editar datos");

            // Verificar la validez de los datos ingresados
            String email = emailTextField.getText();
            String password = passTextField.getText();
            String telefono = tlfTextField.getText();

            boolean datosValidos = true;

            // Verificar el correo electrónico
            if (!Validacion.validarEmail(email)) {
                JOptionPane.showMessageDialog(this, "El email introducido no es válido.", "Email inválido", JOptionPane.WARNING_MESSAGE);
                emailTextField.setText("");
                datosValidos = false;
            } // Verificar la contraseña
            else if (!Validacion.validarContraseña(password)) {
                JOptionPane.showMessageDialog(this, "La contraseña introducida no es válida. \n Revise los requisitos.", "Contraseña inválida", JOptionPane.WARNING_MESSAGE);
                passTextField.setText("");
                datosValidos = false;
            } // Verificar el teléfono
            else if (!Validacion.validarTelefono(telefono)) {
                JOptionPane.showMessageDialog(this, "El teléfono introducido no es válido. \n Debe empezar por 6/7/9 y contener 9 números.", "Teléfono inválido", JOptionPane.WARNING_MESSAGE);
                tlfTextField.setText("");
                datosValidos = false;

            }

            // Si todos los datos son válidos, guardar los cambios
            if (datosValidos) {
                objcli.setCorreo(email);
                objcli.setTelefono(telefono);
                objcli.setClave(password);

                editUserButton.setText("Editar datos");

                System.out.println(objcli);
            } else {
            }
        }

    }//GEN-LAST:event_editUserButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraarriba1;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JTextField dniTextField;
    private javax.swing.JButton editUserButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel errorNoAnt;
    private javax.swing.JLabel errorNoSig;
    private javax.swing.JButton jButtonAnt;
    private javax.swing.JButton jButtonSig;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logo1;
    private javax.swing.JButton mainscr;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JTextField passTextField;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JLabel tlfLabel;
    private javax.swing.JTextField tlfTextField;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}