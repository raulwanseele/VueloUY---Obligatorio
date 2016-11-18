/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelouy.interfaz.common;

import vuelouy.dominio.Viaje;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;

/**
 *
 *
 */
public class InicioPasajero extends javax.swing.JFrame implements Observer{

    /**
     * Creates new form InicioPasajero
     */
    
    private MenuEntretenimiento menu_Musica;
    private MenuIdiomaPasajero menu_Idioma;
    private MenuConfiguracionPasajero menu_ConfiguracionPasajero;
    private MenuCamarasExternas menu_CamarasExternas;
    private MenuPedidos menu_Pedido;
    private MenuReproducirMusica menu_ReproducirMusica;
    private MenuRevistas menu_Revistas;
    private MenuPintura menu_Pintura;
    private MenuLocalizacion menu_Localizacion;
    
    private Viaje viaje;
    private ComunicacionPaneles comunicacion;

    /**
     *
     * @param v
     * @param com
     */
    public InicioPasajero(Viaje v, ComunicacionPaneles com) {
        viaje = v;
        comunicacion = com;
        comunicacion.addObserver(this);
        initComponents();
        this.setSize(798, 600);
        this.setLocation(0, 0);
        cargarPaneles();

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
        btnEntretenimiento = new javax.swing.JButton();
        btnInformacion = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        lblEntretenimiento = new javax.swing.JLabel();
        lblLocalizacion = new javax.swing.JLabel();
        lblPedidos = new javax.swing.JLabel();
        lblConfiguracion = new javax.swing.JLabel();
        jLayeredPasajero = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Pasajero");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnEntretenimiento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEntretenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/Entretenimiento.png"))); // NOI18N
        btnEntretenimiento.setBorder(null);
        btnEntretenimiento.setBorderPainted(false);
        btnEntretenimiento.setContentAreaFilled(false);
        btnEntretenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEntretenimiento.setPreferredSize(new java.awt.Dimension(96, 96));
        btnEntretenimiento.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/EntretenimientoP.png"))); // NOI18N
        btnEntretenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntretenimientoActionPerformed(evt);
            }
        });

        btnInformacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/Localizacion.png"))); // NOI18N
        btnInformacion.setBorder(null);
        btnInformacion.setBorderPainted(false);
        btnInformacion.setContentAreaFilled(false);
        btnInformacion.setPreferredSize(new java.awt.Dimension(96, 96));
        btnInformacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/LocalizacionP.png"))); // NOI18N
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });

        btnServicios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/PedidoAzafata.png"))); // NOI18N
        btnServicios.setBorder(null);
        btnServicios.setBorderPainted(false);
        btnServicios.setContentAreaFilled(false);
        btnServicios.setPreferredSize(new java.awt.Dimension(96, 96));
        btnServicios.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/PedidoAzafataP.png"))); // NOI18N
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });

        btnConfiguracion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/Configuracion.png"))); // NOI18N
        btnConfiguracion.setBorderPainted(false);
        btnConfiguracion.setContentAreaFilled(false);
        btnConfiguracion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfiguracion.setPreferredSize(new java.awt.Dimension(96, 96));
        btnConfiguracion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vuelouy/image/configuracionP.png"))); // NOI18N
        btnConfiguracion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });

        lblEntretenimiento.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblEntretenimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEntretenimiento.setText("Entretenimiento");

        lblLocalizacion.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblLocalizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLocalizacion.setText("Localización");

        lblPedidos.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblPedidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPedidos.setText("Pedidos");

        lblConfiguracion.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblConfiguracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConfiguracion.setText("Configuración");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEntretenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 33, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEntretenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLocalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnEntretenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEntretenimiento)
                .addGap(18, 18, 18)
                .addComponent(btnInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLocalizacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPedidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblConfiguracion)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jLayeredPasajero.setPreferredSize(new java.awt.Dimension(589, 578));

        javax.swing.GroupLayout jLayeredPasajeroLayout = new javax.swing.GroupLayout(jLayeredPasajero);
        jLayeredPasajero.setLayout(jLayeredPasajeroLayout);
        jLayeredPasajeroLayout.setHorizontalGroup(
            jLayeredPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );
        jLayeredPasajeroLayout.setVerticalGroup(
            jLayeredPasajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPasajero, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPasajero, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntretenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntretenimientoActionPerformed
        mostrar(menu_Musica);
        comunicacion.setBPanel(true);
        comunicacion.setPanel("Entrtenimiento");
    }//GEN-LAST:event_btnEntretenimientoActionPerformed

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        mostrar(menu_Pedido);
        comunicacion.setBPanel(true);
        comunicacion.cambio("Azafata");
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        mostrar(menu_ConfiguracionPasajero);
        comunicacion.setBPanel(true);
        comunicacion.setPanel("Configuracion");
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        mostrar(menu_Localizacion);
        comunicacion.setBPanel(true);
        comunicacion.cambio("Localizacion");
    }//GEN-LAST:event_btnInformacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnEntretenimiento;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnServicios;
    private javax.swing.JLayeredPane jLayeredPasajero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConfiguracion;
    private javax.swing.JLabel lblEntretenimiento;
    private javax.swing.JLabel lblLocalizacion;
    private javax.swing.JLabel lblPedidos;
    // End of variables declaration//GEN-END:variables

    private void cargarPaneles() {
        menu_Idioma = new MenuIdiomaPasajero(comunicacion);
        menu_ConfiguracionPasajero = new MenuConfiguracionPasajero(comunicacion);
        
        menu_Localizacion = new MenuLocalizacion(viaje, comunicacion);
        
        menu_Musica = new MenuEntretenimiento(comunicacion);
        menu_CamarasExternas = new MenuCamarasExternas(comunicacion);
        menu_ReproducirMusica = new MenuReproducirMusica(comunicacion);
        menu_Revistas = new MenuRevistas(comunicacion);
        menu_Pintura = new MenuPintura(comunicacion);
        
        menu_Pedido = new MenuPedidos(comunicacion, viaje);

        jLayeredPasajero.setSize(589, 578);
        jLayeredPasajero.setSize(589, 578);
        jLayeredPasajero.setVisible(true);
        
        menu_Idioma.setSize(589, 578);
        jLayeredPasajero.add(menu_Idioma);
        menu_Idioma.setVisible(true);
        
        
    }

    private void mostrar(JPanel menu) {
        
        jLayeredPasajero.removeAll();
        menu.setSize(585, 548);
        jLayeredPasajero.add(menu);
        
        ocultarPaneles();
        menu.setVisible(true);
        
    }

    /**
     *
     * @param menu
     */
    public  void mostrarSubMenu(String menu) {
        switch (menu) {
            case "Entretenimiento":
                mostrar(menu_Musica);
                break;
            case "CamarasExternas":
                mostrar(menu_CamarasExternas);
                break;
            case "Musica":
                mostrar(menu_ReproducirMusica);
                break;
            case "Azafata":
                mostrar(menu_Pedido);
                break;
            case "Configuracion":
                mostrar(menu_ConfiguracionPasajero);
                break;
            case "Revista":
                mostrar(menu_Revistas);
                break;
            case "Pintura":
                mostrar(menu_Pintura);
                break;
            case "Localizacion":
                    mostrar(menu_Localizacion);
            default:
                break;
        }
        comunicacion.setBPanel(false);
    }

    private void ocultarPaneles() {
        menu_Musica.setVisible(false);
        menu_Idioma.setVisible(false);
        menu_ConfiguracionPasajero.setVisible(false);
        menu_CamarasExternas.setVisible(false);
        menu_Pedido.setVisible(false);
        menu_ReproducirMusica.setVisible(false);
        menu_Revistas.setVisible(false);
        menu_Pintura.setVisible(false);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (comunicacion.getIdioma().equals("ingles")) {
            lblEntretenimiento.setText("Entertainment");
            lblConfiguracion.setText("Settings");
            lblLocalizacion.setText("Location");
            lblPedidos.setText("Requests");
        }
        
        if (comunicacion.getIdioma().equals("español")) {
            lblEntretenimiento.setText("Entertainment");
            lblConfiguracion.setText("Configuración");
            lblLocalizacion.setText("Localización");
            lblPedidos.setText("Pedidos");
        }
    }
}
