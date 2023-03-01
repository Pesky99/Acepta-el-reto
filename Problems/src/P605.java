
import java.util.ArrayList;
import java.util.Locale;
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
public class P605 {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (ejercicio());
    }

    public static boolean ejercicio() {
        
        int a = 0;
        int i = 0;
        String prenda = sc.next().toLowerCase();
        
        if(prenda.equals(".")){
            return false;
        }
        while (!prenda.equals(".")){
            if(prenda.equals("v")){
                a++;
            }else if (prenda.equals("i")){
                i++;
            }
            prenda = sc.next().toLowerCase();
        }
        
        if(a>i){
            System.out.println("VERANO");
        }else if (i>a){
            System.out.println("INVIERNO");
        }else if (i==a){
            System.out.println("EMPATE");
        }
        
        return true;
    }
}
