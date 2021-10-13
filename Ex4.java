package GlobalLogic;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
//Write a program to find the longest word in a text file.

public class Ex4 {
	     public static void main(String [ ] args) throws FileNotFoundException {
	              new Ex4().findLongestWords();
	         }

	     public String findLongestWords() throws FileNotFoundException {

	       String longest_word = "";
	       String current;
	       Scanner sc = new Scanner(new File("/home/himanshu.k.sharma/Documents/Longestword.java"));


	       while (sc.hasNext()) {
	          current = sc.next();
	           if (current.length() > longest_word.length()) {
	             longest_word = current;
	           }

	       }
	         System.out.println("\n"+longest_word+"\n");
	            return longest_word;
	            }
	}


