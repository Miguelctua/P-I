import java.util.*;
public class Ex102{
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int b[];
		b = gerarChave();
		mostraChave(b);
		
		
	}
	public static int[] gerarChave(){
		int []b = new int[6];
		
		for (int i=0; i<6; i++){
			System.out.println("\nElemento "+(i+1)+" da chave: ");
			b[i] = sc.nextInt();
			while(b[i]<1|| b[i]>49 || pertenceChave(b, i)){
				System.out.print("\nEntrada inválida! Elemento " + (i+1) + " da chave: ");
				b[i]=sc.nextInt();
			
			}
		}
		
		return b;
	}
	public static boolean pertenceChave(int b[] , int i){
		boolean pertence = false;
		for (int j=0;j<i;j++){
			if (b[j]==b[i]){
				pertence = true;
			}	
		}
		return pertence;
	}
	public static void mostraChave(int b[]){
		int temp;
		boolean trocas;
		do{
			trocas = false;
			for (int i = 0; i<b.length-1; i++){
				if(b[i] > b[i+1]){	
					temp = b[i];
					b[i] = b[i+1];
					b[i+1] = temp;
					trocas = true;
				}
			}
		}while(trocas);
		System.out.println("\n Apostas de totoloto");
		int j = 0;
		for(int i = 0;i<49;i++){
			if (i==7 || i==14 || i==21 || i==28 || i==35 || i==42 || i==49){
				System.out.printf("\n");
			}
			if (j<6){
				if (b[j]==(i+1)){
					System.out.print("X \t");
					j++;
				}else System.out.print((i+1)+"\t");
				
			}else System.out.print((i+1)+"\t");
		}
	}
	

				
		
		 
		
		
		
		
}
