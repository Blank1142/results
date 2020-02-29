import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import oracle.jdbc.driver.OracleDriver;

public class Modell {
	Connection con;
	private String Name;
	private String Username;
	private String Password;
	private String Age;
	private String Subject;
	private String Joining;
	PreparedStatement pst;
	Modell()
	{
		try {
			DriverManager.registerDriver(new OracleDriver());
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1522/XE","SYSTEM","system");
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
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getJoining() {
		return Joining;
	}
	public void setJoining(String joining) {
		Joining = joining;
	}
	int register()
	{
		try
		{
		String s="INSERT INTO TEACHERS VALUES(?,?,?,?,?,?)";
		pst = con.prepareStatement(s);
		pst.setString(1, Name);
		pst.setString(2, Username);
		pst.setString(3, Password);
		pst.setString(4, Age);
		pst.setString(5, Subject);
		pst.setString(6, Joining);
		
		int x=pst.executeUpdate();
		return x;
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return 0;
		
	}
	int eemplogin()
	{
		ResultSet res;
		try
		{
			String s="SELECT * FROM TEACHERS WHERE USERNAME=? AND PASSWORD=?";
			pst=con.prepareStatement(s);
			pst.setString(1,Username);
			pst.setString(2, Password);
		res = pst.executeQuery();	
		if(res.next()==true)
		{
			Name=res.getString("Name");
			Age=res.getString("Age");
			Subject=res.getString("Subject");
			Joining=res.getString("Joining");
			
			
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
