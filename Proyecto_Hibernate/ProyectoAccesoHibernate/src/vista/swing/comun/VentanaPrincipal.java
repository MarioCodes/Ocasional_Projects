/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.swing.comun;

import aplicacion.facade.Facade;
import controlador.datos.Singleton;
import dto.HibernateUtil;
import dto.VistaActividadesAlojamiento;
import dto.VistaActividadesAlojamientoId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JFrame;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import vista.swing.tabla.VentanaAltaYModifHabitacion;
import vista.swing.tabla.VentanaBajaHabitacion;
import vista.swing.tabla.VentanaBuscarHabitacionInputID;
import vista.swing.tabla.VentanaListadoHabitaciones;
import vista.swing.tabla.VentanaOrdenarHabitacionPrecioInput;
import vista.swing.vista.VentanaAltaYModifVista;
import vista.swing.vista.VentanaBajaVista;
import vista.swing.vista.VentanaBuscarAlojID;
import vista.swing.vista.VentanaListadoVista;
import vista.swing.vista.VentanaValoracionMinima;

/**
 * Ventana Principal del programa. Conduce al resto de Ventanas que haran las operaciones.
 * @author Mario Codes Sánchez
 * @since 22/11/16
 */
public class VentanaPrincipal extends javax.swing.JFrame  {
    private final ArrayList<JFrame> VENTANAS_INDEPENDIENTES_ABIERTAS = new ArrayList<>(); //Para almarcenar y cerrar las que se abren de forma independiente cuando volvamos a la ventana de "escoger modo".
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);      
        
