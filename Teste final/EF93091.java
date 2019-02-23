//Miguel Cabral Nº 93091
import java.util.Scanner;
import java.io.*;
public class EF93091 {
public static void main(String[] args) throws IOException{
	Pais[] paises;
	paises = lerFichHum("PaisesHumid.txt");
	procurarListar(paises," "); // espaço lista tudo
	procurarListar(paises,"56"); // lista paises onde apareca "56"
	int [] mins = humMin(paises);
	for(int i=0; i<mins.length; i++)
		System.out.printf("Minimo = %5d %3d %s%n", paises[mins[i]].dia,
		paises[mins[i]].humidade, paises[mins[i]].nome);
		int[] freq = freqHum(paises);
		printFreq(freq);
		System.out.println(diaPaisExiste(paises,paises.length,24,"Marrocos"));
		
}
// Implementar funções pedidas aqui
// Função que lê os dados do ficheiro para um array
 static Pais[] lerFichHum(String nomeF) throws IOException{
	//Lê o ficheiro com o nome dado e inicializa o Scanner para o mesmo
		File file = new File(nomeF);
		Scanner scf = new Scanner(file);
		
		//Ler a primeira linha e passar o conteúdo para int
		int size = Integer.parseInt(scf.nextLine());
		//Criar uma array do tipo Pais com o tamanho indicado
		Pais[] paises = new Pais[size];
		
		//Inicialização do contador
		int count = 0;
		//Loop para ler as linhas do ficheiro enquanto houver nova linha
		while (scf.hasNextLine()) {
			//Cria um objeto do tipo Pais, na posição do valor do contador
			paises[count] = new Pais();
			//Passa o primeiro valor da linha como o dia do objeto
			paises[count].dia = scf.nextInt();
			//Passa o segundo valor da linha como a humidade do objeto
			paises[count].humidade = scf.nextInt();
			//Passa a restante string com o nome para o objeto (passando para a próxima linha pois chega ao final da atual), incrementando o contador
			paises[count++].nome = scf.nextLine();
		}
		
		//Fecha o Scanner
		scf.close();
		
		//Retorna a array com os objetos do tipo Pais
		return paises;
}
//função que imprime todos os paise que contenham a frase 
static void procurarListar(Pais [] p, String frase){
	int i;
	System.out.println("Dia   Hum Pais");
	for (i = 0; i < p.length;i++){
		String str = p[i].dia + "" + p[i].humidade + "" + p[i].nome;
		if (str.indexOf(frase) >=0){
			System.out.printf("%5d %3d%s\n",p[i].dia,p[i].humidade,p[i].nome);
		}
	}	
}		
//função para calcular humidade minima
static int[] humMin(Pais [] p){
	int size=0;
	int min=100;
	for (int i=0;i<p.length;i++){
		if(p[i].humidade<min){
			min=p[i].humidade;
			size = 1;
		}
		else if (p[i].humidade==min){
			size++;
		}
	}
    int minimos[] = new int[size];
    int count=0;
    for (int i=0;i<p.length;i++){
		if(p[i].humidade == min){
			minimos[count++]=i;
		}
	}
	return minimos;
}
// função para gravar no ficheiro os arrays de países
static void gravarPais (Pais [] p, String nome) throws IOException{
	File file = new File(nome);
	PrintWriter pwf = new PrintWriter(file);//criar ficheiro e o scanner
	pwf.println(p.length); //definir tamanho do array
	for ( int i=0;i<p.length;i++){
		pwf.printf("%5d %3d%s\r\n",p[i].dia,p[i].humidade,p[i].nome);
	}
	pwf.close();
}
//função que calcula e devolve um array com a frequencia de humidades
static int[] freqHum(Pais [] p){
	int freq[] = new int[91];
	for (int i=0;i<p.length;i++){
		if (p[i].humidade>=10 && p[i].humidade<=100){
			freq[p[i].humidade-10]++;
		}
	}
	return freq;
}
//função que imprime o array da frequencia de humidades
static void printFreq(int[] f){
	System.out.println("Hum.  Freq");
	for (int i=10; i<100; i++){
		if (f[i-10]>0){
			System.out.printf("%4d  %4d\n",i,f[i-10]);
		}
	}
}
//funçao que verfica se um dia e pais já existe 
static boolean diaPaisExiste(Pais[] p, int comp, int dia, String pais) {
	for (int i=0; i<comp; i++){
		if (p[i].dia == dia && p[i].nome.indexOf(pais)>0){
			return true;
		}
    }
	return false;
}			
	
}
class Pais {
int dia;
int humidade;
String nome;
}
