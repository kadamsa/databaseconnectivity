package Com.basics;

/**
 * 
 * @author sachin.kadam
 *
 */

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "My name is sachin";
		System.out.println(str.length());
//		System.out.println("Original String    " + str);
//
//		// string reverse using stringbuffer
//
//		String strrev = new StringBuffer(str).reverse().toString();
//		System.out.println("Reversed string   " + strrev);
//		

		String strRev;

		strRev = reverseRecursively(str);

		System.out.println(strRev);

	}

//	public static String reverse(String str) {
//		StringBuilder strbuilder = new StringBuilder();
//
//		char[] strchar = str.toCharArray();
//
//		for (int i = strchar.length - 1; i >= 0; i--) {
//
//			strbuilder.append(strchar[i]);
//		}
//
//		return strbuilder.toString();
//
//	}

	public static String reverseRecursively(String str) {

		// base case to handle one char string and empty string
		if (str.length() < 2) {
			return str;
		}

		return reverseRecursively(str.substring(1)) + str.charAt(0);

	}

}
