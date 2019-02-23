import java.util.Scanner;
public class Ex7{
public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int larg, alt;
		System.out.print("Largura: ");
		larg=sc.nextInt();
		System.out.print("Altura: ");
		alt=sc.nextInt();
		
		for(int i  = 1; i <= alt; i++)
		{
			if(i == 1)
			{
				for(int i1 = 1; i1 <= larg; i1++)
				{
					System.out.print("* ");
				}
				System.out.println("");
			}
			else
			{
				System.out.print("*");
				for(int i1 = 1; i1 <= larg; i1++)
				{
					System.out.print(" ");
				}
				System.out.print("  *");
				System.out.println("");
			}
		}
		for(int i1 = 1; i1 <= larg; i1++)
				{
					System.out.print("* ");
				}
				System.out.println("");
	}
}
