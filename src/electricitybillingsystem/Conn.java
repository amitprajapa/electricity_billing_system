package electricitybillingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Conn {
	Connection c;
	Statement s;
	
	Conn()
	{
		try
		{
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			 c =DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","9769");
			
			 s =c.createStatement();
		}
		
		
		
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
