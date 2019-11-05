import java.util.*;
public class ex111{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double euro,taxa,dolar;
        System.out.println("Digite o montante em dolares:");
        dolar = sc.nextDouble();
        System.out.println("Digite a taxa de conversão:");
        taxa = sc.nextDouble();
        euro = dolar*taxa;
        System.out.printf("%5.2f dolares equivalem a %5.2f euros\n",dolar,euro);
    }
}