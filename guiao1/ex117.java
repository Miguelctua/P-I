import java.util.*;

public class ex117 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor total dos produtos");
		double prod = sc.nextDouble();
		System.out.println("Digite o total de descontos (%)");
		double desc = sc.nextDouble();
		System.out.println("Digite a taxa de IVA(%)");
		double iva = sc.nextDouble();
		double totalIva = iva/100;
		System.out.println(totalIva);
		double totalDesc = desc/100;
		System.out.println(totalDesc);
		double totalMoney = prod - prod*Math.abs(totalDesc) + prod*totalIva;
		System.out.printf("Preço final: %.2f",totalMoney);
	}
}

