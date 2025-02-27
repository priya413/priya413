package packag;


import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
	
	
  public static Connection GetConnection () {
	try {
		Class.forName(null);
	} catch (Exception e) {
		
	}
	Connection con =null;

	try {
		con =DriverManager.getConnection("");
	} catch (Exception e) {
		// TODO: handle exception
	}
	return con;
}
 
	
	
	
	
	
	
	
}

	
