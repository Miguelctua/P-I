////Uma função inteira getIntRange que leia com validação um valor dentro de um
//intervalo, sendo os limites desse intervalo passados como argumentos à função. (O
//prompt também deve ser um parâmetro.)
import java.util.Scanner;
public class Function {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		int i=10;
		int r=getIntRange ("Digite um número dentro do intervalo [0,10]" ,n,i);
		System.out.println(r);

}
	public static int getIntRange (String msg,int n,int i){
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		int a = sc.nextInt();
			if (a>=n && a<=i) {
			return a;
		}else {
		return -1;
	}
}
}
