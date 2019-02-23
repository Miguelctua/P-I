import java.util.Scanner;
public class Ex2 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double n,prod=1 ;
		do{
		System.out.printf("Digite um número diferente de zero \n");
			n= sc.nextDouble();
			if (n!=0) {
			prod=prod*n;
		}
		}while (n!=0);
	
		System.out.printf("Produto: %f ",prod);
		
	}
}

