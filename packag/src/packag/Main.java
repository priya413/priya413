package packag;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
		
	 Statement st= con.createStatement();
		ResultSet rs=st.executeQuery("select *from student");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
		}
		con.close();
		
	}

}
