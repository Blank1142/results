import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import oracle.jdbc.driver.OracleDriver;

public class Mode {
	Connection con;
	private String  Name;
	private String  Usn;
	private String  Ten;
	private String  Inter;
	private String  BE;
	PreparedStatement pst;
	Mode()
	{
		try {
			DriverManager.registerDriver(new OracleDriver());
		con	 = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1522/XE","SYSTEM","system");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getUsn() {
		return Usn;
	}


	public void setUsn(String usn) {
		Usn = usn;
	}


	public String getTen() {
		return Ten;
	}


	public void setTen(String ten) {
		Ten = ten;
	}


	public String getInter() {
		return Inter;
	}


	public void setInter(String inter) {
		Inter = inter;
	}


	public String getBE() {
		return BE;
	}


	public void setBE(String bE) {
		BE = bE;
	}


	int register()
	{
		try
		{
		String s="INSERT INTO STUDENTSS VALUES(?,?,?,?,?)";
		pst = con.prepareStatement(s);
		pst.setString(1, Name);
		pst.setString(2, Usn);
		pst.setString(3, Ten);
		pst.setString(4, Inter);
		pst.setString(5, BE);
	
		int x=pst.executeUpdate();
		return x;
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return 0;
		
	}
	int Res()
	{
		ResultSet res;
		try
		{
			String s="SELECT * FROM STUDENTSS WHERE USN=?";
			pst=con.prepareStatement(s);
			pst.setString(1,Usn);
		
		res = pst.executeQuery();	
		if(res.next()==true)
		{
			Name=res.getString("Name");
			Usn=res.getString("Usn");
			Ten=res.getString("Ten");
			Inter=res.getString("Inter");
			BE=res.getString("BE");
			return 1;
		}
		else {
			return 0;
		}
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}

	
}
