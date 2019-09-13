import java.util.*;
import java.io.*;
public class Exame1 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws IOException{
		int op,i=0;
		Dados[] array = new Dados[31];
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
			System.out.println("Digite a sua opção");
			op = sc.nextInt();
			switch(op){
				case 1:
					System.out.println("Nome do ficheiro:");
					String s = sc.next();
					File nameIn =new File(s);
					Scanner scf = new Scanner(nameIn);
					while(scf.hasNextLine()){
						array[i] = new Dados();
						array[i].temp=Integer.parseInt(scf.nextLine());
						array[i].hum=Integer.parseInt(scf.nextLine());
						i++;
					}
					System.out.println("Ficheiro lido!");
					scf.close();
				break;
				case 2:
				if(i<31){
				Dados valores = new Dados();
				boolean isValid;
					do{
						isValid=false;
						System.out.println("Digite uma nova medida de temperatura");
						valores.temp=sc.nextInt();
						System.out.println("Digite uma nova medida de humidade");
						valores.hum=sc.nextInt();
						isValid= Validar(valores);
						if (isValid){
							array[i]=new Dados();
							array[i].temp=valores.temp;
							array[i].hum=valores.hum;
						}else System.out.println("Dados invalidos");
					}while(!isValid);
				}
				else{
					System.out.println("Já não é possivel colocar mais valores");
				}
				i++;
				break;
				case 3:
					for (int n=0;n<i;n++){
						System.out.printf("Temperatura: %d\n",array[n].temp);
						System.out.printf("Humidade: %d\n",array[n].hum);
					}
				break;
				case 4:
					int tmpTemp,tmpHum;
					boolean changes;
					do{
						changes=false;
						for(int j=0;j<i-1;j++){
							if(array[j].temp > array[j+1].temp){
								tmpTemp=array[j].temp;
								tmpHum=array[j].hum;
								array[j].temp=array[j+1].temp;
								array[j].hum=array[j+1].hum;
								array[j+1].temp=tmpTemp;
								array[j+1].hum=tmpHum;
								changes=true;
							}
						}
					}while(changes);
					for (int n=0;n<i;n++){
						System.out.printf("Temperatura: %d\n",array[n].temp);
						System.out.printf("Humidade: %d\n",array[n].hum);
					}
				break;
				case 5:
					int tmpTemp2,tmpHum2;
					boolean changes2;
					do{
						changes2=false;
						for(int j=0;j<i-1;j++){
							if(array[j].hum > array[j+1].hum){
								tmpTemp2=array[j].temp;
								tmpHum2=array[j].hum;
								array[j].temp=array[j+1].temp;
								array[j].hum=array[j+1].hum;
								array[j+1].temp=tmpTemp2;
								array[j+1].hum=tmpHum2;
								changes2=true;
							}
						}
					}while(changes2);
					for (int n=0;n<i;n++){
						System.out.printf("Temperatura: %d\n",array[n].temp);
						System.out.printf("Humidade: %d\n",array[n].hum);
					}
				break;
				case 6:
				double somaTemp=0;
				double somaHum=0;
				double mediaTemp=0;
				double mediaHum=0;
					for (int j=0;j<i;j++){
						somaTemp += array[j].temp;
						somaHum += array[j].hum;
					}
				mediaTemp=somaTemp/i;
				mediaHum=somaHum/i;
				System.out.printf("Media Temperatura = %.2f \n",mediaTemp);
				System.out.printf("Media Humidade = %.2f \n",mediaHum);
				break;
				case 7:	
				Dados max = new Dados();
				Dados min = new Dados();
				max.temp=array[0].temp;
				max.hum=array[0].hum;
				min.temp=array[0].temp;
				min.hum=array[0].hum;
				for (int j=0;j<i;j++){
					if (array[j].temp>max.temp){
						max.temp=array[j].temp;
					}
					if (array[j].hum>max.hum){
						max.hum=array[j].hum;
					}
					if(array[j].temp<min.temp){
						min.temp=array[j].temp;
					}
					if(array[j].hum<min.hum){
						min.hum=array[j].hum;	
					}
				}
				System.out.printf("Valor maximo da temperatura: %d\n",max.temp);
				System.out.printf("Valor minimo da temperatura: %d\n",min.temp);
				System.out.printf("Valor maximo da humidade: %d\n",max.hum);
				System.out.printf("Valor minimo da humidade: %d\n",min.hum);
				break;
				case 8:
					System.out.println("Histograma de temperatura");
					for (int j=-10;j<=40;j++){
						System.out.printf("%3d |",j);
						for(int k=0;k<i;k++){	
							if (array[k].temp==j){
								System.out.print("*");
							}
						}
						System.out.println();
					}
					System.out.println();
					System.out.println("Histograma de humidade");
					for(int j=0;j<=100;j++){
						System.out.printf("%3d |",j);
						for (int k=0;k<i;k++){
							if (array[k].hum==j){
								System.out.print("*");
							}
						}
						System.out.println();
					}
				break;
				case 9:
				break;
				default:
				System.out.println("Opção inválida");
				break;
						
			}
		}while(op!=9);
					
				
	}
	static boolean Validar(Dados valores){
		if ((valores.temp>=-10 && valores.temp<=40) && (valores.hum>=0 && valores.hum<=100)){
			return true;
		}
		else{
			return false;
		}
	}
}
class Dados{
	int temp,hum;
}
