/*Pretende-se escrever um programa que leia do teclado uma sequência de números inteiros
positivos e que permita detetar um conjunto de características acerca da sequência. A leitura
da sequência termina quando aparecer o número zero como indicador de paragem ou quando
tiverem sido lidos 50 números. A interação com o programa deverá ser feita através de um
menu, tal como apresentado de seguida. A cada operação do menu deverá corresponder uma
função.
Análise de uma sequência de números inteiros
 1 - Ler a sequência
 2 - Escrever a sequência
 3 - Calcular o máximo da sequência
 4 - Calcular o mínimo da sequência
 5 - Calcular a média da sequência
 6 - Detetar se é uma sequência só constituída por números pares
10 - Terminar o programa
Opção ->  
 */

import java.util.Scanner;
public class Ex3 {
	static int cont=0;
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int op;
		
		int [] arrayInt = new int [50];
		//Opção
		System.out.printf("-->> Digite a sua opção <<--\n");
		System.out.printf("\n");
		System.out.printf("1 - Ler sequência\n");
		System.out.printf("2 - Imprimir sequência\n");
		System.out.printf("3 - Calcular o máximo da sequência\n");
		System.out.printf("4 - Calcular o mínimo da sequência\n");
		System.out.printf("5 - Calcular média da sequência\n");
		System.out.printf("6 - Detetar se é uma sequência só constituída por números pares\n");
		System.out.printf("10 - Terminar o programa\n");
		System.out.printf("\n");
		do{
			System.out.printf("Opção -->");
			op=sc.nextInt();
		
			switch(op){
			case 1:
				lerseq(arrayInt);
			break;
			case 2:
				impseq(arrayInt);
			break;
			case 3:
				System.out.printf("O máximo é : %d \n", max(arrayInt));
			break;
			case 4:
				System.out.printf("O minimo é : %d \n", min(arrayInt));
			break;
			case 5:
				System.out.printf("A média é : %d \n", med(arrayInt));
				break;
			case 6:
				par(arrayInt);
			break;
			case 10:
			
			break;
			default:
				System.out.printf("opção inválida");
				}
	   }while (op!=10); //Termina quando se introduz 10
  }
  //Funções
  public static void lerseq (int[] array){
  Scanner sc = new Scanner (System.in);
  int i=1;
  do { 
	  System.out.printf("Digite um número ou 0 para parar  \n");
	  array[i]=sc.nextInt();
	  i++;
	  cont++;
  }while (array [i-1]!=0 );
  cont--;

}
  public static void impseq (int[] array){ //função que lê os valores 
  for (int i=0 ; array[i]!=0 ; i++){
	  System.out.printf("array[%d] = %d ",i,array[i]);
  }
}
 public static int max (int[] array ){ //função que calcula o maximo
 int max = array[0];
	for (int i=0; i<cont;i++){
		if (array[i]> max){
		max = array[i];
		}
	 }
	 return max;
 }
 // função que calcula o minimo
 public static int min (int[] array ){ 
	 int min = array[0];
	 for(int i=0; i<cont;i++)
	 {
		 if (array[i]<min){
			 min=array[i];}
		 }
	return min;
}
//função que calcula a media 
public static int med (int[] array){ 
	int soma = 0;
	int media = 0;
	for (int i=0; i<cont; i++)
	{ 
		soma += array[i];
		media = soma/(cont);
	}
	return media;
		
} 
//função que deteta se a sequência é so constituída por nº pares
public static void par (int[] array){ 
	int numPar=0;
	//int i;
	for (int i=0; i<cont; i++)
	{
		if (array[i]%2==0) {
			numPar++;}
	}
	if (numPar==cont) { System.out.printf("A sequência é só contituída por nº pares\n");
	}
	else { 
		System.out.printf("A sequência não é só constituída por nº paresn");
	}
 }
}

