/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI_UX;

import Logica.Inmueble;
import Logica.Sesion;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class BuildingView extends javax.swing.JPanel {

    Inmueble i;

    /**
     * Creates new form PantallaInmueble
     */
    public BuildingView() {
        initComponents();
    }

    public void actualizar() {
        titulolabel.setText(i.getTitulo());
        tipolabel.setText(i.getTipo());
        descripcionarea.setText(i.getDescripcion());
        preciolabel.setText(Double.toString(i.getPrecioNoche())+ "€ por noche");
        //datosinmueblearea.setText(i.getDatosInmueble().toString());
        nhuespedes.setText(Integer.toString(i.getDatosInmueble().getMaxHuespedes()));
        nhabitaciones.setText(Integer.toString(i.getDatosInmueble().getHabitaciones()));
        nbanos.setText(Integer.toString(i.getDatosInmueble().getBaños()));
        ncamas.setText(Integer.toString(i.getDatosInmueble().getCamas()));
        
        direccionarea.setText(i.getDireccion().toString());
        serviciosarea.setText("los servicios de este inmueble son "+i.getServicios());

        fotoboton.setIcon(resizeIMG(i.getFotografia()));
        estrella1.setIcon(i.getCalificacion() >= 1 ? imagenIcon("./src/main/resources/images/estrella50roja.PNG") : (imagenIcon("./src/main/resources/images/estrella50.PNG")));
        estrella2.setIcon(i.getCalificacion() >= 2 ? imagenIcon("./src/main/resources/images/estrella50roja.PNG") : (imagenIcon("./src/main/resources/images/estrella50.PNG")));
        estrella3.setIcon(i.getCalificacion() >= 3 ? imagenIcon("./src/main/resources/images/estrella50roja.PNG") : (imagenIcon("./src/main/resources/images/estrella50.PNG")));
        estrella4.setIcon(i.getCalificacion() >= 4 ? imagenIcon("./src/main/resources/images/estrella50roja.PNG") : (imagenIcon("./src/main/resources/images/estrella50.PNG")));
        estrella5.setIcon(i.getCalificacion() >= 5 ? imagenIcon("./src/main/resources/images/estrella50roja.PNG") : (imagenIcon("./src/main/resources/images/estrella50.PNG")));
      System.out.println("actualizado");
    }

    public void setInmueble(Inmueble inmueble) {
        this.i = inmueble;
        this.actualizar(); // Llamar al método actualizar() para actualizar la vista con el nuevo inmueble
        System.out.println("seteado");
    }

    
    public ImageIcon imagenIcon(String img) {
        try {
            Image image = ImageIO.read(new File(img));
            ImageIcon icon = new ImageIcon(image);
            return icon;
        } catch (IOException e) {
            //JOptionPane.showMessageDialog(null, "No se pudo cargar el icono: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public ImageIcon resizeIMG(String img) {
        try {
            File imagePath = new File(img);
            BufferedImage originalImage = ImageIO.read(imagePath);
            int width = 560;//fotoboton.getWidth();
            int height = 331;//fotoboton.getHeight();
            Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(resizedImage);
            return imageIcon;
        } catch (IOException e) {
            //JOptionPane.showMessageDialog(this, "No se pudo cargar la imagen: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
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

        jPanel1 = new javax.swing.JPanel();
        fotoboton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        estrella1 = new javax.swing.JButton();
        estrella2 = new javax.swing.JButton();
        estrella3 = new javax.swing.JButton();
        estrella4 = new javax.swing.JButton();
        estrella5 = new javax.swing.JButton();
        titulolabel = new javax.swing.JLabel();
        preciolabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionarea = new javax.swing.JTextArea();
        barraarriba = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        logo = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        tipolabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        serviciosarea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        direccionarea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nhuespedes = new javax.swing.JLabel();
        nhabitaciones = new javax.swing.JLabel();
        nbanos = new javax.swing.JLabel();
        ncamas = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 250, 248));

        fotoboton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casa1.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        estrella1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estrella50roja.png"))); // NOI18N
        estrella1.setToolTipText("");
        estrella1.setBorderPainted(false);

        estrella2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estrella50roja.png"))); // NOI18N
        estrella2.setToolTipText("");
        estrella2.setBorderPainted(false);

        estrella3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estrella50.png"))); // NOI18N
        estrella3.setToolTipText("");
        estrella3.setBorderPainted(false);

        estrella4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estrella50.png"))); // NOI18N
        estrella4.setToolTipText("");
        estrella4.setBorderPainted(false);
        estrella4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estrella4ActionPerformed(evt);
            }
        });

        estrella5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estrella50.png"))); // NOI18N
        estrella5.setToolTipText("");
        estrella5.setBorderPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(estrella1)
                .addGap(6, 6, 6)
                .addComponent(estrella2)
                .addGap(6, 6, 6)
                .addComponent(estrella3)
                .addGap(6, 6, 6)
                .addComponent(estrella4)
                .addGap(6, 6, 6)
                .addComponent(estrella5)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estrella1)
                    .addComponent(estrella2)
                    .addComponent(estrella3)
                    .addComponent(estrella4)
                    .addComponent(estrella5))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        titulolabel.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        titulolabel.setText("Titulo");

        preciolabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        preciolabel.setText("precio $/noche");

        descripcionarea.setEditable(false);
        descripcionarea.setBackground(new java.awt.Color(255, 250, 248));
        descripcionarea.setColumns(20);
        descripcionarea.setRows(5);
        descripcionarea.setText("Descripcion : Casa preciosa en Gandía");
        descripcionarea.setAutoscrolls(false);
        descripcionarea.setBorder(null);
        descripcionarea.setCaretPosition(0);
        descripcionarea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(descripcionarea);

        barraarriba.setBackground(new java.awt.Color(255, 250, 248));
        barraarriba.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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

        titleLabel.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 90, 95));
        titleLabel.setText("JavaBNB");

        javax.swing.GroupLayout barraarribaLayout = new javax.swing.GroupLayout(barraarriba);
        barraarriba.setLayout(barraarribaLayout);
        barraarribaLayout.setHorizontalGroup(
            barraarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraarribaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(64, 64, 64))
        );
        barraarribaLayout.setVerticalGroup(
            barraarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraarribaLayout.createSequentialGroup()
                .addGroup(barraarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barraarribaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(barraarribaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(barraarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraarribaLayout.createSequentialGroup()
                                .addComponent(titleLabel)
                                .addGap(21, 21, 21)))))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        tipolabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tipolabel.setText("tipo");

        serviciosarea.setEditable(false);
        serviciosarea.setBackground(new java.awt.Color(255, 250, 248));
        serviciosarea.setColumns(20);
        serviciosarea.setRows(5);
        serviciosarea.setText("Los servicios de este inmueble son blablabla");
        serviciosarea.setBorder(null);
        jScrollPane3.setViewportView(serviciosarea);

        direccionarea.setEditable(false);
        direccionarea.setBackground(new java.awt.Color(255, 250, 248));
        direccionarea.setColumns(20);
        direccionarea.setRows(5);
        direccionarea.setText("Direccion toString()");
        direccionarea.setBorder(null);
        jScrollPane4.setViewportView(direccionarea);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nº máximo de huéspedes:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Baños:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Habitaciones:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Camas:");

        nhuespedes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nhuespedes.setText("1");

        nhabitaciones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nhabitaciones.setText("1");

        nbanos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nbanos.setText("1");

        ncamas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ncamas.setText("1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraarriba, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fotoboton, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titulolabel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(tipolabel))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ncamas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nhuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(nbanos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nhabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(preciolabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 15, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barraarriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(nhuespedes))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(nbanos)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(nhabitaciones))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(ncamas)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fotoboton, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(titulolabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipolabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(preciolabel)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void estrella4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estrella4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estrella4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (Sesion.user != null) {
            if (Sesion.esAnfitrion == true) {
                Aplicacion.cardLayout.show(Aplicacion.cards, "Pantalla mainscreenhost");
            } else {
                Aplicacion.cardLayout.show(Aplicacion.cards, "Pantalla mainscreenclient");
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void logoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraarriba;
    private javax.swing.JTextArea descripcionarea;
    private javax.swing.JTextArea direccionarea;
    private javax.swing.JButton estrella1;
    private javax.swing.JButton estrella2;
    private javax.swing.JButton estrella3;
    private javax.swing.JButton estrella4;
    private javax.swing.JButton estrella5;
    private javax.swing.JButton fotoboton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton logo;
    private javax.swing.JLabel nbanos;
    private javax.swing.JLabel ncamas;
    private javax.swing.JLabel nhabitaciones;
    private javax.swing.JLabel nhuespedes;
    private javax.swing.JLabel preciolabel;
    private javax.swing.JTextArea serviciosarea;
    private javax.swing.JLabel tipolabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titulolabel;
    // End of variables declaration//GEN-END:variables
}
