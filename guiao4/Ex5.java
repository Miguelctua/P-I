import java.util.Scanner;
public class Ex5 {
	
	public static void main (String[] args) {
	Scanner sc = new Scanner (System.in);
	int n, i ;
	double rest;
	System.out.println("Digite um número inteiro: ");
	n=sc.nextInt();
	i=2;
	
	while (true) {
		rest=n%i;
		i++;
		if (rest==0) {
			System.out.println("O número não é primo");
			break;	}
		
		else if (i>=n/2) {
			System.out.println("O número é primo");
			break;
			
		}
	}
	
	
			
	}
}

