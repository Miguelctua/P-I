import java.util.Scanner;

public class Ex2
{
  public static void main(String[] args)
  {
    // Scanner para leitura de dados do teclado
    Scanner sc = new Scanner(System.in);
    double n1,n2;   // Variaveis de Entrada
     
    System.out.print("Número 1 ");
    n1= sc.nextDouble();
    System.out.print("Número 2 ");
    n2= sc.nextDouble();
    if (n1<n2)
    System.out.printf("O maior número é o 2º");
    else 
     if (n1>n2)
     System.out.printf("O maior número é o 1º");
     else
     System.out.printf("Os números são iguais");
     
 }
 }

