import java.util.Scanner;
public class Ex3 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		double n,n1,max,min,med,soma1;
        int cont;
        
    System.out.print("Introduza um número real \n");
    n=sc.nextDouble();
    max=n;
    min=n;
    soma1=n;
    cont=1;
    while (true) {
    System.out.println("Introduza um número real \n");
    n1=sc.nextDouble();
    if (n1==0){
     break;
     }  
    cont++;
    if (n1 > max){
		max=n1;
		 }
	if (n1 < min) {
		min=n1;
		}
	soma1=soma1+n1;
	}
   med=soma1/cont;
    
    
    
    System.out.printf("Foram introduzidos %d números na lista o maximo é %f e o minimo é %f e a media é %f" ,cont,max,min,med);
    }
    
    }
		
	


