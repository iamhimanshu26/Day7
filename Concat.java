package GlobalLogic;

import java.util.Scanner;

//Concating of two strings

public class Concat {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String n1= sc.next();
		String n2= sc.next();
		String str1 = new String(n1);
		String str2 = new String(n2);
		String result= str1.concat(" "+str2);
		System.out.println(result);
	}

}
