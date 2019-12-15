package stou.webapp.servlet;

public class Student {

	public int image_id;
	public String base64Image;
	
	public Student() 
	{
		
	}
	
	public int getImageid() {
		return image_id;
	}
	
	public void setImageid(int xid) {
		this.image_id = xid;
	}

	public String getBase64Image(){
		return base64Image;
	}
	
	public void setBase64Image(String xbase64Image) {
		this.base64Image=xbase64Image;
	}
}
