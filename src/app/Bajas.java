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
 * @author Eduardo Morales Flores (Sistemas)
 */
public class Bajas extends javax.swing.JFrame {

    FondoFrame fondo = new FondoFrame();

    public Bajas() {
        this.setContentPane(fondo);

        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/icono.png")).getImage());
        centrarTabla(tblRegistros);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new FondoFrame();
        recuperarRegistro = new javax.swing.JButton();
        eliminarRegistro = new javax.swing.JButton();
        jPanel2 = new FondoFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Mantenimineto Preventivo Sistemas");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Programa de Mantenimiento Preventivo Sistemas ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        recuperarRegistro.setText("RECUPERAR");
        recuperarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuperarRegistroActionPerformed(evt);
            }
        });

        eliminarRegistro.setText("ELIMINAR");
        eliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(recuperarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eliminarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recuperarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        atras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
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
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(416, 416, 416))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void eliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarRegistroActionPerformed

        PreparedStatement ps;
        ResultSet rs;

        for (int i = 0; i < tblRegistros.getColumnCount(); i++) {
            if (tblRegistros.isRowSelected(i)) {

                int fila = tblRegistros.getSelectedRow();
                String id = tblRegistros.getValueAt(fila, 0).toString();
                Eliminar elim = new Eliminar();

                Connection con = Conexion.getConection();

                int opt = JOptionPane.showConfirmDialog(null, "¿Está seguro(a) de eliminar este registro?, se ELIMINARÁ definitivamente.");

                if (opt == 0) {

                    try {
                        ps = con.prepareStatement("""
                                                          SELECT codigo_inventario
                                                          FROM man_prev_bajas WHERE codigo_inventario=?""");
                        ps.setString(1, id);
                        rs = ps.executeQuery();

                        while (rs.next()) {
                            elim.codInventario.setText(String.valueOf(id));
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex.toString());
                    }
                    String S_CodigoInv = elim.codInventario.getText().toUpperCase();
                    try {

                        ps = con.prepareStatement(
                                """
                    DELETE FROM dbo.man_prev_bajas
                    WHERE codigo_inventario=?
                    """);

                        ps.setString(1, S_CodigoInv);

                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "El registro se a Eliminado");

                        cargarTabla();

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex.toString());

                    }
                }
            }
        }
    }//GEN-LAST:event_eliminarRegistroActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        this.setVisible(false);
        new Ventana().setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

    private void tblRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistrosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRegistrosMouseClicked

    private void tblRegistrosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblRegistrosFocusGained

    }//GEN-LAST:event_tblRegistrosFocusGained

    private void recuperarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuperarRegistroActionPerformed

        PreparedStatement ps;
        ResultSet rs;

        for (int i = 0; i < tblRegistros.getColumnCount(); i++) {
            if (tblRegistros.isRowSelected(i)) {

                int fila = tblRegistros.getSelectedRow();
                String id = tblRegistros.getValueAt(fila, 0).toString();

                Recuperar rec = new Recuperar();
                this.setVisible(false);
                rec.setVisible(true);

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
                        FROM man_prev_bajas WHERE codigo_inventario=?""");
                    ps.setString(1, id);
                    rs = ps.executeQuery();

                    while (rs.next()) {
                        rec.codInventario.setText(String.valueOf(id));
                        rec.nuevoCodInventario.setText(rs.getString("nuevo_cod_inv"));
                        setComboBox(rec.unidadNegocio, rec.elUnidadNegocio, rs, "unidad_negocio");
                        setComboBox(rec.tipoEquipo, rec.elTipoEquipo, rs, "tipo_equipo");
                        rec.marca.setText(rs.getString("marca"));
                        rec.modelo.setText(rs.getString("modelo"));
                        rec.numSerie.setText(rs.getString("numero_serie"));
                        rec.caracteristicas.setText(rs.getString("especif_caract"));
                        setComboBox(rec.estatusFuncionamiento, rec.elEstatusFunc, rs, "estatus_funcionamiento");
                        rec.usuarioAsignado.setText(rs.getString("usuario_asignado"));
                        setComboBox(rec.area, rec.elArea, rs, "area");
                        setComboBox(rec.ubicacion, rec.elUbicacion, rs, "ubicacion");
                        setComboBox(rec.estMantenimiento, rec.elEstatusMan, rs, "estatus_mantenimiento");
                        setComboBox(rec.tiempoMTTO, rec.elTiempoMTTO, rs, "tiempo_mtto");
                        parseString(rs.getString("fec_mant"), rec.fecha_mantenimiento);
                        parseString(rs.getString("fec_mant_prox"), rec.fec_man_prox);
                        rec.obsCom.setText(rs.getString("observ_coment"));
                        parseString(rs.getString("fecha_compra"), rec.fecha_compra);
                        rec.porcentajeDevaluacion.setText(rs.getString("porcentaje_devaluacion"));
                        rec.estatus.setText(rs.getString("estatus"));
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }

            }
        }

    }//GEN-LAST:event_recuperarRegistroActionPerformed

    protected void cargarTabla() {

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
            FROM man_prev_bajas """);

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

    private void parseString(String date, JXDatePicker dtPicker) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            if (!date.equals("")) {
                dtPicker.setDate(sdf.parse(date));
            } else {
                dtPicker.setDate(null);
            }
        } catch (ParseException e) {
            System.out.println(e);
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
            java.util.logging.Logger.getLogger(Bajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Bajas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton eliminarRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton recuperarRegistro;
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
