package GlobalLogic;

import java.util.Scanner;
//Program to write the vowels from the given string

public class EX2 {
	void vowels(String str) {
		char ch;
		for(int i=0; i<str.length(); i++) {
			ch= str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				System.out.println(ch);
			}
		}
	}
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	EX2 obj=new EX2();
	String n= sc.nextLine();
	String str= new String(n);
	System.out.println("String is: ");
	System.out.println(n);
	System.out.println("Vowels are: ");
	obj.vowels(str);
	}
}
