/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poo.interfaces;

import br.com.poo.modelo.Carrinho;
import br.com.poo.modelo.Data;
import br.com.poo.modelo.Evento;
import br.com.poo.modelo.Hora;
import br.com.poo.modelo.Local;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author nirto
 */
public class InterfaceIngresso extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceIngresso
     */
    public InterfaceIngresso() {
        
        initComponents();
        ingresso();
    
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblArtistaCanhoto = new javax.swing.JLabel();
        lblArtista = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblLocal = new javax.swing.JLabel();
        lblValorCanhoto = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblEvento = new javax.swing.JLabel();
        lblIngresso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblArtistaCanhoto.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        lblArtistaCanhoto.setForeground(new java.awt.Color(204, 0, 153));
        lblArtistaCanhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArtistaCanhoto.setText("Artista");
        lblArtistaCanhoto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblArtistaCanhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 270));

        lblArtista.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        lblArtista.setForeground(new java.awt.Color(98, 78, 108));
        lblArtista.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblArtista.setText("Artista");
        getContentPane().add(lblArtista, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 530, 60));

        lblData.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        lblData.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblData.setText("DD/MM/AAAA");
        getContentPane().add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 550, 50));

        lblHora.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHora.setText("Horario");
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 180, 550, -1));

        lblLocal.setFont(new java.awt.Font("Lucida Fax", 1, 30)); // NOI18N
        lblLocal.setText("Local");
        getContentPane().add(lblLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        lblValorCanhoto.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        lblValorCanhoto.setText("Valor");
        getContentPane().add(lblValorCanhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        lblValor.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        lblValor.setText("Valor");
        getContentPane().add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        lblEvento.setFont(new java.awt.Font("Lucida Calligraphy", 1, 30)); // NOI18N
        lblEvento.setForeground(new java.awt.Color(204, 0, 153));
        lblEvento.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEvento.setText("Evento");
        getContentPane().add(lblEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 550, -1));
        getContentPane().add(lblIngresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InterfaceIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceIngresso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblArtista;
    private javax.swing.JLabel lblArtistaCanhoto;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEvento;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblIngresso;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValorCanhoto;
    // End of variables declaration//GEN-END:variables

    private void ingresso() {
        lblIngresso.setIcon(new ImageIcon("imagens/Molde-Ingresso.png"));
    }
    
    public void imprimirIngresso(Carrinho ingresso){
        lblArtista.setText(ingresso.getArtista());
        lblArtistaCanhoto.setText(ingresso.getArtista());
        lblData.setText(ingresso.getData().toString());
        lblEvento.setText(ingresso.getNomeEvento());
        lblHora.setText(ingresso.getHorario().toString());
        lblLocal.setText(ingresso.getLocal());
        lblValor.setText("R$ " + Double.toString(ingresso.getValor()));
        lblValorCanhoto.setText(Double.toString(ingresso.getValor()));
        
    }

}
