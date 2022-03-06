class StringMethods{
	public static void main(String[] args){
		String str="Java Programming Language";
		String str1="";
		String str2=" ";
		//finding the String is empty or not.
		//public boolean isEmpty();
		System.out.println("-->isEmpty method:");
		System.out.println(str.isEmpty());//false
		System.out.println(str1.isEmpty());//true
		System.out.println(str2.isEmpty());//false

		//finding the length of the string.
		//public int length();
		System.out.println("-->length method:");
		System.out.println(str.length());//25
		System.out.println(str1.length());//0
		System.out.println(str2.length());//1

		//comparing two String.
		/*comparing string lexicographically means after comparison
		method returns difference between string content.*/

		//public int compareTo(java.lang.String);

		System.out.println("-->compareTO method:");
		String str3="CSE";
		String str4="cse";
		String str5="Ces";
		String str6="";
		System.out.println(str3.compareTo(str4));//67-99=-32
		System.out.println(str3.compareTo(str5));//83-101=-18
		System.out.println(str3.compareTo(str6));//String Length=3
		System.out.println(str6.compareTo(str3));//0-3=-3

		//public int compareToIgnoreCase(java.lang.String);
		System.out.println("-->comapreToIgnoreCase method:");
		String str7="CSE";
		String str8="cse";
		System.out.println(str7.compareToIgnoreCase(str8));//0

		//public boolean equals(java.lang.Object);
		System.out.println("-->equals method:");
		String str9="CSE";
		String str10=str9;
		System.out.println(str3.equals(str7));//true
		System.out.println(str9==str10);//true

		//public boolean equalsIgnoreCase(java.lang.String);
		System.out.println("-->equalsIgnoreCase method:");
		System.out.println(str3.equalsIgnoreCase(str4));//true
		System.out.println(str3.equalsIgnoreCase(str5));//false

		//startsWith and endsWith
		//public boolean startsWith(java.lang.String);
		//StringName.startsWith("content you want to match");
		System.out.println("-->startsWith and endsWith:");
		String str11="java programming Language";
		System.out.println(str11.startsWith("java"));//true
		System.out.println(str11.startsWith("sayantan"));//false
		System.out.println(str11.endsWith("Language"));//true
		System.out.println(str11.endsWith("sayantan"));//false

		//public boolean startsWith(java.lang.String,(after)int);
		System.out.println(str11.startsWith("programming",5));//true

		//print character of thr given index,starting index starts from zero.
		//public char charAt(int);
		System.out.println("-->charAt method");
					//0123456789012345678901234					
		String str12="java programming language";
		System.out.println(str12.charAt(5));//p

		//print all characters
		for(int i=0;i<str12.length();i++){
			System.out.print(str12.charAt(i));//java programming language
		}
		System.out.println("");
		
		//public int indexOf(java.lang.String);
		//public int indexOf(java.lang.String, int);
		System.out.println("-->indexOf method");
		System.out.println(str12.indexOf("g"));//8
		System.out.println(str12.indexOf("g",9));//15
		System.out.println(str12.indexOf("ja"));//0

		//public int lastIndexOf(java.lang.String);
		//public int lastIndexOf(java.lang.String, int);
		System.out.println("-->lastIndexOf method");
		System.out.println(str12.lastIndexOf("g"));//23
		System.out.println(str12.indexOf("g",24));//-1
		
		//public java.lang.String substring(int);
		//public java.lang.String substring(int, int);
		System.out.println("-->substring method");
		System.out.println(str12.substring(5));//programming language
		System.out.println(str12.substring(5,16));//programming

		//concatenation
		//=============
		//Adding a given string caharacters at the end of the current string
		//and placing the result in new object is called
		//concatenation
		//we can do it two ways
		//1.using '+' operrator.
		//2.using concat() method

		//concatenation using + operator
		System.out.println("-->concatenation method");
		String str13="a";
		String str14=str13+"b";

		System.out.println(str13);//a
		System.out.println(str14);//ab

		//concatenation using concat() method
		//public java.lang.String concat(java.lang.String);
		String str15="x";
		String str16=str15.concat("y");

		System.out.println(str15);//x
		System.out.println(str16);//xy

		//Case conversion
		//public java.lang.String toLowerCase();
		//public java.lang.String toUpperCase();
		String str17="jAvA";
		String str18="JaVa";

		System.out.println(str17.toLowerCase());//java
		System.out.println(str18.toUpperCase());//JAVA

		//replacing old character with new character
		//public java.lang.String replace(java.lang.CharSequence, java.lang.CharSequence);
		System.out.println("-->replace method");
		String str19="jbvb";
		System.out.println(str19.replace("b","a"));//java
		String str20="Ha Ha Ha";
		System.out.println(str20.replace("Ha","Hellow"));//Hellow Hellow Hellow
		
		//trim method cut the begging and ending spaces
		//public java.lang.String trim();
		System.out.println("-->trim method");
		String str21=" sayantan ";
		System.out.println("Length of"+str21+"before triming is:"+str21.length());//Length of sayantan before triming is:10
		System.out.println("Length of"+str21+"after triming is:"+str21.trim().length());//Length of sayantan after triming is:8

		//String to char[]
		//public char[] toCharArray();
		System.out.println("-->String to char");
		String str22="sayantan";
		char[] ch=str22.toCharArray();
		for(char c: ch)
			System.out.print(" "+c);// s a y a n t a n

		//char to String
		char[] ch1={'s','a','y','a','n','t','a','n'};
		String str23=new String(ch1);
		System.out.println("");
		System.out.println("-->char to string");
		System.out.println(str23);//sayantan

		//valueOf methods
		//===============
		//public static java.lang.String valueOf(char);
		//public static java.lang.String valueOf(char[]);
		//public static java.lang.String valueOf(int);
		//public static java.lang.String valueOf(double);
		//public static java.lang.String valueOf(long);
		//public static java.lang.String valueOf(float);
		//public static java.lang.String valueOf(boolean);
		//public static java.lang.String valueOf(java.lang.Object);
		
		System.out.println("-->valueOf method");
		int i=30;
		double d=45.67;
		long l=748364891;
		float f=12.34f;
		char c='J';
		boolean b=true;
		char[] ch2={'J','A','V','A'};
		Object o=null;
		
		String str24=String.valueOf(i);
		System.out.println(str24);//30

		str24=String.valueOf(d);
		System.out.println(str24);//45.67

		str24=String.valueOf(l);
		System.out.println(str24);//748364891

		str24=String.valueOf(f);
		System.out.println(str24);//12.34

		str24=String.valueOf(b);
		System.out.println(str24);//true

		str24=String.valueOf(ch2);
		System.out.println(str24);//JAVA

		str24=String.valueOf(o);
		System.out.println(str24);//null

		//public java.lang.String replaceAll(java.lang.String, java.lang.String);
		//String replaceAll(String regex,String replacement);
		System.out.println("-->replaceAll method");
		String str25="A7B8C9";
		System.out.println(str25);
		System.out.println(str25.replaceAll("[0-9]"," Digit "));//ADigitBDigitCDigit
	}
}
