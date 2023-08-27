/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsi_persuratan;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    static Connection con;
    public static Connection getKoneksi()throws SQLException
    {
        String id,pass,driver,url;
        id="root";
        pass="";
        driver="com.mysql.jdbc.Driver";
        url="jdbc:mysql://localhost:3306/db_persuratan";
        try {
               DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
               con= DriverManager.getConnection(url, id,pass);
               
        } catch (SQLException e) {
             System.out.println(""+e.getLocalizedMessage()); //perintah menampilkan error pada koneksi
        }
        return con;
    }
    

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        
        koneksi k=new koneksi();
    }    
    
 
}
