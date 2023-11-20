import java.sql.*;


public class ConexionBD {
	private Connection con;
	private String host;
	private String puerto;
	private String user;
	private String pswd;
	
	public ConexionBD(Connection con, String host, String puerto, String user, String pswd) {
		super();
		this.con = con;
		this.host = host;
		this.puerto = puerto;
		this.user = user;
		this.pswd = pswd;
		this.con=conectar(host,puerto, user,pswd);
	}
	
	private Connection conectar(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String URL="jdbc:mysql://"+host+":"+puerto;
			Connection con = DriverManager.getConnection(URL,user,pswd);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}


