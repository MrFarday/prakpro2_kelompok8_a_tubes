package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksiregis {

    private static Connection konekdb;

    public static Connection bukaKoneksiDB() throws SQLException {
        if (konekdb == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/users";
                String user = "root";
                String password = "";
                Class.forName("com.mysql.cj.jdbc.Driver");
                konekdb = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException | SQLException ex) {
                throw new SQLException("Gagal membuka koneksi database", ex);
            }
        }
        return konekdb;
    }

    public static void tutupKoneksiDB() {
        try {
            if (konekdb != null && !konekdb.isClosed()) {
                konekdb.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
