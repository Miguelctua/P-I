import java.util.Scanner;
public class Ex1 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,cont=0 ;
		do {
		System.out.printf("Digite um número inteiro \n");
		n = sc.nextInt();
		cont++;
		}
		while(n>0);
		System.out.printf("Valor %d lido na %d vez\n",n,cont);
	}
}


