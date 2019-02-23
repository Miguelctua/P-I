import java.util.Scanner;

public class Ex6 {
	
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int n, r;
	System.out.printf("Introduza um número: ");
	n = sc.nextInt();
	r = n%2;
	if (r==0){
	System.out.printf("O número " +n+ " é par"); }
    else {
	System.out.printf("O número " +n+ " é ímpar");
}
	}
}

