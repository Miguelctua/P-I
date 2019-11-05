import java.util.*;
public class ex110{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double temp,far;
        System.out.println("Digite a medida em graus Celsius");
        temp = sc.nextDouble();
        far = 1.8*temp+32;
        System.out.printf("%.1fº Celsius é equivalente em Fahrenheit a %.1fº. \n",temp,far);
    }
}