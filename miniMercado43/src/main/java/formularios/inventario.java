/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package formularios;

/**
 *
 * @author OSCAR
 */
public class inventario extends javax.swing.JPanel {

    /**
     * Creates new form inventario
     */
    public inventario() {
        initComponents();
        clases.CProducto objetoInventario=new clases.CProducto();
        objetoInventario.mostrarInventario(tbinventario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        controlInventario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbinventario = new javax.swing.JTable();

        controlInventario.setBackground(new java.awt.Color(255, 255, 255));
        controlInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Control de inventario"));

        tbinventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbinventario);

        javax.swing.GroupLayout controlInventarioLayout = new javax.swing.GroupLayout(controlInventario);
        controlInventario.setLayout(controlInventarioLayout);
        controlInventarioLayout.setHorizontalGroup(
            controlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
        );
        controlInventarioLayout.setVerticalGroup(
            controlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controlInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controlInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlInventario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbinventario;
    // End of variables declaration//GEN-END:variables
}
