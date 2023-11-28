
package Interfaces;

import java.net.URL;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Opciones extends javax.swing.JFrame {

   

    public Opciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JFrame();
        jPanel = new javax.swing.JPanel();
        txt_pastas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_bandejaPaisa = new javax.swing.JLabel();
        BandejaPaisa = new javax.swing.JComboBox<>();
        txt_salteado = new javax.swing.JLabel();
        salteado = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BandejaFrijol = new javax.swing.JComboBox<>();
        txt_bandejaFrijol = new javax.swing.JLabel();
        Pastas = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        bebidaCant = new javax.swing.JComboBox<>();
        tiposBebidas = new javax.swing.JComboBox<>();
        btn_VolverOpciones = new javax.swing.JButton();
        btn_TerminarOrden = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_agua = new javax.swing.JLabel();
        Agua = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        StockIngredientes = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_verIngredientes = new javax.swing.JButton();
        btn_añadirIngredientes = new javax.swing.JButton();
        btn_eliminarIngredientes = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        nombreArchivo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fc = new javax.swing.JFileChooser();
        Mesero = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        verCocina = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_pastas.setForeground(new java.awt.Color(255, 255, 255));
        txt_pastas.setText("Pastas: $29.900");
        txt_pastas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel.add(txt_pastas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 130, -1));

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 2, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MENU");
        jPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 210, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bandeja-paisa.png"))); // NOI18N
        jPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        txt_bandejaPaisa.setForeground(new java.awt.Color(255, 255, 255));
        txt_bandejaPaisa.setText("Bandeja paisa: $30.000");
        txt_bandejaPaisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel.add(txt_bandejaPaisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 130, 20));

        BandejaPaisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jPanel.add(BandejaPaisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 50, 30));

        txt_salteado.setForeground(new java.awt.Color(255, 255, 255));
        txt_salteado.setText("Salteado: $25.000");
        txt_salteado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel.add(txt_salteado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 130, 20));

        salteado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jPanel.add(salteado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 50, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salteado.png"))); // NOI18N
        jPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bandejaFrijol.png"))); // NOI18N
        jPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        BandejaFrijol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jPanel.add(BandejaFrijol, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 50, 30));

        txt_bandejaFrijol.setForeground(new java.awt.Color(255, 255, 255));
        txt_bandejaFrijol.setText("Bandeja de frijol: $ 20.000");
        txt_bandejaFrijol.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel.add(txt_bandejaFrijol, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 490, 140, -1));

        Pastas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jPanel.add(Pastas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 50, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pasta (1).png"))); // NOI18N
        jPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, -1, -1));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limonada.png"))); // NOI18N
        jPanel.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        bebidaCant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        bebidaCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bebidaCantActionPerformed(evt);
            }
        });
        jPanel.add(bebidaCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 50, 30));

        tiposBebidas.setBackground(new java.awt.Color(51, 51, 51));
        tiposBebidas.setForeground(new java.awt.Color(255, 255, 255));
        tiposBebidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Limonada: $ 3.000", "jugo: $ 5.000" }));
        tiposBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiposBebidasActionPerformed(evt);
            }
        });
        jPanel.add(tiposBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 140, -1));

        btn_VolverOpciones.setBackground(new java.awt.Color(153, 153, 153));
        btn_VolverOpciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_VolverOpciones.setText("Volver a opciones");
        btn_VolverOpciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_VolverOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverOpcionesActionPerformed(evt);
            }
        });
        jPanel.add(btn_VolverOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 650, 140, 40));

        btn_TerminarOrden.setBackground(new java.awt.Color(153, 153, 153));
        btn_TerminarOrden.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_TerminarOrden.setText("Terminar orden");
        btn_TerminarOrden.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_TerminarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TerminarOrdenActionPerformed(evt);
            }
        });
        jPanel.add(btn_TerminarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, 140, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agua.png"))); // NOI18N
        jPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        txt_agua.setForeground(new java.awt.Color(255, 255, 255));
        txt_agua.setText("Agua: $ 1.500");
        txt_agua.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel.add(txt_agua, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 130, -1));

        Agua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jPanel.add(Agua, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu2.jpg"))); // NOI18N
        jPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu.getContentPane());
        Menu.getContentPane().setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
            .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(null);

        btn_verIngredientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_verIngredientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_verIngredientes.setText("Ver ingredientes");
        btn_verIngredientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_verIngredientes.setContentAreaFilled(false);
        btn_verIngredientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_verIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verIngredientesActionPerformed(evt);
            }
        });
        jPanel2.add(btn_verIngredientes);
        btn_verIngredientes.setBounds(350, 80, 200, 50);

        btn_añadirIngredientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_añadirIngredientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_añadirIngredientes.setText("Añadir ingredientes");
        btn_añadirIngredientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_añadirIngredientes.setContentAreaFilled(false);
        btn_añadirIngredientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_añadirIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirIngredientesActionPerformed(evt);
            }
        });
        jPanel2.add(btn_añadirIngredientes);
        btn_añadirIngredientes.setBounds(350, 150, 200, 50);

        btn_eliminarIngredientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_eliminarIngredientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminarIngredientes.setText("Eliminar ingredientes");
        btn_eliminarIngredientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_eliminarIngredientes.setContentAreaFilled(false);
        btn_eliminarIngredientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_eliminarIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarIngredientesActionPerformed(evt);
            }
        });
        jPanel2.add(btn_eliminarIngredientes);
        btn_eliminarIngredientes.setBounds(350, 230, 200, 50);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Archivo:");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(30, 20, 90, 20);

        nombreArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreArchivoActionPerformed(evt);
            }
        });
        jPanel2.add(nombreArchivo);
        nombreArchivo.setBounds(110, 20, 220, 30);

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "INGREDIENTE", "CANTIDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 0));
        jScrollPane3.setViewportView(jTable1);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(30, 70, 300, 230);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras (2).png"))); // NOI18N
        jButton1.setText("Atras");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jButton1);
        jButton1.setBounds(390, 310, 120, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 560, 380);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout StockIngredientesLayout = new javax.swing.GroupLayout(StockIngredientes.getContentPane());
        StockIngredientes.getContentPane().setLayout(StockIngredientesLayout);
        StockIngredientesLayout.setHorizontalGroup(
            StockIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        StockIngredientesLayout.setVerticalGroup(
            StockIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setLayout(null);

        jLabel8.setText("jLabel8");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 10, 37, 16);

        javax.swing.GroupLayout MeseroLayout = new javax.swing.GroupLayout(Mesero.getContentPane());
        Mesero.getContentPane().setLayout(MeseroLayout);
        MeseroLayout.setHorizontalGroup(
            MeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MeseroLayout.setVerticalGroup(
            MeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MeseroLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(102, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verCocina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chef (3).png"))); // NOI18N
        verCocina.setContentAreaFilled(false);
        verCocina.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verCocinaMouseMoved(evt);
            }
        });
        jPanel4.add(verCocina, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 130, 130));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu (1).png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checklist (1).png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/electronic-ticket.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jButton6.setText("jButton6");
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jButton7.setText("jButton7");
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jButton8.setBackground(new java.awt.Color(153, 153, 153));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras (2).png"))); // NOI18N
        jButton8.setText("Atras");
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int contador = 0;
    int suma = 0;
    private void tiposBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiposBebidasActionPerformed
          if (tiposBebidas.getSelectedIndex() == 0) {
            String icon = "/Imgenes/limonada.png";
            URL url = this.getClass().getResource(icon);
            ImageIcon icono = new ImageIcon(url);

            imagen.setIcon(icono);
        } else if (tiposBebidas.getSelectedIndex() == 1) {
            String icon = "/Imgenes/jugo.png";
            URL url = this.getClass().getResource(icon);
            ImageIcon icono = new ImageIcon(url);

            imagen.setIcon(icono);
        }
    }//GEN-LAST:event_tiposBebidasActionPerformed

    private void btn_TerminarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TerminarOrdenActionPerformed
               //AÑADIMOS PLATOS PEDIDOS EN MENU A TABLA DE PEDIDO        
