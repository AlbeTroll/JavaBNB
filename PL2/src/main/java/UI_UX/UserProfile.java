/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI_UX;

import Logica.Sesion;


public class UserProfile extends javax.swing.JPanel{

    /**
     * Creates new form UserProfile
     */
    public UserProfile() {
        initComponents();
        hostlabel.setVisible(false);
        
    }
    
    public void actualizar(){
    if (Sesion.user != null) {
            labeldni.setText(Sesion.user.getDni());
            username.setText(Sesion.user.getNombre());
            labelcorreo.setText(Sesion.user.getCorreo());
            clave.setText(Sesion.user.getClave());
            labeltlf.setText(Sesion.user.getTelefono());

            if (Sesion.esAnfitrion) {
                hostlabel.setVisible(true);
            } else {
                hostlabel.setVisible(false);
            }
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

        jPanel2 = new javax.swing.JPanel();
        uppermenu = new javax.swing.JPanel();
        appname = new javax.swing.JLabel();
        logo = new javax.swing.JButton();
        mainscr = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        data = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelcorreo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labeldni = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labeltlf = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        clave = new javax.swing.JPasswordField();
        userpfp = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        hostlabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 250, 248));

        jPanel2.setBackground(new java.awt.Color(255, 250, 248));

        uppermenu.setBackground(new java.awt.Color(255, 250, 248));
        uppermenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        uppermenu.setLayout(new java.awt.GridBagLayout());

        appname.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        appname.setForeground(new java.awt.Color(255, 90, 95));
        appname.setText("JavaBNB");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 29, 0, 0);
        uppermenu.add(appname, gridBagConstraints);

        logo.setBackground(new java.awt.Color(255, 153, 153));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airbnb logo - 100x100.png"))); // NOI18N
        logo.setBorderPainted(false);
        logo.setContentAreaFilled(false);
        logo.setDefaultCapable(false);
        logo.setFocusPainted(false);
        logo.setFocusable(false);
        logo.setRequestFocusEnabled(false);
        logo.setRolloverEnabled(false);
        logo.setVerifyInputWhenFocusTarget(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = -31;
        gridBagConstraints.ipady = -24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 119, 21, 0);
        uppermenu.add(logo, gridBagConstraints);

        mainscr.setBackground(new java.awt.Color(255, 153, 153));
        mainscr.setText("Buscar");
        mainscr.setBorderPainted(false);
        mainscr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainscr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainscrActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 424, 0, 180);
        uppermenu.add(mainscr, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(255, 250, 248));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        data.setBackground(new java.awt.Color(255, 250, 248));
        data.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Correo electrónico:");

        labelcorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelcorreo.setText("peperico@gmail.com");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("DNI:");

        labeldni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labeldni.setText("09109125E");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Teléfono:");

        labeltlf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labeltlf.setText("635526438");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Contraseña:");

        clave.setText("contraseña1");

        javax.swing.GroupLayout dataLayout = new javax.swing.GroupLayout(data);
        data.setLayout(dataLayout);
        dataLayout.setHorizontalGroup(
            dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dataLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labeltlf))
                    .addGroup(dataLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labeldni))
                    .addGroup(dataLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(labelcorreo)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        dataLayout.setVerticalGroup(
            dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelcorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labeldni)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labeltlf)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.ipady = 120;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 70, 0, 119);
        jPanel1.add(data, gridBagConstraints);

        userpfp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user (2).jpg"))); // NOI18N
        userpfp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userpfpActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = -22;
        gridBagConstraints.ipady = -45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 118, 0, 0);
        jPanel1.add(userpfp, gridBagConstraints);

        username.setFont(new java.awt.Font("Serif", 0, 30)); // NOI18N
        username.setText("PEPE RICO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 189, 0, 0);
        jPanel1.add(username, gridBagConstraints);

        hostlabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        hostlabel.setForeground(new java.awt.Color(102, 102, 102));
        hostlabel.setText("Host");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 237, 36, 0);
        jPanel1.add(hostlabel, gridBagConstraints);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(uppermenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(uppermenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userpfpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userpfpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userpfpActionPerformed

    private void mainscrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainscrActionPerformed
        Aplicacion.cardLayout.show(Aplicacion.cards, "Pantalla mainscreen");
    }//GEN-LAST:event_mainscrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appname;
    private javax.swing.JPasswordField clave;
    private javax.swing.JPanel data;
    private javax.swing.JLabel hostlabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelcorreo;
    private javax.swing.JLabel labeldni;
    private javax.swing.JLabel labeltlf;
    private javax.swing.JButton logo;
    private javax.swing.JButton mainscr;
    private javax.swing.JPanel uppermenu;
    private javax.swing.JLabel username;
    private javax.swing.JButton userpfp;
    // End of variables declaration//GEN-END:variables
}