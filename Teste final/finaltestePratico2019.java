import java.util.*;

public class testePratico2019 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        double xI = 5, xF = 10;
        double[] arr = new double[20];
        //int[] fun1 = new int[20];
        int npM = 20;
        //int npV = npM;
        int npV = lerF(arr);
        //fun1 = f(xI, xF, npM);
        double dX = (xF - xI)/npV;


        printF(arr, npV, xI, dX);
    }

    public static int lerF(double[] a) {
        System.out.printf("Introduza %d pontos de uma funcao ou ate 0 0 :", a.length);
        int y0 = -1, i = 0;
        double y = -1;

        do{
            y0 = (int) y;
            y = ler.nextDouble();
            a[i++] = y;
        } while((!(y0 == 0 && (int)y == 0)) && i< a.length );

        if(y0 == 0 && (int)y == 0) {i-= 2;}
        
        return i;
    }

    public static void printF(double[] f, int npV, double xI, double dx) {
        for(int x = 0; x < npV; x++) {
            System.out.printf("Pos= %3d x= %8.5f y= %8.5f%n", x, xI+dx, f[x]);
        }
    }

    public static int[] f(double xMin, double xMax, int np) {
        int[] a = new int[np];
        double dx = (xMax-xMin)/np;

        for(int i = 0; i < a.length; i++){
            a[i] = (int) (1000*Math.sin(Math.PI/4 + xMax));
        }

        return a;
    }

    /*public static void printF(int[] funcao, int npv) { 
        System.out.printf("----------------%n[Pos] | %n[X] | %n[Y]-------------------");
        for(int x= 0; x<npv; x++) {
            System.out.printf();
        }

    }*/
}