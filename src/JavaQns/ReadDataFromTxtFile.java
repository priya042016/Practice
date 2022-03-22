package MockInterQns;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class ReadDataFromTxtFile {

	public static void main(String[] args) throws IOException {
		
		//method 1: usng filereader and bufferrredeader
		
	
			FileReader fr=new FileReader("C:\\Users\\Priya\\Desktop\\test.txt");
			BufferedReader br=new BufferedReader(fr);
			String str;
			while((str=br.readLine())!=null){
			System.out.println(str);
			}
			br.close();
			
			//Method2: using File and scanner
			
			File f=new File("C:\\\\Users\\\\Priya\\\\Desktop\\\\test.txt");
			
			Scanner sc=new Scanner(f);
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		
			//Method 3:
			
			
		
		
		
	}

}
