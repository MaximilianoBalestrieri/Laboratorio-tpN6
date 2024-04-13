package Vistas;

import Entidades.Producto;
import Entidades.Rubro;
import java.util.ArrayList;
import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CCMEW
 */
public class PorRubro extends javax.swing.JInternalFrame {
    private TreeSet<Producto> listaProd;
    private DefaultTableModel tablaProducto= new DefaultTableModel();


    public PorRubro(TreeSet<Producto> listaProd) {
        initComponents();
        this.listaProd = listaProd;
       tablaProducto= new DefaultTableModel();
       combo();
       armadoColumnas();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProd = new javax.swing.JTable();

        setClosable(true);
        setResizable(true);
        setTitle("Listado por rubro");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Listado de Productos por Rubro");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Elija un rubro:");

        cmbCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        tablaProd.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaProd);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed

        borrarFila();
        Rubro seleccionado = (Rubro)cmbCategoria.getSelectedItem();
        for (Producto producto : listaProd) {
            if(producto.getCategoria().equals(seleccionado)){
                tablaProducto.addRow(new Object[]{producto.getCodigo(), producto.getDescripcion(), producto.getPrecio(),producto.getCategoria(),producto.getStock()});
       }
        }
    }//GEN-LAST:event_cmbCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Rubro> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProd;
    // End of variables declaration//GEN-END:variables

    private void combo(){
        Rubro comestible=new Rubro(1,"Comestible");
        Rubro limpieza=new Rubro(2,"Limpieza");
        Rubro perfumeria=new Rubro(3,"Perfumeria");
        
        cmbCategoria.addItem(comestible);
        cmbCategoria.addItem(limpieza);
        cmbCategoria.addItem(perfumeria);
    }

    private void armadoColumnas() {
     
        ArrayList<Object> colum = new ArrayList<>();
        colum.add("Código");
        colum.add("Descripción");
        colum.add("Precio");
        colum.add("Categoria");
        colum.add("Stock");      
        for (Object a: colum) {
            tablaProducto.addColumn(a);    
        }   
    }
    
   private void borrarFila(){
  
         int f=tablaProducto.getRowCount()-1;
         for(int i=f;i >= 0;i--){     
             tablaProducto.removeRow(i);
         }
     }
        
   
}
