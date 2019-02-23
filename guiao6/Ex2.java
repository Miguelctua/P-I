//Escreva um programa que leia uma sequência de números inteiros positivos e conte o número
//de vezes que um determinado número, pedido ao utilizador, aparece na sequência. A leitura
//deve terminar após a introdução de 100 números ou com o aparecimento de um número
//negativo.
import java.util.Scanner;
public class Ex2 {
	
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int num,npos;
	int cont=0;
	int contnum=0;
	
		System.out.print("Qual é o número ?");
		num=sc.nextInt();
		do {
			System.out.printf("Digite um número inteiro positivo");
			npos=sc.nextInt();
			if (npos==num){
				cont++;
			}
		contnum++;} while(contnum<=100 && npos>=0);
		System.out.printf("O número %d foi escrito %d vezes",num,cont);
			
	}
}

