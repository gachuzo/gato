/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

/**
 *
 * @author gachu
 */
import java.lang.Math.*;
import javax.swing.JOptionPane;
public class Menu extends javax.swing.JFrame {
    /**VARIABLES UTILIZADAS QUE DEFINEN PRIMERA POSICION, BANDERA PARA DETERMINAR
    SI ESTRO EN UN CASE, SI LA MAQUINA REALIZO SU TURNO, DETERMINAR LA POSICION
    DONDE PONDRA LA MAQUINA Y DETERMINAR LA MEJOR POSICION**/
    int primeraPosicion=0,ban=0,turnoMaquina=0;
    String posicionDeX = "",posicion="";;
    Boolean noPos=false;
    /**
     * Creates new form Menu
     */
    public Menu() {
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
        jButton1_1 = new javax.swing.JButton();
        jButton1_2 = new javax.swing.JButton();
        jButton1_3 = new javax.swing.JButton();
        jButton2_1 = new javax.swing.JButton();
        jButton2_2 = new javax.swing.JButton();
        jButton2_3 = new javax.swing.JButton();
        jButton3_1 = new javax.swing.JButton();
        jButton3_2 = new javax.swing.JButton();
        jButton3_3 = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonReanudar = new javax.swing.JButton();
        jButtonIniciarPartida = new javax.swing.JButton();
        etiquetaJugadorMaquina = new javax.swing.JLabel();
        etiquetaJugadorHumano = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Gato"); // NOI18N

        jButton1_1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1_1.setEnabled(false);
        jButton1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_1ActionPerformed(evt);
            }
        });

        jButton1_2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1_2.setEnabled(false);
        jButton1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_2ActionPerformed(evt);
            }
        });

        jButton1_3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1_3.setEnabled(false);
        jButton1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_3ActionPerformed(evt);
            }
        });

        jButton2_1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2_1.setEnabled(false);
        jButton2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_1ActionPerformed(evt);
            }
        });

        jButton2_2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2_2.setEnabled(false);
        jButton2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_2ActionPerformed(evt);
            }
        });

        jButton2_3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2_3.setEnabled(false);
        jButton2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_3ActionPerformed(evt);
            }
        });

        jButton3_1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3_1.setEnabled(false);
        jButton3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_1ActionPerformed(evt);
            }
        });

        jButton3_2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3_2.setEnabled(false);
        jButton3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_2ActionPerformed(evt);
            }
        });

        jButton3_3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3_3.setEnabled(false);
        jButton3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton3_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jButton1_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2_2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(jButton3_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3_3, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1_3, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2_1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jButton2_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3_1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jButton3_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonReanudar.setText("Reanudar");
        jButtonReanudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReanudarActionPerformed(evt);
            }
        });

        jButtonIniciarPartida.setText("Iniciar Partida");
        jButtonIniciarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarPartidaActionPerformed(evt);
            }
        });

        etiquetaJugadorMaquina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaJugadorMaquina.setText("Maquina = X");

        etiquetaJugadorHumano.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaJugadorHumano.setText("Jugador = O");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaJugadorMaquina)
                            .addComponent(etiquetaJugadorHumano))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonIniciarPartida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonReanudar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(etiquetaJugadorMaquina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaJugadorHumano)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonIniciarPartida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonReanudar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalir)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        // SALIR DEL JUEGO
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButton1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_1ActionPerformed
        // TODO add your handling code here:
       // PONER MARCA DEL USUARIO
        if(jButton1_1.getText()==""){
            jButton1_1.setText("O");
            turnoMaquina();
        }
    }//GEN-LAST:event_jButton1_1ActionPerformed

    private void jButton1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_2ActionPerformed
        // TODO add your handling code here:
        // PONER MARCA DEL USUARIO
          if(jButton1_2.getText()==""){
            jButton1_2.setText("O");
            turnoMaquina();
        }
    }//GEN-LAST:event_jButton1_2ActionPerformed

    private void jButton1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_3ActionPerformed
        // TODO add your handling code here:
        // PONER MARCA DEL USUARIO
          if(jButton1_3.getText()==""){
            jButton1_3.setText("O");
            turnoMaquina();
        }
    }//GEN-LAST:event_jButton1_3ActionPerformed

    private void jButton2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_1ActionPerformed
        // TODO add your handling code here:
        // PONER MARCA DEL USUARIO
          if(jButton2_1.getText()==""){
            jButton2_1.setText("O");
            turnoMaquina();
        }
    }//GEN-LAST:event_jButton2_1ActionPerformed

    private void jButton2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_2ActionPerformed
        // TODO add your handling code here:
        // PONER MARCA DEL USUARIO
          if(jButton2_2.getText()==""){
            jButton2_2.setText("O");
            turnoMaquina();
        }
    }//GEN-LAST:event_jButton2_2ActionPerformed

    private void jButton2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_3ActionPerformed
        // TODO add your handling code here:
        // PONER MARCA DEL USUARIO
          if(jButton2_3.getText()==""){
            jButton2_3.setText("O");
            turnoMaquina();
        }
    }//GEN-LAST:event_jButton2_3ActionPerformed

    private void jButton3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_1ActionPerformed
        // TODO add your handling code here:
        // PONER MARCA DEL USUARIO
          if(jButton3_1.getText()==""){
            jButton3_1.setText("O");
            turnoMaquina();
        }
    }//GEN-LAST:event_jButton3_1ActionPerformed

    private void jButton3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_2ActionPerformed
        // TODO add your handling code here:
        // PONER MARCA DEL USUARIO
          if(jButton3_2.getText()==""){
            jButton3_2.setText("O");
            turnoMaquina();
        }
    }//GEN-LAST:event_jButton3_2ActionPerformed

    private void jButton3_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_3ActionPerformed
        // TODO add your handling code here:
        // PONER MARCA DEL USUARIO
          if(jButton3_3.getText()==""){
            jButton3_3.setText("O");
            turnoMaquina();
        }
    }//GEN-LAST:event_jButton3_3ActionPerformed

    private void jButtonReanudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReanudarActionPerformed
        // TODO add your handling code here:
        // REINICIAR EL JUEGO
        reanudar();
        habilitar(true);
        iniciarPartida();
    }//GEN-LAST:event_jButtonReanudarActionPerformed

    private void jButtonIniciarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarPartidaActionPerformed
        // TODO add your handling code here:
        // INICIAR EL JUEGO
        iniciarPartida();
    }//GEN-LAST:event_jButtonIniciarPartidaActionPerformed

    // BORRA LAS MARCAS PARA PREPARAR UN NUEVO JUEGO
    public void reanudar(){
        jButton1_1.setText("");
        jButton1_2.setText("");
        jButton1_3.setText("");
        jButton2_1.setText("");
        jButton2_2.setText("");
        jButton2_3.setText("");
        jButton3_1.setText("");
        jButton3_2.setText("");
        jButton3_3.setText("");
    }
    // DEFINE LA POSICION DE LA MARCA DE LA MAQUINA
    public void turnoMaquina (){
        turnoMaquina=0;
        posicionDeX = definirPosicion("X");
        noPos=false;
        noPos=ponerX(posicionDeX,"X");
        mejorPosicion(noPos,posicionDeX);
        if(turnoMaquina==0){
            posicionDeX=definirPosicion("O");
            noPos=ponerX(posicionDeX,"X");
            if(noPos==false){
                mejorPosicion(noPos,posicionDeX);
            }
        }
        verificarGanador();
    }
    // DETERMINA LA MEJOR POSICION PARA LA MAQUINA
    public void mejorPosicion(Boolean noPos_2, String posicionDeX_2){
        if(posicionDeX_2=="" || noPos_2==false){
            posicionDeX=definirPosicion("O");
            noPos=ponerX(posicionDeX,"X");
            if(noPos==false){
                if (primeraPosicion==1&&jButton3_3.getText()==""){
                    jButton3_3.setText("X"); noPos=true;turnoMaquina=1;                  
                }else if(jButton1_3.getText()==""){
                    jButton1_3.setText("X");noPos=true;turnoMaquina=1;
                }else if(jButton3_1.getText()==""){
                    jButton3_1.setText("X");noPos=true;turnoMaquina=1;
                }
            }
            if(noPos==false){
                if (primeraPosicion==2&&jButton3_1.getText()==""){
                    jButton3_1.setText("X"); noPos=true;turnoMaquina=1;                 
                }else if(jButton1_1.getText()==""){
                    jButton1_1.setText("X");noPos=true;turnoMaquina=1;
                }else if(jButton3_3.getText()==""){
                    jButton3_3.setText("X");noPos=true;turnoMaquina=1;
                }
            }
            if(noPos==false){
                if (primeraPosicion==3&&jButton1_3.getText()==""){
                    jButton1_3.setText("X"); noPos=true;turnoMaquina=1;                
                }else if(jButton1_1.getText()==""){
                    jButton1_1.setText("X");noPos=true;turnoMaquina=1;
                }else if(jButton3_3.getText()==""){
                    jButton3_3.setText("X");noPos=true;turnoMaquina=1;
                }
            }
            if(noPos==false){
                if (primeraPosicion==4&&jButton1_1.getText()==""){
                    jButton3_1.setText("X");  noPos=true;turnoMaquina=1;                
                }else if(jButton1_3.getText()==""){
                    jButton1_3.setText("X");noPos=true;turnoMaquina=1;
                }else if(jButton3_1.getText()==""){
                    jButton3_1.setText("X");noPos=true;turnoMaquina=1;
                }
            }
        }        
    }
    // PONE LA MARCA DE LA MAQUINA EN EL JUEGO
    public Boolean ponerX(String posi, String n){
        ban=0;
        switch(posi){
            case "fila1":
                if(jButton1_1.getText()==""){jButton1_1.setText(n);turnoMaquina=1;}
                if(jButton1_2.getText()==""){jButton1_2.setText(n);turnoMaquina=1;}
                if(jButton1_3.getText()==""){jButton1_3.setText(n);turnoMaquina=1;}
                ban=1;
                break;
            case "fila2":
                if(jButton2_1.getText()==""){jButton2_1.setText(n);turnoMaquina=1;}
                if(jButton2_2.getText()==""){jButton2_2.setText(n);turnoMaquina=1;}
                if(jButton2_3.getText()==""){jButton2_3.setText(n);turnoMaquina=1;}
                ban=1;
                break;
            case "fila3":
                if(jButton3_1.getText()==""){jButton3_1.setText(n);turnoMaquina=1;}
                if(jButton3_2.getText()==""){jButton3_2.setText(n);turnoMaquina=1;}
                if(jButton3_3.getText()==""){jButton3_3.setText(n);turnoMaquina=1;}
                ban=1;
                break;
            case "col1":
                if(jButton1_1.getText()==""){jButton1_1.setText(n);turnoMaquina=1;}
                if(jButton2_1.getText()==""){jButton2_1.setText(n);turnoMaquina=1;}
                if(jButton3_1.getText()==""){jButton3_1.setText(n);turnoMaquina=1;}
                ban=1;
                break;
            case "col2":
                if(jButton1_2.getText()==""){jButton1_2.setText(n);turnoMaquina=1;}
                if(jButton2_2.getText()==""){jButton2_2.setText(n);turnoMaquina=1;}
                if(jButton3_2.getText()==""){jButton3_2.setText(n);turnoMaquina=1;}
                ban=1;
                break;
            case "col3":
                if(jButton1_3.getText()==""){jButton1_3.setText(n);turnoMaquina=1;}
                if(jButton2_3.getText()==""){jButton2_3.setText(n);turnoMaquina=1;}
                if(jButton3_3.getText()==""){jButton3_3.setText(n);turnoMaquina=1;}
                ban=1;
                break;
            case "diag1":
                if(jButton1_1.getText()==""){jButton1_1.setText(n);turnoMaquina=1;}
                if(jButton2_2.getText()==""){jButton2_2.setText(n);turnoMaquina=1;}
                if(jButton3_3.getText()==""){jButton3_3.setText(n);turnoMaquina=1;} 
                ban=1;
                break;
            case "diag2":
                if(jButton1_3.getText()==""){jButton1_3.setText(n);turnoMaquina=1;}
                if(jButton2_2.getText()==""){jButton2_2.setText(n);turnoMaquina=1;}
                if(jButton3_1.getText()==""){jButton3_1.setText(n);turnoMaquina=1;}
                ban=1;
                break;
        }
        if(ban==0){
            return false;
        }else{return true;}
    }
    // DETERMINA UNA POSICION DE VICTORIA O PARA EVITAR PERDIDA PARA LA MAQUINA
    public String definirPosicion(String n){
        posicion="";
        //VALIDACION DE FILA 1
        if( (jButton1_1.getText()==n&&jButton1_2.getText()==n&&jButton1_3.getText()=="")||(jButton1_2.getText()==n&&jButton1_3.getText()==n&&jButton1_1.getText()=="")||(jButton1_1.getText()==n&&jButton1_3.getText()==n&&jButton1_2.getText()=="") ){
            posicion="fila1";
        }
        //VALIDACION DE FILA 2
        if( (jButton2_1.getText()==n&&jButton2_2.getText()==n&&jButton2_3.getText()=="")||(jButton2_2.getText()==n&&jButton2_3.getText()==n&&jButton2_1.getText()=="")||(jButton2_1.getText()==n&&jButton2_3.getText()==n&&jButton2_2.getText()=="") ){
            posicion="fila2";
        }
        //VALIDACION DE FILA 3
        if( (jButton3_1.getText()==n&&jButton3_2.getText()==n&&jButton3_3.getText()=="")||(jButton3_2.getText()==n&&jButton3_3.getText()==n&&jButton3_1.getText()=="")||(jButton3_1.getText()==n&&jButton3_3.getText()==n&&jButton3_2.getText()=="") ){
            posicion="fila3";
        }
        //VALIDACION DE COLUMNA 1
        if( (jButton1_1.getText()==n&&jButton2_1.getText()==n&&jButton3_1.getText()=="")||(jButton2_1.getText()==n&&jButton3_1.getText()==n&&jButton1_1.getText()=="")||(jButton1_1.getText()==n&&jButton3_1.getText()==n&&jButton2_1.getText()=="") ){
            posicion="col1";
        }
        //VALIDACION DE COLUMNA 2
        if( (jButton1_2.getText()==n&&jButton2_2.getText()==n&&jButton3_2.getText()=="")||(jButton2_2.getText()==n&&jButton3_2.getText()==n&&jButton1_2.getText()=="")||(jButton1_2.getText()==n&&jButton3_2.getText()==n&&jButton2_2.getText()=="") ){
            posicion="col2";
        }
        //VALIDACION DE COLUMNA 3
        if( (jButton1_3.getText()==n&&jButton2_3.getText()==n&&jButton3_3.getText()=="")||(jButton2_3.getText()==n&&jButton3_3.getText()==n&&jButton1_3.getText()=="")||(jButton1_3.getText()==n&&jButton3_3.getText()==n&&jButton2_3.getText()=="") ){
            posicion="col3";
        }
        //VALIDACION DE DIAGONAL 1
        if( (jButton1_1.getText()==n&&jButton2_2.getText()==n&&jButton3_3.getText()=="")||(jButton2_2.getText()==n&&jButton3_3.getText()==n&&jButton1_1.getText()=="")||(jButton1_1.getText()==n&&jButton3_3.getText()==n&&jButton2_2.getText()=="") ){
            posicion="diag1";
        }
        //VALIDACION DE DIAGONAL 2
        if( (jButton1_3.getText()==n&&jButton2_2.getText()==n&&jButton3_1.getText()=="")||(jButton2_2.getText()==n&&jButton3_1.getText()==n&&jButton1_3.getText()=="")||(jButton1_3.getText()==n&&jButton3_1.getText()==n&&jButton2_2.getText()=="") ){
            posicion="diag2";
        }
        return posicion;
    }
    // VERIFICA SI HAY UN GANADOR
    public void verificarGanador(){
        //***VALIDACION DE USUARIO
        //VALIDACION EN LINEAS HORIZONTALES
        if( jButton1_1.getText()=="O"&&jButton1_2.getText()=="O"&&jButton1_3.getText()=="O"){
            habilitar(false);
            mensajeGanador("O");
        }
        if( jButton2_1.getText()=="O"&&jButton2_2.getText()=="O"&&jButton2_3.getText()=="O"){
            habilitar(false);
            mensajeGanador("O");
        }
        if( jButton3_1.getText()=="O"&&jButton3_2.getText()=="O"&&jButton3_3.getText()=="O"){
            habilitar(false);
            mensajeGanador("O");
        }
        //VALIDACION EN LINEAS VERTICALES
        if( jButton1_1.getText()=="O"&&jButton2_1.getText()=="O"&&jButton3_1.getText()=="O"){
            habilitar(false);
            mensajeGanador("O");
        }
        if( jButton1_2.getText()=="O"&&jButton2_2.getText()=="O"&&jButton3_2.getText()=="O"){
            habilitar(false);
            mensajeGanador("O");
        }
        if( jButton1_3.getText()=="O"&&jButton2_3.getText()=="O"&&jButton3_3.getText()=="O"){
            habilitar(false);
            mensajeGanador("O");
        }
        //VALIDACION EN LINEAS DIAGONALES
        if( jButton1_1.getText()=="O"&&jButton2_2.getText()=="O"&&jButton3_3.getText()=="O"){
            habilitar(false);
            mensajeGanador("O");
        }
        if( jButton1_3.getText()=="O"&&jButton2_2.getText()=="O"&&jButton3_1.getText()=="O"){
            habilitar(false);
            mensajeGanador("O");
        }
        //***VALIDACION DE MAQUINA
        //VALIDACION EN LINEAS HORIZONTALES
        if( jButton1_1.getText()=="X"&&jButton1_2.getText()=="X"&&jButton1_3.getText()=="X"){
            habilitar(false);
            mensajeGanador("X");
        }
        if( jButton2_1.getText()=="X"&&jButton2_2.getText()=="X"&&jButton2_3.getText()=="X"){
            habilitar(false);
            mensajeGanador("X");
        }
        if( jButton3_1.getText()=="X"&&jButton3_2.getText()=="X"&&jButton3_3.getText()=="X"){
            habilitar(false);
            mensajeGanador("X");
        }
        //VALIDACION EN LINEAS VERTICALES
        if( jButton1_1.getText()=="X"&&jButton2_1.getText()=="X"&&jButton3_1.getText()=="X"){
            habilitar(false);
            mensajeGanador("X");
        }
        if( jButton1_2.getText()=="X"&&jButton2_2.getText()=="X"&&jButton3_2.getText()=="X"){
            habilitar(false);
            mensajeGanador("X");
        }
        if( jButton1_3.getText()=="X"&&jButton2_3.getText()=="X"&&jButton3_3.getText()=="X"){
            habilitar(false);
            mensajeGanador("X");
        }
        //VALIDACION EN LINEAS DIAGONALES
        if( jButton1_1.getText()=="X"&&jButton2_2.getText()=="X"&&jButton3_3.getText()=="X"){
            habilitar(false);
            mensajeGanador("X");
        }
        if( jButton1_3.getText()=="X"&&jButton2_2.getText()=="X"&&jButton3_1.getText()=="X"){
            habilitar(false);
            mensajeGanador("X");
        }
    }
    // MUESTRA EL MENSAJE SI SE HA GANADO O PERDIDO EL JUEGO
    public void mensajeGanador(String gana){
        if(gana=="X"){
            JOptionPane.showMessageDialog(null,"Has Perdido!!");
        }else {JOptionPane.showMessageDialog(null,"Has Ganado!!");}
    }
    // DETERMINA LA PRIMERA POSICION PARA LA MAQUINA
    public void primerTurnoMaquina(){
        primeraPosicion = (int) (Math.random()*4+1);
        //String prueba= String.valueOf(primeraPosicion);
        if(primeraPosicion==1){
            jButton1_1.setText("X");
        }else if(primeraPosicion==2){
            jButton1_3.setText("X");
        }else if(primeraPosicion==3){
            jButton3_1.setText("X");
        }else{
            jButton3_3.setText("X");
        }         
    }
    // INICIA EL JUEGO
    public void iniciarPartida(){       
        reanudar();
        habilitar(true);
        primerTurnoMaquina();
    }
    // HABILITA O DEHABILITA EL TABLERO DEL JUEGO
    public void habilitar(Boolean habilita){
        jButton1_1.setEnabled(habilita);
        jButton1_2.setEnabled(habilita);
        jButton1_3.setEnabled(habilita);
        jButton2_1.setEnabled(habilita);
        jButton2_2.setEnabled(habilita);
        jButton2_3.setEnabled(habilita);
        jButton3_1.setEnabled(habilita);
        jButton3_2.setEnabled(habilita);
        jButton3_3.setEnabled(habilita);
    }
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaJugadorHumano;
    private javax.swing.JLabel etiquetaJugadorMaquina;
    private javax.swing.JButton jButton1_1;
    private javax.swing.JButton jButton1_2;
    private javax.swing.JButton jButton1_3;
    private javax.swing.JButton jButton2_1;
    private javax.swing.JButton jButton2_2;
    private javax.swing.JButton jButton2_3;
    private javax.swing.JButton jButton3_1;
    private javax.swing.JButton jButton3_2;
    private javax.swing.JButton jButton3_3;
    private javax.swing.JButton jButtonIniciarPartida;
    private javax.swing.JButton jButtonReanudar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
