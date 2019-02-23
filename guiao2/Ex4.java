import java.util.Scanner;

public class Ex4
{
  public static void main(String[] args)
  {
    // Scanner para leitura de dados do teclado
    Scanner sc = new Scanner(System.in);
    int mes,ano;   // Variaveis de Entrada
    double bi1,bi2,bi3; 
    System.out.print("Mês: ");
    mes= sc.nextInt();
    System.out.print("Ano: ");
    ano= sc.nextInt();
    switch (mes)
    {
    case 1:
     System.out.printf("O mês 1 do ano %02d tem 31 dias.",ano);
    break;
    case 2:
     bi1=(ano%4);
     bi2=(ano%100);
     bi3=(ano%400);
     if (bi1==0)
     System.out.printf("O mês 2 do ano %02d tem 29 dias.",ano);
     else 
     if (bi2==0)
     System.out.printf("O mês 2 do ano %02d tem 29 dias.",ano);
     else
     if (bi3==0)
     System.out.printf("O mês 2 do ano %02d tem 29 dias.",ano);
     else
     System.out.printf("O mês 2 do ano %02d tem 28 dias.",ano);
     
    break;
    case 3:
     System.out.printf("O mês 3 do ano %02d tem 31 dias.",ano);
    break;
    case 4:
     System.out.printf("O mês 4 do ano %02d tem 30 dias.",ano);
    break;
    case 5:
     System.out.printf("O mês 5 do ano %02d tem 31 dias.",ano);
    break;
    case 6:
    System.out.printf("O mês 6 do ano %02d tem 30 dias.",ano);
    break;
    case 7:
    System.out.printf("O mês 7 do ano %02d tem 31 dias.",ano);
    break;
    case 8:
    System.out.printf("O mês 8 do ano %02d tem 31dias.",ano);
    break;
    case 9:
    System.out.printf("O mês 9 do ano %02d tem 30 dias.",ano);
    break; 
    case 10:
    System.out.printf("O mês 10 do ano %02d tem 31 dias.",ano);
    break;
    case 11:
    System.out.printf("O mês 11 do ano %02d tem 30 dias.",ano);
    break;
    case 12:
    System.out.printf("O mês 12 do ano %02d tem 31 dias.",ano);
    break;
   }
 }
 }
