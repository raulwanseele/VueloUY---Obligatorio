/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vuelouy.interfaz.common;

import vuelouy.dominio.Viaje;
import java.util.Calendar;
import static java.util.Calendar.getInstance;
import javax.swing.JOptionPane;

/**
 *
 * @author alumnoFI
 */
public class MenuConfiguracionTripulante extends javax.swing.JPanel {

    /**
     * Creates new form MenuConfiguracionPiloto
     */
    private Viaje viaje;
    
    /**
     *
     */
    public MenuConfiguracionTripulante() {
        initComponents();
    }
    
    /**
     *
     * @param unViaje
     */
    public MenuConfiguracionTripulante(Viaje unViaje) {
        viaje = unViaje;
        initComponents();
        lblDestinoError.setText("");
        lblOrigenError.setText("");
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
        jLabel7 = new javax.swing.JLabel();
        cbOrigen = new javax.swing.JComboBox();
        cbHoraDuracion = new javax.swing.JComboBox();
        cbDestino = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cbMinutoDuracion = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cbNroAsiento = new javax.swing.JComboBox();
        cbNombrePasajero = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblOrigenError = new javax.swing.JLabel();
        lblDestinoError = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel7.setText("Número de Asiento: ");

        cbOrigen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Montevideo", "Buenos Aires", "Madrid", "Paris" }));
        cbOrigen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbOrigenItemStateChanged(evt);
            }
        });

        cbHoraDuracion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbHoraDuracion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbHoraDuracionItemStateChanged(evt);
            }
        });

        cbDestino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buenos Aires", "Madrid", "Paris", "Montevideo" }));
        cbDestino.setToolTipText("");
        cbDestino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDestinoItemStateChanged(evt);
            }
        });

        jLabel1.setText("Origen:");

        cbMinutoDuracion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));
        cbMinutoDuracion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMinutoDuracionItemStateChanged(evt);
            }
        });

        jLabel4.setText("Duración Viaje: ");

        cbNroAsiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "15", "33", "45", "68", "72" }));
        cbNroAsiento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbNroAsientoItemStateChanged(evt);
            }
        });

        cbNombrePasajero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ramon", "Juan", "Pedro", "María", "Andrea", "Ana" }));
        cbNombrePasajero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbNombrePasajeroItemStateChanged(evt);
            }
        });

        jLabel6.setText("Nombre de Pasajero: ");

        jLabel3.setText("Destino:");

        lblOrigenError.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        lblOrigenError.setForeground(new java.awt.Color(102, 102, 102));
        lblOrigenError.setText("error origen");

        lblDestinoError.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        lblDestinoError.setForeground(new java.awt.Color(102, 102, 102));
        lblDestinoError.setText("error destino");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(103, 103, 103)
                        .addComponent(cbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOrigenError))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(6, 6, 6))
                                .addComponent(jLabel6))
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbNroAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbHoraDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbMinutoDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbNombrePasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(lblDestinoError)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrigenError))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDestinoError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbHoraDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMinutoDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbNombrePasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbNroAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Panel de configuración del Sistema de Entretenimiento");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbNombrePasajeroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbNombrePasajeroItemStateChanged
        viaje.setNombrePasajero(cbNombrePasajero.getSelectedItem().toString());
    }//GEN-LAST:event_cbNombrePasajeroItemStateChanged

    private void cbNroAsientoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbNroAsientoItemStateChanged
        viaje.setAsiento(cbNroAsiento.getSelectedItem().toString());
    }//GEN-LAST:event_cbNroAsientoItemStateChanged

    private void cbHoraDuracionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbHoraDuracionItemStateChanged
        actualizarFecha();
    }//GEN-LAST:event_cbHoraDuracionItemStateChanged

    private void cbMinutoDuracionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMinutoDuracionItemStateChanged
        actualizarFecha();
    }//GEN-LAST:event_cbMinutoDuracionItemStateChanged

    private void cbOrigenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbOrigenItemStateChanged
        if (cbOrigen.getSelectedItem().toString().equals(viaje.getDestino())) {
            cbOrigen.setSelectedItem(viaje.getOrigen());
            lblOrigenError.setText("Origen y Destino deben ser diferentes");
        }else{
            lblOrigenError.setText("");
            viaje.setOrigen(cbOrigen.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cbOrigenItemStateChanged

    private void cbDestinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDestinoItemStateChanged
        if (cbDestino.getSelectedItem().toString().equals(viaje.getOrigen())) {
            cbDestino.setSelectedItem(viaje.getDestino());
            lblDestinoError.setText("Origen y Destino deben ser diferentes");
        }else{
            lblDestinoError.setText("");
            viaje.setDestino(cbDestino.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cbDestinoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbDestino;
    private javax.swing.JComboBox cbHoraDuracion;
    private javax.swing.JComboBox cbMinutoDuracion;
    private javax.swing.JComboBox cbNombrePasajero;
    private javax.swing.JComboBox cbNroAsiento;
    private javax.swing.JComboBox cbOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDestinoError;
    private javax.swing.JLabel lblOrigenError;
    // End of variables declaration//GEN-END:variables

    public void actualizarFecha(){
                int horaPartida = viaje.getFechaPartida()
                        .get(Calendar.HOUR_OF_DAY);
                int minPartida = viaje.getFechaPartida()
                        .get(Calendar.MINUTE);
                int minDuracion = Integer.parseInt
                (cbMinutoDuracion.getSelectedItem().toString());
                int horaDuracion = Integer.parseInt
                (cbHoraDuracion.getSelectedItem().toString());
                
                int diaArribo;
                int horaArribo;
                int minArribo;
                
                if (minPartida + minDuracion >= 60) {
                    minArribo = minPartida + minDuracion - 60;
                    if (horaPartida + horaDuracion >= 23) {
                        diaArribo = viaje.getFechaPartida()
                                .get(Calendar.DAY_OF_MONTH) + 1;
                        horaArribo = horaPartida + horaDuracion - 23;
                    }else{
                        horaArribo = horaPartida + horaDuracion + 1;
                        diaArribo = viaje.getFechaPartida()
                                .get(Calendar.DAY_OF_MONTH);
                    }
                }else{
                    minArribo = minPartida + minDuracion;
                    if (horaPartida + horaDuracion >= 24) {
                        diaArribo = viaje.getFechaPartida()
                                .get(Calendar.DAY_OF_MONTH) + 1;
                        horaArribo = horaPartida + horaDuracion - 24;
                    }else{
                        diaArribo = viaje.getFechaPartida()
                                .get(Calendar.DAY_OF_MONTH);
                        horaArribo = horaPartida + horaDuracion;
                    }
                }
                Calendar fechaArriboNueva = getInstance();
                fechaArriboNueva.set(viaje.getFechaPartida().get(Calendar.YEAR),
                        viaje.getFechaPartida().get(Calendar.MONTH), 
                        diaArribo, horaArribo, minArribo, 0);
                viaje.setFechaArribo(fechaArriboNueva); 
    }
}
