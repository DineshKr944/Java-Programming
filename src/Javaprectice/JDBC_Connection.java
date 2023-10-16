package Javaprectice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Connection {

	public static void main(String[] args) {
		try {
			Class.forName("oracal.jdbc.driver.OracalDriver");
			Connection con = DriverManager.getConnection("jdbc:oracal:thin:@localhost:1521:xe","System","273113");
			Statement smt = con.createStatement();
			smt.executeUpdate("Create table emp(eno number,ename charvar(15),esal number");
			System.out.println("Table Successfully Created...");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
