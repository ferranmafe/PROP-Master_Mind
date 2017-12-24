package Presentacion;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public abstract class vistaPartida extends javax.swing.JPanel {

    protected CtrlPresentacion CP;
    protected VistaPrincipal VP;
    
    protected int j = 0;
    protected int card = 0;
    
    public vistaPartida(CtrlPresentacion CP, VistaPrincipal VP) {
        this.CP = CP;
        this.VP = VP;
        initComponents();
        jLabel1.setVisible(false);
        inicializarPanelEntrada(jPanel_entrada);
        
        /*
        up.setEnabled(false);
        down.setEnabled(false);
        */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opciones = new javax.swing.JButton();
        jugar = new javax.swing.JButton();
        jPanel_entrada = new javax.swing.JPanel();
        jPanel_tablero = new javax.swing.JPanel();
        up = new javax.swing.JButton();
        down = new javax.swing.JButton();
        jPanel_sol = new javax.swing.JPanel();
        jPanel_NB = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(640, 480));

        opciones.setText("Opciones");
        opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesActionPerformed(evt);
            }
        });

        jugar.setText("Jugar");
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });

        jPanel_entrada.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel_entrada.setLayout(new java.awt.GridLayout(1, 0));

        jPanel_tablero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel_tablero.setLayout(new java.awt.CardLayout());

        up.setText("Up");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });

        down.setText("Down");
        down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downActionPerformed(evt);
            }
        });

        jPanel_sol.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel_sol.setLayout(new java.awt.GridLayout(1, 4));

        jPanel_NB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel_NB.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Solucion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(opciones)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(down)
                            .addComponent(jPanel_sol, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel_tablero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jPanel_NB, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jugar)))
                        .addGap(137, 137, 137)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel_NB, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opciones)
                                    .addComponent(jPanel_sol, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addComponent(up)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(down))
                            .addComponent(jPanel_tablero, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jugar)
                        .addGap(56, 56, 56))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesActionPerformed
        String msj = "Selecciona opcion";
        Object[] options = {"Guardar","Salir y guardar","Salir"};
         int n = JOptionPane.showOptionDialog(this,
                msj,
                "Mensaje",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
        switch (n) {
            case 2:
                VP.goMenuPrincipal();
                break;
            case 1:
                CP.guardarPartida();
                VP.goMenuPrincipal();
                break;
            case 0:
                CP.guardarPartida();
                break;
        }
    }//GEN-LAST:event_opcionesActionPerformed

    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
        datosIntroducidos();
    }//GEN-LAST:event_jugarActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        if (card > 0) {
            /*
            --card;
            if (card == 0) {
                up.setEnabled(false);
                down.setEnabled(true);
            }
            */
            ((CardLayout) jPanel_NB.getLayout()).previous(jPanel_NB);
            ((CardLayout) jPanel_tablero.getLayout()).previous(jPanel_tablero);
        }
        
    }//GEN-LAST:event_upActionPerformed

    private void downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed
        if (card < j/6) {
            /*
            ++card;
            if (card == j/6) {
                down.setEnabled(false);
                up.setEnabled(true);
            }
            */
            ((CardLayout) jPanel_NB.getLayout()).next(jPanel_NB);
            ((CardLayout) jPanel_tablero.getLayout()).next(jPanel_tablero);
        }
    }//GEN-LAST:event_downActionPerformed

    public void cargarPartida(ArrayList<String> info) {
        j = 0;
        
        for (int i = 4; i < info.size(); i += 2) {
            String candidato = info.get(i);
            String NB = null;
            if (i+1 < info.size()) NB = info.get(i+1);

            if (j%6 == 0) {
                tablero_act = new JPanel(new GridLayout(6,4));
                inicializarTablero(tablero_act);
                jPanel_tablero.add(tablero_act);
                ((CardLayout) jPanel_tablero.getLayout()).next(jPanel_tablero);
                
                NB_act = new JPanel(new GridLayout(12,2));
                inicializarTablero(NB_act);
                jPanel_NB.add(NB_act);
                ((CardLayout) jPanel_NB.getLayout()).next(jPanel_NB);
            }
            for (int u = 0; u < 4; ++u) {
                tablero_act.getComponent(4*(j%6)+u).setBackground(intToColor(Character.getNumericValue(candidato.charAt(u))));
                tablero_act.getComponent(4*(j%6)+u).setVisible(true);
            }
            if (NB == null) { ++j; return; }
            int num_N = Character.getNumericValue(NB.charAt(0));
            int num_B = Character.getNumericValue(NB.charAt(1));
            for (int q = 0; q < 4; ++q) {
                if (q < num_N) {
                    NB_act.getComponent(4*(j%6)+q).setVisible(true);
                    NB_act.getComponent(4*(j%6)+q).setBackground(Color.black);
                }
                else if (q-num_N < num_B) {
                    NB_act.getComponent(4*(j%6)+q).setVisible(true);
                    NB_act.getComponent(4*(j%6)+q).setBackground(Color.white);
                }
            }
            
            ++j;
        }
    }
    
    protected abstract void datosIntroducidos();
    
    protected abstract void inicializarPanelEntrada(JPanel jPanel_entrada);
    
    protected void inicializarTablero(JPanel panel) {
        for (int i = 0; i < 4*6; ++i) { // Inicializamos los botones del tablero
            JButton but = new JButton();
            but.setVisible(false);
            panel.add(but);
        }
    } 
    
    
    protected int colorToInt(Color c) {
        if (c == Color.red) return 1;
        if (c == Color.green) return 2;
        if (c == Color.blue) return 3;
        if (c == Color.cyan) return 4;
        if (c == Color.magenta) return 5;
        if (c == Color.yellow) return 6;
        else return 7;
    }
    
    protected Color intToColor(int i) {
        if (i == 1) return Color.red;
        if (i == 2) return Color.green;
        if (i == 3) return Color.blue;
        if (i == 4) return Color.cyan;
        if (i == 5) return Color.magenta;
        if (i == 6 )return Color.yellow;
        else return Color.orange;
    }
   
    protected javax.swing.JPanel NB_act;
    protected javax.swing.JPanel tablero_act;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton down;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JPanel jPanel_NB;
    protected javax.swing.JPanel jPanel_entrada;
    protected javax.swing.JPanel jPanel_sol;
    protected javax.swing.JPanel jPanel_tablero;
    protected javax.swing.JButton jugar;
    protected javax.swing.JButton opciones;
    protected javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables
}
