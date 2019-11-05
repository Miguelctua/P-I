import java.util.*;

public class ex116 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantia que o turista gastou no 1º dia");
		double quant = sc.nextDouble();
		double quant1= quant + (quant*0.2);
		//System.out.println(quant1);
		double quant2 = quant1 + (quant1*0.2);
		//System.out.println(quant2);
		double quant3 = quant2 + (quant2*0.2);
		//System.out.println(quant3);
		double quant4 = quant3 + (quant3*0.2);
		//System.out.println(quant4);
		double media = (quant1+quant2+quant3+quant4)/ 4;
		System.out.printf("O turista teve uma despesa media diaria de %.2f",media);
	}
}

