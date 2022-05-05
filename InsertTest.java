
import java.sql.*;
import java.util.Calendar;
import java.util.Scanner;

import com.sbi.exceptions.ApplicantNotFoundException;

public class InsertTest {

	public static void main(String[] args) {

		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered successfully....");

			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected to DB...");
			
			PreparedStatement ps = conn.prepareStatement("INSERT INTO BANK_APPLICANT VALUES (?,?,?,?,?,?) ");
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter applicant id to be inserted..");
			int appid=scan.nextInt();
			ps.setInt(1,appid);
			
			System.out.println("Enter applicant name to be inserted..");
			ps.setString(2, scan.nextLine());
			
			System.out.println("-----------------");
			System.out.println("\nEnter mail id to be inserted..");
			ps.setString(3, scan.nextLine());
			
			System.out.println("Enter mobile number to be inserted..");
			ps.setString(4, scan.nextLine());
			
			System.out.println("Enter address of applicant to be inserted..");
			ps.setString(6, scan.nextLine());
			
	      
			String s="1991-11-12";
			Date x=Date.valueOf(s);
					
			Calendar cal = Calendar.getInstance();
			java.util.Date date = cal.getTime();
			java.sql.Date sqlDate= new java.sql.Date(date.getTime());
			ps.setDate(5,sqlDate);
			
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM BANK_APPLICANT WHERE APPLICANT_ID="+appid);
			
			if(rs.next())
			{
				throw new ApplicantNotFoundException("Applicant already exist.....cannot be inserted");
			}
			else
			{	
		    System.out.println("prepared statement is created..."+ps);
			int row=ps.executeUpdate();
			System.out.println("row inserted..."+row);
			}
			
            rs.close();
            st.close();
			ps.close();
			
			conn.close();
			System.out.println("DisConnected from the db....");

		}

		catch (SQLException e) {

			e.printStackTrace();
		}
		catch(ApplicantNotFoundException e) {
			   e.printStackTrace();

        }
}
}
