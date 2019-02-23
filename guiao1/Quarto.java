import java.util.Scanner;

public class Quarto 
{
	
	public static void main (String[] args) 
	{
	// Scanner para leitura de dados do teclado
	Scanner sc = new Scanner(System.in);
	int seg; // Varaveis de Entrada
	int seg2, min1 ,min2 ,hr; // Variaveis de saída
	// 1) Ler os dados (sem validar por enquanto)
	System.out.print ("Tempo em segundos: ");
	seg = sc.nextInt();
	// 2) Calcular
	seg2 = seg % 60 ;
	min1 = seg/60 ;
	min2 = min1 % 60 ;
	hr= min1/ 60 ;
	// 3) Escrever os resultados
	System.out.printf ("%02d:%02d:%02d", hr, min2, seg2);
 }
	
	
}
