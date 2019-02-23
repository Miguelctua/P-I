import java.util.Scanner;
public class Ex7 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n1,n2,n3;
		System.out.printf("Digite 1 nr:");
		n1 = sc.nextInt();
		System.out.printf("Digite outro:");
		n2 = sc.nextInt();
		System.out.printf("Digite outro:");
		n3= sc.nextInt();
		if (n1>n2 && n1>n3){
			System.out.printf("O maior número é " +n1);
		}
		else if (n2>n1 && n2>n3){
		System.out.printf("O maior número é " +n2);
	}
	else {
		System.out.printf("O maior número é " +n3);
	}
	}
}

