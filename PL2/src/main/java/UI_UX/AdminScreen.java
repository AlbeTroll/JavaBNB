/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI_UX;

//La clase AdminScreen muestra la interfaz de usuario principal del administrador
 
public class AdminScreen extends javax.swing.JPanel {

    
    public AdminScreen() {
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
        barraarriba = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        logo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        checkBuildingsButton = new javax.swing.JButton();
        checkUsersButton = new javax.swing.JButton();
        checkBookingsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 250, 248));

        barraarriba.setBackground(new java.awt.Color(255, 250, 248));
        barraarriba.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setBackground(new java.awt.Color(255, 153, 153));
        jButton3.setText("Cerrar sesión");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 90, 95));
        titleLabel.setText("JavaBNB");

        logo.setBackground(new java.awt.Color(255, 153, 153));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/airbnb logo - 100x100.png"))); // NOI18N
        logo.setBorderPainted(false);
        logo.setContentAreaFilled(false);
        logo.setDefaultCapable(false);
        logo.setFocusPainted(false);
        logo.setFocusable(false);
        logo.setRequestFocusEnabled(false);
        logo.setRolloverEnabled(false);
        logo.setVerifyInputWhenFocusTarget(false);
        logo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraarribaLayout = new javax.swing.GroupLayout(barraarriba);
        barraarriba.setLayout(barraarribaLayout);
        barraarribaLayout.setHorizontalGroup(
            barraarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraarribaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        barraarribaLayout.setVerticalGroup(
            barraarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraarribaLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraarribaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(barraarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel))
                .addGap(21, 21, 21))
        );

        jPanel2.setBackground(new java.awt.Color(255, 250, 248));

        checkBuildingsButton.setBackground(new java.awt.Color(255, 153, 153));
        checkBuildingsButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        checkBuildingsButton.setText("Consultar inmuebles");
        checkBuildingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBuildingsButtonActionPerformed(evt);
            }
        });

        checkUsersButton.setBackground(new java.awt.Color(255, 153, 153));
        checkUsersButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        checkUsersButton.setText("Consultar usuarios");
        checkUsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkUsersButtonActionPerformed(evt);
            }
        });

        checkBookingsButton.setBackground(new java.awt.Color(255, 153, 153));
        checkBookingsButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        checkBookingsButton.setText("Consultar reservas");
        checkBookingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBookingsButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel1.setText("¡Bienvenido de nuevo!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(jLabel1))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(checkUsersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(checkBuildingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(checkBookingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(checkUsersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkBuildingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkBookingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraarriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barraarriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void checkUsersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkUsersButtonActionPerformed
        App.loadAdminConsultarUser();
    }//GEN-LAST:event_checkUsersButtonActionPerformed

    private void checkBookingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBookingsButtonActionPerformed
        App.loadAdminConsultarReservas();
    }//GEN-LAST:event_checkBookingsButtonActionPerformed

    private void checkBuildingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBuildingsButtonActionPerformed
        App.loadAdminCheckBuildings();
    }//GEN-LAST:event_checkBuildingsButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        App.cardLayout.show(App.cards, "Pantalla login");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void logoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraarriba;
    private javax.swing.JButton checkBookingsButton;
    private javax.swing.JButton checkBuildingsButton;
    private javax.swing.JButton checkUsersButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logo;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
