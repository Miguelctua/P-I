import java.util.*;

public class ex114{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Digite o valor do 1º Cateto");
		double catetoA = sc.nextDouble();
		System.out.println("Digite o valor do 2ª Cateto");
		double catetoB = sc.nextDouble();
		double hip = Math.sqrt(((catetoA*catetoA)+(catetoB*catetoB)));
		System.out.printf("O valor da hipotenusa é %.2f",hip);
		double ang = Math.pow(Math.sin(catetoA/hip),-1);
		System.out.printf("O valor do angulo que A faz com a hipotenusa é, %.2f",ang);
	}
}
