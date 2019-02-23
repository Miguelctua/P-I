import java.io.*;
import java.util.Scanner;
public class Ex72 {
	
	public static void main (String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	int num,npos;
	int cont=0;
	int contnum=0;
	int n=0;
		File f = new File(args[0]);
		Scanner readfile = new Scanner(f);
		while(readfile.hasNextInt()){
			n = readfile.nextInt();
			if(n>0){
				System.out.printf("%d \t",n);
			}
		}
		readfile.close();
	}
}

		
		
		
		
		
		
		
		/*
		System.out.print("Qual é o número ?");
		num=sc.nextInt();
		do {
			System.out.printf("Digite um número inteiro positivo");
			npos=sc.nextInt();
			if (npos==num){
				cont++;
			}
		contnum++;} while(contnum<=100 && npos>=0);
		System.out.printf("O número %d foi escrito %d vezes",num,cont);
			
	}
}
		*/
	


