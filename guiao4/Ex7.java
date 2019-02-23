import java.util.Scanner;
public class Ex7 {	
public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int i, reversei;
		String str;			
		System.out.println("Escreva um número inteiro");
		i= sc.nextInt();
		
		str = Integer.toString(i);
			
		reversei = Integer.parseInt(new StringBuilder(str).reverse().toString());
		System.out.printf("O inverso de %d é : %d",i,reversei);
    


}
	
}	
	


