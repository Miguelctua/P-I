import java.util.Scanner;

public class Segundo
{
  public static void main(String[] args)
  {
    // Scanner para leitura de dados do teclado
    Scanner sc = new Scanner(System.in);
    double temp1;   // Variaveis de Entrada
    double temp2;  // Variaveis de Saida
    // 1) Ler os dados (sem validar, por enquanto)
    System.out.print("Temperatura em graus: ");
    temp1= sc.nextDouble();
    // 2) Calcular
    temp2 = 1.8 * temp1 + 32 ;
    // 3) Escrever os resultados
    System.out.printf("A temperatua em Fahrenheit é %4.1f", temp2);
  }
}
