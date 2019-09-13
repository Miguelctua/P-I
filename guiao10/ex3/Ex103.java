import java.util.*;
import java.io.*;
public class Ex103 {
	static Scanner read = new Scanner(System.in);
	static File fileIn;
	public static void main (String[] args) throws IOException{
		int op;
		double number;
		double numberArray[] = new double[1];
		double ArrayOrdenado[] = new double [1];
		double avg=0;
		System.out.printf("Analisador de pH\n");
		System.out.printf("1 - Ler valores de pH de um ficheiro\n");
		System.out.printf("2 - Escrever valores de pH no terminal\n");
		System.out.printf("3 - Calcular o pH medio das amostras\n");
		System.out.printf("4 - Calcular o numero de amostras acidas e basicas\n");
		System.out.printf("5 - Calcular o numero de amostras de pH superior a media\n");
		System.out.printf("6 - Escrever valores de pH no terminal ordenados de modo crescente\n");
		System.out.printf("7 - Terminar programa\n");
		do{
			System.out.println("Opção-->");
			op=read.nextInt();
			switch(op){
				case 1://ler do ficheiro o PH
					System.out.print("Nome do ficheiro: ");
					String fileName = read.next();
					fileIn = new File(fileName);
					checkFile(fileIn , fileName);
					Scanner scf = new Scanner(fileIn);
					numberArray = new double[countPH(fileIn)];
					for (int i=0;i<numberArray.length;i++){
						number=Double.parseDouble(scf.next());
						if (number>=0 && number<=14){
							numberArray[i]=number;
						}
					}
					System.out.printf("Valores lidos com sucesso");
					System.out.println();
					scf.close();
				break;
				case 2://Escrever os valores de PH no terminal
					for (int i=0;i<numberArray.length;i++){
						System.out.printf("Array[%d]= %.2f\n",i,numberArray[i]);
					}
					System.out.println();
					
				break;
				case 3://Calcular o PH medio das amostras 
					double soma=0;
					for(int i=0; i<numberArray.length;i++){
						soma += numberArray[i];
					}
					
					avg=(soma/numberArray.length);
					System.out.printf("Valor médio de PH é : %.2f \n ",avg);
					System.out.println();
					break;
				
				case 4:
				int base=0;
				int acid=0;
				for (int i=0; i<numberArray.length;i++){
					number = numberArray[i];
					if (number<7){
						acid++;
					}
					if (number>7){
						base++;
					}
				}
				System.out.printf("Existem %d amostras ácidas\n",acid);
				System.out.printf("Existem %d amostras básicas\n", base);
				break;
				case 5:
				int aboveAvg=0;
				for (int i=0;i<numberArray.length;i++){
					number = numberArray[i];
					if(number>avg){
						aboveAvg++;
					}
				}
				System.out.printf("Existem %d valores acima da média",aboveAvg);
				System.out.println();
				break;
				case 6:
				double tmp;
				boolean trocas ;
				ArrayOrdenado = new double [numberArray.length];
				for(int i=0;i<numberArray.length;i++){
					ArrayOrdenado[i]=numberArray[i];
				}
				do{
					trocas=false;
					for(int i=0;i<ArrayOrdenado.length-1;i++){
						if(ArrayOrdenado[i]>ArrayOrdenado[i+1]){
							tmp = ArrayOrdenado[i];
							ArrayOrdenado[i]=ArrayOrdenado[i+1];
							ArrayOrdenado[i+1] = tmp;
							trocas = true;
							
						}
					}
				}while(trocas);
				System.out.print("Valores de PH ordenados:\n");
				for (int i=0;i<ArrayOrdenado.length;i++){
					System.out.printf("ArrayOrdenado[%d]= %.2f \n",i,ArrayOrdenado[i]);
				}
				System.out.println();
				break;
				case 7:
				break;	
				default:
				System.out.println("Opção inválida");
				break;	
				
			}
					
					
		}while(op!=7);	
					
							
					
					
					
					
					
					
					
				
		
		
	}	
	public static void checkFile(File file , String fileName ){
		if(!file.exists()){
			System.out.printf("ERROR: input file " + fileName + " does not exist!");
			System.exit(1);
		}
		if (file.isDirectory()){
			System.out.printf("ERROR: input file " + fileName+ " is a directory!");
			System.exit(3);
		}
		if(!file.canRead()){
			System.out.printf("ERROR: input file " + fileName + " can't read!");
			System.exit(2);
		}
	}
	public static int countPH(File fileIn) throws IOException{
		Scanner scf = new Scanner (fileIn);
		int numElementos=0;
		double number;
		while(scf.hasNext()){
			number = Double.parseDouble(scf.next());
			if (number>=0&& number<=14){
				numElementos++;
		}
		
		}
		scf.close();
		return numElementos;
	}
}

