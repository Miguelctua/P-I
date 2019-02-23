import java.util.Scanner;
 

 
public class Ex84 {
     
    static Scanner sc = new Scanner(System.in);
    static Complexo comp3 = new Complexo();
    public static void main (String args[]) {
         
        Complexo complexo1 = new Complexo();
        Complexo complexo2 = new Complexo();
        char op ;
			do{
				System.out.println("\n Operação:");
				op = sc.next().charAt(0);
				if (op == '='){
					System.out.print("O programa vai terminar");
					System.exit(2);
				}
				switch(op){
					case '+':
					complexo1 = lerComplexo();
					complexo2 = lerComplexo();
					adicao(complexo1, complexo2);
					break;
                 
					case '-':
					complexo1 = lerComplexo();
					complexo2 = lerComplexo();
					subtracao(complexo1, complexo2);
					break;
                 
					case '*':
					complexo1 = lerComplexo();
					complexo2 = lerComplexo();
					multiplicação(complexo1, complexo2);
					break;
                 
					case '/':
					complexo1 = lerComplexo();
					complexo2 = lerComplexo();
					divisao(complexo1, complexo2);
					break;
                 
					default:
					System.out.print("Operação não permitida!");
					break;
				}
					
			} while (op != '=');
	
    }
    public static Complexo lerComplexo() {
         
        Complexo complexo = new Complexo();
         
        System.out.print("Introduza um número complexo: ");
        System.out.print("\nParte real: ");
        complexo.r = sc.nextDouble();
        System.out.print("Parte imaginaria: ");
        complexo.i = sc.nextDouble();
         
        return complexo;
    }
    public static void printComplexo(Complexo complexo){
		if (complexo.i>0 ){
			System.out.printf("%f+%fi",complexo.r,complexo.i);
		}
		else {
			System.out.printf("%f+%fi",complexo.r,Math.abs(complexo.i));
		}
	}
	public static void adicao (Complexo complexo1,Complexo complexo2){
		printComplexo(complexo1);
		System.out.printf("+");
		printComplexo(complexo2);
		System.out.printf("=");

		comp3.r = (complexo1.r+complexo2.r);
		comp3.i = (complexo1.i+complexo2.i);
		printComplexo(comp3);
	}
	public static void subtracao (Complexo complexo1,Complexo complexo2){
		printComplexo(complexo1);
		System.out.printf("-");
		printComplexo(complexo2);
		System.out.printf("=");
		
		comp3.r=(complexo1.r-complexo2.r);
		comp3.i=(complexo1.i-complexo2.i);
		printComplexo(comp3);
	}
	public static void multiplicação (Complexo complexo1,Complexo complexo2){
		printComplexo(complexo1);
		System.out.printf("*");
		printComplexo(complexo2);
		System.out.printf("=");
		
		comp3.r=(complexo1.r*complexo2.r);
		comp3.i=(complexo1.i*complexo2.i);
		printComplexo(comp3);
	}
	public static void divisao (Complexo complexo1,Complexo complexo2){
		printComplexo(complexo1);
		System.out.printf("/");
		printComplexo(complexo2);
		System.out.printf("=");
		
		comp3.r=(complexo1.r/complexo2.r);
		comp3.i=(complexo1.i/complexo2.i);
		printComplexo(comp3);
    }
}		
class Complexo {
    double r;
    double i;
}
