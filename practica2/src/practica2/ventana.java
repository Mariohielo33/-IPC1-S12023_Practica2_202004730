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

/**
 *
 * @author Pedro
 */
public class ventana extends javax.swing.JFrame {
    Hilov hiloverde= new Hilov();
    int iniciov;
    Hilo miHilo = new Hilo();
    hiloro hilorosa = new hiloro();
int valor1=0;
int contador1,contador2;
int valorvv;
int rep1=0;
    
    public ventana() {
        initComponents();
        this.setTitle("Reporte2");
        this.setSize(1000,1000);

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
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setText("Inventario");

        jLabel2.setText("Bienvenidos a Monkey");

        jLabel3.setText("Produccion");

        jLabel4.setText("Empaquetado");

        jLabel5.setText("Salida");

        jLabel6.setText("Tiempo(s)");

        jLabel7.setText("Costo(Q/s)");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel6)
                                .addGap(57, 57, 57))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(produs)
                                    .addComponent(invens)
                                    .addComponent(empas)
                                    .addComponent(salis))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(invenqs, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(produqs)
                            .addComponent(empaqs)
                            .addComponent(saliqs))))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jButton3.setText("Reporte");

        jLabel8.setText("Tiempo transcurrido");

        jLabel9.setText("jLabel9");

        jLabel10.setText("Empaquetado: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(348, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jLabel11.setText("Salida: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jLabel13.setText("Produccion");

        v1.setText("jLabel15");

        v2.setText("jLabel15");

        v3.setText("jLabel15");

        v4.setText("jLabel15");

        v5.setText("jLabel15");

        v6.setText("jLabel15");

        v7.setText("jLabel15");

        v8.setText("jLabel15");

        v9.setText("jLabel15");

        v10.setText("jLabel15");

        v11.setText("jLabel15");

        v12.setText("jLabel15");

        v13.setText("jLabel15");

        v14.setText("jLabel15");

        v15.setText("jLabel15");

        v16.setText("jLabel15");

        v17.setText("jLabel15");

        v18.setText("jLabel15");

        v19.setText("jLabel15");

        v20.setText("jLabel15");

        v21.setText("jLabel15");

        v22.setText("jLabel15");

        v23.setText("jLabel15");

        v24.setText("jLabel15");

        v25.setText("jLabel15");

        v26.setText("jLabel15");

        v27.setText("jLabel15");

        v28.setText("jLabel15");

        v29.setText("jLabel15");

        v30.setText("jLabel15");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(v1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(v2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(v3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(v4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(v5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(v6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(v7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(v8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(v9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(v10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(v11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(v12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(v13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(v14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(v15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(v16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(v17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(v18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(v19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(v20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(v21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(v22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(v23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(v24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(v25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(v26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(v27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(v28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(v29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(v30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(v1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(v11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(v21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Inventario: ");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 0, -1, -1));

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

        label1.setText("Inicio");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1945, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cirama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(cirama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(531, Short.MAX_VALUE))
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
        jButton1.setEnabled(false);
        hiloverde.setDato1(Integer.parseInt(invens.getText()));
        hilorosa.setDato2(Integer.parseInt(produs.getText()));
        valorvv=Integer.parseInt(invens.getText());
        new Thread(new Runnable() {
            public void run() {
                try {
                    for (int i = 1; i <= 60; i++) { // Realiza el parpadero 5 veces
                        Thread.sleep(1000); // Espera 1 segundo
                        if (cirama.isVisible()) {
                            contador1=contador1+1;
                            cirama.setVisible(false);
                            System.out.println(contador1);
                            if (iniciov==1) {
                                hiloverde.debloq();
//                                debloqq();
                                iniciov=2;
                            }
                            mostrar1();

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
        

        hiloverde.start();
             
    }
    }//GEN-LAST:event_jButton1ActionPerformed

//    public void prueba(){
//              new Thread(new Runnable() {
//            public void run() {
//        synchronized(this){            
//        try {           
//                wait();
//                for (int x = 0; x < 60; x++) {
//                System.out.println(valorvv*1000);
//                Thread.sleep(valorvv*1000);    
//                contador2=contador2+1;
//                mostrar2();
//            }         
//        } catch (InterruptedException ex) {
//            ex.printStackTrace();
//        }
//    }
//            }
//        }).start();
//    }
    public void Inventario(){
        valor1=1000*parseInt(invens.getText());
              new Thread(new Runnable() {
            public void run() {
                try {
                    for (int i = 1; i <= 60; i++) { 
                        Thread.sleep(valor1); 
                        if (jLabel16.isVisible()) {
                            jLabel16.setVisible(false);
                        } else {
                            jLabel16.setVisible(true);
                        }
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
                
                iniciov=1;
                break;
            case 2:
                jLabel16.setVisible(true);
                break;
            case 3:
                jLabel17.setVisible(true);
                break;
            case 4: 
                jLabel18.setVisible(true);
                break;
            case 5:
                jLabel19.setVisible(true);
                break;
            case 6:
                jLabel20.setVisible(true);
                break;
            case 7: 
                jLabel21.setVisible(true);
                break;
            case 8:
                jLabel22.setVisible(true);
                break;
            case 9:
                jLabel23.setVisible(true);
                break;
            case 10: 
                jLabel24.setVisible(true);
                break;
            case 11:
                jLabel25.setVisible(true);
                break;
            case 12:
                jLabel26.setVisible(true);
                break;
            case 13: 
                jLabel27.setVisible(true);
                break;
            case 14:
                jLabel28.setVisible(true);
                break;
            case 15:
                jLabel29.setVisible(true);
                break;
            case 16: 
                jLabel30.setVisible(true);
                break;
            case 17:
                jLabel31.setVisible(true);
                break;
            case 18:
                jLabel32.setVisible(true);
                break;
            case 19: 
                jLabel33.setVisible(true);
                break;
            case 20:
                jLabel34.setVisible(true);
                break;
            case 21:
                jLabel35.setVisible(true);
                break;
            case 22: 
                jLabel36.setVisible(true);
                break;
            case 23:
                jLabel37.setVisible(true);
                break;
            case 24:
                jLabel38.setVisible(true);
                break;
            case 25:
                jLabel39.setVisible(true);
                break;
            case 26: 
                jLabel40.setVisible(true);
                break;
            case 27:
                jLabel41.setVisible(true);
                break;
            case 28:
                jLabel42.setVisible(true);
                break;
            case 29: 
                jLabel43.setVisible(true);
                break;
            case 30:
                jLabel44.setVisible(true);
                break;
        }
    }
    public void mostrar2(){
//        v1.setVisible(true);
        System.out.println("cont 2: " + contador2);
        
        switch(contador2){
            case 1: 
                v1.setVisible(true);
                break;
            case 2:
                v2.setVisible(true);
                break;
            case 3:
                v3.setVisible(true);
                break;
            case 4: 
                v4.setVisible(true);
                break;
            case 5:
                v5.setVisible(true);
                break;
            case 6:
                v6.setVisible(true);
                break;
            case 7: 
                v7.setVisible(true);
                break;
            case 8:
                v8.setVisible(true);
                break;
            case 9:
                v8.setVisible(true);
                break;
            case 10: 
                v10.setVisible(true);
                break;
            case 11:
                v11.setVisible(true);
                break;
            case 12:
                v12.setVisible(true);
                break;
            case 13: 
                v13.setVisible(true);
                break;
            case 14:
                v14.setVisible(true);
                break;
            case 15:
                v15.setVisible(true);
                break;
            case 16: 
                v16.setVisible(true);
                break;
            case 17:
                v17.setVisible(true);
                break;
            case 18:
                v18.setVisible(true);
                break;
            case 19: 
                v19.setVisible(true);
                break;
            case 20:
                v20.setVisible(true);
                break;
            case 21:
                v21.setVisible(true);
                break;
            case 22: 
                v22.setVisible(true);
                break;
            case 23:
                v23.setVisible(true);
                break;
            case 24:
                v24.setVisible(true);
                break;
                case 25:
                v25.setVisible(true);
                break;
            case 26: 
                v26.setVisible(true);
                break;
            case 27:
                v27.setVisible(true);
                break;
            case 28:
                v28.setVisible(true);
                break;
            case 29: 
                v29.setVisible(true);
                break;
            case 30:
                v30.setVisible(true);
                rep1=1;
                break;                
        }
    }
    
       public void obtenercon(int contador2){
       this.contador2=contador2;      
        } 

//    public void debloqq(){    
//        synchronized(this){
//        notify();
//        
//        }
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cirama;
    private javax.swing.JTextField empaqs;
    private javax.swing.JTextField empas;
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
    private javax.swing.JTextField produqs;
    private javax.swing.JTextField produs;
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
}
