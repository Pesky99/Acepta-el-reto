import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class P610 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int nCasos = sc.nextInt();
        
        for(int i = 0; i < nCasos; i++) {
            ejercicio();
        }
    }

    public static void ejercicio() {

        int n = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> poblacion = new ArrayList<>();
        
        for(int i = 1; i < n+1; i++) {
            poblacion.add(i);
        }
        int j = 0;
        while(poblacion.size() > (n / 2)) {
            j = j + k;
            
            while(j >= poblacion.size()) {
                j = j - poblacion.size();
            }
            poblacion.remove(j);
            
        }
        
        if(poblacion.contains(s) && poblacion.contains(p)) {
            System.out.println("No hay abrazo");
        } else if (poblacion.contains(s) && !poblacion.contains(p)){
            System.out.println("No quiero irme, Sr. Stark!");
        } else if(!poblacion.contains(s) && poblacion.contains(p)) {
            System.out.println("No quiero irme, Peter!");
        } else if(!poblacion.contains(s) && !poblacion.contains(p)) {
            System.out.println("No hay abrazo");
        }

    }
}