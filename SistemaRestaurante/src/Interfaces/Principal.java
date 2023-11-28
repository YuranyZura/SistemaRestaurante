
package Interfaces;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    static String nombreA;

    public void enableVerCocina(boolean enabled) {
    verCocina.setEnabled(enabled);
}
    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idUser = new javax.swing.JTextField();
        passwordUser = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 2, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("EL FOGON");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 20, 260, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chef (1).png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 90, 120, 130);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 230, 80, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 270, 100, 30);
        jPanel1.add(idUser);
        idUser.setBounds(120, 230, 160, 30);
        jPanel1.add(passwordUser);
        passwordUser.setBounds(120, 270, 160, 30);

        btn_aceptar.setBackground(new java.awt.Color(153, 153, 153));
        btn_aceptar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_aceptar.setText("Aceptar");
        btn_aceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_aceptar);
        btn_aceptar.setBounds(140, 320, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Principale.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -20, 530, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
             String nom = idUser.getText();
        String pass = passwordUser.getText();

        if ((nom.equals("Administrador")) && (pass.equals("admin123"))) {
            nombreA = "Administrador";
            Opciones op = new Opciones();
            op.setVisible(true);
            op.setLocationRelativeTo(null);
            this.dispose();
            
        } else if ((nom.equals("Yurany")) && (pass.equals("123456"))) {
            nombreA = "Yurany";
            Opciones op = new Opciones();
            op.setVisible(true);
            op.setLocationRelativeTo(null);
            this.dispose();
            
            
        } else if ((nom.equals("Miguel")) && (pass.equals("miguel"))) {
            nombreA = "Miguel";
            Opciones op = new Opciones();
            op.setVisible(true);
            op.setLocationRelativeTo(null);
            this.dispose();
            
            
        } else if ((nom.equals("Profesor")) && (pass.equals("poli01"))) {
            nombreA = "Profesor";
            Opciones op = new Opciones();
            op.setVisible(true);
            op.setLocationRelativeTo(null);
            this.dispose();

        } else if ((nom.equals("Rosa")) && (pass.equals("rosa"))) {
            nombreA = "Rosa";
            Opciones op = new Opciones();
            op.setVisible(true);
            op.setLocationRelativeTo(null);
            this.dispose(); 
         
        } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos, verifique nuevamente.");
            } 
    }//GEN-LAST:event_btn_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JTextField idUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passwordUser;
    // End of variables declaration//GEN-END:variables

    private static class verCocina {

        private static void setEnabled(boolean enabled) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public verCocina() {
        }
    }
}
