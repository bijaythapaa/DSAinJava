package array;

public class stringComparision {

	// Java program to Compare two strings lexicographically

	// This method compares two strings lexicographically without using library
	// functions
	public static int stringCompare(String str1, String str2) {

		int l1 = str1.length();
		int l2 = str2.length();
		int lmin = Math.min(l1, l2);

		for (int i = 0; i < lmin; i++) {
			char chr1 = str1.charAt(i);
			char chr2 = str2.charAt(i);
			if (chr1 != chr2)
				System.out.println("oh crap");
			// return 0;

//            System.out.println("char: "+chr);
//            int str1_ch = (int) str1.charAt(i);
//            System.out.println("str1_ch; "+str1_ch);
//            int str2_ch = (int) str2.charAt(i);
//            System.out.println("str2_ch; "+str2_ch);
//            if (str1_ch != str2_ch) {
//                return str1_ch - str2_ch;
		}

		// Edge case for strings like
		// String 1="Geeks" and String 2="Geeksforgeeks"
		if (l1 != l2) {
			System.out.println("hell no");
			return l1 - l2;
		}

		// If none of the above conditions is true,
		// it implies both the strings are equal
		else {
			System.out.println("hell yeah");
			return 1;
		}
	}

	// Driver function to test the above program
	public static void main(String args[]) {
		String string1 = new String("Geeksforgeeks");
//        String string2 = new String("Practice");
//        String string3 = new String("Geeks");
		String string4 = new String("Geeks for geeks");

		// Comparing for String 1 < String 2
//        System.out.println("Comparing " + string1 + " and " + string2
//                + " : " + stringCompare(string1, string2));
//
//        // Comparing for String 3 = String 4
//        System.out.println("Comparing " + string3 + " and " + string4
//                + " : " + stringCompare(string3, string4));

		// Comparing for String 1 > String 4
		System.out.println("Comparing " + string1 + " and " + string4 + " : " + stringCompare(string1, string4));
	}
}
