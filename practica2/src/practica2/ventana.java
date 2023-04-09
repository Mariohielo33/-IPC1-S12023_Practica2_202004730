/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practica2;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.awt.Image;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import Imagenes.panel.reportepanel;
import Imagenes.panel.reportesform;
import java.awt.BorderLayout;

/**
 *
 * @author Pedro
 */
public class ventana extends javax.swing.JFrame{
private reportepanel repanel = new reportepanel();
private reportesform report = new reportesform();
Hilov hiloverde= new Hilov();
int iniciov, inicior,iniciorojo, inicioultima;
static boolean inicioHilo =true;
boolean corriendo = false;
hiloro hilorosa = new hiloro();
private JLabel label;
int valor1=0;
int contador1,contador2,contador3, contador4, contador5;
int valorvv,valorro,valorojo, valorfin, coni,contadorinventario,inventarioi,inventariof, contadorproduccion, produccioni, produccionf;
int contadorempaq, empaquetadoi, empaquetadof, contadorsalida, salidai, salidaf;
int rep1=0;
static int hora,minutos,segundos=0;
int Q1,Q2,Q3,Q4, totalQ;
    
    public ventana() {
        initComponents();
        this.setTitle("Reporte2");
        jPanel2.setVisible(false);
        this.setSize(1095, 1264);
        jLabel9.setText("00:00");
        SetImageLabel(jLabel15, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel16, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel17, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel18, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel19, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel20, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel21, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel22, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel23, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel24, "src/Imagenes/480px-Circulo_azul.png");
        
        SetImageLabel(jLabel25, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel26, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel27, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel28, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel29, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel30, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel31, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel32, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel33, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel34, "src/Imagenes/480px-Circulo_azul.png");
        
        SetImageLabel(jLabel35, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel36, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel37, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel38, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel39, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel40, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel41, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel42, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel43, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(jLabel44, "src/Imagenes/480px-Circulo_azul.png");
        SetImageLabel(cirama, "src/Imagenes/amarillo.png");
        SetImageLabel(v1, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v2, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v3, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v4, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v5, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v6, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v7, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v8, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v9, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v10, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v11, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v12, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v13, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v14, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v15, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v16, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v17, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v18, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v19, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v20, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v21, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v22, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v23, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v24, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v25, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v26, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v27, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v28, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v29, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(v30, "src/Imagenes/Circulo_verde.png");
        SetImageLabel(mora1, "src/Imagenes/morado.png");
        SetImageLabel(mora2, "src/Imagenes/morado.png");
        SetImageLabel(mora3, "src/Imagenes/morado.png");
        SetImageLabel(mora4, "src/Imagenes/morado.png");
        SetImageLabel(mora5, "src/Imagenes/morado.png");
        SetImageLabel(mora6, "src/Imagenes/morado.png");
        SetImageLabel(mora7, "src/Imagenes/morado.png");
        SetImageLabel(mora8, "src/Imagenes/morado.png");
        SetImageLabel(mora9, "src/Imagenes/morado.png");
        SetImageLabel(mora10, "src/Imagenes/morado.png");
        SetImageLabel(mora11, "src/Imagenes/morado.png");
        SetImageLabel(mora12, "src/Imagenes/morado.png");
        SetImageLabel(mora13, "src/Imagenes/morado.png");
        SetImageLabel(mora14, "src/Imagenes/morado.png");
        SetImageLabel(mora15, "src/Imagenes/morado.png");
        SetImageLabel(mora16, "src/Imagenes/morado.png");
        SetImageLabel(mora17, "src/Imagenes/morado.png");
        SetImageLabel(mora18, "src/Imagenes/morado.png");
        SetImageLabel(mora19, "src/Imagenes/morado.png");
        SetImageLabel(mora20, "src/Imagenes/morado.png");
        SetImageLabel(mora21, "src/Imagenes/morado.png");
        SetImageLabel(mora22, "src/Imagenes/morado.png");
        SetImageLabel(mora23, "src/Imagenes/morado.png");
        SetImageLabel(mora24, "src/Imagenes/morado.png");
        SetImageLabel(mora25, "src/Imagenes/morado.png");
        SetImageLabel(mora26, "src/Imagenes/morado.png");
        SetImageLabel(mora27, "src/Imagenes/morado.png");
        SetImageLabel(mora28, "src/Imagenes/morado.png");
        SetImageLabel(mora29, "src/Imagenes/morado.png");
        SetImageLabel(mora30, "src/Imagenes/morado.png");
        
        SetImageLabel(rojo1, "src/Imagenes/rojo.png");
        SetImageLabel(rojo2, "src/Imagenes/rojo.png");
        SetImageLabel(rojo3, "src/Imagenes/rojo.png");
        SetImageLabel(rojo4, "src/Imagenes/rojo.png");
        SetImageLabel(rojo5, "src/Imagenes/rojo.png");
        SetImageLabel(rojo6, "src/Imagenes/rojo.png");
        SetImageLabel(rojo7, "src/Imagenes/rojo.png");
        SetImageLabel(rojo8, "src/Imagenes/rojo.png");
        SetImageLabel(rojo9, "src/Imagenes/rojo.png");
        SetImageLabel(rojo10, "src/Imagenes/rojo.png");
        SetImageLabel(rojo11, "src/Imagenes/rojo.png");
        SetImageLabel(rojo12, "src/Imagenes/rojo.png");
        SetImageLabel(rojo13, "src/Imagenes/rojo.png");
        SetImageLabel(rojo14, "src/Imagenes/rojo.png");
        SetImageLabel(rojo15, "src/Imagenes/rojo.png");
        SetImageLabel(rojo16, "src/Imagenes/rojo.png");
        SetImageLabel(rojo17, "src/Imagenes/rojo.png");
        SetImageLabel(rojo18, "src/Imagenes/rojo.png");
        SetImageLabel(rojo19, "src/Imagenes/rojo.png");
        SetImageLabel(rojo20, "src/Imagenes/rojo.png");
        SetImageLabel(rojo21, "src/Imagenes/rojo.png");
        SetImageLabel(rojo22, "src/Imagenes/rojo.png");
        SetImageLabel(rojo23, "src/Imagenes/rojo.png");
        SetImageLabel(rojo24, "src/Imagenes/rojo.png");
        SetImageLabel(rojo25, "src/Imagenes/rojo.png");
        SetImageLabel(rojo26, "src/Imagenes/rojo.png");
        SetImageLabel(rojo27, "src/Imagenes/rojo.png");
        SetImageLabel(rojo28, "src/Imagenes/rojo.png");
        SetImageLabel(rojo29, "src/Imagenes/rojo.png");
        SetImageLabel(rojo30, "src/Imagenes/rojo.png");
        
        
        cirama.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel19.setVisible(false);       
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
        jLabel22.setVisible(false);
        jLabel23.setVisible(false);
        jLabel24.setVisible(false);
        jLabel25.setVisible(false);
        jLabel26.setVisible(false);
        jLabel27.setVisible(false);
        jLabel28.setVisible(false);
        jLabel29.setVisible(false);
        jLabel30.setVisible(false);
        jLabel31.setVisible(false);
        jLabel32.setVisible(false);
        jLabel33.setVisible(false);
        jLabel34.setVisible(false);
        jLabel35.setVisible(false);
        jLabel36.setVisible(false);
        jLabel37.setVisible(false);
        jLabel38.setVisible(false);
        jLabel39.setVisible(false);
        jLabel40.setVisible(false);
        jLabel41.setVisible(false);
        jLabel42.setVisible(false);
        jLabel43.setVisible(false);
        jLabel44.setVisible(false);
        
        v1.setVisible(false);
        v2.setVisible(false);
        v3.setVisible(false);
        v4.setVisible(false);
        v5.setVisible(false);       
        v6.setVisible(false);
        v7.setVisible(false);
        v8.setVisible(false);
        v9.setVisible(false);
        v10.setVisible(false);
        v11.setVisible(false);
        v12.setVisible(false);
        v13.setVisible(false);
        v14.setVisible(false);
        v15.setVisible(false);
        v16.setVisible(false);
        v17.setVisible(false);
        v18.setVisible(false);
        v19.setVisible(false);
        v20.setVisible(false);
        v21.setVisible(false);
        v22.setVisible(false);
        v23.setVisible(false);
        v24.setVisible(false);
        v25.setVisible(false);
        v26.setVisible(false);
        v27.setVisible(false);
        v28.setVisible(false);
        v29.setVisible(false);
        v30.setVisible(false);
        
        mora1.setVisible(false);
        mora2.setVisible(false);
        mora3.setVisible(false);
        mora4.setVisible(false);
        mora5.setVisible(false);
        mora6.setVisible(false);
        mora7.setVisible(false);
        mora8.setVisible(false);
        mora9.setVisible(false);
        mora10.setVisible(false);
        mora11.setVisible(false);
        mora12.setVisible(false);
        mora13.setVisible(false);
        mora14.setVisible(false);
        mora15.setVisible(false);
        mora16.setVisible(false);
        mora17.setVisible(false);
        mora18.setVisible(false);
        mora19.setVisible(false);
        mora20.setVisible(false);
        mora21.setVisible(false);
        mora22.setVisible(false);
        mora23.setVisible(false);
        mora24.setVisible(false);
        mora25.setVisible(false);
        mora26.setVisible(false);
        mora27.setVisible(false);
        mora28.setVisible(false);
        mora29.setVisible(false);
        mora30.setVisible(false);
        
                rojo1.setVisible(false);
        rojo2.setVisible(false);
        rojo3.setVisible(false);
        rojo4.setVisible(false);
        rojo5.setVisible(false);
        rojo6.setVisible(false);
        rojo7.setVisible(false);
        rojo8.setVisible(false);
        rojo9.setVisible(false);
       rojo10.setVisible(false);
        rojo11.setVisible(false);
        rojo12.setVisible(false);
        rojo13.setVisible(false);
        rojo14.setVisible(false);
        rojo15.setVisible(false);
        rojo16.setVisible(false);
        rojo17.setVisible(false);
        rojo18.setVisible(false);
        rojo19.setVisible(false);
        rojo20.setVisible(false);
        rojo21.setVisible(false);
        rojo22.setVisible(false);
        rojo23.setVisible(false);
        rojo24.setVisible(false);
        rojo25.setVisible(false);
        rojo26.setVisible(false);
        rojo27.setVisible(false);
        rojo28.setVisible(false);
        rojo29.setVisible(false);
        rojo30.setVisible(false);
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        invens = new javax.swing.JTextField();
        produs = new javax.swing.JTextField();
        empas = new javax.swing.JTextField();
        salis = new javax.swing.JTextField();
        invenqs = new javax.swing.JTextField();
        produqs = new javax.swing.JTextField();
        empaqs = new javax.swing.JTextField();
        saliqs = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        mora1 = new javax.swing.JLabel();
        mora2 = new javax.swing.JLabel();
        mora3 = new javax.swing.JLabel();
        mora4 = new javax.swing.JLabel();
        mora5 = new javax.swing.JLabel();
        mora6 = new javax.swing.JLabel();
        mora7 = new javax.swing.JLabel();
        mora8 = new javax.swing.JLabel();
        mora9 = new javax.swing.JLabel();
        mora10 = new javax.swing.JLabel();
        mora11 = new javax.swing.JLabel();
        mora12 = new javax.swing.JLabel();
        mora13 = new javax.swing.JLabel();
        mora14 = new javax.swing.JLabel();
        mora15 = new javax.swing.JLabel();
        mora16 = new javax.swing.JLabel();
        mora17 = new javax.swing.JLabel();
        mora18 = new javax.swing.JLabel();
        mora19 = new javax.swing.JLabel();
        mora20 = new javax.swing.JLabel();
        mora21 = new javax.swing.JLabel();
        mora22 = new javax.swing.JLabel();
        mora23 = new javax.swing.JLabel();
        mora24 = new javax.swing.JLabel();
        mora25 = new javax.swing.JLabel();
        mora26 = new javax.swing.JLabel();
        mora27 = new javax.swing.JLabel();
        mora28 = new javax.swing.JLabel();
        mora29 = new javax.swing.JLabel();
        mora30 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        rojo1 = new javax.swing.JLabel();
        rojo2 = new javax.swing.JLabel();
        rojo3 = new javax.swing.JLabel();
        rojo4 = new javax.swing.JLabel();
        rojo5 = new javax.swing.JLabel();
        rojo6 = new javax.swing.JLabel();
        rojo7 = new javax.swing.JLabel();
        rojo8 = new javax.swing.JLabel();
        rojo9 = new javax.swing.JLabel();
        rojo10 = new javax.swing.JLabel();
        rojo11 = new javax.swing.JLabel();
        rojo12 = new javax.swing.JLabel();
        rojo13 = new javax.swing.JLabel();
        rojo14 = new javax.swing.JLabel();
        rojo15 = new javax.swing.JLabel();
        rojo16 = new javax.swing.JLabel();
        rojo17 = new javax.swing.JLabel();
        rojo18 = new javax.swing.JLabel();
        rojo19 = new javax.swing.JLabel();
        rojo20 = new javax.swing.JLabel();
        rojo21 = new javax.swing.JLabel();
        rojo22 = new javax.swing.JLabel();
        rojo23 = new javax.swing.JLabel();
        rojo24 = new javax.swing.JLabel();
        rojo25 = new javax.swing.JLabel();
        rojo26 = new javax.swing.JLabel();
        rojo27 = new javax.swing.JLabel();
        rojo28 = new javax.swing.JLabel();
        rojo29 = new javax.swing.JLabel();
        rojo30 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        v1 = new javax.swing.JLabel();
        v2 = new javax.swing.JLabel();
        v3 = new javax.swing.JLabel();
        v4 = new javax.swing.JLabel();
        v5 = new javax.swing.JLabel();
        v6 = new javax.swing.JLabel();
        v7 = new javax.swing.JLabel();
        v8 = new javax.swing.JLabel();
        v9 = new javax.swing.JLabel();
        v10 = new javax.swing.JLabel();
        v11 = new javax.swing.JLabel();
        v12 = new javax.swing.JLabel();
        v13 = new javax.swing.JLabel();
        v14 = new javax.swing.JLabel();
        v15 = new javax.swing.JLabel();
        v16 = new javax.swing.JLabel();
        v17 = new javax.swing.JLabel();
        v18 = new javax.swing.JLabel();
        v19 = new javax.swing.JLabel();
        v20 = new javax.swing.JLabel();
        v21 = new javax.swing.JLabel();
        v22 = new javax.swing.JLabel();
        v23 = new javax.swing.JLabel();
        v24 = new javax.swing.JLabel();
        v25 = new javax.swing.JLabel();
        v26 = new javax.swing.JLabel();
        v27 = new javax.swing.JLabel();
        v28 = new javax.swing.JLabel();
        v29 = new javax.swing.JLabel();
        v30 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
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
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        cirama = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jLabel14 = new javax.swing.JLabel();
        finalcont = new javax.swing.JLabel();
        iniciocon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setText("Inventario");

        jLabel2.setText("Bienvenidos a Monkey");

        jLabel3.setText("Produccion");

        jLabel4.setText("Empaquetado");

        jLabel5.setText("Salida");

        jLabel6.setText("Tiempo(s)");

        jLabel7.setText("Costo(Q/s)");

        invens.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                invensKeyTyped(evt);
            }
        });

