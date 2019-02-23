import java.util.Scanner;
public class Ex6 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int a,b,cont=1;
		double rest,rest1;
	System.out.printf("Digite um número inteiro: ");
	a= sc.nextInt();
	System.out.printf("Digite outro número inteiro: ");
	b= sc.nextInt();
	if (a>b){
		rest=b;
	}
	else{
		rest=a;
		a=b;
	}
	while (true){
		rest1=a/rest;
	if (rest1==0){
		System.out.println("O máximo div comum %d",rest);
		break;}
	a = rest;
	rest=rest1;
	
	}
	
}
}

