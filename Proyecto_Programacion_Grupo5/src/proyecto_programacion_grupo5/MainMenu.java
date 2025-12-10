/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_programacion_grupo5;

public class MainMenu extends javax.swing.JFrame {
    

    public MainMenu() {
        initComponents();
        setTitle("Menú Principal - Empresa");
        setLocationRelativeTo(null);

        jButton1.addActionListener(e -> abrirCine());
        jButton2.addActionListener(e -> abrirGym());
        jButton3.addActionListener(e -> abrirClases());
        jButton4.addActionListener(e -> abrirCafeteria());
        jButton5.addActionListener(e -> abrirEmpleados());
        jButton6.addActionListener(e -> salir());
        
        
    }
    
    //Son los metodos para abrir cada subMenu de las clases
    private void abrirCine() { 
        CineFrame cine = new CineFrame();
        cine.setVisible(true);
        this.dispose();
    } 
    private void abrirGym() { 
        new GimnasioFrame().setVisible(true);
        this.dispose();
    }
    private void abrirClases() { 
        ClasesFrame clases = new ClasesFrame();
        clases.setVisible(true);
        this.dispose(); // opcional, si querés cerrar el menú al entrar 
    }
    private void abrirCafeteria() { 
        CafeteriaFrame cafeteria = new CafeteriaFrame();
        cafeteria.setVisible(true);
        cafeteria.setLocationRelativeTo(null);
        this.setVisible(false);
        
    
    }
    private void abrirEmpleados() { System.out.println("Abrir empleados..."); 
    }
    private void salir() { System.exit(0); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Cine");
        jButton1.setActionCommand("BtnCine");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 91, 88, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Gimnasio");
        jButton2.setActionCommand("BtnGym");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 132, 88, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Clases");
        jButton3.setActionCommand("BtnClases");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 173, 88, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Cafeteria");
        jButton4.setActionCommand("BtnCafeteria");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 214, 88, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("Empleados");
        jButton5.setActionCommand("BtnEmpleados");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 255, -1, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Salir");
        jButton6.setActionCommand("BtnSalir");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 296, 88, -1));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel2.setText("Menú Principal");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 6, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Bienvenido al sistema. ¿Que desea realizar?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 53, -1, -1));

        jLabel3.setBackground(new java.awt.Color(153, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo main menu.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -8, 460, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(() -> new MainMenu().setVisible(true));
        BaseDatos.cargarDatos();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
