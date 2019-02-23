import java.util.Scanner;
public class Ex2 {
	
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int n,i;
	System.out.print("Insira um número entre 0 e 100\n");
	n =sc.nextInt();
	for (i=0;i<=10;i++)
	{
	System.out.printf("%2d X %2d = %3d\n", n, i, n*i);
}
	
	}
}
