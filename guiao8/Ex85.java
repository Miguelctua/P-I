import java.util.*;
public class Ex85 {
	static Scanner sc = new Scanner(System.in);
	static Pessoa pessoa = new Pessoa();
	public static void main (String[] args) {
		
		double taxa;
		pessoa = lerdados();
		taxa = Tas(pessoa);
		printTas(taxa);
	}
	public static Pessoa lerdados(){
		
		System.out.println("Nome:");
		pessoa.nome=sc.nextLine();
		System.out.println("Sexo(m/f):");
		pessoa.sexo=sc.next().charAt(0);
		System.out.println("Peso:");
		pessoa.peso=sc.nextInt();
		System.out.println("Quantidade de alcool:");
		pessoa.quant=sc.nextDouble();
		System.out.println("Teor de alcool:");
		pessoa.teor=sc.nextDouble();
		System.out.println("Estava em jejum (s/n)?");
		pessoa.jejum=sc.next().charAt(0);
		return pessoa;
	}
	public static double Tas (Pessoa pessoa){
		double coefeciente=0;
		double tas;
		if (pessoa.jejum == 's'){
			if (pessoa.sexo == 'm'){
				coefeciente = 0.6;
			}
			else if (pessoa.sexo == 'm'){
				coefeciente = 0.7;
			}
		}
		if (pessoa.jejum == 'n'){
			coefeciente = 1.1;
		}	
		tas = (0.8 * pessoa.quant * (pessoa.teor/100))/(pessoa.peso * coefeciente);
		return tas;
	}	
	public static void printTas(double taxa){
		System.out.printf("A taxa de alcool é :%.2f",taxa);
	}	
		
}
class Pessoa{
	String nome;
	char sexo;
	int peso;
	double quant;
	double teor;
	char jejum;
}
