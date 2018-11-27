package Com.exception.demo;

import java.io.IOException;
import java.sql.SQLException;

class M {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

class Testthrows4 {
	public static void main(String args[]) throws IOException, SQLException, ClassNotFoundException {// declare
																										// exception
		try {
			M m = new M();
			m.method();
		} catch (Exception e) {
			System.out.println("exception handled");
			throw new IOException("exeption thrown from catch block");
		}
		System.out.println("normal flow...");
	}
}