/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ThemSua_HocPhanController;
import controller.ThemSua_LopHocController;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.LopHoc;

public class ThemSua_LopHoc extends javax.swing.JFrame {

    /**
     * Creates new form ThemSua_Lop
     */
    public ThemSua_LopHoc() {
        initComponents();
        init();
    }

    public ThemSua_LopHoc(Admin adminView) {
        this.adminView = adminView;
        initComponents();
        init();
    }

    public void init() {
        this.themSuaLopHocController = new ThemSua_LopHocController(this);
        ActionListener action = new ThemSua_LopHocController(this);
        this.jButton_Luu.addActionListener(action);
    }

    public void suaLopHoc(LopHoc lopHoc) {
        this.jTextField_MaLop.setText(lopHoc.getMaLop());
        this.jTextField_MaLop.setEditable(false);
        this.jTextField_MaHocPhan.setText(lopHoc.getMaHP());
        this.jTextField_MSGV.setText(lopHoc.getMSGV());
        this.jTextField_PhongHoc.setText(lopHoc.getPhongHoc());
        this.jTextField_ThoiGian.setText(lopHoc.getThoiGian());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_MaLop = new javax.swing.JTextField();
        jTextField_MaHocPhan = new javax.swing.JTextField();
        jTextField_MSGV = new javax.swing.JTextField();
        jTextField_PhongHoc = new javax.swing.JTextField();
        jTextField_ThoiGian = new javax.swing.JTextField();
        jButton_Luu = new javax.swing.JButton();
        jButton_Huy = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã lớp");

        jLabel2.setText("Mã học phần");

        jLabel3.setText("MSGV");

        jLabel5.setText("Phòng học");

        jLabel6.setText("Thời gian");

        jButton_Luu.setText("Lưu");
        jButton_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LuuActionPerformed(evt);
            }
        });

        jButton_Huy.setText("Huỷ");
        jButton_Huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton_Luu)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_MaLop)
                    .addComponent(jTextField_MaHocPhan, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jTextField_MSGV)
                    .addComponent(jTextField_PhongHoc)
                    .addComponent(jTextField_ThoiGian)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton_Huy)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_MaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_MaHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_MSGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_PhongHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_ThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Luu)
                    .addComponent(jButton_Huy))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_HuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_HuyActionPerformed

    private void jButton_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LuuActionPerformed
        // TODO add your handling code here:t
        this.adminView.init();
    }//GEN-LAST:event_jButton_LuuActionPerformed

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
            java.util.logging.Logger.getLogger(ThemSua_LopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemSua_LopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemSua_LopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemSua_LopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ThemSua_LopHoc().setVisible(true);
            }
        });
    }
    public Admin adminView;
    private ThemSua_LopHocController themSuaLopHocController;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Huy;
    private javax.swing.JButton jButton_Luu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField_MSGV;
    private javax.swing.JTextField jTextField_MaHocPhan;
    private javax.swing.JTextField jTextField_MaLop;
    private javax.swing.JTextField jTextField_PhongHoc;
    private javax.swing.JTextField jTextField_ThoiGian;
    // End of variables declaration//GEN-END:variables

    public JButton getjButton_Huy() {
        return jButton_Huy;
    }

    public void setjButton_Huy(JButton jButton_Huy) {
        this.jButton_Huy = jButton_Huy;
    }

    public JButton getjButton_Luu() {
        return jButton_Luu;
    }

    public void setjButton_Luu(JButton jButton_Luu) {
        this.jButton_Luu = jButton_Luu;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JTextField getjTextField_MSGV() {
        return jTextField_MSGV;
    }

    public void setjTextField_MSGV(JTextField jTextField_MSGV) {
        this.jTextField_MSGV = jTextField_MSGV;
    }

    public JTextField getjTextField_MaHopPhan() {
        return jTextField_MaHocPhan;
    }

    public void setjTextField_MaHopPhan(JTextField jTextField_MaHopPhan) {
        this.jTextField_MaHocPhan = jTextField_MaHopPhan;
    }

    public JTextField getjTextField_MaLop() {
        return jTextField_MaLop;
    }

    public void setjTextField_MaLop(JTextField jTextField_MaLop) {
        this.jTextField_MaLop = jTextField_MaLop;
    }

    public JTextField getjTextField_PhongHoc() {
        return jTextField_PhongHoc;
    }

    public void setjTextField_PhongHoc(JTextField jTextField_PhongHoc) {
        this.jTextField_PhongHoc = jTextField_PhongHoc;
    }

    public JTextField getjTextField_ThoiGian() {
        return jTextField_ThoiGian;
    }

    public void setjTextField_ThoiGian(JTextField jTextField_ThoiGian) {
        this.jTextField_ThoiGian = jTextField_ThoiGian;
    }

}
