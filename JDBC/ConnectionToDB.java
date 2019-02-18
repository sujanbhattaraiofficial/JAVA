import java.sql.*;
public class ConnetionToBD
{
    public static void main(String[] args) {
        Connection myConn = null;
       
		
			try {
				myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databasename","root","");
				System.out.println("Sucessfully Connected");
				
			
				
			} catch (SQLException e1) 
			{
				System.out.println("error");
			}
			
    }
}