        jButton1.setText("Iniciar simulacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel6)
                                .addGap(57, 57, 57))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(produs, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                                    .addComponent(invens)
                                    .addComponent(empas)
                                    .addComponent(salis))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(invenqs, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(produqs)
                            .addComponent(empaqs)
                            .addComponent(saliqs)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(279, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(invens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invenqs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(produs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produqs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(empas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empaqs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(salis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saliqs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Reporte");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Tiempo transcurrido");

        jLabel9.setText("jLabel9");

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Empaquetado: ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        mora1.setText("jLabel15");
        jPanel3.add(mora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 28, 28, 29));

        mora2.setText("jLabel15");
        jPanel3.add(mora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 28, 28, 29));

        mora3.setText("jLabel15");
        jPanel3.add(mora3, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 28, 28, 29));

        mora4.setText("jLabel15");
        jPanel3.add(mora4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 28, 28, 29));

        mora5.setText("jLabel15");
        jPanel3.add(mora5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 28, 28, 29));

        mora6.setText("jLabel15");
        jPanel3.add(mora6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 28, 28, 29));

        mora7.setText("jLabel15");
        jPanel3.add(mora7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 28, 28, 29));

        mora8.setText("jLabel15");
        jPanel3.add(mora8, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 28, 28, 29));

        mora9.setText("jLabel15");
        jPanel3.add(mora9, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 28, 28, 29));

        mora10.setText("jLabel15");
        jPanel3.add(mora10, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 28, 28, 29));

        mora11.setText("jLabel15");
        jPanel3.add(mora11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 63, 28, 29));

        mora12.setText("jLabel15");
        jPanel3.add(mora12, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 63, 28, 29));

        mora13.setText("jLabel15");
        jPanel3.add(mora13, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 63, 28, 29));

        mora14.setText("jLabel15");
        jPanel3.add(mora14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 63, 28, 29));

        mora15.setText("jLabel15");
        jPanel3.add(mora15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 63, 28, 29));

        mora16.setText("jLabel15");
        jPanel3.add(mora16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 63, 28, 29));

        mora17.setText("jLabel15");
        jPanel3.add(mora17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 63, 28, 29));

        mora18.setText("jLabel15");
        jPanel3.add(mora18, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 63, 28, 29));

        mora19.setText("jLabel15");
        jPanel3.add(mora19, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 63, 28, 29));

        mora20.setText("jLabel15");
        jPanel3.add(mora20, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 63, 28, 29));

        mora21.setText("jLabel15");
        jPanel3.add(mora21, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 98, 28, 29));

        mora22.setText("jLabel15");
        jPanel3.add(mora22, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 98, 28, 29));

        mora23.setText("jLabel15");
        jPanel3.add(mora23, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 98, 28, 29));

        mora24.setText("jLabel15");
        jPanel3.add(mora24, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 98, 28, 29));

        mora25.setText("jLabel15");
        jPanel3.add(mora25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 98, 28, 29));

        mora26.setText("jLabel15");
        jPanel3.add(mora26, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 98, 28, 29));

        mora27.setText("jLabel15");
        jPanel3.add(mora27, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 98, 28, 29));

        mora28.setText("jLabel15");
        jPanel3.add(mora28, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 98, 28, 29));

        mora29.setText("jLabel15");
        jPanel3.add(mora29, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 98, 28, 29));

        mora30.setText("jLabel15");
        jPanel3.add(mora30, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 98, 28, 29));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Salida: ");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        rojo1.setText("jLabel15");
        jPanel4.add(rojo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 28, 28, 29));

        rojo2.setText("jLabel15");
        jPanel4.add(rojo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 28, 28, 29));

        rojo3.setText("jLabel15");
        jPanel4.add(rojo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 28, 28, 29));

        rojo4.setText("jLabel15");
        jPanel4.add(rojo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 28, 28, 29));

        rojo5.setText("jLabel15");
        jPanel4.add(rojo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 28, 28, 29));

        rojo6.setText("jLabel15");
        jPanel4.add(rojo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 28, 28, 29));

        rojo7.setText("jLabel15");
        jPanel4.add(rojo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 28, 28, 29));

        rojo8.setText("jLabel15");
        jPanel4.add(rojo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 28, 28, 29));

        rojo9.setText("jLabel15");
        jPanel4.add(rojo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 28, 28, 29));

        rojo10.setText("jLabel15");
        jPanel4.add(rojo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 28, 28, 29));

        rojo11.setText("jLabel15");
        jPanel4.add(rojo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 63, 28, 29));

        rojo12.setText("jLabel15");
        jPanel4.add(rojo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 63, 28, 29));

        rojo13.setText("jLabel15");
        jPanel4.add(rojo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 63, 28, 29));

        rojo14.setText("jLabel15");
        jPanel4.add(rojo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 63, 28, 29));

        rojo15.setText("jLabel15");
        jPanel4.add(rojo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 63, 28, 29));

        rojo16.setText("jLabel15");
        jPanel4.add(rojo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 63, 28, 29));

        rojo17.setText("jLabel15");
        jPanel4.add(rojo17, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 63, 28, 29));

        rojo18.setText("jLabel15");
        jPanel4.add(rojo18, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 63, 28, 29));

        rojo19.setText("jLabel15");
        jPanel4.add(rojo19, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 63, 28, 29));

        rojo20.setText("jLabel15");
        jPanel4.add(rojo20, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 63, 28, 29));

        rojo21.setText("jLabel15");
        jPanel4.add(rojo21, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 98, 28, 29));

        rojo22.setText("jLabel15");
        jPanel4.add(rojo22, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 98, 28, 29));

        rojo23.setText("jLabel15");
        jPanel4.add(rojo23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 98, 28, 29));

        rojo24.setText("jLabel15");
        jPanel4.add(rojo24, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 98, 28, 29));

        rojo25.setText("jLabel15");
        jPanel4.add(rojo25, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 98, 28, 29));

        rojo26.setText("jLabel15");
        jPanel4.add(rojo26, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 98, 28, 29));

        rojo27.setText("jLabel15");
        jPanel4.add(rojo27, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 98, 28, 29));

        rojo28.setText("jLabel15");
        jPanel4.add(rojo28, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 98, 28, 29));

        rojo29.setText("jLabel15");
        jPanel4.add(rojo29, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 98, 28, 29));

        rojo30.setText("jLabel15");
        jPanel4.add(rojo30, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 98, 28, 29));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Produccion:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        v1.setText("jLabel15");
        jPanel5.add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 28, 28, 29));

        v2.setText("jLabel15");
        jPanel5.add(v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 28, 28, 29));

        v3.setText("jLabel15");
        jPanel5.add(v3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 28, 28, 29));

        v4.setText("jLabel15");
        jPanel5.add(v4, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 28, 28, 29));

        v5.setText("jLabel15");
        jPanel5.add(v5, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 28, 28, 29));

        v6.setText("jLabel15");
        jPanel5.add(v6, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 28, 28, 29));

        v7.setText("jLabel15");
        jPanel5.add(v7, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 28, 28, 29));

        v8.setText("jLabel15");
        jPanel5.add(v8, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 28, 28, 29));

        v9.setText("jLabel15");
        jPanel5.add(v9, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 28, 28, 29));

        v10.setText("jLabel15");
        jPanel5.add(v10, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 28, 28, 29));

        v11.setText("jLabel15");
        jPanel5.add(v11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 63, 28, 29));

        v12.setText("jLabel15");
        jPanel5.add(v12, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 63, 28, 29));

        v13.setText("jLabel15");
        jPanel5.add(v13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 63, 28, 29));

        v14.setText("jLabel15");
        jPanel5.add(v14, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 63, 28, 29));

        v15.setText("jLabel15");
        jPanel5.add(v15, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 63, 28, 29));

        v16.setText("jLabel15");
        jPanel5.add(v16, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 63, 28, 29));

        v17.setText("jLabel15");
        jPanel5.add(v17, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 63, 28, 29));

        v18.setText("jLabel15");
        jPanel5.add(v18, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 63, 28, 29));

        v19.setText("jLabel15");
        jPanel5.add(v19, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 63, 28, 29));

        v20.setText("jLabel15");
        jPanel5.add(v20, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 63, 28, 29));

        v21.setText("jLabel15");
        jPanel5.add(v21, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 98, 28, 29));

        v22.setText("jLabel15");
        jPanel5.add(v22, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 98, 28, 29));

        v23.setText("jLabel15");
        jPanel5.add(v23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 98, 28, 29));

        v24.setText("jLabel15");
        jPanel5.add(v24, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 98, 28, 29));

        v25.setText("jLabel15");
        jPanel5.add(v25, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 98, 28, 29));

        v26.setText("jLabel15");
        jPanel5.add(v26, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 98, 28, 29));

        v27.setText("jLabel15");
        jPanel5.add(v27, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 98, 28, 29));

        v28.setText("jLabel15");
        jPanel5.add(v28, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 98, 28, 29));

        v29.setText("jLabel15");
        jPanel5.add(v29, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 98, 28, 29));

        v30.setText("jLabel15");
        jPanel5.add(v30, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 98, 28, 29));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Inventario: ");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel15.setText("jLabel15");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 22, 28, 29));

        jLabel16.setText("jLabel15");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 22, 28, 29));

        jLabel17.setText("jLabel15");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 22, 28, 29));

        jLabel18.setText("jLabel15");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 22, 28, 29));

        jLabel19.setText("jLabel15");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 22, 28, 29));

        jLabel20.setText("jLabel15");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 22, 28, 29));

        jLabel21.setText("jLabel15");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 22, 28, 29));

        jLabel22.setText("jLabel15");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 22, 28, 29));

        jLabel23.setText("jLabel15");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 22, 28, 29));

        jLabel24.setText("jLabel15");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 22, 28, 29));

        jLabel25.setText("jLabel15");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 57, 28, 29));

        jLabel26.setText("jLabel15");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 57, 28, 29));

        jLabel27.setText("jLabel15");
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 57, 28, 29));

        jLabel28.setText("jLabel15");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 57, 28, 29));

        jLabel29.setText("jLabel15");
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 57, 28, 29));

        jLabel30.setText("jLabel15");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 57, 28, 29));

        jLabel31.setText("jLabel15");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 57, 28, 29));

        jLabel32.setText("jLabel15");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 57, 28, 29));

        jLabel33.setText("jLabel15");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 57, 28, 29));

        jLabel34.setText("jLabel15");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 57, 28, 29));

        jLabel35.setText("jLabel15");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 92, 28, 29));

        jLabel36.setText("jLabel15");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 92, 28, 29));

        jLabel37.setText("jLabel15");
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 92, 28, 29));

        jLabel38.setText("jLabel15");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 92, 28, 29));

        jLabel39.setText("jLabel15");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 92, 28, 29));

        jLabel40.setText("jLabel15");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 92, 28, 29));

        jLabel41.setText("jLabel15");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 92, 28, 29));

        jLabel42.setText("jLabel15");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 92, 28, 29));

        jLabel43.setText("jLabel15");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 92, 28, 29));

        jLabel44.setText("jLabel15");
        jPanel6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 92, 28, 29));

        cirama.setText("jLabel15");

        label1.setText("Inicio: ");

        jLabel14.setText("Final:");

        finalcont.setText("0");

        iniciocon.setText("30");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 478, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jButton2)
                                .addGap(330, 330, 330)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(finalcont)
                                .addGap(113, 113, 113)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cirama, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(iniciocon))))
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jButton2))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(iniciocon)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(jLabel14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cirama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finalcont)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(607, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        if (invens.getText().isEmpty() || produs.getText().isEmpty() || empas.getText().isEmpty() || salis.getText().isEmpty() || invenqs.getText().isEmpty() || produqs.getText().isEmpty() || empaqs.getText().isEmpty() || saliqs.getText().isEmpty()) {
           JOptionPane.showMessageDialog(null, "Complete todos los campos","Error", JOptionPane.WARNING_MESSAGE); 
        }else{
            if (esNumeroEntero(invens.getText()) && esNumeroEntero(invenqs.getText()) && esNumeroEntero(produs.getText()) && esNumeroEntero(produqs.getText()) && esNumeroEntero(empas.getText()) && esNumeroEntero(empaqs.getText()) && esNumeroEntero(salis.getText()) && esNumeroEntero(saliqs.getText())) {
        jPanel1.setVisible(false);
        mostrarpa();
        jButton1.setEnabled(false);
        hiloverde.setDato1(Integer.parseInt(invens.getText()));
        hilorosa.setDato2(Integer.parseInt(produs.getText()));
        valorvv=Integer.parseInt(invens.getText());
        valorro=Integer.parseInt(produs.getText());
        valorojo=Integer.parseInt(empas.getText());
        valorfin=Integer.parseInt(salis.getText());
        cronometro();
        Q1=Integer.parseInt(invens.getText())*Integer.parseInt(invenqs.getText())*30;
        Q2=Integer.parseInt(produs.getText())*Integer.parseInt(produqs.getText())*30;
        Q3=Integer.parseInt(empas.getText())*Integer.parseInt(empaqs.getText())*30;
        Q4=Integer.parseInt(salis.getText())*Integer.parseInt(saliqs.getText())*30;
        totalQ=Q1+Q2+Q3+Q4;
       
        new Thread(new Runnable() {
            public void run() {
                try {
                    for (int i = 1; i <= 60; i++) { // Realiza el parpadero 5 veces
                        Thread.sleep(1000); // Espera 1 segundo
                        if (cirama.isVisible()) {
                            coni=29-contador1;
                            iniciocon.setText( coni+" ");
                            contador1=contador1+1;
                            cirama.setVisible(false);
                            System.out.println(contador1);
                            if (iniciov==1) {
                                iniciarverde();
                                iniciov=2;    
                            }                           
                            mostrar1();
                            contadorinventario=inventarioi-inventariof;
                            jLabel12.setText("Inventario: "+contadorinventario);
                        } else {                           
                            cirama.setVisible(true);                                                    
                        }
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                } finally {
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            jButton1.setEnabled(true); // Habilita el botón al finalizar
                        }
                    });
                }               
            }
        }).start();   
       }else{
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros enteros");
        } 
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void mostrarpa(){
        jPanel2.setVisible(true);
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String textoreporte="<html><head></head><body><table><tr><th>Sector</th><th>Tiempo(s)</th><th>Costo de produccion (Q/s)</th><th>Costo sector</th></tr>";        
        
        textoreporte=textoreporte+"<tr><td>"+ "Inventario "+"</td><td>"+invens.getText()+"</td><td>"+invenqs.getText()+"</td><td>"+Integer.parseInt(invens.getText())*Integer.parseInt(invenqs.getText())*30+"</td></tr>" + "<tr><td>"+ "Produccion " +"</td><td>"+ produs.getText() +"</td><td>"+produqs.getText()+"</td><td>"+Integer.parseInt(produs.getText())*Integer.parseInt(produqs.getText())*30+"</td></tr>" +
           "<tr><td>"+ "Empaquetado" +"</td><td>"+ empas.getText() +"</td><td>"+empaqs.getText()+"</td><td>"+Integer.parseInt(empas.getText())*Integer.parseInt(empaqs.getText())*30 + "</td></tr>" + "<tr><td>"+ "Salida" +"</td><td>"+ salis.getText() +"</td><td>"+saliqs.getText()+"</td><td>"+Integer.parseInt(salis.getText())*Integer.parseInt(saliqs.getText())*30+"</td></tr>"    ;
        report.setTextArea(textoreporte);
        report.setVisible(true);
        report.setTextlabel("Total Q."+totalQ+" Pedro Pablo Raul Lopez Vargas, 202004730");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel2.setVisible(false);
        jPanel1.setVisible(true);
        contador1=0;
        contador2=0;
        contador3=0;
        contador4=0;
        contador5=0;
        jLabel9.setText("00:00");
        Q1=0;
        Q2=0;
        Q3=0;
        Q4=0;
        totalQ=0;
        segundos=0;
        minutos=0;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void invensKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_invensKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_invensKeyTyped

    public void iniciarverde(){
              new Thread(new Runnable() {
            public void run() {           
        try {           
                for (int x = 0; x < 30; x++) {
                System.out.println(valorvv*1000);
                Thread.sleep(valorvv*1000);    
                contador2=contador2+1;
                mostrar2();
                contadorinventario=inventarioi-inventariof;
                jLabel12.setText("Inventario: "+contadorinventario);
                contadorproduccion=produccioni-produccionf;
                jLabel13.setText("Produccion: "+contadorproduccion);
                    if (inicior==1) {
                        iniciarmora();
                        inicior=2;
                    }
            }         
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
            }
        }).start();
    }
    public void iniciarmora(){
              new Thread(new Runnable() {
            public void run() {           
        try {           
                for (int y = 0; y < 30; y++) {
                System.out.println(valorro*1000);
                Thread.sleep(valorro*1000);    
                contador3=contador3+1;
                mostrar3();
                contadorproduccion=produccioni-produccionf;
                jLabel13.setText("Produccion: "+contadorproduccion); 
                contadorempaq=empaquetadoi-empaquetadof;
                jLabel10.setText("Empaquetado: "+contadorempaq); 
                    if (iniciorojo==1) {
                        iniciarrojo();
                        iniciorojo=2;
                    }
            }         
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    
            }
        }).start();       
    }
    
        public void iniciarrojo(){
              new Thread(new Runnable() {
            public void run() {           
        try {           
                for (int z = 0; z < 30; z++) {
                System.out.println(valorojo*1000);
                Thread.sleep(valorojo*1000);    
                contador4=contador4+1;
                mostrar4();
                contadorempaq=empaquetadoi-empaquetadof;
                jLabel10.setText("Empaquetado: "+contadorempaq);
                contadorsalida=salidai-salidaf;
                jLabel11.setText("Salida: "+contadorsalida);
                    if (inicioultima==1) {
                        iniciarultim();
                        inicioultima=2;
                    }
            }         
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    
            }
        }).start();       
    }
        public void iniciarultim(){
              new Thread(new Runnable() {
            public void run() {           
        try {           
                for (int a = 0; a < 30; a++) {
                System.out.println(valorfin*1000);
                Thread.sleep(valorfin*1000);    
                contador5=contador5+1;
                
                desaparecer(); 
                contadorsalida=salidai-salidaf;
                jLabel11.setText("Salida: "+contadorsalida);
                finalcont.setText(contador5+" ");

            }         
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    
            }
        }).start();       
    }        
    private void SetImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon( image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
    public void mostrar1(){
        switch(contador1){
            case 1: 
                jLabel15.setVisible(true);  
                inventarioi=inventarioi+1;
                System.out.println("1");
                iniciov=1;
                break;
            case 2:
                jLabel16.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 3:
                jLabel17.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 4: 
                jLabel18.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 5:
                jLabel19.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 6:
                jLabel20.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 7: 
                jLabel21.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 8:
                jLabel22.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 9:
                jLabel23.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 10: 
                jLabel24.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 11:
                jLabel25.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 12:
                jLabel26.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 13: 
                jLabel27.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 14:
                jLabel28.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 15:
                jLabel29.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 16: 
                jLabel30.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 17:
                jLabel31.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 18:
                jLabel32.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 19: 
                jLabel33.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 20:
                jLabel34.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 21:
                jLabel35.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 22: 
                jLabel36.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 23:
                jLabel37.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 24:
                jLabel38.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 25:
                jLabel39.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 26: 
                jLabel40.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 27:
                jLabel41.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 28:
                jLabel42.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 29: 
                jLabel43.setVisible(true);
                inventarioi=inventarioi+1;
                break;
            case 30:
                jLabel44.setVisible(true);
                inventarioi=inventarioi+1;
                break;
        }
    }
    public void mostrar2(){
        System.out.println("cont 2: " + contador2);
        
        switch(contador2){
            case 1: 
                v1.setVisible(true);
                jLabel15.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                inicior=1;
                break;
            case 2:
                v2.setVisible(true);
                jLabel16.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 3:
                v3.setVisible(true);
                jLabel17.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 4: 
                v4.setVisible(true);
                jLabel18.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 5:
                v5.setVisible(true);
                jLabel19.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 6:
                v6.setVisible(true);
                jLabel20.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 7: 
                v7.setVisible(true);
                jLabel21.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 8:
                v8.setVisible(true);
                jLabel22.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 9:
                v9.setVisible(true);
                jLabel23.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 10: 
                v10.setVisible(true);
                jLabel24.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 11:
                v11.setVisible(true);
                jLabel25.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 12:
                v12.setVisible(true);
                jLabel26.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 13: 
                v13.setVisible(true);
                jLabel27.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 14:
                v14.setVisible(true);
                jLabel28.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 15:
                v15.setVisible(true);
                jLabel29.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 16: 
                v16.setVisible(true);
                jLabel30.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 17:
                v17.setVisible(true);
                jLabel31.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 18:
                v18.setVisible(true);
                jLabel32.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 19: 
                v19.setVisible(true);
                jLabel33.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 20:
                v20.setVisible(true);
                jLabel34.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 21:
                v21.setVisible(true);
                jLabel35.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 22: 
                v22.setVisible(true);
                jLabel36.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 23:
                v23.setVisible(true);
                jLabel37.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 24:
                v24.setVisible(true);
                jLabel38.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 25:
                v25.setVisible(true);
                jLabel39.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 26: 
                v26.setVisible(true);
                jLabel40.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 27:
                v27.setVisible(true);
                jLabel41.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 28:
                v28.setVisible(true);
                jLabel42.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 29: 
                v29.setVisible(true);
                jLabel43.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;
            case 30:
                v30.setVisible(true);
                jLabel44.setVisible(false);
                inventariof=inventariof+1;
                produccioni=produccioni+1;
                break;                
        }
    }
    
    public void mostrar3(){

        System.out.println("cont 3: " + contador3);
        
        switch(contador3){
            case 1: 
                mora1.setVisible(true);
                v1.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                iniciorojo=1;
                break;
            case 2:
                mora2.setVisible(true);
                v2.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 3:
                mora3.setVisible(true);
                v3.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 4: 
                mora4.setVisible(true);
                v4.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 5:
                mora5.setVisible(true);
                v5.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 6:
                mora6.setVisible(true);
                v6.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 7: 
                mora7.setVisible(true);
                v7.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 8:
                mora8.setVisible(true);
                v8.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 9:
                mora9.setVisible(true);
                v9.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 10: 
                mora10.setVisible(true);
                v10.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 11:
                mora11.setVisible(true);
                v11.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 12:
                mora12.setVisible(true);
                v12.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 13: 
                mora13.setVisible(true);
                v13.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 14:
                mora14.setVisible(true);
                v14.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 15:
                mora15.setVisible(true);
                v15.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 16: 
                mora16.setVisible(true);
                v16.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 17:
                mora17.setVisible(true);
                v17.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 18:
                mora18.setVisible(true);
                v18.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 19: 
                mora19.setVisible(true);
                v19.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 20:
                mora20.setVisible(true);
                v20.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 21:
                mora21.setVisible(true);
                v21.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 22: 
                mora22.setVisible(true);
                v22.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 23:
                mora23.setVisible(true);
                v23.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 24:
                mora24.setVisible(true);
                v24.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
                case 25:
                mora25.setVisible(true);
                v25.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 26: 
                mora26.setVisible(true);
                v26.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 27:
                mora27.setVisible(true);
                v27.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 28:
                mora28.setVisible(true);
                v28.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 29: 
                mora29.setVisible(true);
                v29.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;
            case 30:
                mora30.setVisible(true);
                v30.setVisible(false);
                produccionf=produccionf+1;
                empaquetadoi=empaquetadoi+1;
                break;                
        }
    }
    
        public void mostrar4(){

        System.out.println("cont 4: " + contador4);
        
        switch(contador4){
            case 1: 
                rojo1.setVisible(true);
                mora1.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                inicioultima=1;
                break;
            case 2:
                rojo2.setVisible(true);
                mora2.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 3:
                rojo3.setVisible(true);
                mora3.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 4: 
                rojo4.setVisible(true);
                mora4.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 5:
                rojo5.setVisible(true);
                mora5.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 6:
                rojo6.setVisible(true);
                mora6.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 7: 
                rojo7.setVisible(true);
                mora7.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 8:
                rojo8.setVisible(true);
                mora8.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 9:
                rojo9.setVisible(true);
                mora9.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 10: 
                rojo10.setVisible(true);
                mora10.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 11:
                rojo11.setVisible(true);
                mora11.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 12:
                rojo12.setVisible(true);
                mora12.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 13: 
                rojo13.setVisible(true);
                mora13.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 14:
                rojo14.setVisible(true);
                mora14.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 15:
                rojo15.setVisible(true);
                mora15.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 16: 
                rojo16.setVisible(true);
                mora16.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 17:
                rojo17.setVisible(true);
                mora17.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 18:
                rojo18.setVisible(true);
                mora18.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 19: 
                rojo19.setVisible(true);
                mora19.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 20:
                rojo20.setVisible(true);
                mora20.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 21:
                rojo21.setVisible(true);
                mora21.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 22: 
                rojo22.setVisible(true);
                mora22.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 23:
                rojo23.setVisible(true);
                mora23.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 24:
                rojo24.setVisible(true);
                mora24.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
                case 25:
                rojo25.setVisible(true);
                mora25.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 26: 
                rojo26.setVisible(true);
                mora26.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 27:
                rojo27.setVisible(true);
                mora27.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 28:
                rojo28.setVisible(true);
                mora28.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 29: 
                rojo29.setVisible(true);
                mora29.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;
            case 30:
                rojo30.setVisible(true);
                mora30.setVisible(false);
                empaquetadof=empaquetadof+1;
                salidai=salidai+1;
                break;                
        }
    }
    
        public void desaparecer(){
      
        switch(contador5){
            case 1: 
                rojo1.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 2:
                rojo2.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 3:
                rojo3.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 4: 
                rojo4.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 5:
                rojo5.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 6:
                rojo6.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 7: 
                rojo7.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 8:
                rojo8.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 9:
                rojo9.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 10: 
                rojo10.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 11:
                rojo11.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 12:
                rojo12.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 13: 
                rojo13.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 14:
                rojo14.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 15:
                rojo15.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 16: 
                rojo16.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 17:
                rojo17.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 18:
                rojo18.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 19: 
                rojo19.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 20:
                rojo20.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 21:
                rojo21.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 22: 
                rojo22.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 23:
                rojo23.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 24:
                rojo24.setVisible(false);
                salidaf=salidaf+1;
                break;
                case 25:
                rojo25.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 26: 
                rojo26.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 27:
                rojo27.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 28:
                rojo28.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 29: 
                rojo29.setVisible(false);
                salidaf=salidaf+1;
                break;
            case 30:
                rojo30.setVisible(false);
                salidaf=salidaf+1;
                detener();
                break;                
        }
    }        
       public void obtenercon(int contador2){
       this.contador2=contador2;      
        } 
      public void obtenerinir(int inicior){
       this.inicior=inicior;      
        } 
      public void cronometro(){
          if (!corriendo) {
              inicioHilo=true;
              corriendo=true;
              iniciarCronometro();
          }
      }
public void iniciarCronometro(){
    if (inicioHilo==true) {
        System.out.println("inicia el hilo");
            Hilo miHilo = new Hilo(jLabel9);
            miHilo.start();
    }
}

public void detener(){
    corriendo=false;
    inicioHilo=false;
    JOptionPane.showMessageDialog(null, "La simulacion ha terminado","Finalizado", JOptionPane.INFORMATION_MESSAGE);
}

public boolean esNumeroEntero(String cadena){
    try{
        Integer.parseInt(cadena);
        return true;
    }catch(NumberFormatException e){
        return false;
    }
}
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cirama;
    private javax.swing.JTextField empaqs;
    private javax.swing.JTextField empas;
    private javax.swing.JLabel finalcont;
    private javax.swing.JLabel iniciocon;
    private javax.swing.JTextField invenqs;
    private javax.swing.JTextField invens;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private java.awt.Label label1;
    private javax.swing.JLabel mora1;
    private javax.swing.JLabel mora10;
    private javax.swing.JLabel mora11;
    private javax.swing.JLabel mora12;
    private javax.swing.JLabel mora13;
    private javax.swing.JLabel mora14;
    private javax.swing.JLabel mora15;
    private javax.swing.JLabel mora16;
    private javax.swing.JLabel mora17;
    private javax.swing.JLabel mora18;
    private javax.swing.JLabel mora19;
    private javax.swing.JLabel mora2;
    private javax.swing.JLabel mora20;
    private javax.swing.JLabel mora21;
    private javax.swing.JLabel mora22;
    private javax.swing.JLabel mora23;
    private javax.swing.JLabel mora24;
    private javax.swing.JLabel mora25;
    private javax.swing.JLabel mora26;
    private javax.swing.JLabel mora27;
    private javax.swing.JLabel mora28;
    private javax.swing.JLabel mora29;
    private javax.swing.JLabel mora3;
    private javax.swing.JLabel mora30;
    private javax.swing.JLabel mora4;
    private javax.swing.JLabel mora5;
    private javax.swing.JLabel mora6;
    private javax.swing.JLabel mora7;
    private javax.swing.JLabel mora8;
    private javax.swing.JLabel mora9;
    private javax.swing.JTextField produqs;
    private javax.swing.JTextField produs;
    private javax.swing.JLabel rojo1;
    private javax.swing.JLabel rojo10;
    private javax.swing.JLabel rojo11;
    private javax.swing.JLabel rojo12;
    private javax.swing.JLabel rojo13;
    private javax.swing.JLabel rojo14;
    private javax.swing.JLabel rojo15;
    private javax.swing.JLabel rojo16;
    private javax.swing.JLabel rojo17;
    private javax.swing.JLabel rojo18;
    private javax.swing.JLabel rojo19;
    private javax.swing.JLabel rojo2;
    private javax.swing.JLabel rojo20;
    private javax.swing.JLabel rojo21;
    private javax.swing.JLabel rojo22;
    private javax.swing.JLabel rojo23;
    private javax.swing.JLabel rojo24;
    private javax.swing.JLabel rojo25;
    private javax.swing.JLabel rojo26;
    private javax.swing.JLabel rojo27;
    private javax.swing.JLabel rojo28;
    private javax.swing.JLabel rojo29;
    private javax.swing.JLabel rojo3;
    private javax.swing.JLabel rojo30;
    private javax.swing.JLabel rojo4;
    private javax.swing.JLabel rojo5;
    private javax.swing.JLabel rojo6;
    private javax.swing.JLabel rojo7;
    private javax.swing.JLabel rojo8;
    private javax.swing.JLabel rojo9;
    private javax.swing.JTextField saliqs;
    private javax.swing.JTextField salis;
    private javax.swing.JLabel v1;
    private javax.swing.JLabel v10;
    private javax.swing.JLabel v11;
    private javax.swing.JLabel v12;
    private javax.swing.JLabel v13;
    private javax.swing.JLabel v14;
    private javax.swing.JLabel v15;
    private javax.swing.JLabel v16;
    private javax.swing.JLabel v17;
    private javax.swing.JLabel v18;
    private javax.swing.JLabel v19;
    private javax.swing.JLabel v2;
    private javax.swing.JLabel v20;
    private javax.swing.JLabel v21;
    private javax.swing.JLabel v22;
    private javax.swing.JLabel v23;
    private javax.swing.JLabel v24;
    private javax.swing.JLabel v25;
    private javax.swing.JLabel v26;
    private javax.swing.JLabel v27;
    private javax.swing.JLabel v28;
    private javax.swing.JLabel v29;
    private javax.swing.JLabel v3;
    private javax.swing.JLabel v30;
    private javax.swing.JLabel v4;
    private javax.swing.JLabel v5;
    private javax.swing.JLabel v6;
    private javax.swing.JLabel v7;
    private javax.swing.JLabel v8;
    private javax.swing.JLabel v9;
    // End of variables declaration//GEN-END:variables

    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
