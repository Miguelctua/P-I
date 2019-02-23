import java.util.Scanner;
import java.io.*;
public class Ex1 {
	
	public static void main (String args[]) throws IOException {
		Scanner read = new Scanner(System.in); 
		String file;
		System.out.print("Nome do ficheiro: ");
		file = read.nextLine();
		File my_file = new File(file);
		if(verify(my_file,file)){
			Scanner readFile = new Scanner(my_file); 
			while(readFile.hasNextLine()){
				System.out.printf("%s\n",readFile.nextLine());
			}
		}	
	}
	
	//Função 
	public static boolean verify(File nameFile, String file){
		
		if(!nameFile.exists()){
			System.out.printf("ERROR: input name %s is not a file\n", file);
			return false;
		}else if(nameFile.isDirectory()){
			System.out.printf("ERROR: input name %s is a directory\n", file);
			return false;
		}else if(!nameFile.canRead()){
			System.out.printf("ERROR: input name %s can't be read\n", file);
			return false;
		}
		return true;
	}
}
