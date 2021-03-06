/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vuelouy.interfaz.common;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author alumnoFI
 */
public class MenuIdiomaPasajero extends javax.swing.JPanel implements Observer{

    /**
     * Creates new form MenuIdiomaPasajero2
     */
    private ComunicacionPaneles comunicacion;

    /**
     *
     */
    public MenuIdiomaPasajero() {
        initComponents();
    }
    
    /**
     *
     * @param com
     */
    public MenuIdiomaPasajero(ComunicacionPaneles com) {
        comunicacion = com;
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

        lblIdioma = new javax.swing.JLabel();
        btnIng = new javax.swing.JButton();
        btnEspaniol = new javax.swing.JButton();

        lblIdioma.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblIdioma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdioma.setText("Seleccione Idioma / Select Language");

        btnIng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/IdiomaIng.png"))); // NOI18N
        btnIng.setBorder(null);
        btnIng.setBorderPainted(false);
        btnIng.setContentAreaFilled(false);
        btnIng.setPreferredSize(new java.awt.Dimension(96, 96));
        btnIng.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/IdiomaEngP.png"))); // NOI18N
        btnIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngActionPerformed(evt);
            }
        });

        btnEspaniol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/IdiomaEsp.png"))); // NOI18N
        btnEspaniol.setBorder(null);
        btnEspaniol.setBorderPainted(false);
        btnEspaniol.setContentAreaFilled(false);
        btnEspaniol.setPreferredSize(new java.awt.Dimension(96, 96));
        btnEspaniol.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/IdiomaEspP.png"))); // NOI18N
        btnEspaniol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspaniolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(btnEspaniol, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179)
                .addComponent(btnIng, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEspaniol, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIng, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(lblIdioma)
                    .addContainerGap(457, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngActionPerformed
        comunicacion.setBPanel(false);
        comunicacion.setBIdioma(true);
        comunicacion.cambio("ingles");
    }//GEN-LAST:event_btnIngActionPerformed

    private void btnEspaniolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspaniolActionPerformed
        comunicacion.setBIdioma(true);
        comunicacion.setBPanel(false);
        comunicacion.cambio("español");
    }//GEN-LAST:event_btnEspaniolActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEspaniol;
    private javax.swing.JButton btnIng;
    private javax.swing.JLabel lblIdioma;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
        if(comunicacion.getIdioma().equals("español")){
            lblIdioma.setText("Seleccione Idioma");
        }
        
        if(comunicacion.getIdioma().equals("español")){
            lblIdioma.setText("Select Language");
        }
    }

}
