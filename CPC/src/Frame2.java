
import java.awt.Component;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hayou1838
 */
public class Frame2 extends javax.swing.JFrame {

    /**
     * Creates new form Frame2
     */
    public Frame2() {
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

        Background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        toF1fromF2 = new javax.swing.JMenuItem();
        toF3fromF3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 350));

        Background.setBackground(new java.awt.Color(204, 204, 255));
        Background.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        jLabel1.setText("The functioning O_O");
        Background.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 70);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Background.add(jButton1);
        jButton1.setBounds(240, 240, 73, 30);

        jTextField1.setText("jTextField1");
        Background.add(jTextField1);
        jTextField1.setBounds(90, 70, 500, 30);

        jLabel2.setText("Liquidity");
        Background.add(jLabel2);
        jLabel2.setBounds(10, 70, 70, 30);

        jLabel3.setText("Profitability");
        Background.add(jLabel3);
        jLabel3.setBounds(10, 110, 70, 30);

        jLabel4.setText("Solvency");
        Background.add(jLabel4);
        jLabel4.setBounds(10, 150, 70, 30);

        jTextField2.setText("jTextField2");
        Background.add(jTextField2);
        jTextField2.setBounds(90, 110, 500, 30);

        jTextField3.setText("jTextField3");
        Background.add(jTextField3);
        jTextField3.setBounds(90, 150, 500, 30);

        jMenu1.setText("Go to");

        toF1fromF2.setText("Frame 1");
        toF1fromF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toF1fromF2ActionPerformed(evt);
            }
        });
        jMenu1.add(toF1fromF2);

        toF3fromF3.setText("Frame 3");
        toF3fromF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toF3fromF3ActionPerformed(evt);
            }
        });
        jMenu1.add(toF3fromF3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object[] options = {"Yes", "Hold on"};
        String s = (String)JOption
        Component frame = null;
int n = JOptionPane.showOptionDialog(frame,"Are you sure?", "Redirect", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void toF1fromF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toF1fromF2ActionPerformed
        this.setVisible(false);
        new Frame1().setVisible(true);
    }//GEN-LAST:event_toF1fromF2ActionPerformed

    private void toF3fromF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toF3fromF3ActionPerformed
        this.setVisible(false);
        new Frame3().setVisible(true);
    }//GEN-LAST:event_toF3fromF3ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JMenuItem toF1fromF2;
    private javax.swing.JMenuItem toF3fromF3;
    // End of variables declaration//GEN-END:variables
}
