
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Miguel
 */
public class P254 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
            while(ejercicio());
    }
    
    public static boolean ejercicio(){
        
        int squis = sc.nextInt();
        
        if(squis==0){
            return false;
        }
        
        long diferencia =0;
        int [] esquiadores = new int [squis];
        
        int [] nSquis = new int [squis];
        
        for (int i = 0; i < squis; i++) {
            esquiadores[i] = sc.nextInt();
        }
        for (int i = 0; i < squis; i++) {
            nSquis [i] = sc.nextInt();
        }
        
        Arrays.sort(esquiadores);
        Arrays.sort(nSquis);
        
        for (int i = 0; i < squis; i++) {
            if(esquiadores[i]>nSquis[i]){
                diferencia = diferencia + (esquiadores[i]-nSquis[i]);
            }else{
                diferencia = diferencia + (nSquis[i]-esquiadores[i]);
            }
            
        }
        
        System.out.println(diferencia);
        
        return true;
    }
}
