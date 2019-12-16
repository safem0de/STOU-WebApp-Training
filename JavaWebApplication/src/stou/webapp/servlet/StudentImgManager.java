package stou.webapp.servlet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

public class StudentImgManager {
String databaseURL = "jdbc:mysql://localhost:3307/mobileshopdb";
String user = "root";
String password = "123456789";

	public Student get(int id) throws SQLException, IOException
	{
		Student img = null;
		
		String sql = "SELECT * FROM images"; //WHERE image_id = ?";

		Connection conn = DriverManager.getConnection(databaseURL, user, password);
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			//statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			
			if (rs.next()) {
				img = new Student();
				int img_id = rs.getInt("images_id");
				Blob img_file = rs.getBlob("images_file");
				
				InputStream inputStream = img_file.getBinaryStream();
				ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
				
				byte[] buffer = new byte[4096];
				
				int bytesRead = -1;
				while ((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead);
				}
			
				byte[] imageBytes = outputStream.toByteArray();
				String base64Image = Base64.getEncoder().encodeToString(imageBytes);
				
				inputStream.close();
				outputStream.close();
				
				img.setImageid(img_id);
				img.setBase64Image(base64Image);
			}
				
		} catch (SQLException | IOException ex) {
			
			ex.printStackTrace();
			
		} finally {
			
			conn.close();
		}
		
		return img;
	}
}
