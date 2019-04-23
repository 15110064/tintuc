package connect;
import java.sql.Connection;
import java.sql.DriverManager;

//?autoReconnect=true&useSSL=false
public class connect {
		private static final String DRIVER_JDBC = "com.mysql.jdbc.Driver";
	    //private static final String URL_DB = "jdbc:mysql://35.240.168.251/demo?useSSL=false";
	    //private static final String URL_DB = "jdbc:google:mysql://cloud-daovantoan:asia-southeast1:tintucnhom6/demo?useSSL=false";
	     private static final String URL_DB = "jdbc:mysql://35.240.168.251:3306/demo?useSSL=false";
	    // Pass and User
	    private static final String USER = "root";
	    private static final String PASS = "1234";

	    private static Connection conn;

	    public static Connection getConnection() {
	        try {
	         Class.forName(DRIVER_JDBC);
	          conn = DriverManager.getConnection(URL_DB, USER, PASS);
	        } catch (Exception e) {
	            System.out.println("Error connection " + e);
	        }

	        return conn;
	    }
}

