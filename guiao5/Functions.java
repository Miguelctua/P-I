/*
 * JAM, out-2018
 *
 * Nesta classe deve definir novas funções e testá-las na função main.
 */
 
import java.util.Scanner;

public class Functions {
    
    public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);	
		// Testar função sqr:
		//System.out.printf("sqr(%f) = %f\n", 10.1, sqr(10.1));
		//System.out.printf("sqr(%f) = %f\n", -2.0, sqr(-2.0));

		// Invoque as funções pedidas no enunciado para as testar:
		// Por exemplo, para testar func f (problema 5.2):
		//System.out.printf("f(%d) = %f\n", 6, f(6));

		// Testar as restantes funções desenvolvidas
		//System.out.printf("max(%f,%f) = %f\n", 3.1, 5.2, max(3.1, 5.2));
		//System.out.printf("max(%d,%d) = %d\n", 3, 2, max(3, 2));
		//int ano = getIntPos("Ano? ");
		//System.out.printf("ano = %d\n", ano);
        //System.out.printf("poly3(%f,%f,%f,%f,%f) = %f\n" , 1.0,1.0,1.0,1.0,1.0, poly3(1,1,1,1,1));
      
		//Função fact
        //int n , p;
        // System.out.print("Digite um valor para calcular o fatorial");
        //n = sc.nextInt();
        //p= fact (n);
        //System.out.printf("O fatorial de %d é %d\n",n,p);
      
        // Função getIntPos
		//int j=getIntPos ("Digite um número inteiro ");
	    
	    //Função getIntRange
	    //int n=0;
		//int i=10;
		//int r=getIntRange ("Digite um número dentro do intervalo [0,10]" ,n,i);
		//System.out.println(r);
		
		//Função printNtimes
		
		int n;
		System.out.println("Mensagem a ler ");
		String msg = sc.next();
		System.out.println("Quantas vezes vai repetir?");
		n=sc.nextInt();
		printNtimes (msg,n);
	     
	}

	/*
	 * sqr - calcula o quadrado de um número (real).
	 */
	public static double sqr(double x) {
		double y;	// variavel para resultado
		y = x*x;	// calculo do resultado a partir dos dados
		return y;	// devolver o resultado
	}

	// Defina as funções pedidas no enunciado:
    public static double f (double n) {
	 return 1/(1+Math.pow(n,2));
	}	
	public static double max (double a, double b){
		if (a>b) {
			return a;
		}
		return b;
	}
	
	public static int max (int a, int b){
		if (a>b) {
			return a;
		}
		return b;
	}
	
	public static double poly3 (int n,int a,int b,int c,int d){
		return a*Math.pow(n,3) + b*Math.pow(n,2) + c*Math.pow(n,1) + d;
	}
	public static int fact ( int n){
		int f=1;
		for (int i=1 ;i <= n ;i++){
			f = (f*i);
			}
		return f;	
	}
	public static int getIntPos (String promp){
		int a;
		Scanner sc = new Scanner(System.in);
			do{
			System.out.println(promp);
			a=sc.nextInt();
			} while (a<0);
		return a;
	}
	
	public static int getIntRange (String msg,int n,int i){
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		int a = sc.nextInt();
		if (a>n && a<i) {
			return a;
		}
        return -1;	
	}
			
	public static void printNtimes (String msg ,int n){
		for (int i=0 ; i<=n ; i++){
			System.out.print(msg);}
		}	
		
	 	
			
	

}
