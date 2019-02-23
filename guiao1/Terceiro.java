import java.util.Scanner;

public class Terceiro
{
  public static void main(String[] args)
  {
    // Scanner para leitura de dados do teclado
    Scanner sc = new Scanner(System.in);
    double dolar, euro;       // Variaveis de Entrada
    double fim;  // Variaveis de Saida
    // 1) Ler os dados (sem validar, por enquanto)
    System.out.print("Quantia em dolares:");
    dolar = sc.nextDouble();
    System.out.print("Taxa de conversão: ");
    euro = sc.nextDouble();
    // 2) Calcular
     fim = dolar*euro;

    // 3) Escrever os resultados
    System.out.printf("%5.2f dolares equivalem a %5.2f euros",dolar,fim);
  }
}
