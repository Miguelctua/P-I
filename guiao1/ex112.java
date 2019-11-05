import java.util.*;
public class ex112{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int seg,seg2,min1,min2,hora;
        System.out.println("Digite os segundos:");
        seg = sc.nextInt();
        seg2 = seg%60;
        min1 = seg/60;
        min2 = min1%60;
        hora = min1/60;
        System.out.printf("%02d:%02d:%02d\n",hora,min2,seg2);

    }
}
