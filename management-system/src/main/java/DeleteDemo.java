import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/studentDb";
		String user = "root";
		String password = "Rishwa16.";

		try (Connection conn = DriverManager.getConnection(dbURL, user, password)) {
			String sql = "DELETE FROM Student WHERE Name = ?";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, "John");

			int rowsDeleted = ps.executeUpdate();

			if (rowsDeleted > 0) {
				System.out.println("A user was deleted successfully!");
			}
		}

		catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

}
