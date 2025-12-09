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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cine");
        jButton1.setActionCommand("BtnCine");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Gimnasio");
        jButton2.setActionCommand("BtnGym");

        jButton3.setText("Clases");
        jButton3.setActionCommand("BtnClases");

        jButton4.setText("Cafeteria");
        jButton4.setActionCommand("BtnCafeteria");

        jButton5.setText("Empleados");
        jButton5.setActionCommand("BtnEmpleados");

        jButton6.setText("Salir");
        jButton6.setActionCommand("BtnSalir");

        jLabel2.setText("Menú Principal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
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
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
