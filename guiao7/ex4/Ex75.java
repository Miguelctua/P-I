import java.io.*;
import java.util.*;
public class Ex75 {
	
	public static void main (String[] args) throws IOException {
		String fileIn= "ola.txt";
		File fin = new File(fileIn);
		Scanner readfile = new Scanner(fin);
		String fileOut="out.txt";
		File fout = new File (fileOut);
		if(!fin.exists()) {
			System.out.print("ERRO FILE" +fileIn+ "DOES NOT EXIST!");
			System.exit(2);
		}
		PrintWriter pw = new PrintWriter(fout);
		while (readfile.hasNextLine()){
			String line = readfile.nextLine();
			if(!line.startsWith("//")) {
				pw.println(line);
			}  
			
			
		}
		readfile.close();
		pw.close();
		
			
		
		
		
		
	}
}

