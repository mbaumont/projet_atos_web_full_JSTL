package net.atos.englishbattle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBdd {
	public static Connection connection = null;
	 public static Connection getConnection() throws SQLException, ClassNotFoundException {
         Class.forName("com.mysql.jdbc.Driver");
         if(connection == null)
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/englishbattle?verifyServerCertificate=false&useSSL=true","root","");
         return connection ;
 }

}
