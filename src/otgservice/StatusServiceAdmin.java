/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otgservice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static otgservice.MasterBarang.selectDataBarang;

/**
 *
 * @author Andy
 */
public class StatusServiceAdmin extends javax.swing.JFrame {

    /**
     * Creates new form StatusBarang
     */
    String nama_customer;
    String nama_teknisi;
    String kode_service2;
    String kode_teknisi2;
    String kode_customer2;
    String nama_customer2;
    String status_book;
    public StatusServiceAdmin() {
        initComponents();
        selectData2();
    }
    
    public void selectData(){
        if (rbnamacust.isSelected() == false){
            if (rbkodeser.isSelected() == true){
                kode_service2 = tbsearch.getText();
            }
            else if (rbkodetek.isSelected() == true){
                kode_teknisi2 = tbsearch.getText();
            }
            else if (rbkodecust.isSelected() == true){
                kode_customer2 = tbsearch.getText();
            }
            else if (rbkodeser.isSelected()==false && rbkodetek.isSelected()==false && rbkodecust.isSelected()==false){
                kode_service2 = "%";
                kode_teknisi2 = "%";
                kode_customer2 = "%";    
            }
            String kolom[] = {"KODE_BOOKING","NAMA_CUSTOMER","NAMA_TEKNISI","NAMA_BARANG","TANGGAL MASUK","KETERANGAN","STATUS"}; //kolom untuk jTable yang ada di form
            DefaultTableModel dtm = new DefaultTableModel(null, kolom);
            String SQLSearch = "select b.KODEBOOKING, c.NAMACUSTOMER, t.NAMATEKNISI, b.NAMABARANG, b.TANGGALMASUK, b.KETERANGAN, b.STATUS from teknisi t, customer c, booking b where t.kodeteknisi = b.KODETEKNISI and c.KODECUSTOMER = b.KODECUSTOMER and (B.KODEBOOKING LIKE '"+ kode_service2 +"' or c.kodecustomer LIKE '"+ kode_customer2+"' or t.kodeteknisi LIKE '"+kode_teknisi2+"')";
            ResultSet rs = OTGService.executeQuery(SQLSearch);
            try {
                while(rs.next()) {
                String kode_booking = rs.getString(1);
                String nama_customer3 = rs.getString(2);         
                String nama_teknisi2 = rs.getString(3);              
                String nama_barang = rs.getString(4);                
                String tanggal_masuk = rs.getString(5);
                String keterangan = rs.getString(6);
                String status = rs.getString(7);

                String data[] = {kode_booking, nama_customer3, nama_teknisi2, nama_barang, tanggal_masuk, keterangan, status};
                dtm.addRow(data);
                }
            } catch (SQLException ex) {
                Logger.getLogger(StatusServiceCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
            tbldata.setModel(dtm);
            kode_customer2="";
            kode_service2="";
            kode_teknisi2="";
        }
        else if (rbnamacust.isSelected() == true){
            nama_customer2 = tbsearch.getText().toUpperCase();
            String kolom[] = {"KODE_BOOKING","NAMA_CUSTOMER","NAMA_TEKNISI","NAMA_BARANG","TANGGAL MASUK","KETERANGAN","STATUS"}; //kolom untuk jTable yang ada di form
            DefaultTableModel dtm = new DefaultTableModel(null, kolom);
            String SQLSearch = "select b.KODEBOOKING, c.NAMACUSTOMER, t.NAMATEKNISI, b.NAMABARANG, b.TANGGALMASUK, b.KETERANGAN, b.STATUS from teknisi t, customer c, booking b where t.kodeteknisi = b.KODETEKNISI and c.KODECUSTOMER = b.KODECUSTOMER and c.namacustomer LIKE '%" + nama_customer2 + "'";
            ResultSet rs = OTGService.executeQuery(SQLSearch);
            try {
                while(rs.next()) {
                String kode_booking = rs.getString(1);
                String nama_customer3 = rs.getString(2);         
                String nama_teknisi2 = rs.getString(3);              
                String nama_barang = rs.getString(4);                
                String tanggal_masuk = rs.getString(5);
                String keterangan = rs.getString(6);
                String status = rs.getString(7);

                String data[] = {kode_booking, nama_customer3, nama_teknisi2, nama_barang, tanggal_masuk, keterangan, status};
                dtm.addRow(data);
                }
            } catch (SQLException ex) {
                Logger.getLogger(StatusServiceCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
            tbldata.setModel(dtm);
        }
    }
    
    public void selectData2(){
        String kolom[] = {"KODE_BOOKING","NAMA_CUSTOMER","NAMA_TEKNISI","NAMA_BARANG","TANGGAL MASUK","KETERANGAN","STATUS"}; //kolom untuk jTable yang ada di form
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "select b.KODEBOOKING, c.NAMACUSTOMER, t.NAMATEKNISI, b.NAMABARANG, b.TANGGALMASUK, b.KETERANGAN, b.STATUS from teknisi t, customer c, booking b where t.kodeteknisi = b.KODETEKNISI and c.KODECUSTOMER = b.KODECUSTOMER";
        ResultSet rs = OTGService.executeQuery(SQL);
        try {
            while(rs.next()) {
            String kode_booking = rs.getString(1);
            String nama_customer3 = rs.getString(2);         
            String nama_teknisi2 = rs.getString(3);              
            String nama_barang = rs.getString(4);                
            String tanggal_masuk = rs.getString(5);
            String keterangan = rs.getString(6);
            String status = rs.getString(7);

            String data[] = {kode_booking, nama_customer3, nama_teknisi2, nama_barang, tanggal_masuk, keterangan, status};
            dtm.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StatusServiceAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbldata.setModel(dtm);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();
        lbsearch = new javax.swing.JLabel();
        rbkodeser = new javax.swing.JRadioButton();
        rbkodecust = new javax.swing.JRadioButton();
        rbkodetek = new javax.swing.JRadioButton();
        rbnamacust = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        tbsearch = new javax.swing.JTextField();
        btsearch = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rbsdh = new javax.swing.JRadioButton();
        rbdiambil = new javax.swing.JRadioButton();
        rbbelum = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Status Service");

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

        lbsearch.setText("Search By");

        buttonGroup1.add(rbkodeser);
        rbkodeser.setText("Kode Service");

        buttonGroup1.add(rbkodecust);
        rbkodecust.setText("Kode Customer");

        buttonGroup1.add(rbkodetek);
        rbkodetek.setText("Kode Teknisi");

        buttonGroup1.add(rbnamacust);
        rbnamacust.setText("Nama Cutomer");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btsearch.setText("Search");
        btsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbsdh);
        rbsdh.setText("SUDAH DIPERBAIKI");

        buttonGroup2.add(rbdiambil);
        rbdiambil.setText("SUDAH DIAMBIL");

        buttonGroup2.add(rbbelum);
        rbbelum.setText("BELUM DIPERBAIKI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lbsearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbkodeser)
                                    .addComponent(rbkodetek))
                                .addGap(37, 37, 37)
                                .addComponent(rbnamacust))
                            .addComponent(rbkodecust))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(317, 317, 317)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(267, 267, 267)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbbelum)
                                            .addComponent(rbdiambil)
                                            .addComponent(rbsdh))))))))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(380, 380, 380))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbsearch)
                    .addComponent(rbkodeser)
                    .addComponent(rbnamacust)
                    .addComponent(tbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbsdh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbkodecust)
                    .addComponent(btsearch)
                    .addComponent(rbdiambil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbkodetek)
                    .addComponent(rbbelum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:        
        MainMenuAdmin.f2.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsearchActionPerformed
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_btsearchActionPerformed

    private void tbldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldataMouseClicked
        // TODO add your handling code here:
        int baris = tbldata.getSelectedRow();
        String status = tbldata.getValueAt(baris, 6).toString();
        if (status.equalsIgnoreCase(rbbelum.getText())){
            rbbelum.setSelected(true);
        }
        else if (status.equalsIgnoreCase(rbsdh.getText())){
            rbsdh.setSelected(true);
        }
        else if (status.equalsIgnoreCase(rbdiambil.getText())){
            rbdiambil.setSelected(true);
        }
    }//GEN-LAST:event_tbldataMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int baris = tbldata.getSelectedRow();
        if (rbsdh.isSelected()==true){
            status_book = rbsdh.getText();
        }
        else if (rbdiambil.isSelected()==true){
            status_book = rbdiambil.getText();
        }
        if (baris != -1) 
        {
            String kode_booking = tbldata.getValueAt(baris, 0).toString();
            String SQL = "UPDATE BOOKING SET STATUS = '"+status_book+"' WHERE KODEBOOKING = '"+kode_booking+"'";
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
        selectData();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(StatusServiceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatusServiceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatusServiceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatusServiceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatusServiceAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btsearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lbsearch;
    private javax.swing.JRadioButton rbbelum;
    private javax.swing.JRadioButton rbdiambil;
    public static javax.swing.JRadioButton rbkodecust;
    public static javax.swing.JRadioButton rbkodeser;
    public static javax.swing.JRadioButton rbkodetek;
    public static javax.swing.JRadioButton rbnamacust;
    private javax.swing.JRadioButton rbsdh;
    private static javax.swing.JTable tbldata;
    public static javax.swing.JTextField tbsearch;
    // End of variables declaration//GEN-END:variables
}
