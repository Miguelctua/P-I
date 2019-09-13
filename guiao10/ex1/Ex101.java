import java.io.*;
import java.util.Scanner;
public class Ex101 {
	static int cont=0;
	
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args)  throws IOException{
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
		System.out.printf("7 - ler uma sequência de números de um ficheiro de texto\n");
		System.out.printf("8 - adicionar números à sequência existente\n");
		System.out.printf("9 - Gravar a sequência atual de números num ficheiro\n");
		System.out.printf("10 - Ordenar a sequência por ordem crescente utilizando ordenação sequencial\n");
		System.out.printf("11 - Ordenar a sequência por ordem decrescente utilizando ordenação por flutuação\n");
		System.out.println("12 - Pesquisa de valor na sequência");
		System.out.printf("13 - Terminar o programa");
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
			case 7:
				lerficheiro();
			break;
			case 8:
				adseq();
			break;
			case 9:
				gravar();
			break;
			case 10:
				arrayInt=crescente(arrayInt);
			break;
			case 11:
				arrayInt=decrescente(arrayInt);
			
			break;
			case 12:
				pesquisa(arrayInt);
			break;
			case 13:
			break;
			
			default:
				System.out.printf("opção inválida");
				}
	   }while (op!=13); //Termina quando se introduz 10
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
// função que lê uma sequêcia de nº de um ficheiro 
public static void lerficheiro() throws IOException{
	System.out.print("Digite o nome do ficheiro: ");
	String fic = new String();
	fic = sc.nextLine();
	File f = new File(fic);
	double n=0;
	Scanner readfile= new Scanner(f);
	while(readfile.hasNextDouble()){
		n= readfile.nextDouble();
			System.out.printf("%f \t",n);
			}
		readfile.close();
	}
// função que adiciona nº à sequencia 
public static void adseq() throws IOException{
	String s = new String();
	System.out.println("Adicione os nº /n ");
	s = sc.nextLine();
	FileWriter f = new FileWriter ("FicheiroComNumeros.txt",true);
	PrintWriter pwf = new PrintWriter(f);
	pwf.printf("\t"+s);
	pwf.close();
}
// função que grava 
    public static void gravar() throws IOException{
	double n = 0;
	String s = new String();
	File f = new File ("FicheiroComNumeros.txt");
	Scanner readfile= new Scanner(f);
	while(readfile.hasNext()){
		
	s= readfile.nextLine();
    }
    readfile.close();
    File t = new File("out.txt");
    PrintWriter pwf = new PrintWriter(t);
    pwf.printf(s);
    pwf.close();
}
// Função que ordena a sequência por ordem crescente utilizando ordenação sequencial
	public static int[] crescente (int arrayInt[]){
		int temp;
		int n=0;
		for (int i=0;i<arrayInt.length;i++){
			if (arrayInt[i]==0){
				break;
			}else{
				n++;
			}
		}
		for(int k=0; k<n-1 ; k++){
			for (int j=k+1;j<n;j++){
				if (arrayInt[k] > arrayInt[j]){
					temp = arrayInt[j];
					arrayInt[j] = arrayInt[k];
					arrayInt[k] = temp;
				}
			}
		}
			return arrayInt;
	}
	//Função que ordenar a sequência por ordem decrescente utilizando ordenação por flutuação
	public static int [] decrescente (int arrayInt[]){
		boolean troca = false;
		int n=0;
		int temp;
		for (int k=0; k<arrayInt.length;k++){
			if (arrayInt[k]==0){
			break;
			}else{
			 n++;}
		}
		do {
			troca = false;
			for (int i=0;i<n;i++){
				if (arrayInt[i+1]>arrayInt[i]){
					if (arrayInt[i+1]==0) continue;
					temp = arrayInt[i];
					arrayInt[i]=arrayInt[i+1];
					arrayInt[i+1]=temp;
					troca=true;
				}
			}
		} while(troca);
		return arrayInt;
	}
// Função que pesquisa um valor na sequência
	public static void pesquisa (int arrayInt[]){
		int a;
		int pos = -1;
		System.out.println("\nDigite o valor a procurar");
		a=sc.nextInt();
		for(int i=0;i<arrayInt.length;i++){
			if(arrayInt[i]==a){
				pos = i;
			}
		}	
		if (pos==-1) {
			System.out.println("O valor nao existe");
		}
		else{
			System.out.printf("O valor está na posição %d.",pos);
		}
	}
				
			
			
		
					
					
		
		
							 
			
	
}
