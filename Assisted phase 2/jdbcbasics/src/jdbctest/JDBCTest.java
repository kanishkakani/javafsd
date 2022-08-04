package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	public static void main(String[] args) {
       //readFromDB();
		//insertIntoDB();
		//updateDB();
        deleteDB();
	}
	private static void deleteDB() {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "kani2601@2001");
				Statement statement = connection.createStatement();) {

			int rowsdeleted = statement.executeUpdate("delete from account where accno=2;");
			System.out.println("Number of rows deleted: " + rowsdeleted);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
	}
	private static void updateDB() {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "kani2601@2001");
				Statement statement = connection.createStatement();) {

			int rowsupdated = statement.executeUpdate("update account set balance=20000 where accno=2;");
			System.out.println("Number of rows updated: " + rowsupdated);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
	}
	private static void insertIntoDB() {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "kani2601@2001");
				Statement statement = connection.createStatement();) {

			int rowsInserted = statement.executeUpdate("insert into account values(3, 'Mary', 'Lucy', 150000)");
			System.out.println("Number of rows inserted: " + rowsInserted);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
	}
	private static void readFromDB() {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root",
				"kani2601@2001"); Statement statement = connection.createStatement();) {

			ResultSet resultSet = statement.executeQuery("select * from account");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + ", " + resultSet.getString(2) + ", " + resultSet.getString(3)
						+ ", " + resultSet.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
}