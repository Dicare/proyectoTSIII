/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ts3.cliente.gui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JFrame;
import ts3.server.daos.UsuarioDAO;
import ts3.server.entidades.Mensaje;
import ts3.util.Constantes;

/**
 *
 * @author sjarc
 */
public class win_principal extends javax.swing.JFrame {

    /**
     * Creates new form FormularioPrincipal
     */
    public win_principal() {
        initComponents();
        setLocationRelativeTo(this);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        tab_mensajes = new javax.swing.JTabbedPane();
        pnl_entrada = new javax.swing.JPanel();
        btn_salirbandeja = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_destinatario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_asunto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa_Mensaje = new javax.swing.JTextArea();
        btn_enviar = new javax.swing.JButton();
        pnl_leidos = new javax.swing.JPanel();
        btn_salirleidos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_entrada = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_salirbandeja1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_salida = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btn_salirbandeja2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_salida1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Secure Mail");
        setMinimumSize(new java.awt.Dimension(450, 450));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(tab_mensajes.getPreferredSize());

        jPanel3.setBackground(new java.awt.Color(242, 242, 246));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 255));
        jLabel18.setText("S");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 255));
        jLabel19.setText("E");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 255));
        jLabel20.setText("C");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 255));
        jLabel21.setText("U");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 255));
        jLabel22.setText("R");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 255));
        jLabel23.setText("E");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 255));
        jLabel24.setText("M");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 255));
        jLabel25.setText("A");

        jLabel26.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 255));
        jLabel26.setText("I");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 153, 255));
        jLabel27.setText("L");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ts3/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel28)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab_mensajes.setBackground(new java.awt.Color(102, 102, 255));
        tab_mensajes.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tab_mensajes.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tab_mensajes.setAlignmentX(0.0F);
        tab_mensajes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tab_mensajes.setInheritsPopupMenu(true);
        tab_mensajes.setPreferredSize(new java.awt.Dimension(500, 350));

        pnl_entrada.setBackground(new java.awt.Color(242, 242, 246));

        btn_salirbandeja.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_salirbandeja.setForeground(new java.awt.Color(102, 102, 255));
        btn_salirbandeja.setText("Salir");
        btn_salirbandeja.setBorderPainted(false);
        btn_salirbandeja.setContentAreaFilled(false);
        btn_salirbandeja.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_salirbandejaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Mensaje Nuevo:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Para:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Asunto:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Mensaje:");

        txa_Mensaje.setColumns(20);
        txa_Mensaje.setRows(5);
        jScrollPane1.setViewportView(txa_Mensaje);

        btn_enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ts3/img/enviar.PNG"))); // NOI18N
        btn_enviar.setContentAreaFilled(false);
        btn_enviar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_entradaLayout = new javax.swing.GroupLayout(pnl_entrada);
        pnl_entrada.setLayout(pnl_entradaLayout);
        pnl_entradaLayout.setHorizontalGroup(
            pnl_entradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_entradaLayout.createSequentialGroup()
                .addGroup(pnl_entradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_entradaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(pnl_entradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(pnl_entradaLayout.createSequentialGroup()
                                .addGroup(pnl_entradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(pnl_entradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_destinatario)
                                    .addComponent(txt_asunto)))
                            .addGroup(pnl_entradaLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnl_entradaLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 635, Short.MAX_VALUE)
                                .addComponent(btn_enviar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_entradaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salirbandeja)))
                .addContainerGap())
        );
        pnl_entradaLayout.setVerticalGroup(
            pnl_entradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_entradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pnl_entradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_entradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_asunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(pnl_entradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_salirbandeja)
                .addContainerGap())
        );

        tab_mensajes.addTab("Redactar                 ", pnl_entrada);

        pnl_leidos.setBackground(new java.awt.Color(242, 242, 246));

        btn_salirleidos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_salirleidos.setForeground(new java.awt.Color(102, 102, 255));
        btn_salirleidos.setText("Salir");
        btn_salirleidos.setBorderPainted(false);
        btn_salirleidos.setContentAreaFilled(false);
        btn_salirleidos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_salirleidosActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Bandeja de Entrada:");

        jScrollPane2.setPreferredSize(new java.awt.Dimension(455, 420));

        tbl_entrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Enviado por:", "Mensaje", "Recibido el:"
            }
        ));
        tbl_entrada.setToolTipText("");
        tbl_entrada.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbl_entrada.setAutoscrolls(false);
        jScrollPane2.setViewportView(tbl_entrada);
        if (tbl_entrada.getColumnModel().getColumnCount() > 0)
        {
            tbl_entrada.getColumnModel().getColumn(0).setMinWidth(240);
            tbl_entrada.getColumnModel().getColumn(1).setMinWidth(894);
            tbl_entrada.getColumnModel().getColumn(2).setMinWidth(100);
        }

        javax.swing.GroupLayout pnl_leidosLayout = new javax.swing.GroupLayout(pnl_leidos);
        pnl_leidos.setLayout(pnl_leidosLayout);
        pnl_leidosLayout.setHorizontalGroup(
            pnl_leidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_leidosLayout.createSequentialGroup()
                .addGroup(pnl_leidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_leidosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salirleidos))
                    .addGroup(pnl_leidosLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(pnl_leidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_leidosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnl_leidosLayout.setVerticalGroup(
            pnl_leidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_leidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_salirleidos)
                .addContainerGap())
        );

        tab_mensajes.addTab("Bandeja de Entrada", pnl_leidos);

        jPanel2.setBackground(new java.awt.Color(242, 242, 246));

        btn_salirbandeja1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_salirbandeja1.setForeground(new java.awt.Color(102, 102, 255));
        btn_salirbandeja1.setText("Salir");
        btn_salirbandeja1.setBorderPainted(false);
        btn_salirbandeja1.setContentAreaFilled(false);
        btn_salirbandeja1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_salirbandeja1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setText("Bandeja de Salida:");

        tbl_salida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Enviado por:", "Mensaje", "Recibido el:"
            }
        ));
        tbl_salida.setToolTipText("");
        tbl_salida.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbl_salida.setAutoscrolls(false);
        jScrollPane3.setViewportView(tbl_salida);
        if (tbl_salida.getColumnModel().getColumnCount() > 0)
        {
            tbl_salida.getColumnModel().getColumn(0).setMinWidth(240);
            tbl_salida.getColumnModel().getColumn(1).setMinWidth(894);
            tbl_salida.getColumnModel().getColumn(2).setMinWidth(100);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salirbandeja1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_salirbandeja1)
                .addContainerGap())
        );

        tab_mensajes.addTab("Bandeja de Salida   ", jPanel2);

        jPanel4.setBackground(new java.awt.Color(242, 242, 246));

        btn_salirbandeja2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_salirbandeja2.setForeground(new java.awt.Color(102, 102, 255));
        btn_salirbandeja2.setText("Salir");
        btn_salirbandeja2.setBorderPainted(false);
        btn_salirbandeja2.setContentAreaFilled(false);
        btn_salirbandeja2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_salirbandeja2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Eliminados:");

        tbl_salida1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Enviado por:", "Mensaje", "Recibido el:"
            }
        ));
        tbl_salida1.setToolTipText("");
        tbl_salida1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbl_salida1.setAutoscrolls(false);
        jScrollPane4.setViewportView(tbl_salida1);
        if (tbl_salida1.getColumnModel().getColumnCount() > 0)
        {
            tbl_salida1.getColumnModel().getColumn(0).setMinWidth(240);
            tbl_salida1.getColumnModel().getColumn(1).setMinWidth(894);
            tbl_salida1.getColumnModel().getColumn(2).setMinWidth(100);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 698, Short.MAX_VALUE))
                            .addComponent(jScrollPane4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salirbandeja2)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_salirbandeja2)
                .addContainerGap())
        );

        tab_mensajes.addTab("Eliminados              ", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tab_mensajes, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                        .addGap(28, 28, 28))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab_mensajes, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirleidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirleidosActionPerformed
        win_login oWin_login = new win_login();
        oWin_login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_salirleidosActionPerformed

    private void btn_salirbandejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirbandejaActionPerformed
        win_login oWin_login = new win_login();
        oWin_login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_salirbandejaActionPerformed

    private void btn_salirbandeja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirbandeja1ActionPerformed
        win_login oWin_login = new win_login();
        oWin_login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_salirbandeja1ActionPerformed

    private void btn_salirbandeja2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirbandeja2ActionPerformed
        win_login oWin_login = new win_login();
        oWin_login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_salirbandeja2ActionPerformed

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        DateFormat dateFormat = new SimpleDateFormat(Constantes.FORMATO_FECHA);
        Date date = new Date();        
               
        UsuarioDAO.getInstance()
                .enviarMensaje(new Mensaje(date, 
                                           txa_Mensaje.getText(),
                                           Constantes.USUARIO_lOGEADO.getUserName(),
                                           new ArrayList<>(Arrays.asList(txt_destinatario.getText().trim().split(";")))
                                        ));
    }//GEN-LAST:event_btn_enviarActionPerformed

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
            java.util.logging.Logger.getLogger(win_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(win_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(win_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(win_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new win_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_salirbandeja;
    private javax.swing.JButton btn_salirbandeja1;
    private javax.swing.JButton btn_salirbandeja2;
    private javax.swing.JButton btn_salirleidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel pnl_entrada;
    private javax.swing.JPanel pnl_leidos;
    private javax.swing.JTabbedPane tab_mensajes;
    private javax.swing.JTable tbl_entrada;
    private javax.swing.JTable tbl_salida;
    private javax.swing.JTable tbl_salida1;
    private javax.swing.JTextArea txa_Mensaje;
    private javax.swing.JTextField txt_asunto;
    private javax.swing.JTextField txt_destinatario;
    // End of variables declaration//GEN-END:variables
}
