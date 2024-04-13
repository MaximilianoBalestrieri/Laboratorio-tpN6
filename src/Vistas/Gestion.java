package Vistas;

import Entidades.Producto;
import Entidades.Rubro;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class Gestion extends javax.swing.JInternalFrame {
 private TreeSet<Producto> productos;
 private Producto auxiliar=null;
 

public Gestion(TreeSet<Producto>productos) {
        initComponents();
        this.productos=productos;
        llenarCombo();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtDescripcion = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jcRubros = new javax.swing.JComboBox<>();
        jtStock = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Descripción: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Precio:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Categoria:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Stock:");

        jtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jcRubros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcRubros.setSelectedIndex(-1);

        jtStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.setEnabled(false);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSalir)
                .addGap(124, 124, 124))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtCodigo)
                    .addComponent(jtDescripcion)
                    .addComponent(jcRubros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcRubros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbBuscar)
                                .addGap(15, 15, 15)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106)
                        .addComponent(jLabel5)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbNuevo))
                .addGap(23, 23, 23))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Gestión de Productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel6)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();    
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        int codigo;
       
        if(validaEntero(jtCodigo.getText())){
            codigo = Integer.parseInt(jtCodigo.getText());
        }else {
        
            JOptionPane.showMessageDialog(this, "Debe ingresar un número.","Código incorrecto",JOptionPane.ERROR_MESSAGE);
            jtCodigo.requestFocus();
            return;
        }
        
        for(Producto prod:productos){
 
            if(codigo==prod.getCodigo()){
            
                jtDescripcion.setText(prod.getDescripcion());
                jtPrecio.setText(prod.getPrecio()+"");
                jtStock.setText(prod.getStock()+"");
                jcRubros.setSelectedItem(prod.getRubro());
                jbEliminar.setEnabled(true);
                auxiliar=prod;
                return;
                
            }
        }
        
        JOptionPane.showMessageDialog(this,"No se encontró ningúnproducto con el código: "+codigo,"Codigo inexistente",JOptionPane.PLAIN_MESSAGE);
        limpiar();
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int opcion=JOptionPane.showConfirmDialog(this, "¿Desea eliminar el producto: "+auxiliar.getCodigo()+" - "+auxiliar.getDescripcion()+"?", "Eliminar producto exixtente",JOptionPane.YES_NO_OPTION);
                if(opcion==JOptionPane.YES_OPTION){
                     productos.remove(auxiliar);
                    JOptionPane.showMessageDialog(this, "Producto Eliminado ");
                    limpiar();
                    auxiliar=null;
                }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int codigo;
        String descripcion;
        double precio;
        Rubro rubro=new Rubro();
        int stock;
       
        if(validaEntero(jtCodigo.getText())){
            codigo = Integer.parseInt(jtCodigo.getText());
        }else {
        
            JOptionPane.showMessageDialog(this, "Debe ingresar un número.","Código incorrecto",JOptionPane.ERROR_MESSAGE);
            jtCodigo.requestFocus();
            return;
        }
       
        if(validaEntero(jtStock.getText())){
            stock = Integer.parseInt(jtStock.getText());
        }else {
        
            JOptionPane.showMessageDialog(this, "Debe ingresar un número.","Valor de stock incorrecto",JOptionPane.ERROR_MESSAGE);
            jtStock.requestFocus();
            return;
        }
        
        if(validaReal(jtPrecio.getText())){
            
            precio = Double.parseDouble(jtPrecio.getText());
            
        }else {
        
            JOptionPane.showMessageDialog(this, "Debe ingresar un número.","Precio incorrecto",JOptionPane.ERROR_MESSAGE);
            jtPrecio.requestFocus();
            return;
        }
        
        if(!jtDescripcion.getText().isEmpty()){
        
            descripcion = jtDescripcion.getText();
        }else {
            JOptionPane.showMessageDialog(this, "Debe ingresar una descripción.","Descripción incorrecta",JOptionPane.ERROR_MESSAGE);
            jtDescripcion.requestFocus();
            return;
        }
        
        if(!(jcRubros.getSelectedIndex()<0)){
            rubro =(Rubro) jcRubros.getSelectedItem();
        }else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un rubro.","Rubro no seleccionado",JOptionPane.ERROR_MESSAGE);
            jcRubros.requestFocus();
            return;
        }
        

        
        Producto nvoProd=new Producto(codigo,descripcion,stock,precio,rubro);
        if(productos.add(nvoProd)){
            JOptionPane.showMessageDialog(this, "Producto Agregado");
            limpiar();
        }else {
       
            JOptionPane.showMessageDialog(this, "Ya existe un producto con ese código","Código existente",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        limpiar();        // TODO add your handling code here:
    }//GEN-LAST:event_jbNuevoActionPerformed

  private boolean validaEntero(String nro){
    
        Pattern patron=Pattern.compile("^[0-9]+$");
        Matcher m=patron.matcher(nro);
        return m.matches();
    }

    private boolean validaReal(String nro){
    Pattern patron=Pattern.compile("^[0-9]+[.]{0,1}[0-9]{0,2}$");
        Matcher m=patron.matcher(nro);
        return m.matches();
        
    }
    
    private void limpiar(){
    
        jtCodigo.setText("");
        jtDescripcion.setText("");
        jtPrecio.setText("");
        jtStock.setText("");
        jcRubros.setSelectedIndex(-1);
        jbEliminar.setEnabled(false);
        auxiliar=null;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Rubro> jcRubros;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables

    private void llenarCombo(){
        Rubro comestible=new Rubro(1,"Comestible");
        Rubro limpieza=new Rubro(2,"Limpieza");
        Rubro perfumeria=new Rubro(3,"Perfumeria");
        
        jcRubros.addItem(comestible);
        jcRubros.addItem(limpieza);
        jcRubros.addItem(perfumeria);
        jcRubros.setSelectedIndex(-1);
    }
}
