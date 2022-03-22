package MockInterQns;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToTxtFile {

	public static void main(String[] args) throws IOException {
	
		FileWriter fw=new FileWriter("C:\\Users\\Priya\\Desktop\\write.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("welcome to writing");
		bw.newLine();
		bw.write("this is test file 424324324");
		bw.newLine();
		bw.write("********************");
		System.out.println("finished writing");
		bw.close();
		

	}

}
