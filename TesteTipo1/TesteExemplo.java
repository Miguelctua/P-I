/* Teste prático, exemplo 2019/20
* NMec:93091
* Nome: Miguel Cabral
*/
import java.util.Scanner;
public class TesteExemplo {
	 static Scanner ler = new Scanner(System.in);
	 
	 public static void main(String[] args) {
		 
	 int[] notas = {4, 6, 7, 5, 4, 6, 6, 8, 11};
	 int[] histo;
	 double mediaf,mediat;
	 System.out.printf("Introduza notas dos alunos(nota 0-10; 11 faltou): %n");
	 notas = LerNotas(10);
	 // lista notas
	 listar(notas);
	 // calcula histograma
	 histo = Histograma(notas);
	 // imprime histograma
	 ImprimeHistograma(histo);
	 // calcular média freq e total
	 mediaf= Medias(notas,'f');
	 mediat= Medias(notas,'t');
	 // 6) Imprime medias
	 System.out.printf("Media total %.1f",mediat);
	 System.out.printf("Media alunos freq. %.1f",mediaf);
	 }
	 // 1) Listar notas no ecrã
 public static void listar(int[] notas) {
	for(int i = 0;i < notas.length; i++){
		System.out.print(notas[i] + ", ");
	}
 }

 // 2) função para ler notas entre 0 e 11. 11 significa que o aluno faltou. Devolve array com as notas
 public static int[] LerNotas(int numNotas) {
	 int notas[] = new int[numNotas];
	for(int i = 1; i <= numNotas; i++){
		do{	
			System.out.printf("Nota aluno %d: ",i);
			notas[i-1] = ler.nextInt();
		}while(notas[i-1] < 0 || notas[i-1] > 11);
	}
	return notas;
		
		
 }
 // 3) função histograma
 public static int[] Histograma(int[] notas) {
	int hist[] = new int[12];
	for(int nota: notas){
		hist[nota]++;
	}
	return hist;
 }

 // 4) Função ImprimeHistograma.
 // Cada linha tem a nota, e um nº de * = à sua frequência
 public static void ImprimeHistograma (int[] hist) {
	 System.out.println();
	for(int i = 0;i <hist.length;i++){
		System.out.printf("Nota %d ",i);
		for (int j = 0;j < hist[i];j++){
			System.out.print("*");
		}
		System.out.println();
	}
 }
 // 5) função medias de freq ou total conforme tipo = 'f' ou 't'
 public static double Medias(int[] lista,char tipo) {
	double media = 0;
	int soma = 0;
	int n = 0;
	if(tipo == 't'){
		for(int i =0 ; i<lista.length;i++){
			if(lista[i] != 11){
				soma += lista[i];
			}
			n++;
		}
	}
	if(tipo == 'f'){
		for(int i = 0; i <lista.length;i++){
			if(lista[i] != 11){
				soma += lista[i];
				n++;
			}
		}
	}
	return soma/n;
}
}				

