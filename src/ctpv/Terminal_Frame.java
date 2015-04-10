/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ctpv;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class Terminal_Frame extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTabla; //Modelo de la tabla que contiene la factura
    /**
     * Creates new form venta
     */
    public Terminal_Frame() {
        initComponents();
        this.modeloTabla = new DefaultTableModel();

        //Añadimos las columnas a la tabla
        this.modeloTabla.addColumn("Productos");
        this.modeloTabla.addColumn("Cantidad");
        this.modeloTabla.addColumn("Sub-total");

        this.jTableLineasCompra.setModel(modeloTabla);// Añadimos el modelo a la tabla
        this.jLabelFinal.setVisible(false);
    }

    public void reset (){
        this.jTableLineasCompra.setModel(modeloTabla);// Añadimos el modelo a la tabla
        this.jLabelFinal.setText("€");
        this.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jLabelFinal = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableLineasCompra = new javax.swing.JTable();

        jLabel1.setText("Ticket de compra");

        jLabel2.setText("Total ticket");

        jLabelTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotal.setText("€");

        jLabelFinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFinal.setText("CLIENTE SERVIDO");
        jLabelFinal.setEnabled(false);

        jTableLineasCompra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTableLineasCompra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(114, 114, 114))
                    .addComponent(jLabelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFinal;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableLineasCompra;
    // End of variables declaration//GEN-END:variables

//*******************************************************************************
//GETTERS & SETTERS

    public javax.swing.JLabel getjLabelFinal() {
        return jLabelFinal;
    }

    public void setjLabelFinal(javax.swing.JLabel jLabelFinal) {
        this.jLabelFinal = jLabelFinal;
    }

    public javax.swing.JLabel getjLabelTotal() {
        return jLabelTotal;
    }

    public void setjLabelTotal(javax.swing.JLabel jLabelTotal) {
        this.jLabelTotal = jLabelTotal;
    }

    public javax.swing.JTable getjTableLineasCompra() {
        return jTableLineasCompra;
    }

    public void setjTableLineasCompra(javax.swing.JTable jTableLineasCompra) {
        this.jTableLineasCompra = jTableLineasCompra;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }
    
    
}
