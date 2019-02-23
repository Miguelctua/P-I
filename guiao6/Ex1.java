
import java.util.Scanner;
public class Ex1 {
	
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);	
		int n;
			
			System.out.print("Insira o número de números que vai introduzir");
			n= sc.nextInt();
			int a []=new int[n];
				for ( int i=0 ; i<a.length ; i++) {
				System.out.print("Número:\n");
				a[i]= sc.nextInt();
			}
				for ( int m = a.length-1;m>=0;m--){
				System.out.printf("%d " , a[m]);
			}
		
				
			
	
	}
}

