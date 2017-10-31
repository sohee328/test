package lecture02;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB1 {
	static String JDBC_DRIVER_NAME = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static String DB_URL = "jdbc:sqlserver://127.0.0.1;databaseName=lecture2;";
	static String USER_ID = "sa";
	static String USER_PASSWORD = "test123";

	public static Connection getConnection() throws Exception {
		Class.forName(JDBC_DRIVER_NAME);
		return DriverManager.getConnection(DB_URL, USER_ID, USER_PASSWORD);
	}
}
