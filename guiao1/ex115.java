import java.util.*;

public class ex115{
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		System.out.println("Digite o nome do aluno");
		String nome = sc.next();
		System.out.println("Digite a nota do TP1");
		double notaTp1 = sc.nextDouble();
		System.out.println("Digite a nota do TP2");
		double notaTp2 = sc.nextDouble();
		System.out.println("Digite a nota do API");
		double notaApi = sc.nextDouble();
		System.out.println("Digite a nota do EF");
		double notaEf = sc.nextDouble();
		double notaFinal = notaTp1*0.15 + notaTp2*0.15 + notaApi*0.30 + notaEf*0.40;
		System.out.printf("O aluno %s teve nota final de %.2f",nome,notaFinal);
		
	}
}

