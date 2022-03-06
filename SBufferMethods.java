class SBufferMethods {
	public static void main(String[] args) 
	{
		//public synchronized void setCharAt(int, char);
		//Replace the character located at specified index with provided character.
		System.out.println("-->setChar Method");
		StringBuffer sb=new StringBuffer("java");
		sb.setCharAt(0,'J');
		System.out.println(sb);

		/*public syschronized StringBuffer append(String s)-->this method is used to append the specified string with the StringBuffer.
		There are 13 forms in which append method can be used.*/ 
		//public synchronized java.lang.StringBuffer append(boolean);
		//public synchronized java.lang.StringBuffer append(char);
		//public synchronized java.lang.StringBuffer append(char[]);
		//public synchronized java.lang.StringBuffer append(char[], int, int);
		//public synchronized java.lang.StringBuffer append(double);
		//public synchronized java.lang.StringBuffer append(float);
		//public synchronized java.lang.StringBuffer append(int);
		//public synchronized java.lang.StringBuffer append(long);
		// public synchronized java.lang.StringBuffer append(java.lang.String);
		//public synchronized java.lang.StringBuffer append(java.lang.Object);
		//public synchronized java.lang.StringBuffer append(java.lang.StringBuffer);
		System.out.println("-->setChar Method");
		StringBuffer sb1=new StringBuffer();
		sb1.append("pI valie is:");
		sb1.append(3.14);
		sb1.append(" It is exactly ");
		sb1.append(true);
		System.out.println(sb1);

		//public synchronized java.lang.StringBuffer insert(int, char);
		//public java.lang.StringBuffer insert(int, boolean);
		//public java.lang.StringBuffer insert(int, double);
		//public java.lang.StringBuffer insert(int, long);
		//public java.lang.StringBuffer insert(int, int);
		//public synchronized java.lang.StringBuffer insert(int, java.lang.String);
		//public synchronized java.lang.StringBuffer insert(int, java.lang.Object);
		StringBuffer sb2=new StringBuffer("StringBuffer is mutable it's ");
		sb2.insert(29,true);
		System.out.println(sb2);
		sb2.insert(0,'A');
		System.out.println(sb2);
		char[] ch={'E','x','a','c','t','l','y',' '};
		sb2.insert(30,ch);
		System.out.println(sb2);
		
		//public synchronized java.lang.StringBuffer delete(int, int);
		StringBuffer sb3=new StringBuffer("StringBuffer");
		sb3.delete(6,12);// begin to (end-1)
		System.out.println(sb3);

		//public synchronized java.lang.StringBuffer deleteCharAt(int);
		sb3.deleteCharAt(2);
		System.out.println(sb3);

		//public synchronized java.lang.StringBuffer reverse();
		StringBuffer sb4=new StringBuffer("StringBuffer");
		sb4.reverse();
		System.out.println(sb4);

		// public synchronized void setLength(int);
		StringBuffer sb5=new StringBuffer("StringBuffer");
		sb5.setLength(6);
		System.out.println(sb5);
		sb5.setLength(12);
		System.out.println(sb5);
		System.out.println(sb5.length());
	}
}
