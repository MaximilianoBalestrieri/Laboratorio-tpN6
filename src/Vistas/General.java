package Vistas;

import Entidades.Producto;
import Entidades.Rubro;
import java.util.TreeSet;


public class General extends javax.swing.JFrame {
    private TreeSet<Producto> listaProd=new TreeSet<>();

    /**
     * Creates new form General
     */
    public General() {
        initComponents();
        
        //LISTA HARDCODE DE PRODUCTOS
        listaProd.add(new Producto(101,"Arroz",23,12.50,new Rubro(1,"Comestible")));
        listaProd.add(new Producto(102,"Polenta",3,9,new Rubro(1,"Comestible")));
        listaProd.add(new Producto(103,"Pollo",2,20.1,new Rubro(1,"Comestible")));
        listaProd.add(new Producto(104,"A Perfume",4,52.99,new Rubro(3,"Perfumeria")));
        listaProd.add(new Producto(105,"Limp Tree",2,55,new Rubro(2,"Limpieza")));
        listaProd.add(new Producto(107,"Rexona",4,152.15,new Rubro(3,"Perfumeria")));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmGestion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmListaRubro = new javax.swing.JMenuItem();
        jmListaNombre = new javax.swing.JMenuItem();
        jmListaPrecio = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabajo Practico Nro6");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        jMenu1.setText("Administracion");

        jmGestion.setText("Producto");
        jmGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGestionActionPerformed(evt);
            }
        });
        jMenu1.add(jmGestion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");

        jmListaRubro.setText("Por Rubro");
        jmListaRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListaRubroActionPerformed(evt);
            }
        });
        jMenu2.add(jmListaRubro);

        jmListaNombre.setText("Por Nombre");
        jmListaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListaNombreActionPerformed(evt);
            }
        });
        jMenu2.add(jmListaNombre);

        jmListaPrecio.setText("Por Precio");
        jmListaPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListaPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(jmListaPrecio);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //EVENTO HACER CLICK en GESTION de PRODUCTO.
    private void jmGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGestionActionPerformed
        Gestion producto=new Gestion(listaProd);
        escritorio.removeAll();
        escritorio.repaint();
        escritorio.add(producto);
        producto.toFront();
        producto.setVisible(true);
      
    }//GEN-LAST:event_jmGestionActionPerformed

    //EVENTO HACER CLICK en CONSULTA POR PRECIO
    private void jmListaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListaPrecioActionPerformed
        ListaPrecio lista=new ListaPrecio();
        escritorio.removeAll();
        escritorio.repaint();
        escritorio.add(lista);
        lista.toFront();
        lista.setVisible(true);
    }//GEN-LAST:event_jmListaPrecioActionPerformed

    //EVENTO HACER CLICK en CONSULTA POR RUBRO
    private void jmListaRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListaRubroActionPerformed
        PorRubro lista=new PorRubro(listaProd);
        escritorio.removeAll();
        escritorio.repaint();
        escritorio.add(lista);
        lista.toFront();
        lista.setVisible(true); 
    }//GEN-LAST:event_jmListaRubroActionPerformed

    //EVENTO HACER CLICK en CONSULTA POR NOMBRE
    private void jmListaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListaNombreActionPerformed
        PorNombre lista=new PorNombre(listaProd);
        escritorio.removeAll();
        escritorio.repaint();
        escritorio.add(lista);
        lista.toFront();
        lista.setVisible(true);         
    }//GEN-LAST:event_jmListaNombreActionPerformed


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
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
          
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new General().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem jmGestion;
    private javax.swing.JMenuItem jmListaNombre;
    private javax.swing.JMenuItem jmListaPrecio;
    private javax.swing.JMenuItem jmListaRubro;
    // End of variables declaration//GEN-END:variables
}
