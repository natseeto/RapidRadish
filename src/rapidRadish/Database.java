package rapidRadish;


import java.sql.*;

public class Database {
	
	public static Connection conn;
	
	public static void openConnection() {
		
		try {
			conn = DriverManager.getConnection("jdbc:splite:rrtest.db");
		} catch (SQLException ex) {
			ex.printStackTrace();
		
		}
	}

}
