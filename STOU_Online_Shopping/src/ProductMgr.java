import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductMgr {
	
	String databaseURL = "jdbc:mysql://localhost:3307/shopping";
	String dbuser = "root";
	String dbpassword = "123456789";

	public ArrayList<String> searchProduct(String name) {
		String sql = "select product_name from product where product_name = ?";
		ArrayList<String> list = new ArrayList<String>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(databaseURL, dbuser, dbpassword);
			PreparedStatement sm = cn.prepareStatement(sql);
			sm.setString(1, name);
			ResultSet rs = sm.executeQuery();
			while (rs.next()) {
				list.add(rs.getString("product_name"));
			}
			
			rs.close();
			sm.close();
			cn.close();

			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
