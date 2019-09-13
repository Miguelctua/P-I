import java.util.*;
import java.io.*;
public class Ex104 {
	static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) throws IOException{
		int n = lerNum();
		String a[] = new String[n];
		int b[] = new int[n];
		int mec;
		int pos;
		lerNome(b,a,n);
		do{
			System.out.println("Insira o número que pretender procurar");
			mec= sc.nextInt();
			pos = pBinaria(b,n,mec);
			System.out.printf("O aluno com nr mec %d corresponde ao aluno %s ",mec,a[pos]);
		}while (mec!=0);
		
		
		
		
	
	}
	public static int pBinaria (int b[], int n , int mec){
		int pos = -1;
		int inicio=0, fim= n-1, meio;
		while(inicio<=fim){
			meio=(fim+inicio)/2;
			if (b[meio]==mec){
				pos = meio;
				break;
			}
			if(b[meio]> mec){
				fim = meio-1;
			}
			else{
				inicio= meio-1;
			}
		}
		return pos;
	}
	public static int lerNum() throws IOException{
		int n=0 ;
		File alunos = new File("alunos.txt");
		Scanner lerfic = new Scanner(alunos);
		while (lerfic.hasNext()){
			lerfic.next();
			n++;
		}
		lerfic.close();
		return n;
	}
	public static void lerNome(int b[], String a[], int n) throws IOException{
		n=0;
		File alunos = new File ("alunos.txt");
		Scanner lerfic = new Scanner(alunos);
		while (lerfic.hasNext()){
			b[n]=lerfic.nextInt();
			a[n]=lerfic.nextLine();
			n++;
		}
		lerfic.close();
	}
			
		
}


