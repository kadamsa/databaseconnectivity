package Com.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Main.java 
class Test1 {
	int i;
	Test t;
	boolean b;
	byte bt;
	float ft;
}

public class Main {
	public static void main(String args[]) throws IOException {
		Test1 t = new Test1(); // default constructor is called.
//		System.out.println(t.i);
//		System.out.println(t.t);
//		System.out.println(t.b);
//		System.out.println(t.bt);
//		System.out.println(t.ft);

		System.out.println("what is your name?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name = br.readLine();

		// int a = Integer.parseInt();

		System.out.println("you name is " + name);

		// using scanner class..

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		System.out.println("you entered string.." + s);

		int a = sc.nextInt();

		System.out.println("you entered integer.." + a);

		String newname = System.console().readLine();

		System.out.println("by using console input readed." + newname);

	}
}