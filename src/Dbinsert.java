import java.sql.*;
import java.util.*;
public class Dbinsert {
    public static void main(String[] args) {
    	//Insert the record to database from java 
    	try
    	{
    	// the logic to load driver is in library and that has to be loaded so load using path by right clicking on parent 
    	// than build path -> configure path -> libraries -> classpath than add external jar files.
		 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Pass@123");
// these statements are inserting data into db in static manner
//		Statement stmt = con.createStatement();
//		stmt.execute("insert into emp values(3,'anj',21,30000,'manager')");
//		stmt.execute("drop table emp");
		
// now to insert the data by user ie in dynamic manner we can use PreparedStatement
		
		
//		PreparedStatement p = con.prepareStatement("insert into emp values(?,?,?,?,?)");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter id: ");
//		int id = sc.nextInt();
//		
//		System.out.println("enter name: ");
//		String name = sc.next();
//		
//		System.out.println("enter age: ");
//		int age = sc.nextInt();
//		
//		System.out.println("enter salary: ");
//		int salary = sc.nextInt();
//		
//		System.out.println("enter Desig");
//		String desig = sc.next();
//		
//		p.setInt(1, id);
//		p.setString(2, name);
//		p.setInt(3, age);
//		p.setInt(4, salary);
//		p.setString(5, desig);
//		p.execute();
//		
////		Statement stmt = con.createStatement();
////		stmt.execute("select * from emp");
		
		
		// here we are updating the name with respect to id and to update what we have to do is whichever column u want to update that has to be chnaged in 
		// p.setmethod() like here we are first using name in update statement so we have to use coulmn number 1 for name 
		
		PreparedStatement p = con.prepareStatement("update emp set name = ? where id = ? ");
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the id user want to update");
		int id = s.nextInt();
		
		System.out.println("are u sure u want to update?");
		String ch = s.next();
		if(ch.equals("yes") || ch.equals("YES"))
		{
          System.out.println("enter the name u want to update");
          String name = s.next();
		  p.setString(1, name);
		  p.setInt(2, id);
		  p.execute();
		  System.out.println("updated");
		}
		else
		{
			System.out.println("name was not updated");
		}
		con.close();
		System.out.println("ho gya blle blle nacho bc!!");
		
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
	}
}
