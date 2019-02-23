import java.util.Scanner;

public class Ex3
{
  public static void main(String[] args)
  {
    // Scanner para leitura de dados do teclado
    Scanner sc = new Scanner(System.in);
    int idade;   // Variaveis de Entrada
     
    System.out.print("Idade: ");
    idade= sc.nextInt();
     if (idade<6)
     System.out.printf("Isento de pagar");
     else 
      if (idade>6 && idade<12)
     System.out.printf("Bilhete de criança");
     else
      if (idade>13 && idade<65)
     System.out.printf("Bilhete normal");
     else
     System.out.printf("Bilhete de 3ª idade");
     
    
     
 }
 }
