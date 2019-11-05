import java.util.*;
public class ex113 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1,y1,x2,y2;
        double dist,escala;
        System.out.println("Digite as coordenadas da primeira cidade");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Digite as coordenadas da segunda cidade");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        escala = 1000;
        dist = (Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)))*escala;
        System.out.printf("A distância entre as duas cidades é: %.2f km\n",dist);

    }
}