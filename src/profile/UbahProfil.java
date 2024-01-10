/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package profile;

/**
 *
 * @author mr.farday
 */

import Form.*;
import Main.MenuDashboard;
import db.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UbahProfil extends javax.swing.JFrame {

    private Connection conn;
    
    public UbahProfil() {
        initComponents();
        conn = Koneksi.getConnection();
        getData();
           }

   private void getData() {
       DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
       model.setRowCount(0);
       
       try{
           String sql = "Select * FROM profile";
           PreparedStatement st = conn.prepareStatement(sql);
           ResultSet rs = st.executeQuery();
           
           while(rs.next()){
               int id = rs.getInt("id");
               String nama = rs.getString("nama");
               String jenis = rs.getString("nomerHp");
               String status = rs.getString("alamat");
               
               Object[] rowData = {id,nama,jenis,status};
                 model.addRow(rowData);
           }
           
           rs.close();
           st.close();
       }catch (Exception e){
        Logger.getLogger(UbahProfil.class.getName()).log(Level.SEVERE,null, e);
    
        }
   }
   
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        t_namaLabel = new javax.swing.JLabel();
        t_teleponLabel = new javax.swing.JLabel();
        t_alamatLabel = new javax.swing.JLabel();
        t_cari = new javax.swing.JTextField();
        t_alamat = new javax.swing.JTextField();
        t_nama = new javax.swing.JTextField();
        t_telepon = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(109, 164, 170));

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Nomer hp", "Alamat"
            }
        ));
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_data);

        t_namaLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_namaLabel.setText("Nama");

        t_teleponLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_teleponLabel.setText("Nomer Hp");

        t_alamatLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_alamatLabel.setText("Alamat");

        t_cari.setText("Pencarian");
        t_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_cariMouseClicked(evt);
            }
        });
        t_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_cariActionPerformed(evt);
            }
        });
        t_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cariKeyTyped(evt);
            }
        });

        t_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_alamatActionPerformed(evt);
            }
        });

        t_telepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_teleponActionPerformed(evt);
            }
        });

        btn_tambah.setBackground(new java.awt.Color(38, 80, 115));
        btn_tambah.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambah.setText("Tambah");
        btn_tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(38, 80, 115));
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(38, 80, 115));
        btn_hapus.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 45)); // NOI18N
        jLabel5.setText("Profile");

        back.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        back.setText("<Back");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_tambah)
                                .addGap(51, 51, 51)
                                .addComponent(btn_edit)
                                .addGap(62, 62, 62)
                                .addComponent(btn_hapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(t_namaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(t_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(t_alamatLabel)
                                .addGap(45, 45, 45)
                                .addComponent(t_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(t_teleponLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(t_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_namaLabel)
                    .addComponent(t_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_teleponLabel))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_alamatLabel)
                    .addComponent(t_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tambah)
                    .addComponent(btn_edit)
                    .addComponent(btn_hapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 780, 550));

        jPanel3.setBackground(new java.awt.Color(100, 125, 135));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  

        
    
    private void t_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_cariActionPerformed

    private void t_teleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_teleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_teleponActionPerformed

    private void t_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_alamatActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
    String nama = t_nama.getText();
    String jenis = t_telepon.getText();
    String status = t_alamat.getText();
    
    if(nama.isEmpty() || jenis.isEmpty() || status.isEmpty()){
        JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    try{
        String sql = "INSERT INTO profile (nama, nomerHp, alamat) VALUES (?, ?, ?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, nama);
        st.setString(2, jenis);
        st.setString(3, status);
        
        int rowInserted = st.executeUpdate();
        if(rowInserted > 0) {
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
            resetForm();
            getData();
        }
        
        st.close();
    } catch (Exception e){
        Logger.getLogger(UbahProfil.class.getName()).log(Level.SEVERE, null, e);
    }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
          int selectedRow = tbl_data.getSelectedRow();
          if(selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih baris yang akan diperbarui");
        return;
    }

    String id = tbl_data.getValueAt(selectedRow, 0).toString();
    String nama = t_nama.getText();
    String jenis = t_telepon.getText();
    String status = t_alamat.getText();

    if(nama.isEmpty() || jenis.isEmpty() || status.isEmpty()){
        JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try{
        String sql = "UPDATE profile SET nama=?, nomerHp=?, alamat=? WHERE id=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, nama);
        st.setString(2, jenis);
        st.setString(3, status);
        st.setString(4, id);

        int rowUpdated = st.executeUpdate();
        if(rowUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Data berhasil diperbaharui");
            resetForm();
            getData();
        }

        st.close();
    } catch (Exception e){
        Logger.getLogger(UbahProfil.class.getName()).log(Level.SEVERE, null, e);
    }

    }//GEN-LAST:event_btn_editActionPerformed

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
        int selectedRow = tbl_data.getSelectedRow();
        if(selectedRow != -1){
            String nama = tbl_data.getValueAt(selectedRow, 1).toString();
            String nomerHp = tbl_data.getValueAt(selectedRow, 2).toString();
            String alamat = tbl_data.getValueAt(selectedRow, 3).toString();
            
            t_nama.setText(nama);
            t_telepon.setText(nomerHp);
            t_alamat.setText(alamat);
            
        }
        
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
       int selectedRow = tbl_data.getSelectedRow();
    if(selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus");
        return;
    }
    
    int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus data ini", "Konfirmasi", JOptionPane.YES_NO_OPTION);
    if(confirm == JOptionPane.YES_OPTION) {
        String id = tbl_data.getValueAt(selectedRow, 0).toString();

        try {
            String sql = "DELETE FROM profile WHERE id=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, id);

            int rowDelete = st.executeUpdate();
            if(rowDelete > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
                resetForm();
                getData();
            }
            st.close();
        } catch (Exception e) {
            Logger.getLogger(UbahProfil.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void t_cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cariKeyTyped
       DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
       model.setRowCount(0);
       
       String cari = t_cari.getText();
       
       
       try{
           String sql = "Select * FROM profile WHERE nama LIKE ? OR nomerHp LIKE ? OR alamat LIKE ?";
           PreparedStatement st = conn.prepareStatement(sql);
           st.setString(1,"%" + cari + "%");
           st.setString(2,"%" + cari + "%");
           st.setString(3,"%" + cari + "%");
           
           ResultSet rs = st.executeQuery();
           
           while(rs.next()){
               int id = rs.getInt("id");
               String nama = rs.getString("nama");
               String telepon = rs.getString("nomerHp");
               String alamat = rs.getString("alamat");
               
               Object[] rowData = {id,nama,telepon,alamat};
                 model.addRow(rowData);
           }
           
           rs.close();
           st.close();
       }catch (Exception e){
        Logger.getLogger(UbahProfil.class.getName()).log(Level.SEVERE,null, e);
    
        }
    }//GEN-LAST:event_t_cariKeyTyped

    private void t_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_cariMouseClicked
        t_cari.setText("");
    }//GEN-LAST:event_t_cariMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        MenuDashboard main = new MenuDashboard();
            main.setVisible(true);
            main.pack();
            main.setLocationRelativeTo(null);
            main.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_backMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UbahProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UbahProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UbahProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UbahProfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UbahProfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_alamat;
    private javax.swing.JLabel t_alamatLabel;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTextField t_nama;
    private javax.swing.JLabel t_namaLabel;
    private javax.swing.JTextField t_telepon;
    private javax.swing.JLabel t_teleponLabel;
    private javax.swing.JTable tbl_data;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        t_nama.setText("");
        t_telepon.setText("");
        t_alamat.setText("");
        
    }

  
    
}
