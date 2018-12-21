/**
 * 
 */
package com.sachin.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author sachinkadam2712@gmail.com
 *
 * 
 */
public class GetCon {

	public GetCon() {

	}

	public static Connection con;
	static {

		try {
			Class.forName(DbInitializer.DRIVER);
			con = DriverManager.getConnection(DbInitializer.CON_STRING, DbInitializer.USERNAME, DbInitializer.PASSWORD);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static Connection getCon() {
	
		return con;
	}
}
