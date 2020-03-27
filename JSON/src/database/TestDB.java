package database;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDB {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
		Connection cn=AccessDB.getConnection();
        System.out.println(cn+" Successful Connection ....");
	}

}