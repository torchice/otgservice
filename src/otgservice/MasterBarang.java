/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otgservice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andy
 */
public class MasterBarang extends javax.swing.JFrame {

    /**
     * Creates new form MasterBarang
     */
    public static String jenis_brg;
    public static String jenis="%";
    public MasterBarang() {
        initComponents();
        selectDataBarang();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbkode = new javax.swing.JLabel();
        lbjenis = new javax.swing.JLabel();
        tbnama = new javax.swing.JTextField();
        spstok = new javax.swing.JSpinner();
        spharju = new javax.swing.JSpinner();
        spharpok = new javax.swing.JSpinner();
        rbkomp = new javax.swing.JRadioButton();
        rbmot = new javax.swing.JRadioButton();
        rbmob = new javax.swing.JRadioButton();
        rbme = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MASTER BARANG");

        tbldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbldata);

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Kode Barang :");

        jLabel3.setText("Jenis Barang :");

        jLabel4.setText("Nama Barang");
        jLabel4.setToolTipText("");

        jLabel5.setText("Stok");

        jLabel6.setText("Harga_Jual");

        jLabel7.setText("Harga_Pokok");

        lbkode.setText("Kode Barang");

        lbjenis.setText("Jenis Barang");

        buttonGroup1.add(rbkomp);
        rbkomp.setText("Komputer");
        rbkomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbkompActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbmot);
        rbmot.setText("Motor");
        rbmot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmotActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbmob);
        rbmob.setText("Mobil");
        rbmob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmobActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbme);
        rbme.setText("Mesin");
        rbme.setToolTipText("");
        rbme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1)
                        .addGap(168, 397, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(rbkomp)
                        .addGap(18, 18, 18)
                        .addComponent(rbmot)
                        .addGap(18, 18, 18)
                        .addComponent(rbmob)
                        .addGap(18, 18, 18)
                        .addComponent(rbme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbkode)
                        .addComponent(lbjenis)
                        .addComponent(spstok, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spharju)
                        .addComponent(spharpok, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tbnama, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbkode))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbjenis))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tbnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(spstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(spharju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(spharpok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jButton3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbkomp)
                        .addComponent(rbmot)
                        .addComponent(rbmob)
                        .addComponent(rbme)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MainMenuAdmin.f2.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int baris = tbldata.getSelectedRow();
        if (baris != -1) 
        {
            String kode_barang = tbldata.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM BARANG WHERE KODEBARANG = '"+kode_barang+"'";
            int status = OTGService.execute(SQL);
            if (status==1) 
            {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
        selectDataBarang();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldataMouseClicked
        // TODO add your handling code here: 
        int baris = tbldata.getSelectedRow();
        
        if (baris != -1) 
        {
            lbkode.setText(tbldata.getValueAt(baris, 0).toString());
            lbjenis.setText(tbldata.getValueAt(baris, 1).toString());
            tbnama.setText(tbldata.getValueAt(baris, 2).toString());
            spstok.setValue(Integer.parseInt(tbldata.getValueAt(baris, 3).toString()));
            spharju.setValue(Integer.parseInt(tbldata.getValueAt(baris, 4).toString()));
            spharpok.setValue(Integer.parseInt(tbldata.getValueAt(baris, 5).toString()));
        }
    }//GEN-LAST:event_tbldataMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int baris = tbldata.getSelectedRow();
        if (baris != -1) 
        {
            String kode_barang = tbldata.getValueAt(baris, 0).toString();
            int stok = Integer.parseInt(spstok.getValue().toString());
            int harju = Integer.parseInt(spharju.getValue().toString());
            int harpok = Integer.parseInt(spharpok.getValue().toString());
            String SQL = "UPDATE BARANG SET NAMABARANG = '"+tbnama.getText()+"', STOK = "+stok+", HARGAJUAL = "+harju+", HARGAPOKOK = "+harpok+" WHERE KODEBARANG = '"+kode_barang+"'";
            int status = OTGService.execute(SQL);
            if (status==1) 
            {
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "Data gagal diupdate", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
        selectDataBarang();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rbkompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbkompActionPerformed
        // TODO add your handling code here:
        if (rbkomp.isSelected() == true){
            jenis = "3";
        }
        selectDataBarang();
    }//GEN-LAST:event_rbkompActionPerformed

    private void rbmotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmotActionPerformed
        // TODO add your handling code here:
        if (rbmot.isSelected() == true){
            jenis = "1";
        }
        selectDataBarang();
    }//GEN-LAST:event_rbmotActionPerformed

    private void rbmobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmobActionPerformed
        // TODO add your handling code here:
        if (rbmob.isSelected() == true){
            jenis = "2";
        }
        selectDataBarang();
    }//GEN-LAST:event_rbmobActionPerformed

    private void rbmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmeActionPerformed
        // TODO add your handling code here:
        if (rbme.isSelected() == true){
            jenis = "4";
        }
        selectDataBarang();
    }//GEN-LAST:event_rbmeActionPerformed

    public static void selectDataBarang() 
    {
        String kolom[] = {"KODE_BARANG","JENIS_BARANG","NAMA_BARANG","STOK","HARGA_JUAL","HARGA_POKOK"}; //kolom untuk jTable yang ada di form
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM BARANG WHERE JENISBARANG LIKE '"+jenis+"'";
        ResultSet rs = OTGService.executeQuery(SQL);
        try {
            while(rs.next()) {
                String kode_barang = rs.getString(1);
                String jenis_barang = rs.getString(2);
                if (jenis_barang.equals("1")) {
                    jenis_brg = "Motor";
                }
                else if (jenis_barang.equals("2")) {
                    jenis_brg = "Mobil";
                }
                else if (jenis_barang.equals("3")) {
                    jenis_brg = "Komputer";
                }
                else if (jenis_barang.equals("4")) {
                    jenis_brg = "Mesin";
                }
                String nama_barang = rs.getString(3);
                String stok = rs.getString(4);
                String harga_jual = rs.getString(5);
                String harga_pokok = rs.getString(6);

                String data[] = {kode_barang, jenis_brg, nama_barang, stok, harga_jual, harga_pokok};
                dtm.addRow(data);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(StatusServiceAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbldata.setModel(dtm);
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
            java.util.logging.Logger.getLogger(MasterBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbjenis;
    private javax.swing.JLabel lbkode;
    private javax.swing.JRadioButton rbkomp;
    private javax.swing.JRadioButton rbme;
    private javax.swing.JRadioButton rbmob;
    private javax.swing.JRadioButton rbmot;
    private javax.swing.JSpinner spharju;
    private javax.swing.JSpinner spharpok;
    private javax.swing.JSpinner spstok;
    private static javax.swing.JTable tbldata;
    private javax.swing.JTextField tbnama;
    // End of variables declaration//GEN-END:variables
}
