
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
public class P205 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int veces = sc.nextInt();

        for (int i = 0; i < veces; i++) {
            ejercicio();
        }
    }

    public static void ejercicio() {
        int n = sc.nextInt();
        int count =0;

        String nS;
        String nSi = "";
        int nI;
        
        do{
             nS = Integer.toString(n);
             nSi = "";
        for (int i = nS.length() - 1; i >= 0; i--) {
            nSi = nSi + nS.charAt(i);
        }
        
        nI = Integer.parseInt(nSi);

        n = n + nI;
        count++;
        }while(comprueba(n)==false && n<1000000000);
        
        if(comprueba(n)){
            System.out.println(count + " " + n);
        }else{
            System.out.println("Lychrel?");
        }
    }
   
    public static boolean comprueba(int n){
        
        String nS = Integer.toString(n);
        String nSi = "";
        for (int i = nS.length()-1; i >=0; i--) {
            nSi=nSi+nS.charAt(i);
        }
        
        if(nS.equals(nSi)){
            return true;
        }else{
            return false;
        }
    }
}
