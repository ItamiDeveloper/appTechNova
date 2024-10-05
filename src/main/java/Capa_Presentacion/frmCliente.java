package Capa_Presentacion;

import Capa_Datos.ClienteDAO;
import Capa_Entidad.Cliente;
import Capa_Negocio.Neg_Cliente;
import Capa_Negocio.Neg_MetodosGenerales;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo
 */
public class frmCliente extends javax.swing.JPanel {

    /**
     * Creates new form Producto
     */
    public frmCliente() {
        initComponents();
        aplicarTemaMac();
        cargarClientesEnTabla();
        obtenerProximoIdCliente();
        txtIDCliente.enable(false);
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
        Background1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtnomape = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        btnNuevoCli = new javax.swing.JButton();
        btnModificarCli = new javax.swing.JButton();
        btnEliminarCli = new javax.swing.JButton();
        btnAgregarCli = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(610, 540));

        Background1.setBackground(new java.awt.Color(255, 255, 255));
        Background1.setPreferredSize(new java.awt.Dimension(610, 540));

        jPanel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(590, 280));

        jLabel8.setText("ID:");

        jLabel11.setText("Nombre y Apellido:");

        jLabel13.setText("DNI:");

        jLabel14.setText("Telefono:");

        jLabel15.setText("Direcion:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(551, 551, 551))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txtDireccion)
                                .addGap(388, 388, 388))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txtTelefono)
                                .addGap(270, 270, 270))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnomape, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(386, 386, 386))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtnomape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion)
                    .addComponent(jLabel15))
                .addGap(251, 251, 251))
        );

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCliente);

        jPanel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(590, 40));

        btnNuevoCli.setText("Nuevo Cliente");
        btnNuevoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoCliActionPerformed(evt);
            }
        });

        btnModificarCli.setText("Modificar Cliente");
        btnModificarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCliActionPerformed(evt);
            }
        });

        btnEliminarCli.setText("Eliminar Cliente");
        btnEliminarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCliActionPerformed(evt);
            }
        });

        btnAgregarCli.setText("Agregar Cliente");
        btnAgregarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregarCli, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(btnNuevoCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(btnModificarCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(btnEliminarCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarCli)
                    .addComponent(btnModificarCli)
                    .addComponent(btnNuevoCli)
                    .addComponent(btnAgregarCli))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Background1Layout = new javax.swing.GroupLayout(Background1);
        Background1.setLayout(Background1Layout);
        Background1Layout.setHorizontalGroup(
            Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Background1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE))
                .addContainerGap())
        );
        Background1Layout.setVerticalGroup(
            Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Background1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCliActionPerformed
        // TODO add your handling code here:
        limpiarCampos(); // Limpiar los campos de texto
        int nuevoIdCliente = obtenerProximoIdCliente(); // Usar el método de la capa de negocios
        txtIDCliente.setText(String.valueOf(nuevoIdCliente)); // Mostrar el nuevo ID autoincrementado
    }//GEN-LAST:event_btnNuevoCliActionPerformed

    private void btnModificarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCliActionPerformed
        // TODO add your handling code here:
        modificarCliente();
        limpiarCampos();
        cargarClientesEnTabla();
    }//GEN-LAST:event_btnModificarCliActionPerformed

    private void btnEliminarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCliActionPerformed
        // TODO add your handling code here:
        eliminarCliente();
        cargarClientesEnTabla();
    }//GEN-LAST:event_btnEliminarCliActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        // TODO add your handling code here:
        clicTablaCliente();
    }//GEN-LAST:event_tblClienteMouseClicked

    private void btnAgregarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCliActionPerformed
        // TODO add your handling code here:
        agregarCliente();
        limpiarCampos();
        cargarClientesEnTabla();
    }//GEN-LAST:event_btnAgregarCliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background1;
    private javax.swing.JButton btnAgregarCli;
    private javax.swing.JButton btnEliminarCli;
    private javax.swing.JButton btnModificarCli;
    private javax.swing.JButton btnNuevoCli;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtnomape;
    // End of variables declaration//GEN-END:variables

    private void aplicarTemaMac() {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
            SwingUtilities.updateComponentTreeUI(this); // Actualiza la UI
        } catch (UnsupportedLookAndFeelException e) {
        }
    }

    private void configurarModeloTabla() {
        DefaultTableModel modelo = new DefaultTableModel();

        // Definir las columnas que tendrá la tabla
        modelo.addColumn("ID Cliente");
        modelo.addColumn("Nombre");
        modelo.addColumn("DNI");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Dirección");

        // Asignar el modelo al JTable
        tblCliente.setModel(modelo);
    }

    private void cargarClientesEnTabla() {
        configurarModeloTabla();
        ClienteDAO clienteDAO = new ClienteDAO();
        List<Cliente> clientes = clienteDAO.listarClientes();

        DefaultTableModel modelo = (DefaultTableModel) tblCliente.getModel();
        modelo.setRowCount(0); // Limpiar la tabla antes de cargar los datos

        for (Cliente cliente : clientes) {
            Object[] fila = {
                cliente.getIdCliente(),
                cliente.getNomape(),
                cliente.getDni(),
                cliente.getTelefono(),
                cliente.getDireccion()
            };
            modelo.addRow(fila);
        }
    }

    private int obtenerProximoIdCliente() {
        Neg_MetodosGenerales metodosDAO = new Neg_MetodosGenerales();
        return metodosDAO.obtenerProximoIdCliente(); // Llamada al método de la capa de negocios
    }

    private void eliminarCliente() {
        int filaSeleccionada = tblCliente.getSelectedRow();
        if (filaSeleccionada >= 0) {
            int idCliente = Integer.parseInt(tblCliente.getValueAt(filaSeleccionada, 0).toString());

            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar este cliente?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                Neg_Cliente clienteDAO = new Neg_Cliente();
                clienteDAO.eliminarCliente(idCliente);
                JOptionPane.showMessageDialog(this, "Cliente eliminado exitosamente.");

                cargarClientesEnTabla(); // Actualizar la tabla después de eliminar
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor selecciona un cliente para eliminar.");
        }
    }

    private void modificarCliente() {
        if (validarCampos()) {
            Cliente cliente = new Cliente();
            cliente.setIdCliente(Integer.parseInt(txtIDCliente.getText()));
            cliente.setNomape(txtnomape.getText());
            cliente.setDni(Integer.parseInt(txtDNI.getText()));
            cliente.setTelefono(txtTelefono.getText());
            cliente.setDireccion(txtDireccion.getText());

            Neg_Cliente clienteDAO = new Neg_Cliente();
            clienteDAO.modificarCliente(cliente);
            JOptionPane.showMessageDialog(this, "Cliente modificado exitosamente.");

            cargarClientesEnTabla(); // Actualizar la tabla con los datos modificados
        }
    }

    private void clicTablaCliente() {

        int filaSeleccionada = tblCliente.getSelectedRow();
        if (filaSeleccionada >= 0) {
            txtIDCliente.setText(tblCliente.getValueAt(filaSeleccionada, 0).toString());
            txtnomape.setText(tblCliente.getValueAt(filaSeleccionada, 1).toString());
            txtDNI.setText(tblCliente.getValueAt(filaSeleccionada, 2).toString());
            txtTelefono.setText(tblCliente.getValueAt(filaSeleccionada, 3).toString());
            txtDireccion.setText(tblCliente.getValueAt(filaSeleccionada, 4).toString());
        }
    }

    private void guardarCliente() {
        if (validarCampos()) {
            Cliente cliente = new Cliente();
            cliente.setNomape(txtnomape.getText());
            cliente.setDni(Integer.parseInt(txtDNI.getText()));
            cliente.setTelefono(txtTelefono.getText());
            cliente.setDireccion(txtDireccion.getText());

            Neg_Cliente clienteDAO = new Neg_Cliente();
            String mensaje = clienteDAO.agregarCliente(cliente);
            JOptionPane.showMessageDialog(this, mensaje);

            cargarClientesEnTabla(); // Actualizar la tabla con los nuevos datos
        }
    }

    private boolean validarCampos() {
        if (txtnomape.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío.");
            return false;
        }
        if (txtDNI.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El DNI no puede estar vacío.");
            return false;
        }
        // Validaciones adicionales si es necesario
        return true;
    }

    private void limpiarCampos() {
        txtnomape.setText("");
        txtDNI.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
    }

    private void agregarCliente() {
        if (validarCampos()) {
            Cliente cliente = new Cliente();
            cliente.setNomape(txtnomape.getText());
            cliente.setDni(Integer.parseInt(txtDNI.getText()));
            cliente.setTelefono(txtTelefono.getText());
            cliente.setDireccion(txtDireccion.getText());

            Neg_Cliente clienteDAO = new Neg_Cliente();
            String mensaje = clienteDAO.agregarCliente(cliente);
            JOptionPane.showMessageDialog(this, mensaje);

            cargarClientesEnTabla(); // Actualizar la tabla con los nuevos datos
        }
    }

}
