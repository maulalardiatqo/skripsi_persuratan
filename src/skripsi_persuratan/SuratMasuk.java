/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsi_persuratan;

import java.io.File;
import java.io.FileFilter;
import java.awt.Event;
import java.util.Calendar;
import java.awt.EventQueue;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author galaxy.co
 */
public class SuratMasuk extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    public String filename;
    
    /**
     * Creates new form SuratMasuk
     */
    public SuratMasuk() {
        initComponents();
    }
    
    private void kosongkan(){
        itemSifat.setSelectedItem(null);
        txtNoSurat.setText(null);
        Date.setDate(null);
        txtFrom.setText(null);
        txtTo.setText(null);
        txtDeskripsi.setText(null);
        txtHal.setText(null);
        txtFileName.setText(null);
    
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNoSurat = new javax.swing.JTextField();
        txtFrom = new javax.swing.JTextField();
        txtTo = new javax.swing.JTextField();
        txtHal = new javax.swing.JTextField();
        txtDeskripsi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtFileName = new javax.swing.JTextField();
        Date = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        itemSifat = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        BHome = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MSuratMasuk = new javax.swing.JMenuItem();
        MSuratKeluar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MAgendaSKeluar = new javax.swing.JMenuItem();
        MAgendaSMasuk = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel2.setText("Tanggal");

        jLabel3.setText("No. Surat");

        jLabel4.setText("Dari");

        jLabel5.setText("Deskripsi");

        jLabel6.setText("Perihal");

        jLabel7.setText("Kepada");

        jLabel8.setText("File Surat");

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Pilih File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("TAMBAH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Sifat Surat");

        itemSifat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Penting", "- Rahasia" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(itemSifat, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel6))
                                        .addGap(22, 22, 22)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtHal)
                                            .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(itemSifat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNoSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtHal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jButton1)
                            .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(22, 22, 22))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("INPUT SURAT MASUK");

        BHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skripsi_persuratan/img/home.png"))); // NOI18N
        BHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHomeActionPerformed(evt);
            }
        });

        jMenu1.setText("Transaksi Surat");

        MSuratMasuk.setText("Surat Masuk");
        MSuratMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSuratMasukActionPerformed(evt);
            }
        });
        jMenu1.add(MSuratMasuk);

        MSuratKeluar.setText("Surat Keluar");
        MSuratKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSuratKeluarActionPerformed(evt);
            }
        });
        jMenu1.add(MSuratKeluar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Data Surat");

        MAgendaSKeluar.setText("Data Sutrat Keluar");
        MAgendaSKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAgendaSKeluarActionPerformed(evt);
            }
        });
        jMenu2.add(MAgendaSKeluar);

        MAgendaSMasuk.setText("Data Surat Masuk");
        MAgendaSMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAgendaSMasukActionPerformed(evt);
            }
        });
        jMenu2.add(MAgendaSMasuk);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Action");

        jMenuItem5.setText("Logout");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(BHome)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BHome)))
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(785, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHomeActionPerformed
        new HalamanUtama().show();
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_BHomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       FileFilter myfilter = new FileFilter() {
            
            public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".jpg")
                        || f.isDirectory();
            }

            public String getDescription() {
                return "JPG Files"; //type any description you want to display
            }
        };
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File f = fc.getSelectedFile();
        this.filename = f.getAbsolutePath();
        String ext = filename.substring(filename.lastIndexOf('.')+1);
         Date tgl = Date.getDate();
        String nama = "Surat_dari";
        String dari = txtFrom.getText();
        int no = 0;
        String namaSurat = nama + dari + no +'.' + ext;
        no++;
        txtFileName.setText(namaSurat);
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try{
           String newpath = "src/upload";
           File directory = new File(newpath);
           
           if(!directory.exists()){
               directory.mkdirs();
           }
           File fileawal = null;
           File fileakhir = null;
           String ext = filename.substring(filename.lastIndexOf('.')+1);
           fileawal = new File(filename);
           fileakhir = new File(newpath+"/"+txtFileName.getText());
           String tampilan = "yyyy/MM/dd";
           SimpleDateFormat fm = new SimpleDateFormat(tampilan);
           String tanggal = String.valueOf(fm.format(Date.getDate()));
           Files.copy(fileawal.toPath(), fileakhir.toPath());
           
            if(txtNoSurat.getText()==null || Date.getDate() == null || txtFrom.getText() == null || txtTo.getText() == null || txtHal.getText() == null || txtFileName.getText() == null ){
                JOptionPane.showMessageDialog(null, "Pastikan Semua Data Terisi");
            }else{
                Integer id = 0;
                String sifat = itemSifat.getSelectedItem().toString();
                String noSurat = txtNoSurat.getText();
                String date = tanggal;
                Integer type = 1;
                String dari = txtFrom.getText();
                String kepada = txtTo.getText();
                String hal = txtHal.getText();
                String desk = txtDeskripsi.getText();
                String file = txtFileName.getText();
                
                String cek = "SELECT no_surat FROM tbl_surat";
                if(noSurat == cek){
                     JOptionPane.showMessageDialog(null, "No Surat sudah tersedia");
                }else{
                    String sql = "INSERT INTO tbl_surat VALUES('" + id + "','"+ sifat +"','"+ noSurat +"','"+ date +"','"+ type +"','"+ dari +"','"+ kepada+"','"+ hal +"','"+ desk +"','"+ file +"' )";
                 java.sql.Connection conn = (Connection)koneksi.getKoneksi();
                 java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                 pst.execute();
                 
                 JOptionPane.showMessageDialog(null, "berhasil simpan");
                 kosongkan();
                 
                }
            }
    
        }catch(HeadlessException | SQLException e){
             JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(SuratMasuk.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void MSuratMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSuratMasukActionPerformed
        new SuratMasuk().show();
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_MSuratMasukActionPerformed

    private void MSuratKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSuratKeluarActionPerformed
        new SuratKeluar().show();
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_MSuratKeluarActionPerformed

    private void MAgendaSKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAgendaSKeluarActionPerformed
        new AgendaSKeluar().show();
        this.dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_MAgendaSKeluarActionPerformed

    private void MAgendaSMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAgendaSMasukActionPerformed
        new Agenda().show();
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_MAgendaSMasukActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        int Logout=JOptionPane.showOptionDialog(this, "Keluar Aplikasi?", "Pesan Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,null,null);

        if(Logout==JOptionPane.YES_OPTION){
            new FormLogin().show();
            this.dispose();
        } // TODO add your handling        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(SuratMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuratMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuratMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuratMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuratMasuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BHome;
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JMenuItem MAgendaSKeluar;
    private javax.swing.JMenuItem MAgendaSMasuk;
    private javax.swing.JMenuItem MSuratKeluar;
    private javax.swing.JMenuItem MSuratMasuk;
    private javax.swing.JComboBox itemSifat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDeskripsi;
    private javax.swing.JTextField txtFileName;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtHal;
    private javax.swing.JTextField txtNoSurat;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}
