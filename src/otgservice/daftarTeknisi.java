/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otgservice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Andy
 */
public class daftarTeknisi extends javax.swing.JFrame {

    /**
     * Creates new form daftarTeknisi
     */
    public static String FotoDiri;
    File foto1;
    public static String FotoPengenal;
    File foto2;
    String jk;
    public String kode;
    String kode_teknisi;
    public daftarTeknisi() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        cbjob = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tbuname = new javax.swing.JTextField();
        tbpass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        tbnama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tbalamat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tbkota = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tbtelp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        rbpria = new javax.swing.JRadioButton();
        rbwanita = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        fotoPribadi1 = new otgservice.FotoPribadi();
        fotoPengenal2 = new otgservice.FotoPengenal();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel1.setText("FORM PENDAFTARAN TEKNISI BARU");

        cbjob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEKNISI KOMPUTER", "TEKNISI MOTOR", "TEKNISI MOBIL", "TEKNISI MESIN" }));
        cbjob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjobActionPerformed(evt);
            }
        });

        jLabel2.setText("SPECIALIS");

        jLabel3.setText("USERNAME");

        jLabel4.setText("PASSWORD");

        jLabel5.setText("NAMA LENGKAP");
        jLabel5.setToolTipText("");

        jLabel6.setText("ALAMAT");

        jLabel7.setText("KOTA");

        jLabel8.setText("TELEPON");
        jLabel8.setToolTipText("");

        jButton1.setText("DAFTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("FOTO PRIBADI");

        jButton3.setText("BROWSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setText("TANDA PENGENAL");

        jButton4.setText("BROWSE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbpria);
        rbpria.setText("Pria");
        rbpria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbpriaMouseClicked(evt);
            }
        });

        buttonGroup1.add(rbwanita);
        rbwanita.setText("Wanita");
        rbwanita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbwanitaMouseClicked(evt);
            }
        });

        jLabel11.setText("JENIS KELAMIN");

        javax.swing.GroupLayout fotoPribadi1Layout = new javax.swing.GroupLayout(fotoPribadi1);
        fotoPribadi1.setLayout(fotoPribadi1Layout);
        fotoPribadi1Layout.setHorizontalGroup(
            fotoPribadi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        fotoPribadi1Layout.setVerticalGroup(
            fotoPribadi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fotoPengenal2Layout = new javax.swing.GroupLayout(fotoPengenal2);
        fotoPengenal2.setLayout(fotoPengenal2Layout);
        fotoPengenal2Layout.setHorizontalGroup(
            fotoPengenal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        fotoPengenal2Layout.setVerticalGroup(
            fotoPengenal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jLabel12.setText("KODE TEKNISI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel4))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel11)))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbjob, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbuname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbpass, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(rbpria)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbwanita)))
                                .addGap(215, 215, 215)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jButton3)))
                            .addComponent(tbnama, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(fotoPribadi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel6)
                        .addGap(66, 66, 66)
                        .addComponent(tbalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel7))
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jButton1)
                                .addGap(10, 10, 10)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbkota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbtelp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(215, 215, 215)
                        .addComponent(fotoPengenal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(246, 246, 246)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jLabel12)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbjob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(tbuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(tbpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tbnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbpria)
                            .addComponent(rbwanita)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(11, 11, 11)
                        .addComponent(jButton3))
                    .addComponent(fotoPribadi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel10))
                            .addComponent(jButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(tbalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tbkota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tbtelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(fotoPengenal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         Login.f1.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tbnama.getText().equals("")||tbalamat.getText().equals("")||tbkota.getText().equals("")||tbtelp.getText().equals("")
                ||tbuname.getText().equals("") || tbpass.getText().equals("") || (rbpria.isSelected()==false && rbwanita.isSelected()==false) || FotoDiri.equals("") || FotoPengenal.equals("")) {
            JOptionPane.showMessageDialog(this, "Semua Field dan Foto harus diisi");
        }
        else{
            String insert_uname = "insert into dbusername values('" + tbuname.getText() + "','" + tbpass.getText() + "')";
            int status = OTGService.execute(insert_uname);
            if (status == 1) 
            {
                JOptionPane.showMessageDialog(this, "Username berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                try {
                    String sql = "INSERT INTO teknisi (KODETEKNISI, NAMATEKNISI, JENISKELAMIN, KOTA, ALAMAT, NOTELP, TANDAPENGENAL,FOTOPRIBADI, USERNAME) values ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement statement = OTGService.setKoneksi().prepareStatement(sql);
                    statement.setString(1, kode_teknisi);
                    statement.setString(2, tbnama.getText());
                    statement.setString(3, jk);
                    statement.setString(4, tbkota.getText());
                    statement.setString(5, tbalamat.getText());
                    statement.setString(6, tbtelp.getText());
                    
                    InputStream FotoKTP = new FileInputStream(new File(FotoPengenal));
                    statement.setBlob(7, FotoKTP);                    
                    
                    InputStream PasFoto = new FileInputStream(new File(FotoDiri));
                    statement.setBlob(8, PasFoto);
                    
                    statement.setString(9, tbuname.getText());
                    
                    int row = statement.executeUpdate();
                    if (row > 0) {
                        JOptionPane.showMessageDialog(this, "Selamat Anda Sudah Terdaftar Sebagai Teknisi Kami", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                        Login.f1.setVisible(false);
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "Masih Gagal", "Gagal", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(daftarTeknisi.class.getName()).log(Level.SEVERE, null, ex);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(daftarTeknisi.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "Username gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JFileChooser OpenFile = new JFileChooser();
        OpenFile.showOpenDialog(null);
        foto1 = OpenFile.getSelectedFile();
        FotoDiri = foto1.getAbsolutePath();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JFileChooser OpenFile = new JFileChooser();
        OpenFile.showOpenDialog(null);
        foto2 = OpenFile.getSelectedFile();
        FotoPengenal = foto2.getAbsolutePath();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cbjobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjobActionPerformed
        // TODO add your handling code here:
        if (cbjob.getSelectedItem().toString().equals("TEKNISI KOMPUTER")){
            kode = "TKO";
        }
        else if (cbjob.getSelectedItem().toString().equals("TEKNISI MOTOR")){
            kode = "TMT";
        }
        else if (cbjob.getSelectedItem().toString().equals("TEKNISI MOBIL")){
            kode = "TMB";
        }
        else if (cbjob.getSelectedItem().toString().equals("TEKNISI MESIN")){
            kode = "TME";
        }
        int kode1;
        String cari_kode = "SELECT MAX(SUBSTR(KODETEKNISI,4)) FROM `teknisi` WHERE KODETEKNISI LIKE '" + kode + "%'";
        ResultSet rs = OTGService.executeQuery(cari_kode);
        try {
            while(rs.next()) {
                kode1 = rs.getInt(1) + 1;
                if (kode1<10) {
                    kode_teknisi = kode + "00" + kode1;
                }
                else if (kode1 < 100) {
                    kode_teknisi = kode + "0" + kode1;
                }
                else if (kode1 < 1000){
                    kode_teknisi = kode + kode1;
                }
            jLabel12.setText(kode_teknisi);
            }
            
        } 
        catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_cbjobActionPerformed

    private void rbpriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbpriaMouseClicked
        // TODO add your handling code here:
        jk = "P";
    }//GEN-LAST:event_rbpriaMouseClicked

    private void rbwanitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbwanitaMouseClicked
        // TODO add your handling code here:
        jk = "W";
    }//GEN-LAST:event_rbwanitaMouseClicked

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
            java.util.logging.Logger.getLogger(daftarTeknisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftarTeknisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftarTeknisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftarTeknisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftarTeknisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbjob;
    private otgservice.FotoPengenal fotoPengenal2;
    private otgservice.FotoPribadi fotoPribadi1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbpria;
    private javax.swing.JRadioButton rbwanita;
    private javax.swing.JTextField tbalamat;
    private javax.swing.JTextField tbkota;
    private javax.swing.JTextField tbnama;
    private javax.swing.JPasswordField tbpass;
    private javax.swing.JTextField tbtelp;
    private javax.swing.JTextField tbuname;
    // End of variables declaration//GEN-END:variables
}