import java.util.Scanner;

public class Ex507 {
	
	public static void main (String[] args) {
		
		int a,b;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Primeio valor: ");
		a = ler.nextInt();
		
		System.out.print("Segundo valor: ");
		b = ler.nextInt();
		
		euclides(a,b);
		
	}
	
	public static void euclides (int a, int b)
	{
		int a1 = a;
		int b1 = b;
		do
		{
		int resto = a%b;
		a= b;
		b= resto;
	} while(b!= 0);
	
		System.out.printf("O máximo divisor comum entre %d e %d é %d", a1, b1, a); 
	} 
		
}

