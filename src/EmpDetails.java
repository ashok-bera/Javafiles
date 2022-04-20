import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class EmpDetails {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		try 
		{
		    Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Pass@123");
			
			PreparedStatement s = con.prepareStatement("select * from emp where name = ?");
			System.out.println("enter the name");
			Scanner sc = new Scanner(System.in);
			
			String name = sc.next();
			s.setString(1, name);
			ResultSet r = s.executeQuery();
			
			
			
			while(r.next()) {
				System.out.println(r.getInt("id") + ":" + r.getInt(3) + ":" + r.getInt(4) +":" + r.getString(5));
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			con.close();
		}

	}

}
