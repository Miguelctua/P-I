import java.util.Scanner;

public class Ex1
{
  public static void main(String[] args)
  {
    // Scanner para leitura de dados do teclado
    Scanner sc = new Scanner(System.in);
    double t1,t2,ei;   // Variaveis de Entrada
    double nfinal;  // Variaveis de Saida 
    System.out.print("Teste 1: ");
    t1= sc.nextDouble();
    System.out.print("Teste 2: ");
    t2= sc.nextDouble();
    System.out.print("Exame");
    ei= sc.nextDouble();
    // 2) Calcular
    nfinal = (0.2*t1)+(0.3*t2)+(0.5*ei) ;
    if (nfinal>= 9.5)
    {
    System.out.printf("O aluno está aprovado");
    }
    else 
    {
    System.out.printf("O aluno está resprovado");
  }
 }
}
