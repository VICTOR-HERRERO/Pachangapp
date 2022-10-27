package base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dominio.Usuario;

public class BD {
	
	public static void main(String[] args) throws ClassNotFoundException {

		// Carga el sqlite-JDBC driver usando el cargador de clases
		Class.forName("...");
		//Class.forName("org.sqlite.JDBC");

		Connection connection = null;
		try {
			// Crear una conexión de BD
			connection = DriverManager.getConnection("...");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);  // poner timeout 30 msg

			statement.executeUpdate("drop table if exists person");
			statement.executeUpdate("create table person (id integer, name string)");
			int res = statement.executeUpdate("insert into person values(1, 'leo')");
			System.out.println( res );
			res = statement.executeUpdate("insert into person values(2, 'yui')");
			System.out.println( res );
			ResultSet rs = statement.executeQuery("select * from person");
			while(rs.next()) {
				// Leer el resultset
				System.out.println("name = " + rs.getString("name"));
				System.out.println("id = " + rs.getInt("id"));
			}
		} catch(SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				if(connection != null)
					connection.close();
			} catch(SQLException e) {
				// Cierre de conexión fallido
				System.err.println(e);
			}
		}
	}
	
	public static Connection initBD(String nombreBD) {
		Connection con = null;
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:"+nombreBD);
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void closeBD(Connection con) {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void crearTablaUsuario(Connection con) {
		String sql = "CREATE TABLE IF NOT EXISTS Usuario (nick String, pass String, nombre String, apellido String, tlf String, fechaUltimoLogin String)";
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertarUsuario(Connection con, String nick, String pass, String nombre, String apellido, String telefono, String fechaUltimoLogIn) {
		String sql = "INSERT INTO Usuario VALUES('"+nick+"','"+pass+"','"+nombre+"','"+apellido+"',"+telefono+",'"+fechaUltimoLogIn+"')";
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Usuario obtenerDatosUsuario(Connection con, String nick) {
		String sql = "SELECT * FROM Usuario WHERE nick='"+nick+"'";
		Usuario u = null;
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) {
				String n = rs.getString("nick");
				String pass = rs.getString("pass");
				String nom = rs.getString("nombre");
				String a = rs.getString("apellido");
				String tlf = rs.getString("telefono");
				String fuli = rs.getString("fechaUltimoLogIn");
				u = new Usuario(n, pass, nom, a, tlf, fuli);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	//// PARTE DE LEER INFO DE USUARIO
	


}
