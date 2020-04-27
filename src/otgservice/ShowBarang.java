/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otgservice;

import java.awt.Frame;
import java.awt.Point;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andy
 */
public class ShowBarang extends javax.swing.JFrame {

    /**
     * Creates new form ShowBarang
     */
    public static String kode;
    public static Integer ctrtrans=1;
    public static Frame f2;
    public ShowBarang() {
        initComponents();
    //    new ShowBarang().setVisible(true);
        selectData();  
        pilih = new DefaultListModel();
        listbox.setModel(pilih);
        cekkode();
    }
      public void cekkode(){
       
        String cari_kode = "SELECT MAX(SUBSTR(KODETRANS,2)) FROM `DETAILTRANSAKSI2`";
        ResultSet rs = OTGService.executeQuery(cari_kode);
        try {
            while(rs.next()) {
                ctrtrans = rs.getInt(1) + 1;
                if (ctrtrans<10) {
                    kode = "H00" + String.valueOf(ctrtrans);
                }
                else if (ctrtrans >= 10 && ctrtrans <1000) {
                    kode = "H0" + String.valueOf(ctrtrans);
                }
                else if (ctrtrans > 1000){
                    kode = "H" + String.valueOf(ctrtrans);
                }
                
            
            }
            
        } 
        catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
  
    int ctrcart=0;
    public void inputtrans(){
            try {
               
                    String sql = "INSERT INTO detailtransaksi2 (KODETRANS, NAMABARANG, QUANTITY,HARGAPCS,USERNAME) values ( ?, ?, ?, ?, ?)";
                    PreparedStatement statement = OTGService.setKoneksi().prepareStatement(sql);
                    statement.setString(1, kode);
                    statement.setString(2, arrcart.get(ctrcart).getNama());
                    statement.setInt(3, arrcart.get(ctrcart).getStok());
                    statement.setInt(4, arrcart.get(ctrcart).getHargapcs());
                    statement.setString(5, otgservice.Login.username);
                    //ctrtrans++;
                    
                    //cekkode();
                    //ctrtrans++;
                    int row = statement.executeUpdate();
                     if (row > 0) {
                        JOptionPane.showMessageDialog(this, "Transaksi anda akan di proses", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "Masih Gagal", "Gagal", JOptionPane.INFORMATION_MESSAGE);
                    }
                
                   
                } catch (SQLException ex) {
                    Logger.getLogger(daftarTeknisi.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    
    public void selectData() 
    {
        String kolom[] = {"KodeBarang","Nama","Stok","Harga"}; //kolom untuk jTable yang ada di form
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);//untuk menyimpan hasil select
        
        String SQL = "SELECT kodebarang,namabarang,stok,hargajual FROM BARANG";
        ResultSet rs = OTGService.executeQuery(SQL);
        
        try {
            while(rs.next()) {
                String kodebarang = rs.getString(1);
                String namabarang = rs.getString(2);
                Integer stok=rs.getInt(3);
                Integer hargajual=rs.getInt(4);
                //String username=rs.getString(5);
                String data[] = {kodebarang,namabarang,String.valueOf(stok),String.valueOf(hargajual)};
                dtm.addRow(data);
                
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Masih Gagal", "Gagal", JOptionPane.INFORMATION_MESSAGE);

            Logger.getLogger(OTGService.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbldata.setModel(dtm);
    }
    
    
    public void selectjenis() 
    {
        int jns = 0;
        String kolom[] = {"Kode Barang","Nama","Stok","Harga",}; //kolom untuk jTable yang ada di form
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);//untuk menyimpan hasil select
        if (cb2.getSelectedItem().toString().equalsIgnoreCase("Motor")){
           jns=1; 
        }
        else if (cb2.getSelectedItem().toString().equalsIgnoreCase("Mobil")){
            jns=2;
        }
        else if (cb2.getSelectedItem().toString().equalsIgnoreCase("Mesin")){
            jns=4;
        }
        else if (cb2.getSelectedItem().toString().equalsIgnoreCase("Komputer")){
            jns=3;
        }
        String SQL = "SELECT kodebarang,namabarang,stok,hargajual FROM BARANG WHERE jenisbarang = "+ jns +"";
        ResultSet rs = OTGService.executeQuery(SQL);
        
        try {
            while(rs.next()) {
                String kodebarang = rs.getString(1);
                String namabarang = rs.getString(2);
                Integer stok=rs.getInt(3);
                Integer hargajual=rs.getInt(4);
    
                String data[] = {kodebarang,namabarang,String.valueOf(stok),String.valueOf(hargajual)};
                dtm.addRow(data);
                
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Masih Gagal", "Gagal", JOptionPane.INFORMATION_MESSAGE);

            Logger.getLogger(OTGService.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbldata.setModel(dtm);
    }
    public void selectDataAvailable() 
    {
        String kolom[] = {"Kode Barang","Nama","Stok","Harga",}; //kolom untuk jTable yang ada di form
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);//untuk menyimpan hasil select
        
        String SQL = "SELECT kodebarang,namabarang,stok,hargajual FROM BARANG WHERE STOK >=1";
        ResultSet rs = OTGService.executeQuery(SQL);
        
        try {
            while(rs.next()) {
                String kodebarang = rs.getString(1);
                String namabarang = rs.getString(2);
                Integer stok=rs.getInt(3);
                Integer hargajual=rs.getInt(4);
    
                String data[] = {kodebarang,namabarang,String.valueOf(stok),String.valueOf(hargajual)};
                dtm.addRow(data);
                
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Masih Gagal", "Gagal", JOptionPane.INFORMATION_MESSAGE);

            Logger.getLogger(OTGService.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbldata.setModel(dtm);
    }
     public void selectDataNonAvailable() 
    {
        String kolom[] = {"Kode Barang","Nama","Stok","Harga",}; //kolom untuk jTable yang ada di form
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);//untuk menyimpan hasil select
        
        String SQL = "SELECT kodebarang,namabarang,stok,hargajual FROM BARANG WHERE STOK < 1";
        ResultSet rs = OTGService.executeQuery(SQL);
        
        try {
            while(rs.next()) {
                String kodebarang = rs.getString(1);
                String namabarang = rs.getString(2);
                Integer stok=rs.getInt(3);
                Integer hargajual=rs.getInt(4);
    
                String data[] = {kodebarang,namabarang,String.valueOf(stok),String.valueOf(hargajual)};
                dtm.addRow(data);
                
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Masih Gagal", "Gagal", JOptionPane.INFORMATION_MESSAGE);

            Logger.getLogger(OTGService.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbldata.setModel(dtm);
    }
         public void selectDataNama() 
    {
        String kolom[] = {"Kode Barang","Nama","Stok","Harga",}; //kolom untuk jTable yang ada di form
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);//untuk menyimpan hasil select
        
        String SQL = "SELECT kodebarang,namabarang,stok,hargajual FROM BARANG WHERE namabarang like '%" + tbsearch.getText() + "%'";
        ResultSet rs = OTGService.executeQuery(SQL);
        
        try {
            while(rs.next()) {
                String kodebarang = rs.getString(1);
                String namabarang = rs.getString(2);
                Integer stok=rs.getInt(3);
                Integer hargajual=rs.getInt(4);
    
                String data[] = {kodebarang,namabarang,String.valueOf(stok),String.valueOf(hargajual)};
                dtm.addRow(data);
                
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Masih Gagal", "Gagal", JOptionPane.INFORMATION_MESSAGE);

            Logger.getLogger(OTGService.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbldata.setModel(dtm);
    }
     public Double [] hargasatuan = new Double[99];
     int totalharga;
        
         public void selectDataMax() 
    {
        String kolom[] = {"Kode Barang","Nama","Stok","Harga",}; //kolom untuk jTable yang ada di form
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);//untuk menyimpan hasil select
        
        String SQL = "SELECT kodebarang,namabarang,stok,hargajual FROM BARANG WHERE HARGAJUAL <=" + tbsearch.getText();
        ResultSet rs = OTGService.executeQuery(SQL);
        
        try {
            while(rs.next()) {
                String kodebarang = rs.getString(1);
                String namabarang = rs.getString(2);
                Integer stok=rs.getInt(3);
                Integer hargajual=rs.getInt(4);
    
                String data[] = {kodebarang,namabarang,String.valueOf(stok),String.valueOf(hargajual)};
                dtm.addRow(data);
                
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Masih Gagal", "Gagal", JOptionPane.INFORMATION_MESSAGE);

            Logger.getLogger(OTGService.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbldata.setModel(dtm);
    }
         public void selectDataMin() 
    {
        String kolom[] = {"Kode Barang","Nama","Stok","Harga",}; //kolom untuk jTable yang ada di form
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);//untuk menyimpan hasil select
        
        String SQL = "SELECT kodebarang,namabarang,stok,hargajual FROM BARANG WHERE HARGAJUAL >=" + tbsearch.getText();
        ResultSet rs = OTGService.executeQuery(SQL);
        
        try {
            while(rs.next()) {
                String kodebarang = rs.getString(1);
                String namabarang = rs.getString(2);
                Integer stok=rs.getInt(3);
                Integer hargajual=rs.getInt(4);
    
                String data[] = {kodebarang,namabarang,String.valueOf(stok),String.valueOf(hargajual)};
                dtm.addRow(data);
                
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Masih Gagal", "Gagal", JOptionPane.INFORMATION_MESSAGE);

            Logger.getLogger(OTGService.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tbsearch = new javax.swing.JTextField();
        ava = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        nava = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        nama = new javax.swing.JRadioButton();
        max = new javax.swing.JRadioButton();
        min = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listbox = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tbstok = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Frame Barang");

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

        jLabel2.setText("Jenis Barang");

        jButton1.setText("Buy Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(ava);
        ava.setText("Available");
        ava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaActionPerformed(evt);
            }
        });

        jLabel4.setText("Filter");

        buttonGroup1.add(nava);
        nava.setText("Non Available");

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(nama);
        nama.setText("Nama");

        buttonGroup1.add(max);
        max.setText("Harga Tertinggi");

        buttonGroup1.add(min);
        min.setText("Harga Minimum");

        listbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listboxMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listbox);

        jLabel3.setText("Akan dibeli");

        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motor", "Mobil", "Komputer", "Mesin", "All" }));

        jLabel5.setText("Total Harga:");

        jLabel6.setText("Stok Yang ingin");

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Keyword search");

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(min)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(nava, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ava, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(nama)
                                            .addComponent(max)
                                            .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(tbstok, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(27, 27, 27)
                                .addComponent(jButton3))
                            .addComponent(tbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(ava))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nava)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(max)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(min)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton2)
                                            .addComponent(jButton3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel3))))
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (ava.isSelected()){
            selectDataAvailable();
        }
        else if (nava.isSelected()){
            selectDataNonAvailable();
        }
        else if (nama.isSelected()){
            selectDataNama();
        }
        else if (max.isSelected()){
            selectDataMax();
        }
        else if (min.isSelected()){
            selectDataMin();
        }
        else if (cb2.getSelectedItem().toString().equalsIgnoreCase("Motor")){
            selectjenis();
        }
        else if (cb2.getSelectedItem().toString().equalsIgnoreCase("Mobil")){
            selectjenis();
        }
        else if (cb2.getSelectedItem().toString().equalsIgnoreCase("Komputer")){
            selectjenis();
        }
        else if (cb2.getSelectedItem().toString().equalsIgnoreCase("Mesin")){
            selectjenis();
        }
        else if (cb2.getSelectedItem().toString().equalsIgnoreCase("all")){
            selectData();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        inputtrans();
        ctrtrans++;
        f2 = new frameTransaksi();
        f2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
   String namacart;
    String kodebrg;
     int hargapcs;
   
    int harga=0;
    int stok;
    public static DefaultListModel pilih;
    public static ArrayList <barangDagang> arrcart =  new ArrayList<>();
    //public static ArrayList <Double> hargasatuan = new ArrayList<>();
    int cekstok;
    int qty;
    int index;
    
    private void tbldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldataMouseClicked
        // TODO add your handling code here:
        Point mouse = evt.getPoint();
        int row = tbldata.rowAtPoint(mouse);
        int col = tbldata.columnAtPoint(mouse);
        kodebrg=tbldata.getValueAt(row, 0).toString();
        namacart=tbldata.getValueAt(row, 1).toString();
        stok=Integer.parseInt(tbstok.getText());
        cekstok=Integer.parseInt(tbldata.getValueAt(row, 2).toString());
        hargapcs=Integer.parseInt(tbldata.getValueAt(row, 3).toString());
       //otalharga=totalharga+(int)hargapcs;
        
        
            
        
       
        
    }//GEN-LAST:event_tbldataMouseClicked

    private void listboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listboxMouseClicked
        
       
    }//GEN-LAST:event_listboxMouseClicked
    String cekkode;
    public static int tot;
    int pcs;
    int peritem;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        arrcart.add(new barangDagang(kodebrg,namacart, hargapcs,stok,totalharga));
        System.out.println(arrcart.size());
        qty=Integer.parseInt(tbstok.getText());
        peritem=qty*hargapcs;
        tot=tot+peritem;
        if (cekstok<stok){
            JOptionPane.showMessageDialog(this, "Stok Kurang", "Gagal", JOptionPane.INFORMATION_MESSAGE);
        
        }
        else{
        pilih.addElement("Kode : " + kodebrg+" Nama: "+namacart+" Harga PCS "+hargapcs +" Total: "+peritem);
            jLabel7.setText(String.valueOf(tot));
        }
        
        
                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MainMenu.f2.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ShowBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ava;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listbox;
    private javax.swing.JRadioButton max;
    private javax.swing.JRadioButton min;
    private javax.swing.JRadioButton nama;
    private javax.swing.JRadioButton nava;
    private javax.swing.JTable tbldata;
    private javax.swing.JTextField tbsearch;
    private javax.swing.JTextField tbstok;
    // End of variables declaration//GEN-END:variables
}
