
import java.sql.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

import com.sbi.exceptions.ApplicantNotFoundException;

public class DeleteTest {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded.../registered....");

			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected to the db....");

			PreparedStatement pst = conn.prepareStatement("delete from BANK_APPLICANT WHERE APPLICANT_ID=?");

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter applicant id to be deleted..");
			int appid = scan.nextInt();

			pst.setInt(1, appid);

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM BANK_APPLICANT WHERE APPLICANT_ID=" + appid);

			if (rs.next()) {
				System.out.println("prepared statement is created..." + pst);
				int row = pst.executeUpdate();
				System.out.println("row deleted ..." + row);
			} else {
				
				throw new ApplicantNotFoundException("Applicant doesn't exist cannot be deleted");
			}

			pst.close();
			conn.close();
			System.out.println("DisConnected from the db....");

		} catch (SQLException e) {
			System.out.println("Some problem : " + e);
		} catch (ApplicantNotFoundException e) {
			e.printStackTrace();

		}

	}
}
