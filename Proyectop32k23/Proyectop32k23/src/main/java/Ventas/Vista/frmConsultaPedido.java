/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Carlos Javier Sandoval Catalán
//9959-21-1324
//Consulta Pedidos

package Ventas.Vista;


import Seguridad.Controlador.clsBitacora;
import Ventas.Controlador.clsCotizacion;
import Seguridad.Controlador.clsUsuarioConectado;
import Ventas.Controlador.clsPedidos;
import Ventas.Controlador.clsTienda;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.AbstractCellEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author visitante
 */
public class frmConsultaPedido extends javax.swing.JInternalFrame {

    public void llenadoDeCombos() {
        /*EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        List<Empleado> empleados = empleadoDAO.select();
        cbox_empleado.addItem("Seleccione una opción");
        for (int i = 0; i < empleados.size(); i++) {
            cbox_empleado.addItem(empleados.get(i).getNombreEmpleado());
        } */
    }


    private DefaultTableModel modeloTabla;
    
    public frmConsultaPedido() {
        initComponents();
        cargarComboBox();
        llenadoDeTablasCotizaciones();
        llenadoDeCombos();
    }

    int codigoAplicacion = 3007;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb2PedCons = new javax.swing.JLabel();
        lbusuPedCons = new javax.swing.JLabel();
        jScrollPane1PedCons = new javax.swing.JScrollPane();
        jTable1PedCons = new javax.swing.JTable();
        jScrollPanePedReg = new javax.swing.JScrollPane();
        tblPedConsulta = new javax.swing.JTable();
        lbPedReg = new javax.swing.JLabel();
        btnVerDetallePed = new javax.swing.JButton();
        btnFacturarPed = new javax.swing.JButton();
        lbInsPedReg = new javax.swing.JLabel();
        cbxTiendaPed = new javax.swing.JComboBox<>();
        lbDescPed = new javax.swing.JLabel();
        cbxDescPed = new javax.swing.JComboBox<>();
        btnCancelarPedido = new javax.swing.JButton();
        txtVenFacPed = new javax.swing.JTextField();
        lbIdVenPed = new javax.swing.JLabel();
        lbIdTiePed = new javax.swing.JLabel();
        btnAyudaConPed = new javax.swing.JButton();

        lb2PedCons.setForeground(new java.awt.Color(204, 204, 204));
        lb2PedCons.setText(".");

        jTable1PedCons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1PedCons.setViewportView(jTable1PedCons);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pedidos");
        setVisible(true);

        tblPedConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPanePedReg.setViewportView(tblPedConsulta);

        lbPedReg.setText("Pedidos Registrados:");

