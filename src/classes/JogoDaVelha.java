/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;




/**
 *
 * @author Thulio
 */
public class JogoDaVelha extends javax.swing.JFrame {

    /**
     * Creates new form JogoDaVelha
     */
    int jogador = 0;
    int velha = 0;
    int venceu = 0;
    int mat[][] = new int[3][3];
    DefaultListModel vlista = new DefaultListModel();
    ImageIcon imagemX = new ImageIcon(getClass().getResource("/imagens/x.png"));
    ImageIcon imagemO = new ImageIcon(getClass().getResource("/imagens/o.png"));
    
    
    public JogoDaVelha() {
        initComponents();
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                mat[i][j] = 0;
            }
            
        }
        
        
    }
    
    public void checaFim(){
        if (mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2] &&(mat[0][0] != 0 && mat[1][1] != 0 && mat[2][2] !=0) && venceu == 0){
            btn1.setBackground(Color.RED);
            btn5.setBackground(Color.RED);
            btn9.setBackground(Color.RED);
            if (mat[0][0] == 1) {
                lblMsg.setText("O JOGADOR [ O ] VENCEU!");
            } else {
                lblMsg.setText("O JOGADOR [ X ] VENCEU!");
            }
            venceu = 1;
        }else if (mat[2][0] == mat[1][1] && mat[1][1] == mat[0][2] &&(mat[2][0] != 0 && mat[1][1] != 0 && mat[0][2] !=0)&& venceu == 0){
            btn3.setBackground(Color.RED);
            btn5.setBackground(Color.RED);
            btn7.setBackground(Color.RED);
            if (mat[2][0] == 1) {
                lblMsg.setText("O JOGADOR [ O ] VENCEU!");
            } else {
                lblMsg.setText("O JOGADOR [ X ] VENCEU!");
            }            
            venceu = 1;
        }        
    }
    
    public void checaLinha(){
        for (int i =0;i<=2;i++){            
            if (mat[i][0] == mat[i][1] && mat[i][1] == mat[i][2]&&(mat[i][0] != 0 && mat[i][1] != 0 && mat[i][2] !=0)&& venceu == 0){
                if (i == 0){
                    btn1.setBackground(Color.RED);
                    btn2.setBackground(Color.RED);;
                    btn3.setBackground(Color.RED);
                    if (mat[0][0] == 1) {
                        lblMsg.setText("O JOGADOR [ O ] VENCEU!");
                    } else {
                        lblMsg.setText("O JOGADOR [ X ] VENCEU!");
                    }            
                    venceu = 1;
                }else if (i == 1){
                    btn4.setBackground(Color.RED);
                    btn5.setBackground(Color.RED);
                    btn6.setBackground(Color.RED);
                    if (mat[1][0] == 1) {
                        lblMsg.setText("O JOGADOR [ O ] VENCEU!");
                    } else {
                        lblMsg.setText("O JOGADOR [ X ] VENCEU!");
                    }            
                    venceu = 1;
                }else if (i == 2){
                    btn7.setBackground(Color.RED);
                    btn8.setBackground(Color.RED);
                    btn9.setBackground(Color.RED);
                    if (mat[2][0] == 1) {
                        lblMsg.setText("O JOGADOR [ O ] VENCEU!");
                    } else {
                        lblMsg.setText("O JOGADOR [ X ] VENCEU!");
                    }            
                    venceu = 1;
                }
            }
        
        }
    }
    
    public void checaColuna(){
        for (int i =0;i<=2;i++){            
            if (mat[0][i] == mat[1][i] && mat[1][i] == mat[2][i]&&(mat[0][i] != 0 && mat[1][i] != 0 && mat[2][i] !=0)&& venceu == 0){
                if (i == 0){
                    btn1.setBackground(Color.RED);
                    btn4.setBackground(Color.RED);
                    btn7.setBackground(Color.RED);
                    if (mat[0][0] == 1) {
                        lblMsg.setText("O JOGADOR [ O ] VENCEU!");
                    } else {
                        lblMsg.setText("O JOGADOR [ X ] VENCEU!");
                    }            
                    venceu = 1;
                }else if (i == 1){
                    btn2.setBackground(Color.RED);
                    btn5.setBackground(Color.RED);
                    btn8.setBackground(Color.RED);
                    if (mat[1][1] == 1) {
                        lblMsg.setText("O JOGADOR [ O ] VENCEU!");
                    } else {
                        lblMsg.setText("O JOGADOR [ X ] VENCEU!");
                    }            
                    venceu = 1;
                }else if (i == 2){
                    btn3.setBackground(Color.RED);
                    btn6.setBackground(Color.RED);
                    btn9.setBackground(Color.RED);
                    if (mat[2][2] == 1) {
                        lblMsg.setText("O JOGADOR [ O ] VENCEU!");
                    } else {
                        lblMsg.setText("O JOGADOR [ X ] VENCEU!");
                    }            
                    venceu = 1;
                }
            }
        
        }
    }
    
    public void checaVelha(){
        if (velha == 9 && venceu == 0){
            lblMsg.setText("[X X X] DEU VELHA [X X X]");
        
            btn1.setBackground(Color.ORANGE);
            btn2.setBackground(Color.ORANGE);
            btn3.setBackground(Color.ORANGE);
            btn4.setBackground(Color.ORANGE);
            btn5.setBackground(Color.ORANGE);
            btn6.setBackground(Color.ORANGE);
            btn7.setBackground(Color.ORANGE);
            btn8.setBackground(Color.ORANGE);
            btn9.setBackground(Color.ORANGE);
        }      
    }
    public void escreveBtn(JButton botao){
        
        if(botao.getIcon() == null){
            if (jogador == 0 && velha < 9 && venceu == 0){
                //lblMsg.setText("");
                botao.setIcon(imagemX);
                velha = velha+1;                
                jogador = jogador + 1;
            }
            else if (jogador == 1 && velha < 9 && venceu == 0){
                //lblMsg.setText("");
                botao.setIcon(imagemO);
                velha = velha+1;
                jogador = jogador - 1;
            }
        }else
            if (velha < 9 && venceu == 0){
                String msg = "";
                if (botao.getIcon().equals(imagemX)){
                    msg = String.format("ERRO, [ X ] JA MARCADO!!!");
                }
                else if (botao.getIcon().equals(imagemO)){
                    msg = String.format("ERRO, [ O ] JA MARCADO!!!");
                }
                lblMsg.setText(msg);
            }
        
        }       
        
    
    public void jogada(int x, int y,int jogador){
    if (jogador == 0 && mat[x][y] == 0){
        mat[x][y] = 1;
    }else if (jogador == 1 && mat[x][y] == 0){
        mat[x][y] = 2;
    }
    }
    
    public void checar(){
        checaFim();
        checaLinha();
        checaColuna();
        checaVelha();
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
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();
        lblMsg1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReset.setText("REINICIAR");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnReset)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblMsg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblMsg1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMsg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMsg1.setText("JOGO DA VELHA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMsg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMsg1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        escreveBtn(btn2);
        jogada(0, 1, jogador);
        checar();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        escreveBtn(btn1);
        jogada(0, 0, jogador);
        checar();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        escreveBtn(btn3);
        jogada(0, 2, jogador);
        checar();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        escreveBtn(btn4);
        jogada(1, 0, jogador);
        checar();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        escreveBtn(btn5);
        jogada(1, 1, jogador);
        checar();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        escreveBtn(btn6);
        jogada(1, 2, jogador);
        checar();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
       escreveBtn(btn7);
       jogada(2, 0, jogador);
       checar();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        escreveBtn(btn8);
        jogada(2, 1, jogador);
        checar();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
       escreveBtn(btn9);
       jogada(2, 2, jogador);
       checar();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        jogador = 0;
        btn1.setIcon(null);
        btn1.setBackground(null);
        btn2.setIcon(null);
        btn2.setBackground(null);
        btn3.setIcon(null);
        btn3.setBackground(null);
        btn4.setIcon(null);
        btn4.setBackground(null);
        btn5.setIcon(null);
        btn5.setBackground(null);
        btn6.setIcon(null);
        btn6.setBackground(null);
        btn7.setIcon(null);
        btn7.setBackground(null);
        btn8.setIcon(null);
        btn8.setBackground(null);
        btn9.setIcon(null);
        btn9.setBackground(null);

        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                mat[i][j] = 0;
            }
            
        }
        
        velha = 0;
        venceu = 0;
        lblMsg.setText("JOGO REINICIADO!");
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnReset;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblMsg1;
    // End of variables declaration//GEN-END:variables
}