//        test();
    }
    
    /**
     * Cerramos todas las ventanas independientes de la VentanaPrincipal que se han instanciado / abierto.
     */
    private void cerrarVentanasIndependientesAbiertas() {
        for(JFrame jFrameTmp : VENTANAS_INDEPENDIENTES_ABIERTAS) {
            if(jFrameTmp != null) jFrameTmp.dispose(); //En teoria nunca seran nulls aqui, si se ha aniadido es porque se ha instanciado. Preveo NullPointerException de todos modos.
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

        labelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonAltaAlojamiento = new javax.swing.JButton();
        botonModifAlojamiento = new javax.swing.JButton();
        botonBajaAlojamiento = new javax.swing.JButton();
        botonListado = new javax.swing.JButton();
        jButtonBuscarValoracion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botonHabitacionesPrecio = new javax.swing.JButton();
        botonAltaHabitacion = new javax.swing.JButton();
        botonBajaHabitacion = new javax.swing.JButton();
        botonModificacionHabitacion = new javax.swing.JButton();
        botonListadoCompletoHabitaciones = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPrograma = new javax.swing.JMenu();
        jMenuItemEscogerModo = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTitulo.setText("Gestión Alojamientos Rurales Aragón v.3");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestión Vista Mapeada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(317, 403));
        jPanel1.setMinimumSize(new java.awt.Dimension(317, 403));

        botonAltaAlojamiento.setText("Alta");
        botonAltaAlojamiento.setMaximumSize(new java.awt.Dimension(190, 60));
        botonAltaAlojamiento.setMinimumSize(new java.awt.Dimension(190, 60));
        botonAltaAlojamiento.setPreferredSize(new java.awt.Dimension(190, 60));
        botonAltaAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaAlojamientoActionPerformed(evt);
            }
        });

        botonModifAlojamiento.setText("Modificacion");
        botonModifAlojamiento.setMaximumSize(new java.awt.Dimension(190, 60));
        botonModifAlojamiento.setMinimumSize(new java.awt.Dimension(190, 60));
        botonModifAlojamiento.setPreferredSize(new java.awt.Dimension(190, 60));
        botonModifAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModifAlojamientoActionPerformed(evt);
            }
        });

        botonBajaAlojamiento.setText("Baja");
        botonBajaAlojamiento.setMaximumSize(new java.awt.Dimension(190, 60));
        botonBajaAlojamiento.setMinimumSize(new java.awt.Dimension(190, 60));
        botonBajaAlojamiento.setPreferredSize(new java.awt.Dimension(190, 60));
        botonBajaAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBajaAlojamientoActionPerformed(evt);
            }
        });

        botonListado.setText("Listado Completo");
        botonListado.setMaximumSize(new java.awt.Dimension(190, 60));
        botonListado.setMinimumSize(new java.awt.Dimension(190, 60));
        botonListado.setPreferredSize(new java.awt.Dimension(190, 60));
        botonListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListadoActionPerformed(evt);
            }
        });

        jButtonBuscarValoracion.setText("Buscar por Valoracion");
        jButtonBuscarValoracion.setMaximumSize(new java.awt.Dimension(190, 60));
        jButtonBuscarValoracion.setMinimumSize(new java.awt.Dimension(190, 60));
        jButtonBuscarValoracion.setPreferredSize(new java.awt.Dimension(190, 60));
        jButtonBuscarValoracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarValoracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonModifAlojamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonBajaAlojamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBuscarValoracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(botonAltaAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(botonAltaAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(botonBajaAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(botonModifAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(botonListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jButtonBuscarValoracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestión Tabla Unica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(317, 403));
        jPanel2.setMinimumSize(new java.awt.Dimension(317, 403));
        jPanel2.setPreferredSize(new java.awt.Dimension(317, 403));

        botonHabitacionesPrecio.setText("Buscar por Tipo de Hab.");
        botonHabitacionesPrecio.setMaximumSize(new java.awt.Dimension(190, 60));
        botonHabitacionesPrecio.setMinimumSize(new java.awt.Dimension(190, 60));
        botonHabitacionesPrecio.setPreferredSize(new java.awt.Dimension(190, 60));
        botonHabitacionesPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHabitacionesPrecioActionPerformed(evt);
            }
        });

        botonAltaHabitacion.setText("Alta");
        botonAltaHabitacion.setMaximumSize(new java.awt.Dimension(190, 60));
        botonAltaHabitacion.setMinimumSize(new java.awt.Dimension(190, 60));
        botonAltaHabitacion.setPreferredSize(new java.awt.Dimension(190, 60));
        botonAltaHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaHabitacionActionPerformed(evt);
            }
        });

        botonBajaHabitacion.setText("Baja");
        botonBajaHabitacion.setMaximumSize(new java.awt.Dimension(190, 60));
        botonBajaHabitacion.setMinimumSize(new java.awt.Dimension(190, 60));
        botonBajaHabitacion.setPreferredSize(new java.awt.Dimension(190, 60));
        botonBajaHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBajaHabitacionActionPerformed(evt);
            }
        });

        botonModificacionHabitacion.setText("Modificación");
        botonModificacionHabitacion.setMaximumSize(new java.awt.Dimension(190, 60));
        botonModificacionHabitacion.setMinimumSize(new java.awt.Dimension(190, 60));
        botonModificacionHabitacion.setPreferredSize(new java.awt.Dimension(190, 60));
        botonModificacionHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificacionHabitacionActionPerformed(evt);
            }
        });

        botonListadoCompletoHabitaciones.setText("Listado Completo");
        botonListadoCompletoHabitaciones.setMaximumSize(new java.awt.Dimension(190, 60));
        botonListadoCompletoHabitaciones.setMinimumSize(new java.awt.Dimension(190, 60));
        botonListadoCompletoHabitaciones.setPreferredSize(new java.awt.Dimension(190, 60));
        botonListadoCompletoHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListadoCompletoHabitacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAltaHabitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBajaHabitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(botonHabitacionesPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonListadoCompletoHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonModificacionHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(botonAltaHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonBajaHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonModificacionHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonListadoCompletoHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonHabitacionesPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuPrograma.setText("Programa");

        jMenuItemEscogerModo.setText("Menu escoger modo");
        jMenuItemEscogerModo.setToolTipText("Volver a escoger el modo de inicio de la ventana.");
        jMenuItemEscogerModo.setEnabled(false);
        jMenuItemEscogerModo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEscogerModoActionPerformed(evt);
            }
        });
        jMenuPrograma.add(jMenuItemEscogerModo);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.setToolTipText("Cerrar el Programa.");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuPrograma.add(jMenuItemSalir);

        jMenuBar1.add(jMenuPrograma);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(labelTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAltaAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaAlojamientoActionPerformed
        new VentanaAltaYModifVista();
    }//GEN-LAST:event_botonAltaAlojamientoActionPerformed

    private void botonBajaAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajaAlojamientoActionPerformed
        new VentanaBajaVista();
    }//GEN-LAST:event_botonBajaAlojamientoActionPerformed

    private void botonListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListadoActionPerformed
        new VentanaListadoVista();
    }//GEN-LAST:event_botonListadoActionPerformed

    private void botonModifAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModifAlojamientoActionPerformed
        new VentanaBuscarAlojID();
    }//GEN-LAST:event_botonModifAlojamientoActionPerformed

    private void botonHabitacionesPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHabitacionesPrecioActionPerformed
        VENTANAS_INDEPENDIENTES_ABIERTAS.add(new VentanaOrdenarHabitacionPrecioInput());
    }//GEN-LAST:event_botonHabitacionesPrecioActionPerformed

    private void jButtonBuscarValoracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarValoracionActionPerformed
        new VentanaValoracionMinima();
    }//GEN-LAST:event_jButtonBuscarValoracionActionPerformed

    private void botonAltaHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaHabitacionActionPerformed
        new VentanaAltaYModifHabitacion();
    }//GEN-LAST:event_botonAltaHabitacionActionPerformed

    private void botonModificacionHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificacionHabitacionActionPerformed
        VENTANAS_INDEPENDIENTES_ABIERTAS.add(new VentanaBuscarHabitacionInputID());
    }//GEN-LAST:event_botonModificacionHabitacionActionPerformed

    private void botonListadoCompletoHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListadoCompletoHabitacionesActionPerformed
        VENTANAS_INDEPENDIENTES_ABIERTAS.add(new VentanaListadoHabitaciones());
    }//GEN-LAST:event_botonListadoCompletoHabitacionesActionPerformed

    private void botonBajaHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajaHabitacionActionPerformed
        new VentanaBajaHabitacion();
    }//GEN-LAST:event_botonBajaHabitacionActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemEscogerModoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEscogerModoActionPerformed
    }//GEN-LAST:event_jMenuItemEscogerModoActionPerformed
          
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Singleton.getVentanaPrincipalObtencionSingleton().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAltaAlojamiento;
    private javax.swing.JButton botonAltaHabitacion;
    private javax.swing.JButton botonBajaAlojamiento;
    private javax.swing.JButton botonBajaHabitacion;
    private javax.swing.JButton botonHabitacionesPrecio;
    private javax.swing.JButton botonListado;
    private javax.swing.JButton botonListadoCompletoHabitaciones;
    private javax.swing.JButton botonModifAlojamiento;
    private javax.swing.JButton botonModificacionHabitacion;
    private javax.swing.JButton jButtonBuscarValoracion;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemEscogerModo;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuPrograma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the botonAltaHabitacion
     */
    public javax.swing.JButton getBotonAltaHabitacion() {
        return botonAltaHabitacion;
    }

    /**
     * @return the botonBajaHabitacion
     */
    public javax.swing.JButton getBotonBajaHabitacion() {
        return botonBajaHabitacion;
    }

    /**
     * @return the botonHabitacionesPrecio
     */
    public javax.swing.JButton getBotonHabitacionesPrecio() {
        return botonHabitacionesPrecio;
    }

    /**
     * @return the botonListadoCompletoHabitaciones
     */
    public javax.swing.JButton getBotonListadoCompletoHabitaciones() {
        return botonListadoCompletoHabitaciones;
    }

    /**
     * @return the botonModificacionHabitacion
     */
    public javax.swing.JButton getBotonModificacionHabitacion() {
        return botonModificacionHabitacion;
    }
}
