package GlobalLogic;
import java.io.File;
import java.text.SimpleDateFormat;

//Write a program to get last modified time of a file.

public class Ex5 {
	    public static void main(String[] args){	
	        //Specify the file path and name
		File file = new File("/home/himanshu.k.sharma/Documents/Longestword.java");
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println("Last Modified Date: " + sdf.format(file.lastModified()));
	    }
	
	}


