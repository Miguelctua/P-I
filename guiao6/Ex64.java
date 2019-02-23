import java.util.Scanner;
public class Ex64 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		int num;
		
		do {
		System.out.printf("Digite o nr de notas\n");
		num = sc.nextInt();
	} while (num<=0 || num>50);
		int[] arrayGlobal=new int[num];
		int i;
		for (i=0;i<num;i++)
		{
			arrayGlobal[i]=verifyNota();
		}
		System.out.printf("Histograma de Notas\n");
		System.out.printf("--------------------------------------------\n");
		for (int k=20;k>=0;k--){
			System.out.printf("%2d |",k);
			for (int j=0;j<arrayGlobal.length;j++){
				
				if (arrayGlobal[j]==k){
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
				
			
	}
	public static int verifyNota(){
		int nota;
		do{
			System.out.printf("Digite a nota\n");
			nota=sc.nextInt();
		}while (nota<0 || nota>20);
		return nota;
	}
}

