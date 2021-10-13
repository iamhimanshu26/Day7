package GlobalLogic;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

//Write a program to read a plain text file.
public class Ex3 {

	public static void main(String[] args) {
		StringBuilder obj = new StringBuilder();
		String strLine= "";
		try {
			BufferedReader bR= new BufferedReader(new FileReader("/home/himanshu.k.sharma/Documents/Main.java"));
			while(strLine!= null) {
				obj.append(strLine);
				obj.append(System.lineSeparator());
				strLine= bR.readLine();
				System.out.println(strLine);
			}
			bR.close();
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}catch(IOException e) {
			System.out.println("Can't read the file");
		}
	}
}
