/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Logica.NumComplejo;

/**
 *
 * @author futbo
 */
public class EulerGUI2 extends javax.swing.JFrame {
    String tetha="°";
    String r ="r";
    boolean point=false;
    /**
     * Creates new form CalculadoraGUI
     */
    public EulerGUI2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_tres = new javax.swing.JButton();
        btn_nueve = new javax.swing.JButton();
        btn_seis = new javax.swing.JButton();
        btn_cero = new javax.swing.JButton();
        btn_cinco = new javax.swing.JButton();
        btn_ocho = new javax.swing.JButton();
        btn_dos = new javax.swing.JButton();
        btn_uno = new javax.swing.JButton();
        btn_seven = new javax.swing.JButton();
        btn_pn = new javax.swing.JButton();
        btn_cuatro = new javax.swing.JButton();
        btn_real = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_ima = new javax.swing.JButton();
        jtf_muestra = new javax.swing.JTextField();
        btn_enviar = new javax.swing.JButton();
        lbl_r = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_tetha = new javax.swing.JLabel();
        AC = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(400, 300));

        jPanel1.setPreferredSize(new java.awt.Dimension(300, 100));

        btn_tres.setText("3");
        btn_tres.setPreferredSize(new java.awt.Dimension(40, 30));
        btn_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tresActionPerformed(evt);
            }
        });

        btn_nueve.setText("9");
        btn_nueve.setPreferredSize(new java.awt.Dimension(40, 30));
        btn_nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nueveActionPerformed(evt);
            }
        });

        btn_seis.setText("6");
        btn_seis.setPreferredSize(new java.awt.Dimension(40, 30));
        btn_seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seisActionPerformed(evt);
            }
        });

        btn_cero.setText("0");
        btn_cero.setPreferredSize(new java.awt.Dimension(40, 30));
        btn_cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ceroActionPerformed(evt);
            }
        });

        btn_cinco.setText("5");
        btn_cinco.setPreferredSize(new java.awt.Dimension(40, 30));
        btn_cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cincoActionPerformed(evt);
            }
        });

        btn_ocho.setText("8");
        btn_ocho.setPreferredSize(new java.awt.Dimension(40, 30));
        btn_ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ochoActionPerformed(evt);
            }
        });

        btn_dos.setText("2");
        btn_dos.setPreferredSize(new java.awt.Dimension(40, 30));
        btn_dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dosActionPerformed(evt);
            }
        });

        btn_uno.setText("1");
        btn_uno.setPreferredSize(new java.awt.Dimension(40, 30));
        btn_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_unoActionPerformed(evt);
            }
        });

        btn_seven.setText("7");
        btn_seven.setPreferredSize(new java.awt.Dimension(40, 30));
        btn_seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sevenActionPerformed(evt);
            }
        });

        btn_pn.setText("+/-");
        btn_pn.setPreferredSize(new java.awt.Dimension(40, 30));
        btn_pn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pnActionPerformed(evt);
            }
        });

        btn_cuatro.setText("4");
        btn_cuatro.setPreferredSize(new java.awt.Dimension(40, 30));
        btn_cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuatroActionPerformed(evt);
            }
        });

        btn_real.setText("r");
        btn_real.setPreferredSize(new java.awt.Dimension(40, 30));
        btn_real.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_realActionPerformed(evt);
            }
        });

        btn_punto.setText(".");
        btn_punto.setPreferredSize(new java.awt.Dimension(40, 30));
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });

        btn_ima.setText("i");
        btn_ima.setPreferredSize(new java.awt.Dimension(40, 30));
        btn_ima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_uno, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btn_dos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_tres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_cinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_seven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_punto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_pn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_real, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ima, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(166, 166, 166))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_seis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_real, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_uno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_seven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jtf_muestra.setEditable(false);
        jtf_muestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_muestraActionPerformed(evt);
            }
        });

        btn_enviar.setText("Guardar");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        lbl_r.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_r.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_r.setText("r");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("e");

        lbl_tetha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tetha.setText("i(°)");

        AC.setText("A/C");
        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(AC)
                        .addGap(138, 138, 138)
                        .addComponent(btn_enviar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(lbl_r)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_tetha)))
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jtf_muestra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(337, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_r, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lbl_tetha)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_enviar)
                    .addComponent(AC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(jtf_muestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(193, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_muestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_muestraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_muestraActionPerformed

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
    String resultador=r;
    String resultadot=tetha;
    double rr;
    float t;
    if(resultador.equals("")||resultador.equals("r")){
       rr=0;// TODO add your handling code here:
    }
       else{
        
        rr=Double.parseDouble(resultador);
    }
    if(resultadot.equals("")||resultadot.equals("°")){
       t=0;// TODO add your handling code here:
    }                                          
    else{
        t=Float.parseFloat(resultadot);
    }
    //Operaciones.o.lista[Operaciones.o.contador]=new NumComplejo(x,y);
    Operaciones.o.z2 = new NumComplejo(rr,t);
    Operaciones.o.load_2();
    this.setVisible(false);
    Operaciones.o.setVisible(true);
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed
        jtf_muestra.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_ACActionPerformed

    private void btn_imaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imaActionPerformed
        tetha = jtf_muestra.getText();
        lbl_tetha.setText("i("+tetha+")");
        jtf_muestra.setText("");
        btn_punto.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_btn_imaActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        if(jtf_muestra.getText().equals("")){
            jtf_muestra.setText("0.");
            btn_punto.setEnabled(false);
        }
        else{
            jtf_muestra.setText(jtf_muestra.getText()+".");
            btn_punto.setEnabled(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_realActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_realActionPerformed
        r = jtf_muestra.getText();
        lbl_r.setText(r);
        jtf_muestra.setText("");// TODO add your handling code here:
        btn_punto.setEnabled(true);
    }//GEN-LAST:event_btn_realActionPerformed

    private void btn_cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cuatroActionPerformed
        jtf_muestra.setText(jtf_muestra.getText()+"4");        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cuatroActionPerformed

    private void btn_pnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pnActionPerformed
        double muestras = Double.parseDouble(jtf_muestra.getText());
        muestras = muestras*-1;// TODO add your handling code here:
        jtf_muestra.setText(muestras+"");
    }//GEN-LAST:event_btn_pnActionPerformed

    private void btn_sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sevenActionPerformed
        jtf_muestra.setText(jtf_muestra.getText()+"7");        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sevenActionPerformed

    private void btn_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_unoActionPerformed
        // TODO add your handling code here:
        jtf_muestra.setText(jtf_muestra.getText()+"1");
    }//GEN-LAST:event_btn_unoActionPerformed

    private void btn_dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dosActionPerformed
        jtf_muestra.setText(jtf_muestra.getText()+"2");   // TODO add your handling code here:
    }//GEN-LAST:event_btn_dosActionPerformed

    private void btn_ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ochoActionPerformed
        jtf_muestra.setText(jtf_muestra.getText()+"8");        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ochoActionPerformed

    private void btn_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cincoActionPerformed
        jtf_muestra.setText(jtf_muestra.getText()+"5");        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cincoActionPerformed

    private void btn_ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ceroActionPerformed
        jtf_muestra.setText(jtf_muestra.getText()+"0");        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ceroActionPerformed

    private void btn_seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seisActionPerformed
        jtf_muestra.setText(jtf_muestra.getText()+"6");        // TODO add your handling code here:
    }//GEN-LAST:event_btn_seisActionPerformed

    private void btn_nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nueveActionPerformed
        jtf_muestra.setText(jtf_muestra.getText()+"9");        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nueveActionPerformed

    private void btn_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tresActionPerformed
        jtf_muestra.setText(jtf_muestra.getText()+"3");        // TODO add your handling code here:
    }//GEN-LAST:event_btn_tresActionPerformed
    
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AC;
    private javax.swing.JButton btn_cero;
    private javax.swing.JButton btn_cinco;
    private javax.swing.JButton btn_cuatro;
    private javax.swing.JButton btn_dos;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_ima;
    private javax.swing.JButton btn_nueve;
    private javax.swing.JButton btn_ocho;
    private javax.swing.JButton btn_pn;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_real;
    private javax.swing.JButton btn_seis;
    private javax.swing.JButton btn_seven;
    private javax.swing.JButton btn_tres;
    private javax.swing.JButton btn_uno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtf_muestra;
    private javax.swing.JLabel lbl_r;
    private javax.swing.JLabel lbl_tetha;
    // End of variables declaration//GEN-END:variables
}
