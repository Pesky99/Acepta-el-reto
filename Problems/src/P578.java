import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Haciendo_Inventario{

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        while (ejercicio());
    }

    public static boolean ejercicio() {
        
        TreeSet<String> inventario = new TreeSet();

        int casos = Integer.parseInt(scan.nextLine());
 
        if (casos == 0) {
            return false;
        }

        for (int i = 0; i < casos; i++) {
            inventario.add(scan.nextLine().toUpperCase());
        }

        System.out.println(inventario.size());
        return true;

    }

}