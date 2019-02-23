import java.util.Scanner;
public class Ex3 {
	
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int i,n,fact;
	System.out.print("Digite o n até qual quer o fatorial entre 1 e 10: ");
	n=sc.nextInt();
	if (n<=10) 
	{
	fact=1;
	for (i=1; i<=n; i++)
	{
	
	fact=fact*i;
	System.out.printf(" %3d! = % d %n", i, fact);
}
}
	
	}
}
