import java.util.Scanner;

public class Quinto
{
  public static void main(String[] args)
  {
    // Scanner para leitura de dados do teclado
    Scanner sc = new Scanner(System.in);
    double x1,y1,x2,y2;       // Variaveis de Entrada
    double km;  // Variaveis de Saida
    // 1) Ler os dados (sem validar, por enquanto)
    System.out.print("Coordenadas da primeira cidade");
    x1 = sc.nextDouble();
    
    y1 = sc.nextDouble();
    System.out.print("Coordenadas da segunda cidade");
    x2 = sc.nextDouble();
    y2 = sc.nextDouble();
    
    // 2) Calcular
     km= (x1-x2)*(x1-x2)+(y1-y2)*(y1*y2);
     km= Math.sqrt(km);
     km=km*100;
     

    // 3) Escrever os resultados
    System.out.printf("%5.2f",km);
  }
}
