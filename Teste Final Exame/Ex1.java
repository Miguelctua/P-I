import java.util.*;
import java.io.*;
public class Ex1 {
	static Scanner read = new Scanner (System.in);
	public static void main (String[] args) throws IOException {
		int op ;
		Dados[] arrayValores = new Dados [31];
		File fileIn;
		Scanner scf;
		int n=0;
		System.out.println("Estação meteorológica:");
		System.out.println("1 - Ler ficheiro de dados");
		System.out.println("2 - Acrescentar medida");
		System.out.println("3 - Listar valores de temperatura e humidade");
		System.out.println("4 - Listar medidas ordenadas por valor de temperatura");
		System.out.println("5 - Listar medidas ordenadas por valor de humidade");
		System.out.println("6 - Calcular valores médios de temperatura e humidade");
		System.out.println("7 - Calcular valores máximos e mínimos de temperatura e humidade");
		System.out.println("8 - Calcular histograma das temperaturas e humidade");
		System.out.println("9 - Terminar o programa");
		do{
			System.out.println(" Opção ->");
			op = read.nextInt();
			switch(op){
				case 1:
				System.out.println("Digite o nome do ficheiro");
				String fileName = read.next();
				fileIn = new File(fileName);
				scf= new Scanner (fileIn);
				for(int i =0; scf.hasNext(); i++){
					arrayValores[i] = new Dados();
					arrayValores[i].temp=Integer.parseInt(scf.nextLine());
					arrayValores[i].hum=Integer.parseInt(scf.nextLine());
					n++;
				}
				System.out.print("Ficheiro lido!");
				System.out.println();
				scf.close();
				break;
				case 2:
				if (n<31){
					Dados valores = new Dados();
					boolean isValid;
					do{
						isValid=false;
						System.out.println("Valor da temperatura");
						valores.temp= read.nextInt();
						System.out.println("Valor da Humidade");
						valores.hum= read.nextInt();
						isValid = Validar(valores);
						if (isValid){
							arrayValores[n]=new Dados();
							arrayValores[n].temp=valores.temp;
							arrayValores[n].hum=valores.hum;
						}else System.out.println("Valores Inválidos!");
					}while(!isValid);
				}
				else{
					System.out.println("Já não é possível arranjar mais medidas!");
				}
				n++;
				System.out.println();
				break;
				case 3:
				for(int i=0;i<n;i++){
					System.out.printf("Temperatura: %d\n " , arrayValores[i].temp);
					System.out.printf("Humidade: %d\n ",arrayValores[i].hum);
				}
				System.out.println();
				break;
				case 4:
				int tmpTemp;
				int tmpHum;
				boolean changes;
				do{
					changes=false;
					for(int i=0;i<n-1;i++){
						if (arrayValores[i].temp>arrayValores[i+1].temp){
							tmpTemp= arrayValores[i].temp;
							tmpHum = arrayValores[i].hum;
							arrayValores[i].temp=arrayValores[i+1].temp;
							arrayValores[i].hum=arrayValores[i+1].hum;
							arrayValores[i+1].temp=tmpTemp;
							arrayValores[i+1].hum=tmpHum;
							changes=true;
						}
					}
				}while(changes);	
				for (int i=0;i<n;i++){
					System.out.printf("Temperatura: %d\n",arrayValores[i].temp);
					System.out.printf("Humidade: %d\n",arrayValores[i].hum);
					System.out.println();
				}
				System.out.println();
				break;
				case 5:
				int tmpTemp1;
				int tmpHum1;
				boolean changes1;
				do{
					changes1=false;
					for(int i=0;i<n-1;i++){
						if(arrayValores[i].hum < arrayValores[i+1].hum){
							tmpTemp1 = arrayValores[i].temp;
							tmpHum1= arrayValores[i].hum;
							arrayValores[i].temp = arrayValores[i+1].temp;
							arrayValores[i].hum = arrayValores[i+1].hum;
							arrayValores[i+1].temp = tmpTemp1;
							arrayValores[i+1].hum = tmpHum1;
							changes1 = true;
						}
					}
				}while(changes1);
				for(int i=0;i<n;i++){
					System.out.printf("Temperatura: %d\n",arrayValores[i].temp);
					System.out.printf("Humidade: %d\n",arrayValores[i].hum);
					System.out.println();
				}
				System.out.println();
				break;
			
				case 6:
				Media media = new Media();
				Media soma = new Media();
				soma.temp=0;
				soma.hum=0;
				for (int i=0; i<n; i++){
					soma.temp += arrayValores[i].temp;
					soma.hum += arrayValores[i].hum;
				}
				media.temp=soma.temp/n;
				media.hum=soma.hum/n;
				System.out.printf("Media temperatura = %.2f \n",media.temp);
				System.out.printf("Media humidade = %.2f \n",media.hum);
				System.out.println();
				break;
				case 7:
				Dados max = new Dados();
				Dados min = new Dados();
				max.temp=arrayValores[0].temp;
				max.hum=arrayValores[0].hum;
				min.temp=arrayValores[0].temp;
				min.hum=arrayValores[0].hum;
				
				for (int i=0 ;i<n ;i++){
					if (arrayValores[i].temp>max.temp){
						max.temp=arrayValores[i].temp;
					}
					if (arrayValores[i].temp<min.temp){
						min.temp=arrayValores[i].temp;
					}
					if (arrayValores[i].hum>max.hum){
						max.hum=arrayValores[i].hum;
					}
					if (arrayValores[i].hum<min.hum){
						min.hum=arrayValores[i].hum;
					}
				}
				System.out.printf("Valor maximo da temperatura: %d\n",max.temp);
				System.out.printf("Valor minimo da temperatura: %d\n",min.temp);
				System.out.printf("Valor maximo da humidade: %d\n",max.hum);
				System.out.printf("Valor minimo da humidade: %d\n",min.hum);
				break;
				case 8:
				System.out.println("Histograma de temperaturas");
				System.out.println("--------------------------");
				for (int i=10; i<=40; i++){
					System.out.printf("%d |",i);
					for (int j=0;j<n;j++){
						if (arrayValores[j].temp==i){
							System.out.print("*");
						}
					}
					System.out.println();
				}
				System.out.println();
				System.out.println("Histograma de humidade");
				System.out.println("--------------------------");
				for (int i=10; i<=40; i++){
					System.out.printf("%d |",i);
					for (int j=0;j<n;j++){
						if (arrayValores[j].hum==i){
							System.out.print("*");
						}
					}
					System.out.println();
				}
				System.out.println();
				break;
				case 9:
				System.exit(69);
				break;
				
					
			}
			
		}while(op!=9);
			
		
		
				
				
						
					
		
						
					
					
			
				
				
						
						
				
			
			
			
		}
			
		
		
		
	
	public static boolean Validar(Dados valores){
		if((valores.temp>=-10 && valores.temp<=40) && (valores.hum>=0 && valores.hum<=100)){
			return true;
		}
		return false;
	}
}
class Dados {
	int hum;
	int temp;
}
class Media{
	double hum;
	double temp;
}

