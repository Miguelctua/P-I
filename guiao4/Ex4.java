import java.util.Scanner;
public class Ex4 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int secret=(int)(100.0*Math.random()) + 1;
		int tent,cont;
		cont=1;
		do {
		System.out.printf("Escreva a sua tentativa \n");
		tent=sc.nextInt();
		
		cont++;
		if (tent<secret){
			System.out.printf("Demasiado baixa");
		}
		if (tent>secret){
			System.out.printf("Demasiado alta");
		}
        }while (tent!=secret);
        System.out.printf("Acertou em %d tentativas ",cont);	
	
			
		
	}
}

