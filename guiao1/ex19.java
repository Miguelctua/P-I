import java.util.*;
public class ex19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a medida do lado do retângulo");
        double lado = sc.nextDouble();
        System.out.println("Digite a medida da altura do retângulo");
        double altura = sc.nextDouble();
        double perimetro = (2*altura) + (2*lado);
        double area = altura*lado;
        System.out.printf("Perimetro = %4.1f cm,Area = %4.1f cm\n", perimetro,area);
    }
}