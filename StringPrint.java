package optimized_code;

import java.util.*;
public class StringPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.next();
		printChar(str);
		sc.close();
	}
	public static void printChar(String str)
	{
		for(int i=0;i<str.length(); i++)
		{
			System.out.println(str.charAt(i));
		}
	}
}