// Comprobar si es mayor que 0 para agregarlos a tabla de pedido
        DefaultTableModel model = (DefaultTableModel) datosTable.getModel();

        if (BandejaPaisa.getSelectedIndex() > 0) {
            String x = txt_bandejaPaisa.getText();
            String[] y;
            y = x.split(":");

            model.addRow(new Object[]{y[0], y[1], BandejaPaisa.getSelectedIndex()});
        }

        if (salteado.getSelectedIndex() > 0) {
            String x = txt_salteado.getText();
            String[] y;
            y = x.split(":");
            model.addRow(new Object[]{y[0], y[1], salteado.getSelectedIndex()});
        }
        if (BandejaFrijol.getSelectedIndex() > 0) {
            String x = txt_bandejaFrijol.getText();
            String[] y;
            y = x.split(":");

            model.addRow(new Object[]{y[0], y[1], BandejaFrijol.getSelectedIndex()});
        }
        if (Pastas.getSelectedIndex() > 0) {
            String x = txt_pastas.getText();
            String[] y;
            y = x.split(":");

            model.addRow(new Object[]{y[0], y[1], Pastas.getSelectedIndex()});
        }
        if (Agua.getSelectedIndex() > 0) {
            String x = txt_agua.getText();
            String[] y;
            y = x.split(":");

            model.addRow(new Object[]{y[0], y[1], Agua.getSelectedIndex()});

        }
        if (bebidaCant.getSelectedIndex() > 0) {
            String x = (String) tiposBebidas.getSelectedItem();
            String[] y;
            y = x.split(":");

            model.addRow(new Object[]{y[0], y[1], bebidaCant.getSelectedIndex()});
        }

        Pedido.setVisible(true);
        Menu.dispose();

    }//GEN-LAST:event_btn_TerminarOrdenActionPerformed

    private void bebidaCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bebidaCantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bebidaCantActionPerformed

    private void btn_VolverOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverOpcionesActionPerformed
        jPanel.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btn_VolverOpcionesActionPerformed

    private void btn_verIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verIngredientesActionPerformed
        //STOCK INGREDIENTES ARCHIVO
        // Agregar filtro a FileChooser
        FileNameExtensionFilter filter
        = new FileNameExtensionFilter("Archivos.txt", "txt", "texto");
        fc.setFileFilter(filter);

        // Mostrar el FileChooser
        int opcion = fc.showOpenDialog(this);

        // Si el usuario escogió abrir
        if (opcion == JFileChooser.APPROVE_OPTION) {
            // Asignar archivo y nombre.
            archivo = fc.getSelectedFile();
            nombreArchivo.setText(archivo.getAbsolutePath());

            // Tomar el modelo de la tabla
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            try (Scanner lector = new Scanner(archivo)) {
                // Mientras el archivo tenga otra línea.
                while (lector.hasNextLine()) {
                    // Pedir la linea
                    String linea = lector.nextLine();

                    // Separar los datos
                    String[] datos = linea.split(" ");

                    // Convertir los datos
                    String ingrediente = datos[0];
                    int cantidad = Integer.parseInt(datos[1]);

                    // Agregamos datos a la tabla
                    model.addRow(new Object[]{ingrediente, cantidad});

                }
            } catch (FileNotFoundException ex) {
                mostrarError("Archivo no existe", "No se pudo encontrar el archivo");
            } catch (NullPointerException ex) {
                mostrarError("Formato equivocado", "El archivo no tiene el formato correcto");
                limpiarTabla(jTable1);
            }
        }
    }//GEN-LAST:event_btn_verIngredientesActionPerformed

    private void btn_añadirIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirIngredientesActionPerformed
        AñadirProd.setVisible(true);
        AñadirProd.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_añadirIngredientesActionPerformed

    private void btn_eliminarIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarIngredientesActionPerformed
    // Hallar fila
    int fila = jTable1.getSelectedRow();

    // Tomar modelo de la tabla
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    // Eliminar fila
    model.removeRow(fila);
    }//GEN-LAST:event_btn_eliminarIngredientesActionPerformed

    private void nombreArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreArchivoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void verCocinaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verCocinaMouseMoved
        verCocina.setToolTipText("*ACCEDER A COCINA/STOCK");
    }//GEN-LAST:event_verCocinaMouseMoved

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
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Agua;
    private javax.swing.JComboBox<String> BandejaFrijol;
    private javax.swing.JComboBox<String> BandejaPaisa;
    private javax.swing.JFrame Menu;
    private javax.swing.JFrame Mesero;
    private javax.swing.JComboBox<String> Pastas;
    private javax.swing.JFrame StockIngredientes;
    private javax.swing.JComboBox<String> bebidaCant;
    private javax.swing.JButton btn_TerminarOrden;
    private javax.swing.JButton btn_VolverOpciones;
    private javax.swing.JButton btn_añadirIngredientes;
    private javax.swing.JButton btn_eliminarIngredientes;
    private javax.swing.JButton btn_verIngredientes;
    private javax.swing.JFileChooser fc;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombreArchivo;
    private javax.swing.JComboBox<String> salteado;
    private javax.swing.JComboBox<String> tiposBebidas;
    private javax.swing.JLabel txt_agua;
    private javax.swing.JLabel txt_bandejaFrijol;
    private javax.swing.JLabel txt_bandejaPaisa;
    private javax.swing.JLabel txt_pastas;
    private javax.swing.JLabel txt_salteado;
    private javax.swing.JButton verCocina;
    // End of variables declaration//GEN-END:variables
}