        btnVerDetallePed.setText("Ver Detalle");
        btnVerDetallePed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDetallePedActionPerformed(evt);
            }
        });

        btnFacturarPed.setText("Facturar");
        btnFacturarPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturarPedActionPerformed(evt);
            }
        });

        lbInsPedReg.setText("Haz clic en el pedido que quieras trabajar, luego presiona un botón:");

        lbDescPed.setText("Descuento:");

        cbxDescPed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.0", "0.15", "0.25", "0.50", "0.75", "0.95" }));

        btnCancelarPedido.setText("Cancelar Pedido");
        btnCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPedidoActionPerformed(evt);
            }
        });

        lbIdVenPed.setText("Id del Vendedor:");

        lbIdTiePed.setText("Tienda:");

        btnAyudaConPed.setText("Ayuda");
        btnAyudaConPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaConPedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(lbPedReg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbInsPedReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPanePedReg, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerDetallePed)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAyudaConPed)
                                    .addComponent(btnFacturarPed))
                                .addGap(1, 1, 1)))
                        .addGap(123, 123, 123))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbIdVenPed, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbIdTiePed, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbDescPed, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVenFacPed, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(cbxTiendaPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxDescPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPedReg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(lbInsPedReg)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPanePedReg, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnVerDetallePed)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarPedido)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVenFacPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbIdVenPed))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbIdTiePed)
                            .addComponent(cbxTiendaPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDescPed)
                            .addComponent(cbxDescPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(btnFacturarPed)
                        .addGap(28, 28, 28)
                        .addComponent(btnAyudaConPed)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerDetallePedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDetallePedActionPerformed
        // TODO add your handling code here:
// Crea una instancia de FrmConsultaCotizacionDetalle
                int filaSeleccionada = tblPedConsulta.getSelectedRow();
                int cotidSeleccionado = Integer.valueOf(tblPedConsulta.getValueAt(filaSeleccionada, 0).toString());
                frmConsultaPedidoDetalle frmConsulta = new frmConsultaPedidoDetalle(cotidSeleccionado);

                // Agrega el FrmConsultaCotizacionDetalle al JDesktopPane
                JDesktopPane desktopPane = getDesktopPane();
                desktopPane.add(frmConsulta);
                frmConsulta.setVisible(true);
                frmConsulta.toFront();
                int resultadoBitacora=0;
                    clsBitacora bitacoraRegistro = new clsBitacora();
                    resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(),codigoAplicacion,"QRY"); 

    }//GEN-LAST:event_btnVerDetallePedActionPerformed

         private void cargarComboBox() {
    clsPedidos perfilUsuario = new clsPedidos();
    ArrayList<String> nombresUsuarios = perfilUsuario.obtenerNombresUsuarios();

    nombresUsuarios.forEach(nombreUsuario -> {
        cbxTiendaPed.addItem(nombreUsuario);
        });
}
         
    private void btnFacturarPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturarPedActionPerformed
        // TODO add your handling code here:
               String nombretienda = (String) cbxTiendaPed.getSelectedItem();
        double descuento = Double.valueOf((String)cbxDescPed.getSelectedItem());
        int idVendedor = Integer.parseInt(txtVenFacPed.getText());
        int filaSeleccionada = tblPedConsulta.getSelectedRow();
                int cotidSeleccionado = Integer.valueOf(tblPedConsulta.getValueAt(filaSeleccionada, 0).toString());
                clsPedidos frmConsulta = new clsPedidos();
                frmConsulta.RegistrarPedidoCot(cotidSeleccionado, idVendedor, nombretienda, descuento);
                frmConsulta.RegistrarPedidoCotDet(cotidSeleccionado, descuento); 
                    DefaultTableModel model = (DefaultTableModel) tblPedConsulta.getModel();
                    model.setRowCount(0); // Eliminar todas las filas actuales de la tabla
                    llenadoDeTablasCotizaciones();
                int resultadoBitacora=0;
                    clsBitacora bitacoraRegistro = new clsBitacora();
                    resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(),codigoAplicacion,"INS");    
    }//GEN-LAST:event_btnFacturarPedActionPerformed

    private void btnCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPedidoActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tblPedConsulta.getSelectedRow();
        int cotidSeleccionado = Integer.valueOf(tblPedConsulta.getValueAt(filaSeleccionada, 0).toString());
        clsPedidos frmConsulta = new clsPedidos();
        frmConsulta.CancelarPedido(cotidSeleccionado);
        DefaultTableModel model = (DefaultTableModel) tblPedConsulta.getModel();
        model.setRowCount(0); // Eliminar todas las filas actuales de la tabla
        llenadoDeTablasCotizaciones();
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(),codigoAplicacion,"DEL");
    }//GEN-LAST:event_btnCancelarPedidoActionPerformed

    private void btnAyudaConPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaConPedActionPerformed
        // TODO add your handling code here:
        //Carlos Javier Sandoval Catalán
        //9959-21-1324
        try {
            if ((new File("src\\main\\java\\ventas\\ayuda\\ayudaconped.chm")).exists()) {
                Process p = Runtime
                .getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\ventas\\ayuda\\ayudaconped.chm");
                p.waitFor();
            } else {
                System.out.println("La ayuda no fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAyudaConPedActionPerformed

     public void llenadoDeTablasCotizaciones() {
        DefaultTableModel modelo = new DefaultTableModel(){
            public boolean isCellEditable(int row, int column) {
                return false; // Desactivar la edición de las celdas
            }
        };
        modelo.addColumn("Id Pedido");
        modelo.addColumn("Id Cliente");
        modelo.addColumn("Fecha");
        modelo.addColumn("Total");
        modelo.addColumn("Estatus");
        clsPedidos cotizacion = new clsPedidos();
        //VendedorDAO vendedorDAO = new VendedorDAO();
        List<clsPedidos> listaCotizaciones = cotizacion.getListadoPedidos();
        tblPedConsulta.setModel(modelo);
        String[] dato = new String[5];
        for (int i = 0; i < listaCotizaciones.size(); i++) {
            dato[0] = Integer.toString(listaCotizaciones.get(i).getIdPed());
            dato[1] = Integer.toString(listaCotizaciones.get(i).getIdCliente());
            dato[2] = listaCotizaciones.get(i).getFechaPed();
            dato[3] = Double.toString(listaCotizaciones.get(i).getTotalPed());
            dato[4] = listaCotizaciones.get(i).getEstatusPed();
            modelo.addRow(dato);
        }              

                    

}
    
public int obtenerCotidSeleccionado() {
    int filaSeleccionada = tblPedConsulta.getSelectedRow();
    int cotidSeleccionado = (int) tblPedConsulta.getValueAt(filaSeleccionada, 0);
    return cotidSeleccionado;
}

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyudaConPed;
    private javax.swing.JButton btnCancelarPedido;
    private javax.swing.JButton btnFacturarPed;
    private javax.swing.JButton btnVerDetallePed;
    private javax.swing.JComboBox<String> cbxDescPed;
    private javax.swing.JComboBox<String> cbxTiendaPed;
    private javax.swing.JScrollPane jScrollPane1PedCons;
    private javax.swing.JScrollPane jScrollPanePedReg;
    private javax.swing.JTable jTable1PedCons;
    private javax.swing.JLabel lb2PedCons;
    private javax.swing.JLabel lbDescPed;
    private javax.swing.JLabel lbIdTiePed;
    private javax.swing.JLabel lbIdVenPed;
    private javax.swing.JLabel lbInsPedReg;
    private javax.swing.JLabel lbPedReg;
    private javax.swing.JLabel lbusuPedCons;
    private javax.swing.JTable tblPedConsulta;
    private javax.swing.JTextField txtVenFacPed;
    // End of variables declaration//GEN-END:variables


}