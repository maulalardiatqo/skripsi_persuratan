/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsi_persuratan;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileFilter;
import java.awt.Event;
import java.util.Calendar;
import java.awt.EventQueue;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.Desktop;
/**
 *
 * @author galaxy.co
 */
public class Agenda extends javax.swing.JFrame {
    private DefaultTableModel model;
    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        txttipe.setVisible(false);
        txttipe1.setVisible(false);
        model = new DefaultTableModel();
        
        tblSuratMasuk.setModel(model);
        model.addColumn("NO");
        model.addColumn("SIFAT_SURAT");
        model.addColumn("NO_SURAT");
        model.addColumn("TGL_SURAT");
        model.addColumn("DARI");
        model.addColumn("KEPADA");
        model.addColumn("PERIHAL");
        model.addColumn("DESKRIPSI");
        model.addColumn("FILE_SURAT");
        
        getData();
    }
    
    public void getData(){
        model.getDataVector( ).removeAllElements( );
        model.fireTableDataChanged( );
       
        try{
            int no = 1;
            String sql = "SELECT * FROM tbl_surat WHERE type_surat = 1";
            java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(2),res.getString(3),res.getString(4),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10)});
            }
            tblSuratMasuk.setModel(model);
        }catch(SQLException err){
            
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TCari = new javax.swing.JTextField();
        BCari = new javax.swing.JButton();
        BHome = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSuratMasuk = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        startDate = new com.toedter.calendar.JDateChooser();
        endDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        txttipe = new javax.swing.JTextField();
        btnbuka = new javax.swing.JButton();
        txttipe1 = new javax.swing.JTextField();
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DATA SURAT MASUK");

        BCari.setText("Cari");
        BCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCariActionPerformed(evt);
            }
        });

        BHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skripsi_persuratan/img/home.png"))); // NOI18N
        BHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHomeActionPerformed(evt);
            }
        });

        tblSuratMasuk.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSuratMasuk.setFocusable(false);
        tblSuratMasuk.setUpdateSelectionOnSort(false);
        tblSuratMasuk.setVerifyInputWhenFocusTarget(false);
        tblSuratMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSuratMasukMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSuratMasuk);

        jLabel2.setText("Filter By Date :");

        jLabel3.setText("Start Date :");

        jLabel4.setText("End Date");

        jButton2.setText("Load Data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jButton1.setText("Delete Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        txttipe.setText("1");

        btnbuka.setText("Buka File");
        btnbuka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbukaActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 289, Short.MAX_VALUE)
                        .addComponent(BHome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TCari, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BCari))
                                            .addComponent(txttipe, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txttipe1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnbuka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BHome)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BCari))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttipe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnPrint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnbuka)
                .addGap(71, 71, 71))
        );

        setSize(new java.awt.Dimension(891, 641));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHomeActionPerformed
            new HalamanUtama().show();
            this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_BHomeActionPerformed

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

    private void BCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCariActionPerformed
        // TODO add your handling code here:
        int jumlahRow = tblSuratMasuk.getRowCount();
        for(int n=0;n<jumlahRow;n++){
            model.removeRow(0);
        }
        String cari = TCari.getText();
        
        try{
            int no = 1;
            String sql = "SELECT * FROM tbl_surat WHERE no_surat LIKE '"+cari+"'";
            java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(2),res.getString(3),res.getString(4),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10)});
            }
            tblSuratMasuk.setModel(model);
            
        }catch(SQLException err){
            System.out.print(err.getMessage());
        }
    }//GEN-LAST:event_BCariActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            int row = tblSuratMasuk.getSelectedRow();
            String no_surat = (tblSuratMasuk.getModel().getValueAt(row, 2).toString());

                String sqlDelete = "DELETE FROM tbl_surat WHERE no_surat ='"+no_surat+"'";
                java.sql.Connection conn = (Connection)koneksi.getKoneksi();
                 java.sql.PreparedStatement pst = conn.prepareStatement(sqlDelete);
                 pst.execute();
                JOptionPane.showMessageDialog(null, "berhasil di hapus");
                getData();
            
        }catch(SQLException err){
            System.out.print(err.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         model.getDataVector( ).removeAllElements( );
        model.fireTableDataChanged( );
        
        String tampilan = "yyyy/MM/dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String sDate = String.valueOf(fm.format(startDate.getDate()));
        String eDate = String.valueOf(fm.format(endDate.getDate()));
        try{
         int no = 1;
         String sql = "SELECT * FROM tbl_surat WHERE type_surat = 1 AND tgl_surat BETWEEN '"+sDate+"' AND '"+eDate+"'";
         java.sql.Connection conn = (Connection)koneksi.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(2),res.getString(3),res.getString(4),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10)});
            }
            tblSuratMasuk.setModel(model);
        }catch(SQLException err){
              System.out.print(err.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        getData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        new Laporan_Masuk().show();
           
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnbukaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbukaActionPerformed
     
try {
String dari = txttipe1.getText();
		if ((new File(".\\src\\upload\\"+dari)).exists()) {

			Process p = Runtime
			   .getRuntime()
			   .exec("rundll32 url.dll,FileProtocolHandler .\\src\\upload\\"+dari);
			p.waitFor();
				
		} else {

			JOptionPane.showMessageDialog(null, "File is not exists");

		}

		System.out.println("Done");

  	  } catch (Exception ex) {
		ex.printStackTrace();
	  }

	


	
            // TODO add your handling code here:
    }//GEN-LAST:event_btnbukaActionPerformed

    private void tblSuratMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSuratMasukMouseClicked
 String kode = tblSuratMasuk.getValueAt(tblSuratMasuk.getSelectedRow(), 8).toString();  
 txttipe1.setText(kode);// TODO add your handling code here:
        
    }//GEN-LAST:event_tblSuratMasukMouseClicked
    
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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCari;
    private javax.swing.JButton BHome;
    private javax.swing.JMenuItem MAgendaSKeluar;
    private javax.swing.JMenuItem MAgendaSMasuk;
    private javax.swing.JMenuItem MSuratKeluar;
    private javax.swing.JMenuItem MSuratMasuk;
    private javax.swing.JTextField TCari;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnbuka;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser startDate;
    private javax.swing.JTable tblSuratMasuk;
    private javax.swing.JTextField txttipe;
    private javax.swing.JTextField txttipe1;
    // End of variables declaration//GEN-END:variables
}