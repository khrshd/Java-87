
public class StringMethods {

	public static void main(String[] args) {
		String str = "edureka limited";
		
		System.out.println("size = " + str.length());
		System.out.println("char at index 0 = " + str.charAt(0));
		
		System.out.println("index of \"e\" = " + str.indexOf("e"));
		System.out.println("index of \"e\" from index 1 = " + str.indexOf("e", 1));
		System.out.println("last index of \"e\" = " + str.lastIndexOf("e"));
		
		String s1 = new String("java");
		//String s2 = new String("java");
		String s2 = new String("Java");
		System.out.println(s1 == s2); //false
		System.out.println("equals() --> " + s1.equals(s2));
		System.out.println("contentEquals() --> " + s1.contentEquals(s2));
		System.out.println("equalsIgnoreCase() --> " + s1.equalsIgnoreCase(s2));
		
		String s3 = s1.concat(" techologies");
		System.out.println(s3);
		
		System.out.println(str.replace("e", "*"));
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(str);
	}

}
