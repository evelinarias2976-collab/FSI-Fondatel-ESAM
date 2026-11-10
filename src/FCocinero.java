
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author eveli
 */
public class FCocinero extends javax.swing.JFrame {

    Conexion cnx = new Conexion();
    
    public FCocinero() {
        initComponents();
        setLocationRelativeTo(null);
        
        if (cnx.conectar("localhost", "fondatel", "root", "") == 1) {
        } else {
            JOptionPane.showMessageDialog(this, "Sin conexión. La ventana se cerrará...");
            System.exit(0);
        }
    }

    public FCocinero(String nombre) {
    this();
    LUsuario.setText("Usuario: " + nombre);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LUsuario = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel5 = new javax.swing.JPanel();
        BTodo = new javax.swing.JToggleButton();
        BPromedio = new javax.swing.JToggleButton();
        BMaxMin = new javax.swing.JToggleButton();
        BHoy = new javax.swing.JToggleButton();
        B4 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SFechaIni = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        SFechaFin = new javax.swing.JSpinner();
        BBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        CBEstacion = new javax.swing.JComboBox();
        BFiltrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TMediciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Ventana de Cocinero");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Consulta de Mediciones Metereológicas");

        LUsuario.setBackground(new java.awt.Color(255, 255, 255));
        LUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LUsuario.setText("Usuario:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(LUsuario))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jToolBar1.setRollover(true);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultas Predefinidas"));
        jPanel5.setMaximumSize(new java.awt.Dimension(600, 100));
        jPanel5.setMinimumSize(new java.awt.Dimension(600, 100));
        jPanel5.setPreferredSize(new java.awt.Dimension(600, 100));
        jPanel5.setLayout(new java.awt.GridLayout());

        BTodo.setText("TODO");
        BTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTodoActionPerformed(evt);
            }
        });
        jPanel5.add(BTodo);

        BPromedio.setText("PROMEDIO");
        BPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPromedioActionPerformed(evt);
            }
        });
        jPanel5.add(BPromedio);

        BMaxMin.setText("MAX-MIN");
        BMaxMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMaxMinActionPerformed(evt);
            }
        });
        jPanel5.add(BMaxMin);

        BHoy.setText("HOY");
        BHoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHoyActionPerformed(evt);
            }
        });
        jPanel5.add(BHoy);
        jPanel5.add(B4);

        jToolBar1.add(jPanel5);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Periodo de Tiempo"));
        jPanel2.setMaximumSize(new java.awt.Dimension(400, 100));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 100));

        jLabel2.setText("DEL");
        jLabel2.setMaximumSize(new java.awt.Dimension(50, 40));
        jLabel2.setMinimumSize(new java.awt.Dimension(50, 40));
        jLabel2.setPreferredSize(new java.awt.Dimension(114, 50));

        SFechaIni.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1767287760000L), new java.util.Date(1767287760000L), new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));
        SFechaIni.setMaximumSize(new java.awt.Dimension(114, 50));
        SFechaIni.setMinimumSize(new java.awt.Dimension(114, 50));
        SFechaIni.setPreferredSize(new java.awt.Dimension(114, 50));

        jLabel3.setText("AL");
        jLabel3.setMaximumSize(new java.awt.Dimension(50, 40));
        jLabel3.setMinimumSize(new java.awt.Dimension(50, 40));
        jLabel3.setPreferredSize(new java.awt.Dimension(114, 50));

        SFechaFin.setModel(new javax.swing.SpinnerDateModel());
        SFechaFin.setPreferredSize(new java.awt.Dimension(114, 50));

        BBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BBuscar.setPreferredSize(new java.awt.Dimension(114, 50));
        BBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(SFechaFin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SFechaIni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jToolBar1.add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Estación"));
        jPanel3.setMaximumSize(new java.awt.Dimension(252, 100));
        jPanel3.setMinimumSize(new java.awt.Dimension(252, 100));

        CBEstacion.setMinimumSize(new java.awt.Dimension(100, 50));
        CBEstacion.setPreferredSize(new java.awt.Dimension(0, 50));

        BFiltrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BFiltrar.setPreferredSize(new java.awt.Dimension(0, 50));
        BFiltrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(CBEstacion, 0, 172, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CBEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(BFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jToolBar1.add(jPanel3);

        TMediciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TMediciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1270, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTodoActionPerformed

    }//GEN-LAST:event_BTodoActionPerformed

    private void BPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPromedioActionPerformed

    }//GEN-LAST:event_BPromedioActionPerformed

    private void BMaxMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMaxMinActionPerformed

    }//GEN-LAST:event_BMaxMinActionPerformed

    private void BHoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHoyActionPerformed

    }//GEN-LAST:event_BHoyActionPerformed

    private void BBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarActionPerformed

    }//GEN-LAST:event_BBuscarActionPerformed

    private void BFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFiltrarActionPerformed

    }//GEN-LAST:event_BFiltrarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FCocinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCocinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCocinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCocinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCocinero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton B4;
    private javax.swing.JButton BBuscar;
    private javax.swing.JButton BFiltrar;
    private javax.swing.JToggleButton BHoy;
    private javax.swing.JToggleButton BMaxMin;
    private javax.swing.JToggleButton BPromedio;
    private javax.swing.JToggleButton BTodo;
    private javax.swing.JComboBox CBEstacion;
    private javax.swing.JLabel LUsuario;
    private javax.swing.JSpinner SFechaFin;
    private javax.swing.JSpinner SFechaIni;
    private javax.swing.JTable TMediciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
