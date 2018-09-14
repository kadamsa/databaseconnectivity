package com.sachin.DatabaseConnWithPostgres;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// System.out.println( "Hello World!" );

		try {
			Class.forName("org.postgresql.Driver");

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres",
					"password");

			PreparedStatement ps = con.prepareStatement("insert into test values(?,?,?)");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			do {
				System.out.println("enter id:");
				int id = Integer.parseInt(br.readLine());
				System.out.println("enter name:");
				String name = br.readLine();
				System.out.println("enter address:");
				String address = br.readLine();

				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, address);
				int i = ps.executeUpdate();
				System.out.println(i + "records affected");

				System.out.println("Do you want to continue: y/n");
				String s = br.readLine();
				if (s.equals("n")) {
					break;
				}
			} while (true);
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
