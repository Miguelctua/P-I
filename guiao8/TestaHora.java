import java.util.Scanner;

public class TestaHora {
  static final Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    Hora inicio;  // tem de definir o novo tipo Hora!
    Hora fim;
    
    inicio = new Hora();
    inicio.h = 9;
    inicio.m = 23;
    inicio.s = 5;
    
    System.out.print("Começou às ");
    printHora(inicio);  // crie esta função!
    System.out.println(".");
    System.out.println("Quando termina?");
    fim = lerHora();  // crie esta função!
    System.out.print("Início: ");
    printHora(inicio);
    System.out.print(" Fim: ");
    printHora(fim);
  }
	public static void printHora(Hora hora){
		System.out.printf("%02d:%02d:%02d",hora.h,hora.m,hora.s);
		}
	public static Hora lerHora(){
		Hora fim = new Hora();
		System.out.printf("horas?");
		fim.h=sc.nextInt();
		System.out.printf("minutos?");
		fim.m=sc.nextInt();
		System.out.printf("segundos?");
		fim.s=sc.nextInt();
		return fim;
	}
		
}

	class Hora{
		int h;
		int m;
		int s;
	}
/**
EXEMPLO do pretendido:
$ java TestaHora
Começou às 09:23:05.
Quando termina?
horas? 11
minutos? 72
minutos? 7
segundos? 2
Início: 09:23:05 Fim: 11:07:02.
**/
