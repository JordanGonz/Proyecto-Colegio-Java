package Interfaces;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagen/123.jpg"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuRegistro = new javax.swing.JMenuItem();
        MenuProducto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1257, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 836, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(null);

        jMenu1.setBorder(null);
        jMenu1.setForeground(new java.awt.Color(0, 153, 102));
        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        MenuRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/thefreeforty_register_icon-icons.com_66338.png"))); // NOI18N
        MenuRegistro.setText("Estudiante");
        MenuRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistroActionPerformed(evt);
            }
        });
        jMenu1.add(MenuRegistro);

        MenuProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/thefreeforty_register_icon-icons.com_66338.png"))); // NOI18N
        MenuProducto.setText("Profesor");
        MenuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProductoActionPerformed(evt);
            }
        });
        jMenu1.add(MenuProducto);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 102, 102));
        jMenu2.setBorder(null);
        jMenu2.setText("Acerca De");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/hola_black_logo_icon_147123.png"))); // NOI18N
        jMenuItem3.setText("Ventana Proyecto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

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
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistroActionPerformed
        RegistroESTUDIANTE obj = new RegistroESTUDIANTE();
        escritorio.add(obj);
        obj.setVisible(true);
      
       // MenuProducto.setEnabled(false);
      
        
    }//GEN-LAST:event_MenuRegistroActionPerformed

    private void MenuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProductoActionPerformed
      RegistroProfesor obj = new RegistroProfesor();
      escritorio.add(obj);
      obj.setVisible(true);
    //  MenuRegistro.setEnabled(false);
    
    }//GEN-LAST:event_MenuProductoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       AcercaDe obj= new AcercaDe();
       escritorio.add(obj);
       obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuProducto;
    private javax.swing.JMenuItem MenuRegistro;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
