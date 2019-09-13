import java.util.*;
import java.io.*;

public class Exame4 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws IOException {
		int opcao;
		Aluno[] alunos = new Aluno[100];
		do{
			System.out.println("Servicos Academicos - Gestao de uma pauta:");
			System.out.println("1 - Ler ficheiro com numeros mec. e pedir informacao de notas");
			System.out.println("2 - Imprimir no terminal a informacao da disciplina");
			System.out.println("3 - Calcular estatisticas da notas finais");
			System.out.println("4 - Alterar as notas de um aluno");
			System.out.println("5 - Imprimir um histograma de notas");
			System.out.println("6 - Gravar num ficheiro a informacao da disciplina (ordenada)");
			System.out.println("7 - Terminar programa");
			System.out.println();
			System.out.println("-------------------------");
			System.out.println();
			System.out.print("Opcao -> ");
			opcao = sc.nextInt();
			System.out.println();
			switch (opcao){
				case 1:
					alunos = lerFicheiro();
					
				break;
				case 2:
					print(alunos);
				break;
				case 3:
					stats(alunos);
				break;
				case 4:
					change(alunos);
				break;
				case 5:
					histograma(alunos);
				break;
				case 6:
					save(alunos);
				break;
				case 7:
				break;
				default:
					System.out.println("Opçao invalida");
				break;
				
			}		
		}while(opcao!=7);			
	}
	public static Aluno[]lerFicheiro()throws IOException{
		int i=0;
		int n=0;
		double op,op2;
		
		System.out.println("Digite o nome do ficheiro");
		String s = sc.next();
		System.out.println("Ficheiro lido");
		File f = new File(s);
		Scanner scf = new Scanner(f);
		while (scf.hasNextLine()){
			scf.nextLine();
			n++;
		}
		Aluno[] lista = new Aluno[n];
		scf.close();
		scf=new Scanner(f);
		while (scf.hasNextLine()){
			lista[i] = new Aluno();
			lista[i].mec = scf.nextInt();
			i++;
		}
			
		for (int j=0;j<n;j++){
			do{
				System.out.printf("Digite a 1ª nota normal do aluno %d [0-20] ou 77 se desistiu \n",lista[j].mec);
				lista[j].Nnota1=sc.nextInt();
				op= lista[j].Nnota1;
			}while((op<0 || op>20) && op!=77);
			do{
				System.out.printf("Digite a 2ª nota normal do aluno %d [0-20] ou 77 se desistiu \n",lista[j].mec);
				lista[j].Nnota2=sc.nextInt();
				op= lista[j].Nnota2;
			}while((op<0 || op>20) && op!=77);
			do{ 
				System.out.printf("Digite a nota de Recurso do aluno %d [0-20] ou 77 se desistiu \n",lista[j].mec);
				lista[j].Rnota=sc.nextInt();
				op2=lista[j].Rnota;
			}while((op2<0 || op2>20) && op2!=77);
		
		}
		return lista;
	}
	public static void print(Aluno[]alunos){
		System.out.println("Pauta de uma disciplina ");
		System.out.println("------------------------");
		for (int i=0;i<alunos.length;i++){
			System.out.printf("| %5d | %2d | %2d | %2d |\n", alunos[i].mec,alunos[i].Nnota1,alunos[i].Nnota2,alunos[i].Rnota);
		}
		System.out.println("------------------------");
	}
	public static void stats(Aluno[]alunos){
		Aluno media[] = new Aluno[alunos.length];
		int aprov =0;
		int reprov=0;
		double best=0;
		int melhor =0;
		for (int i=0;i<alunos.length;i++){
			media[i] = new Aluno();
			media[i].medN= (alunos[i].Nnota1+alunos[i].Nnota2)/2;
			media[i].medR= alunos[i].Rnota;
			if(media[i].medN>=9.5){
				media[i].medF=media[i].medN;
				if (media[i].medR>media[i].medF){
					media[i].medF=media[i].medR;
					if (media[i].medF==77){
						media[i].medF=media[i].medN;
					}
				}
			}
			if ((media[i].medN<9.5) || alunos[i].Nnota1==77 || alunos[i].Nnota2==77){
				media[i].medF=media[i].medR;
				if (media[i].medF==77){
					media[i].medF=0;
				}
			}
			if(media[i].medF>=9.5){
				aprov++;
			}
			if(media[i].medF<9.5){
				reprov++;
			}
			if(media[i].medF>best){
				best = media[i].medF;
				melhor=alunos[i].mec;
			}
			System.out.printf("Nota final do aluno %d é: %f\n",alunos[i].mec,media[i].medF);
		}
		System.out.printf("Foram aprovados %d alunos reprovados %d e o melhor aluno foi o %d .\n",aprov,reprov,melhor);
		System.out.println();
	}				
	public static void change(Aluno[] alunos){
		int mudar;
		int n=0;
		int pos = -1;
		System.out.println("Digite o Nr mec do aluno:");
		mudar = sc.nextInt();
		do { 
			if (alunos[n++].mec == mudar){
			pos = n-1;
			}
		} while (pos == -1 && n< alunos.length);
		if (pos!=-1){
			System.out.printf("Digite a 1ª nota normal do aluno %d [0-20] ou 77 se desistiu \n",alunos[pos].mec);
			alunos[pos].Nnota1 = sc.nextInt();
			System.out.printf("Digite a 2ª nota normal do aluno %d [0-20] ou 77 se desistiu \n",alunos[pos].mec);
			alunos[pos].Nnota2 = sc.nextInt();
			System.out.printf("Digite a nota de recurso do aluno %d [0-20] ou 77 se desistiu \n",alunos[pos].mec);
			alunos[pos].Rnota = sc.nextInt();
			
		}
		if (pos==-1){
			System.out.println("Aluno não existe!");
		}
		System.out.println();
	}		
	public static void histograma(Aluno[]alunos){
		System.out.println("Histograma de uma disciplina");
		for (int i=0;i<=20;i++){
			System.out.printf("%3d \n|",i);
			for (int j=0;j<alunos.length;j++){
				
				if (alunos[j].medF==i){
					System.out.print("*");
				}
			}
		}
		System.out.println();
	}
	public static void save(Aluno alunos){
		boolean trocas=false;
		double tmp;
		int cont=0;
		for (int i=0;i<4;i++){
			if (alunos[i].medF>=9.5){
			cont++;
			}
		}
		Aluno[] aprov = new Aluno[cont];
		for (int i=0;i<4;i++){
			aprov[i]=new Aluno();
			if(alunos[i].medF>=9.5){
				aprov[i].medF=alunos[i].medF;
			}
		}
		do{
			trocas= false;
			for(int i=0;i<4-1;i++){	
				if(	aprov[i].medF<aprov[i+1].medF){
					tmp=aprov[i].medF;
					aprov[i].medF=aprov[i+1].medF;
					aprov[i+1].medF=tmp;
					trocas = true;
				}
			}
		}while(trocas);
		System.out.println("Qual o nome do ficheiro onde quer gravar ");
		String s = sc.nextLine();
		File f = new File(s);
		PrintWriter pw = new PrintWriter(f);
		for (int i=0;i<aprov.length;i++){
			pw.println(aprov[i].mec +"\t"+aprov[i].medF);
		}
		pw.close();
	}	
			
			
		
		
}
class Aluno{
	int mec;
	int Nnota1;
	int Nnota2;
	int Rnota;
	double medN;
	double medR;
	double medF;
}
	

