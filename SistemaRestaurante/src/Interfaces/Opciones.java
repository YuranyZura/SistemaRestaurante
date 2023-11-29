
package Interfaces;

import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Opciones extends javax.swing.JFrame {

    File archivo;
    private BufferedWriter bw;
    Thread cronometro;

    public Opciones() {
        //HILO CRONOMETRO
        this.cronometro = new Thread() {
            @Override
            public void run() {
                int hor = 0, min = 0, seg = 0;
                for (;;) {
                    try {
                        //System.out.println(hor+":"+min+":"+seg);
                        seg++;
                        if (seg > 59) {
                            seg = 0;
                            min++;
                        }
                        if (min > 59) {
                            seg = 0;
                            min = 0;
                            hor++;
                        }
                        int cont = 0;
                        int filas = datosTable2.getRowCount();
                        if (seg == 10) {
                            int fila = datosTable2.getSelectedRow();
                            datosTable2.getSelectedRow();
                            DefaultTableModel model = (DefaultTableModel) datosTable2.getModel();
                            model.removeRow(fila);
                            dispose();
                            lblTime.resetKeyboardActions();
                            lblTime.setText(String.valueOf("0"));
                            seg = 0;
                            cont = cont + 1;
                        }
                        if (cont == filas) {
                            JOptionPane.showMessageDialog(null, "Pedido listo para entregar a la mesa.");
                            break;
                        }

                        lblTime.setText(hor + ":" + min + ":" + seg);
                        Thread.sleep(999);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };
        
        initComponents();
        this.setLocationRelativeTo(null);
        int totalisimo = 0;
        Pedido.setLocationRelativeTo(null);
        Cocina.setLocationRelativeTo(null);
        Factura.setLocationRelativeTo(null);

        //ESCRITURA DE PARRAFO EN UN LABEL
        fac.setText("<html><p>RESTAURANTE PITAKS </p><p>Colombia, Barranquilla</p><p>Teléfono: 30011111 - 31900000</p></html>");
        horario.setText("<html><p>Lunes a Sábado 9:00 a.m a 9:00 p.m </p><p> Domingos y Festivos 10:00 a.m a 8:00 p.m</p></html>");

        //PRODUCTOS
        ptr1 = new Nodo();
        ptr2 = null;

    }

    class Nodo {

        Nodo link;
        int numero;
    }

    class Nodo2 {

        Nodo2 link;
        int total;
        int mesa;
    }

    Nodo ptr1, ptr2;
    Nodo2 ptr3;

    Nodo agregarCola(Nodo ptr) {
        Nodo p = new Nodo();
        if (ptr == null) {
            ptr = p;
        } else {
            Nodo q = ptr;
            while (q.link != null) {
                q = q.link;
            }
            q.link = p;
        }
        return ptr;
    }

    Nodo agregarCola1(Nodo ptr, int num) {
        Nodo p = new Nodo();
        p.numero = num;
        if (ptr == null) {
            ptr = p;
        } else {
            Nodo q = ptr;
            while (q.link != null) {
                q = q.link;
            }
            q.link = p;
        }
        return ptr;

    }

    class NodoMesero {

        String nombre;
        int id;
        int mesero;
        String mesa;
        NodoMesero link;

    }
    NodoMesero ptr;

    private void GuardarInfoMesero(NodoMesero ptr) throws IOException {
        try (BufferedWriter bwr = new BufferedWriter(new FileWriter("Mesero.txt"))) {
            bwr.write("");

            NodoMesero p = ptr;

            while (p != null) {
                bwr.write(p.nombre + " " + p.id + " " + p.mesero + " " + p.mesa);
                p = p.link;
                bwr.newLine();
            }
        }
        bw.close();
    }

    NodoMesero agregarInfoMesero(NodoMesero ptr, String nom, int id, int mesero, String mesa) {
        NodoMesero p = new NodoMesero();
        p.nombre = nom;
        p.id = id;
        p.mesero = mesero;
        p.mesa = mesa;

        if (ptr == null) {
            ptr = p;
        } else {
            NodoMesero q = ptr;
            while (q.link != null) {
                q = q.link;
            }
            q.link = p;
        }
        return ptr;
    }

    File archivo2;

    void mostrarError(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(this,
                mensaje,
                titulo,
                JOptionPane.ERROR_MESSAGE);
    }

    void guardarArchivo() throws IOException {
        // Crear un nuevo escritor
        try (BufferedWriter bwr = new BufferedWriter(
                new FileWriter(archivo))) {
            // Hallamos el numero de filas
            int filas = datosTable.getRowCount();

            // Tomamos el modelo
            DefaultTableModel model = (DefaultTableModel) datosTable.getModel();

            for (int i = 0; i < filas; ++i) {
                Object ingrediente = model.getValueAt(i, 0);
                Object cantidad = model.getValueAt(i, 1);

                bwr.write(ingrediente + "," + cantidad);
                bwr.newLine();
            }
        }
    }

    void limpiarTabla(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
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
        btn_atras2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fc = new javax.swing.JFileChooser();
        Mesero = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        txt_identificacionMesero = new javax.swing.JTextField();
        numMesero = new javax.swing.JComboBox<>();
        mesasAsign = new javax.swing.JLabel();
        generar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Pedido = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        numMeserito = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        numMesa = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        datosTable = new javax.swing.JTable();
        btn_preparar = new javax.swing.JButton();
        btn_atras6 = new javax.swing.JButton();
        AñadirProd = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        nuevoProd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cantProdNuevo = new javax.swing.JTextField();
        btn_añadirProductos = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Cocina = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        datosTable2 = new javax.swing.JTable();
        btn_atras7 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        cocinar = new javax.swing.JButton();
        generaFact = new javax.swing.JButton();
        btn_otroPedido = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        verCocina = new javax.swing.JButton();
        verMenu = new javax.swing.JButton();
        doPedido = new javax.swing.JButton();
        verEstadisticas = new javax.swing.JButton();
        infoMeseros = new javax.swing.JButton();
        pagos = new javax.swing.JButton();
        btn_atras1 = new javax.swing.JButton();

        Menu.setTitle("MENU");
        Menu.setResizable(false);

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
        BandejaPaisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BandejaPaisaActionPerformed(evt);
            }
        });
        jPanel.add(BandejaPaisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 50, 30));

        txt_salteado.setForeground(new java.awt.Color(255, 255, 255));
        txt_salteado.setText("Salteado: $25.000");
        txt_salteado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel.add(txt_salteado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 130, 20));

        salteado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        salteado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salteadoActionPerformed(evt);
            }
        });
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
        Agua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AguaActionPerformed(evt);
            }
        });
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

        StockIngredientes.setTitle("INGREDIENTES");
        StockIngredientes.setResizable(false);

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

        btn_atras2.setBackground(new java.awt.Color(153, 153, 153));
        btn_atras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras (2).png"))); // NOI18N
        btn_atras2.setText("Atras");
        btn_atras2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_atras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_atras2);
        btn_atras2.setBounds(390, 310, 120, 40);

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

        Mesero.setTitle("INFORMACION MESERO");
        Mesero.setResizable(false);

        jPanel3.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(120, 30, 80, 30);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Asignacion de mesas:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(20, 160, 190, 25);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Identificacion:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(70, 70, 130, 25);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Numero de mesero:");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(30, 110, 170, 25);

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel3.add(nombre);
        nombre.setBounds(220, 40, 190, 22);

        txt_identificacionMesero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_identificacionMeseroKeyTyped(evt);
            }
        });
        jPanel3.add(txt_identificacionMesero);
        txt_identificacionMesero.setBounds(220, 80, 190, 22);

        numMesero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jPanel3.add(numMesero);
        numMesero.setBounds(220, 120, 40, 30);

        mesasAsign.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(mesasAsign);
        mesasAsign.setBounds(20, 200, 220, 80);

        generar.setBackground(new java.awt.Color(153, 153, 153));
        generar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        generar.setText("Generar");
        generar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });
        jPanel3.add(generar);
        generar.setBounds(270, 220, 100, 40);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(270, 310, 90, 40);

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras (2).png"))); // NOI18N
        jButton2.setText("Atras");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(59, 310, 80, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(0, -20, 560, 420);

        javax.swing.GroupLayout MeseroLayout = new javax.swing.GroupLayout(Mesero.getContentPane());
        Mesero.getContentPane().setLayout(MeseroLayout);
        MeseroLayout.setHorizontalGroup(
            MeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );
        MeseroLayout.setVerticalGroup(
            MeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        Pedido.setTitle("PEDIDOS");
        Pedido.setModal(true);
        Pedido.setResizable(false);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/preparacion.PNG"))); // NOI18N
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 50, 510, 340));

        jLabel18.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("El fogon");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Numero de mesero:");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        numMeserito.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numMeserito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1", "2", "3", "4", " " }));
        numMeserito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numMeseritoActionPerformed(evt);
            }
        });
        jPanel6.add(numMeserito, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Numero de mesa:");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        numMesa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        numMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numMesaActionPerformed(evt);
            }
        });
        jPanel6.add(numMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 110, 30));

        datosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Valor", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(datosTable);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 360, 160));

        btn_preparar.setBackground(new java.awt.Color(153, 153, 153));
        btn_preparar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_preparar.setText("Preparar");
        btn_preparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prepararActionPerformed(evt);
            }
        });
        jPanel6.add(btn_preparar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 100, 40));

        btn_atras6.setBackground(new java.awt.Color(153, 153, 153));
        btn_atras6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_atras6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras (2).png"))); // NOI18N
        btn_atras6.setText("atras");
        btn_atras6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras6ActionPerformed(evt);
            }
        });
        jPanel6.add(btn_atras6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, 30));

        javax.swing.GroupLayout PedidoLayout = new javax.swing.GroupLayout(Pedido.getContentPane());
        Pedido.getContentPane().setLayout(PedidoLayout);
        PedidoLayout.setHorizontalGroup(
            PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PedidoLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PedidoLayout.setVerticalGroup(
            PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        jPanel5.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nuevo producto");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(260, 80, 160, 30);

        nuevoProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nuevoProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nuevoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoProdActionPerformed(evt);
            }
        });
        nuevoProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nuevoProdKeyTyped(evt);
            }
        });
        jPanel5.add(nuevoProd);
        nuevoProd.setBounds(40, 80, 200, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cantidad");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(260, 140, 90, 20);

        cantProdNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cantProdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantProdNuevoActionPerformed(evt);
            }
        });
        cantProdNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantProdNuevoKeyTyped(evt);
            }
        });
        jPanel5.add(cantProdNuevo);
        cantProdNuevo.setBounds(40, 140, 200, 30);

        btn_añadirProductos.setBackground(new java.awt.Color(153, 153, 153));
        btn_añadirProductos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_añadirProductos.setText("Añadir");
        btn_añadirProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirProductosActionPerformed(evt);
            }
        });
        jPanel5.add(btn_añadirProductos);
        btn_añadirProductos.setBounds(180, 210, 100, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(0, 0, 460, 290);

        javax.swing.GroupLayout AñadirProdLayout = new javax.swing.GroupLayout(AñadirProd.getContentPane());
        AñadirProd.getContentPane().setLayout(AñadirProdLayout);
        AñadirProdLayout.setHorizontalGroup(
            AñadirProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );
        AñadirProdLayout.setVerticalGroup(
            AñadirProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(null);

        datosTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Mesa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(datosTable2);

        jPanel7.add(jScrollPane2);
        jScrollPane2.setBounds(60, 70, 290, 240);

        btn_atras7.setBackground(new java.awt.Color(153, 153, 153));
        btn_atras7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_atras7.setText("Atras");
        btn_atras7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras7ActionPerformed(evt);
            }
        });
        jPanel7.add(btn_atras7);
        btn_atras7.setBounds(60, 340, 100, 40);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Pedidos:");
        jPanel7.add(jLabel22);
        jLabel22.setBounds(60, 40, 90, 20);

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("00:00:00");
        lblTime.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.add(lblTime);
        lblTime.setBounds(410, 80, 160, 50);

        cocinar.setBackground(new java.awt.Color(204, 204, 204));
        cocinar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cocinar.setText("Cocinar");
        cocinar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cocinar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cocinarMouseMoved(evt);
            }
        });
        cocinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocinarActionPerformed(evt);
            }
        });
        jPanel7.add(cocinar);
        cocinar.setBounds(410, 160, 160, 40);

        generaFact.setBackground(new java.awt.Color(204, 204, 204));
        generaFact.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        generaFact.setText("Generar factura");
        generaFact.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        generaFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generaFactActionPerformed(evt);
            }
        });
        jPanel7.add(generaFact);
        generaFact.setBounds(410, 210, 160, 40);

        btn_otroPedido.setBackground(new java.awt.Color(204, 204, 204));
        btn_otroPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_otroPedido.setText("Registrar otro pedido");
        btn_otroPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_otroPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_otroPedidoActionPerformed(evt);
            }
        });
        jPanel7.add(btn_otroPedido);
        btn_otroPedido.setBounds(410, 260, 160, 40);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        jPanel7.add(jLabel21);
        jLabel21.setBounds(80, 20, 563, 370);

        javax.swing.GroupLayout CocinaLayout = new javax.swing.GroupLayout(Cocina.getContentPane());
        Cocina.getContentPane().setLayout(CocinaLayout);
        CocinaLayout.setHorizontalGroup(
            CocinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        CocinaLayout.setVerticalGroup(
            CocinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
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
        verCocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCocinaActionPerformed(evt);
            }
        });
        jPanel4.add(verCocina, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 130, 130));

        verMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu (1).png"))); // NOI18N
        verMenu.setContentAreaFilled(false);
        verMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verMenuMouseMoved(evt);
            }
        });
        verMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verMenuActionPerformed(evt);
            }
        });
        jPanel4.add(verMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        doPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checklist (1).png"))); // NOI18N
        doPedido.setContentAreaFilled(false);
        doPedido.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                doPedidoMouseMoved(evt);
            }
        });
        doPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doPedidoActionPerformed(evt);
            }
        });
        jPanel4.add(doPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        verEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/electronic-ticket.png"))); // NOI18N
        verEstadisticas.setContentAreaFilled(false);
        verEstadisticas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verEstadisticasMouseMoved(evt);
            }
        });
        verEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verEstadisticasActionPerformed(evt);
            }
        });
        jPanel4.add(verEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        infoMeseros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/waiter (2).png"))); // NOI18N
        infoMeseros.setContentAreaFilled(false);
        infoMeseros.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                infoMeserosMouseMoved(evt);
            }
        });
        infoMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoMeserosActionPerformed(evt);
            }
        });
        jPanel4.add(infoMeseros, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        pagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/money.png"))); // NOI18N
        pagos.setContentAreaFilled(false);
        pagos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pagosMouseMoved(evt);
            }
        });
        pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagosActionPerformed(evt);
            }
        });
        jPanel4.add(pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        btn_atras1.setBackground(new java.awt.Color(102, 102, 102));
        btn_atras1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_atras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras (2).png"))); // NOI18N
        btn_atras1.setText("Atras");
        jPanel4.add(btn_atras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
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

    private void doPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doPedidoActionPerformed
        Pedido.setVisible(true);
        Pedido.setLocationRelativeTo(null);
    }//GEN-LAST:event_doPedidoActionPerformed

    private void verEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEstadisticasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verEstadisticasActionPerformed

    private void verCocinaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verCocinaMouseMoved
        verCocina.setToolTipText("*Acceder a cocina");
    }//GEN-LAST:event_verCocinaMouseMoved

    private void verCocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCocinaActionPerformed
        StockIngredientes.setVisible(true);
        this.dispose();
        StockIngredientes.setLocationRelativeTo(null);
    }//GEN-LAST:event_verCocinaActionPerformed

    private void btn_atras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras2ActionPerformed
        StockIngredientes.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btn_atras2ActionPerformed

    private void btn_añadirProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirProductosActionPerformed
        //Aañade ingredientes a tabla Stock Ingredientes

        // Tomar el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String name = nuevoProd.getText();
        int cantidad = Integer.parseInt(cantProdNuevo.getText());

        model.addRow(new Object[]{name, cantidad});

        if (!name.isEmpty()) {
            if (cantidad != 0) {
                JOptionPane.showMessageDialog(null, "Ingrediente se ha añadido satisfactoriamente.");
                AñadirProd.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se han ingresado datos.");
        }
    }//GEN-LAST:event_btn_añadirProductosActionPerformed

    private void verMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verMenuActionPerformed
        Menu.setVisible(true);
        Menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_verMenuActionPerformed

    private void infoMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoMeserosActionPerformed
        Mesero.setVisible(true);
        this.dispose();
        Mesero.setLocationRelativeTo(null);
    }//GEN-LAST:event_infoMeserosActionPerformed

    private void pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagosActionPerformed
        Factura.setVisible(true);
        Cocina.dispose();
    }//GEN-LAST:event_pagosActionPerformed

    private void infoMeserosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMeserosMouseMoved
        infoMeseros.setToolTipText("Acceder informacion de mesero");
    }//GEN-LAST:event_infoMeserosMouseMoved

    private void verMenuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMenuMouseMoved
        verMenu.setToolTipText("*Ver menu");
    }//GEN-LAST:event_verMenuMouseMoved

    private void doPedidoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doPedidoMouseMoved
        doPedido.setToolTipText("*Ingreso de pedidos");
    }//GEN-LAST:event_doPedidoMouseMoved

    private void verEstadisticasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verEstadisticasMouseMoved
        verEstadisticas.setToolTipText("*Verestadisticas");
    }//GEN-LAST:event_verEstadisticasMouseMoved

    private void pagosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagosMouseMoved
        pagos.setToolTipText("*Registrar pago");
    }//GEN-LAST:event_pagosMouseMoved

    private void cantProdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantProdNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantProdNuevoActionPerformed

    private void cantProdNuevoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantProdNuevoKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_cantProdNuevoKeyTyped

    private void nuevoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoProdActionPerformed

    private void nuevoProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoProdKeyTyped
        //Bloqueo de numeros en el textField
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && ((c < 'A') | c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_nuevoProdKeyTyped

    private void BandejaPaisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BandejaPaisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BandejaPaisaActionPerformed

    private void salteadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salteadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salteadoActionPerformed

    private void AguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AguaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //GUARDAMOS ARCHIVO DE MESEROS
        String n = nombre.getText();
        int i = Integer.parseInt(txt_identificacionMesero.getText());
        int mesero;
        mesero = numMesero.getSelectedIndex();
        mesero = mesero + 1;
        String mesa = mesasAsign.getText();

        NodoMesero p = new NodoMesero();
        ptr = agregarInfoMesero(ptr, n, i, mesero, mesa);
        String archivo1;
        archivo1 = "Mesero.txt";
        JOptionPane.showMessageDialog(null, "La informacion del mesero " + n + " se ha guardado en archivo");
        try {
            GuardarInfoMesero(ptr);

        } catch (IOException ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void txt_identificacionMeseroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_identificacionMeseroKeyTyped
        //Bloqueo de letras en textField
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_txt_identificacionMeseroKeyTyped

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
          //ASIGNAMOS A CADA MESERO UN NUMERO DE MESAS
        switch (numMesero.getSelectedIndex()) {
            case 0:
                mesasAsign.setText("Mesas 1 2 3 4 5");
                break;
            case 1:
                mesasAsign.setText("Mesas 6 7 8 9 10");
                break;
            case 2:
                mesasAsign.setText("Mesas 11 12 13 14 15");
                break;
            case 3:
                mesasAsign.setText("Mesas 16 17 18 19 20");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_generarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Mesero.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void numMeseritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numMeseritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numMeseritoActionPerformed

    private void numMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numMesaActionPerformed
        //Indice de mesa segun el mesero - comboBox de mesa
        if (numMeserito.getSelectedIndex() == 1) {
            if (numMesa.getSelectedIndex() > 5) {
                JOptionPane.showMessageDialog(null, "Numero de mesa invalido para mesero " + numMeserito.getSelectedIndex());
                numMesa.setSelectedIndex(0);
            }

        } else if (numMeserito.getSelectedIndex() == 2) {
            if (numMesa.getSelectedIndex() > 11 || numMesa.getSelectedIndex() < 6) {
                JOptionPane.showMessageDialog(null, "Numero de mesa invalido para mesero " + numMeserito.getSelectedIndex());
                numMesa.setSelectedIndex(0);
            }

        } else if (numMeserito.getSelectedIndex() == 3) {
            if (numMesa.getSelectedIndex() > 16 || numMesa.getSelectedIndex() < 11) {
                JOptionPane.showMessageDialog(null, "Numero de mesa invalido para mesero " + numMeserito.getSelectedIndex());
                numMesa.setSelectedIndex(0);

            }
        } else if (numMesa.getSelectedIndex() > 21 || numMesa.getSelectedIndex() < 15) {
            JOptionPane.showMessageDialog(null, "Numero de mesa invalido para mesero " + numMeserito.getSelectedIndex());
            numMesa.setSelectedIndex(0);
        }

    }//GEN-LAST:event_numMesaActionPerformed

    private void btn_prepararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prepararActionPerformed
        //Llena tabla de cocina
        
        DefaultTableModel model2 = (DefaultTableModel) datosTable2.getModel();

        if (BandejaPaisa.getSelectedIndex() > 0) {
            String x = txt_bandejaPaisa.getText();
            String[] y;
            y = x.split(":");
            if (numMesa.getSelectedIndex() >= 0) {
                model2.addRow(new Object[]{y[0], BandejaPaisa.getSelectedIndex(), numMesa.getSelectedIndex()});
            }
        }
        if (salteado.getSelectedIndex() > 0) {
            String x = txt_salteado.getText();
            String[] y;
            y = x.split(":");
            if (numMesa.getSelectedIndex() >= 0) {
                model2.addRow(new Object[]{y[0], salteado.getSelectedIndex(), numMesa.getSelectedIndex()});
            }

        }
        if (BandejaFrijol.getSelectedIndex() > 0) {
            String x = txt_bandejaFrijol.getText();
            String[] y;
            y = x.split(":");
            if (numMesa.getSelectedIndex() >= 0) {
                model2.addRow(new Object[]{y[0], BandejaFrijol.getSelectedIndex(), numMesa.getSelectedIndex()});
            }
        }
        if (Pastas.getSelectedIndex() > 0) {
            String x = txt_pastas.getText();
            String[] y;
            y = x.split(":");
            if (numMesa.getSelectedIndex() >= 0) {
                model2.addRow(new Object[]{y[0], Pastas.getSelectedIndex(), numMesa.getSelectedIndex()});
            }
        }
        if (Agua.getSelectedIndex() > 0) {
            String x = txt_agua.getText();
            String[] y;
            y = x.split(":");
            if (numMesa.getSelectedIndex() >= 0) {
                model2.addRow(new Object[]{y[0], Agua.getSelectedIndex(), numMesa.getSelectedIndex()});
            }
    }//GEN-LAST:event_btn_prepararActionPerformed
 if (bebidaCant.getSelectedIndex() > 0) {
            String x = (String) tiposBebidas.getSelectedItem();
            String[] y;
            y = x.split(":");
            if (numMesa.getSelectedIndex() >= 0) {
                model2.addRow(new Object[]{y[0], bebidaCant.getSelectedIndex(), numMesa.getSelectedIndex()});
            }
        }
        Cocina.setVisible(true);
        Pedido.setVisible(false);
    }  
    private void btn_atras6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras6ActionPerformed
        Pedido.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btn_atras6ActionPerformed

    private void cocinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cocinarActionPerformed
        int filas = datosTable2.getRowCount();
        cronometro.start();
    }//GEN-LAST:event_cocinarActionPerformed

    private void cocinarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cocinarMouseMoved
        cocinar.setToolTipText("Debe seleccionar un plato de la tabla para cocinar");
    }//GEN-LAST:event_cocinarMouseMoved

    private void generaFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generaFactActionPerformed
        int filas = datosTable2.getRowCount();
        
        emergente.setVisible(true);
        emergente.setLocationRelativeTo(null);
        Cocina.setVisible(false);
    }//GEN-LAST:event_generaFactActionPerformed

    private void btn_otroPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_otroPedidoActionPerformed

        //Reset valores de pedido tabla de pedidos
        limpiarTabla(datosTable);
        numMesa.setSelectedIndex(0);
        numMeserito.setSelectedIndex(0);
        Menu.setVisible(true);
        Cocina.setVisible(false);
        BandejaPaisa.setSelectedIndex(0);
        salteado.setSelectedIndex(0);
        BandejaFrijol.setSelectedIndex(0);
        Pastas.setSelectedIndex(0);
        Agua.setSelectedIndex(0);
        bebidaCant.setSelectedIndex(0);
       
    }//GEN-LAST:event_btn_otroPedidoActionPerformed

    private void btn_atras7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras7ActionPerformed
        Cocina.setVisible(false);
        Menu.setVisible(true);
    }//GEN-LAST:event_btn_atras7ActionPerformed
       
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
    javax.swing.JComboBox<String> Agua;
    javax.swing.JDialog AñadirProd;
    javax.swing.JComboBox<String> BandejaFrijol;
    javax.swing.JComboBox<String> BandejaPaisa;
    javax.swing.JDialog Cocina;
    javax.swing.JFrame Menu;
    javax.swing.JFrame Mesero;
    javax.swing.JComboBox<String> Pastas;
    javax.swing.JDialog Pedido;
    javax.swing.JFrame StockIngredientes;
    javax.swing.JComboBox<String> bebidaCant;
    javax.swing.JButton btn_TerminarOrden;
    javax.swing.JButton btn_VolverOpciones;
    javax.swing.JButton btn_atras1;
    javax.swing.JButton btn_atras2;
    javax.swing.JButton btn_atras6;
    javax.swing.JButton btn_atras7;
    javax.swing.JButton btn_añadirIngredientes;
    javax.swing.JButton btn_añadirProductos;
    javax.swing.JButton btn_eliminarIngredientes;
    javax.swing.JButton btn_otroPedido;
    javax.swing.JButton btn_preparar;
    javax.swing.JButton btn_verIngredientes;
    javax.swing.JTextField cantProdNuevo;
    javax.swing.JButton cocinar;
    javax.swing.JTable datosTable;
    javax.swing.JTable datosTable2;
    javax.swing.JButton doPedido;
    javax.swing.JFileChooser fc;
    javax.swing.JButton generaFact;
    javax.swing.JButton generar;
    javax.swing.JLabel imagen;
    javax.swing.JButton infoMeseros;
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel10;
    javax.swing.JLabel jLabel11;
    javax.swing.JLabel jLabel12;
    javax.swing.JLabel jLabel13;
    javax.swing.JLabel jLabel14;
    javax.swing.JLabel jLabel15;
    javax.swing.JLabel jLabel16;
    javax.swing.JLabel jLabel17;
    javax.swing.JLabel jLabel18;
    javax.swing.JLabel jLabel19;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel20;
    javax.swing.JLabel jLabel21;
    javax.swing.JLabel jLabel22;
    javax.swing.JLabel jLabel27;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JPanel jPanel;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JPanel jPanel4;
    javax.swing.JPanel jPanel5;
    javax.swing.JPanel jPanel6;
    javax.swing.JPanel jPanel7;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JScrollPane jScrollPane3;
    javax.swing.JTable jTable1;
    javax.swing.JLabel lblTime;
    javax.swing.JLabel mesasAsign;
    javax.swing.JTextField nombre;
    javax.swing.JTextField nombreArchivo;
    javax.swing.JTextField nuevoProd;
    javax.swing.JComboBox<String> numMesa;
    javax.swing.JComboBox<String> numMeserito;
    javax.swing.JComboBox<String> numMesero;
    javax.swing.JButton pagos;
    javax.swing.JComboBox<String> salteado;
    javax.swing.JComboBox<String> tiposBebidas;
    javax.swing.JLabel txt_agua;
    javax.swing.JLabel txt_bandejaFrijol;
    javax.swing.JLabel txt_bandejaPaisa;
    javax.swing.JTextField txt_identificacionMesero;
    javax.swing.JLabel txt_pastas;
    javax.swing.JLabel txt_salteado;
    javax.swing.JButton verCocina;
    javax.swing.JButton verEstadisticas;
    javax.swing.JButton verMenu;
    // End of variables declaration//GEN-END:variables
}


