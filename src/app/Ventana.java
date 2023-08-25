/** 
 * Autor: Eduardo Morales Flores
 **/
package app;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author Sistemas
 */
public class Ventana extends javax.swing.JFrame {

    FondoFrame fondo = new FondoFrame();

    public Ventana() {
        this.setContentPane(fondo);

        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/icono.png")).getImage());
        cargarTabla();
        centrarTabla(tblRegistros);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new FondoFrame();
        nuevoRegistro = new javax.swing.JButton();
        ModificarRegistro = new javax.swing.JButton();
        eliminarRegistro = new javax.swing.JButton();
        ModificarRegistro1 = new javax.swing.JButton();
        jPanel2 = new FondoFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Mantenimineto Preventivo Sistemas");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Programa de Mantenimiento Preventivo Sistemas ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        nuevoRegistro.setText("Nuevo registro");
        nuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoRegistroActionPerformed(evt);
            }
        });

        ModificarRegistro.setText("Modificar registro");
        ModificarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarRegistroActionPerformed(evt);
            }
        });

        eliminarRegistro.setText("Dar de Baja un registro");
        eliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarRegistroActionPerformed(evt);
            }
        });

        ModificarRegistro1.setText("Bajas");
        ModificarRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarRegistro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(nuevoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ModificarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eliminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ModificarRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nuevoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ModificarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ModificarRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla de Registros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        tblRegistros.setAutoCreateRowSorter(true);
        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de Inventario", "Nuevo Código de Inventario", "Unidad de Negocio", "Tipo de Equipo", "Marca", "Modelo", "Número de serie", "Especificaciones/Caracteristicas", "Estatus funcionamiento", "Usuario Asignado", "Área", "Ubicación", "Estatus Mantenimiento", "Tiempo MTTO", "Fecha de Mantenimiento", "Fecha Próx. Mantenimiento", "Observaciones / Comentarios", "Fecha de compra", "% de Devaluación", "Estatus"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRegistros.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblRegistros.setGridColor(new java.awt.Color(0, 0, 0));
        tblRegistros.setInheritsPopupMenu(true);
        tblRegistros.setShowGrid(true);
        tblRegistros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblRegistrosFocusGained(evt);
            }
        });
        tblRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistros);
        if (tblRegistros.getColumnModel().getColumnCount() > 0) {
            tblRegistros.getColumnModel().getColumn(0).setMinWidth(130);
            tblRegistros.getColumnModel().getColumn(0).setPreferredWidth(130);
            tblRegistros.getColumnModel().getColumn(1).setMinWidth(170);
            tblRegistros.getColumnModel().getColumn(1).setPreferredWidth(170);
            tblRegistros.getColumnModel().getColumn(2).setMinWidth(130);
            tblRegistros.getColumnModel().getColumn(2).setPreferredWidth(130);
            tblRegistros.getColumnModel().getColumn(3).setMinWidth(150);
            tblRegistros.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblRegistros.getColumnModel().getColumn(4).setMinWidth(130);
            tblRegistros.getColumnModel().getColumn(4).setPreferredWidth(130);
            tblRegistros.getColumnModel().getColumn(5).setMinWidth(150);
            tblRegistros.getColumnModel().getColumn(5).setPreferredWidth(150);
            tblRegistros.getColumnModel().getColumn(6).setMinWidth(130);
            tblRegistros.getColumnModel().getColumn(6).setPreferredWidth(130);
            tblRegistros.getColumnModel().getColumn(7).setMinWidth(300);
            tblRegistros.getColumnModel().getColumn(7).setPreferredWidth(300);
            tblRegistros.getColumnModel().getColumn(8).setMinWidth(150);
            tblRegistros.getColumnModel().getColumn(8).setPreferredWidth(150);
            tblRegistros.getColumnModel().getColumn(9).setMinWidth(180);
            tblRegistros.getColumnModel().getColumn(9).setPreferredWidth(180);
            tblRegistros.getColumnModel().getColumn(10).setMinWidth(130);
            tblRegistros.getColumnModel().getColumn(10).setPreferredWidth(130);
            tblRegistros.getColumnModel().getColumn(11).setMinWidth(130);
            tblRegistros.getColumnModel().getColumn(11).setPreferredWidth(130);
            tblRegistros.getColumnModel().getColumn(12).setMinWidth(150);
            tblRegistros.getColumnModel().getColumn(12).setPreferredWidth(150);
            tblRegistros.getColumnModel().getColumn(13).setMinWidth(130);
            tblRegistros.getColumnModel().getColumn(13).setPreferredWidth(130);
            tblRegistros.getColumnModel().getColumn(14).setMinWidth(150);
            tblRegistros.getColumnModel().getColumn(14).setPreferredWidth(150);
            tblRegistros.getColumnModel().getColumn(15).setMinWidth(150);
            tblRegistros.getColumnModel().getColumn(15).setPreferredWidth(150);
            tblRegistros.getColumnModel().getColumn(16).setMinWidth(300);
            tblRegistros.getColumnModel().getColumn(16).setPreferredWidth(300);
            tblRegistros.getColumnModel().getColumn(17).setMinWidth(150);
            tblRegistros.getColumnModel().getColumn(17).setPreferredWidth(150);
            tblRegistros.getColumnModel().getColumn(18).setMinWidth(130);
            tblRegistros.getColumnModel().getColumn(18).setPreferredWidth(130);
            tblRegistros.getColumnModel().getColumn(19).setMinWidth(130);
            tblRegistros.getColumnModel().getColumn(19).setPreferredWidth(130);
        }

        cerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cerrar.setText("Cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(416, 416, 416))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(214, 214, 214))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoRegistroActionPerformed
        Registros r = new Registros();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_nuevoRegistroActionPerformed

    private void ModificarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarRegistroActionPerformed

        PreparedStatement ps;
        ResultSet rs;

        
        for (int i = 0; i < tblRegistros.getRowCount(); i++) {
            if (tblRegistros.isRowSelected(i)) {

                int fila = tblRegistros.getSelectedRow();
                String id = tblRegistros.getValueAt(fila, 0).toString();

                Modificar mod = new Modificar();
                this.setVisible(false);
                mod.setVisible(true);

                Connection con = Conexion.getConection();
                try {
                    ps = con.prepareStatement("""
                                                          SELECT nuevo_cod_inv
                                                          ,unidad_negocio
                                                          ,tipo_equipo
                                                          ,marca
                                                          ,modelo
                                                          ,numero_serie
                                                          ,especif_caract
                                                          ,estatus_funcionamiento
                                                          ,usuario_asignado
                                                          ,area
                                                          ,ubicacion
                                                          ,estatus_mantenimiento
                                                          ,tiempo_mtto
                                                          ,fec_mant
                                                          ,fec_mant_prox
                                                          ,observ_coment
                                                          ,fecha_compra
                                                          ,porcentaje_devaluacion
                                                          ,estatus
                                                          FROM prog_mant_prev WHERE codigo_inventario=?""");
                    ps.setString(1, id);
                    rs = ps.executeQuery();

                    while (rs.next()) {
                        mod.codInventario.setText(String.valueOf(id));
                        mod.nuevoCodInventario.setText(rs.getString("nuevo_cod_inv"));
                        setComboBox(mod.unidadNegocio, mod.elUnidadNegocio, rs, "unidad_negocio");
                        setComboBox(mod.tipoEquipo, mod.elTipoEquipo, rs, "tipo_equipo");
                        mod.marca.setText(rs.getString("marca"));
                        mod.modelo.setText(rs.getString("modelo"));
                        mod.numSerie.setText(rs.getString("numero_serie"));
                        mod.caracteristicas.setText(rs.getString("especif_caract"));
                        setComboBox(mod.estatusFuncionamiento, mod.elEstatusFunc, rs, "estatus_funcionamiento");
                        mod.usuarioAsignado.setText(rs.getString("usuario_asignado"));
                        setComboBox(mod.area, mod.elArea, rs, "area");
                        setComboBox(mod.ubicacion, mod.elUbicacion, rs, "ubicacion");
                        setComboBox(mod.estMantenimiento, mod.elEstatusMan, rs, "estatus_mantenimiento");
                        setComboBox(mod.tiempoMTTO, mod.elTiempoMTTO, rs, "tiempo_mtto");
                        parseString(rs.getString("fec_mant"), mod.fecha_mantenimiento);
                        parseString(rs.getString("fec_mant_prox"), mod.fec_man_prox);
                        mod.obsCom.setText(rs.getString("observ_coment"));
                        parseString(rs.getString("fecha_compra"), mod.fec_compra);
                        mod.porcentajeDevaluacion.setText(rs.getString("porcentaje_devaluacion"));
                        mod.estatus.setText(rs.getString("estatus"));
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }

            }
        }


    }//GEN-LAST:event_ModificarRegistroActionPerformed

    private void eliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarRegistroActionPerformed

        PreparedStatement ps;
        ResultSet rs;

        for (int i = 0; i < tblRegistros.getRowCount(); i++) {
            if (tblRegistros.isRowSelected(i)) {

                int fila = tblRegistros.getSelectedRow();
                String id = tblRegistros.getValueAt(fila, 0).toString();

                Eliminar elim = new Eliminar();
                this.setVisible(false);
                elim.setVisible(true);

                Connection con = Conexion.getConection();

                try {
                    ps = con.prepareStatement("""
                                                          SELECT nuevo_cod_inv
                                                          ,unidad_negocio
                                                          ,tipo_equipo
                                                          ,marca
                                                          ,modelo
                                                          ,numero_serie
                                                          ,especif_caract
                                                          ,estatus_funcionamiento
                                                          ,usuario_asignado
                                                          ,area
                                                          ,ubicacion
                                                          ,estatus_mantenimiento
                                                          ,tiempo_mtto
                                                          ,fec_mant
                                                          ,fec_mant_prox
                                                          ,observ_coment
                                                          ,fecha_compra
                                                          ,porcentaje_devaluacion
                                                          ,estatus
                                                          FROM prog_mant_prev WHERE codigo_inventario=?""");
                    ps.setString(1, id);
                    rs = ps.executeQuery();

                    while (rs.next()) {
                        elim.codInventario.setText(String.valueOf(id));
                        elim.nuevoCodInventario.setText(rs.getString("nuevo_cod_inv"));
                        setComboBox(elim.unidadNegocio, elim.elUnidadNegocio, rs, "unidad_negocio");
                        setComboBox(elim.tipoEquipo, elim.elTipoEquipo, rs, "tipo_equipo");
                        elim.marca.setText(rs.getString("marca"));
                        elim.modelo.setText(rs.getString("modelo"));
                        elim.numSerie.setText(rs.getString("numero_serie"));
                        elim.caracteristicas.setText(rs.getString("especif_caract"));
                        setComboBox(elim.estatusFuncionamiento, elim.elEstatusFunc, rs, "estatus_funcionamiento");
                        elim.usuarioAsignado.setText(rs.getString("usuario_asignado"));
                        setComboBox(elim.area, elim.elArea, rs, "area");
                        setComboBox(elim.ubicacion, elim.elUbicacion, rs, "ubicacion");
                        setComboBox(elim.estMantenimiento, elim.elEstatusMan, rs, "estatus_mantenimiento");
                        setComboBox(elim.tiempoMTTO, elim.elTiempoMTTO, rs, "tiempo_mtto");
                        parseString(rs.getString("fec_mant"), elim.fecha_mantenimiento);
                        parseString(rs.getString("fec_mant_prox"), elim.fec_man_prox);
                        elim.obsCom.setText(rs.getString("observ_coment"));
                        parseString(rs.getString("fecha_compra"), elim.fecha_compra);
                        elim.porcentajeDevaluacion.setText(rs.getString("porcentaje_devaluacion"));
                        elim.estatus.setText(rs.getString("estatus"));
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
            }
        }
    }//GEN-LAST:event_eliminarRegistroActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Seguro que quieres salir?");
        if (i == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_cerrarActionPerformed

    private void tblRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistrosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRegistrosMouseClicked

    private void tblRegistrosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblRegistrosFocusGained

    }//GEN-LAST:event_tblRegistrosFocusGained

    private void ModificarRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarRegistro1ActionPerformed
        this.setVisible(false);
        new Bajas().setVisible(true);
    }//GEN-LAST:event_ModificarRegistro1ActionPerformed

    private void parseString(String date,JXDatePicker dtPicker){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            if(!date.equals(""))
                dtPicker.setDate(sdf.parse(date));
            else
                dtPicker.setDate(null);
        } catch (ParseException e) {
            System.out.println(e);
        }
    }
    private void cargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tblRegistros.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection con = Conexion.getConection();
            ps = con.prepareStatement("""
            SELECT codigo_inventario
            ,nuevo_cod_inv
            ,unidad_negocio
            ,tipo_equipo
            ,marca
            ,modelo
            ,numero_serie
            ,especif_caract
            ,estatus_funcionamiento
            ,usuario_asignado
            ,area
            ,ubicacion
            ,estatus_mantenimiento
            ,tiempo_mtto
            ,fec_mant
            ,fec_mant_prox
            ,observ_coment
            ,fecha_compra
            ,porcentaje_devaluacion
            ,estatus
            FROM prog_mant_prev """);

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

    private void setComboBox(JComboBox com, String[] elementos, ResultSet rs, String campo) throws SQLException {
        for (int i = 0; i < elementos.length; i++) {
            if (rs.getString(campo).equals(elementos[i])) {
                com.setSelectedIndex(i);
            }
        }
    }

    public static void centrarTabla(JTable tbl) {
        TableCellRenderer rnd = tbl.getTableHeader().getDefaultRenderer();
        JLabel header = (JLabel) rnd;
        header.setHorizontalAlignment(JLabel.CENTER);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Ventana().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ModificarRegistro;
    private javax.swing.JButton ModificarRegistro1;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton eliminarRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuevoRegistro;
    protected javax.swing.JTable tblRegistros;
    // End of variables declaration//GEN-END:variables

    class FondoFrame extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/images/fondo_obscuro.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);
        }
    }
}
