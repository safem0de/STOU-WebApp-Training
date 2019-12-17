import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMgr {

	String databaseURL = "jdbc:mysql://localhost:3307/shopping";
	String dbuser = "user00";
	String dbpassword = "user00";

	public Customer getProfile(String username) throws SQLException, IOException {
		Customer customer = null;
		String sql = "SELECT * FROM customer WHERE username = ?";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try (
			
			Connection cn = DriverManager.getConnection(databaseURL, dbuser, dbpassword)) {
			PreparedStatement sm = cn.prepareStatement(sql);
			sm.setString(1, username);
			ResultSet rs = sm.executeQuery();
			
			if (rs.next()) {
				customer = new Customer();
				String id = rs.getString("id");
				String name = rs.getString("name");
				String password = rs.getString("password");
				
				customer.setId(id);
				customer.setName(name);
				customer.setUsername(username);
				customer.setPassword(password);
			}
			
			rs.close();
			sm.close();
			cn.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
		return customer;
	}
	
	public boolean validateLogin(String username,String password) throws SQLException {
		
		String sql = "SELECT * FROM customer WHERE username = ?";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(databaseURL, dbuser, dbpassword);
			PreparedStatement sm = cn.prepareStatement(sql);
			sm.setString(1, username);
			ResultSet rs = sm.executeQuery();
			if (rs.next()) {
				if ( password.equals(rs.getString("password") ) ) {
					return true;
				}
			}
			
			rs.close();
			sm.close();
			cn.close();
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void signupCustomer(String id, String name, String username, String password) {
		
		String sql = "INSERT INTO customer (id,name,username,password) values(?, ?, ?, ?)";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(databaseURL, dbuser, dbpassword);
			PreparedStatement sm = cn.prepareStatement(sql);
			sm.setString(1, id);
			sm.setString(2, name);
			sm.setString(3, username);
			sm.setString(4, password);
			sm.execute();
			
			sm.close();
			cn.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
