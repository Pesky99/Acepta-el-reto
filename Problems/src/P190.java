
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
public class P190 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(ejercicio());
    }
    public static boolean ejercicio() {
        
        int num=sc.nextInt(); int den=sc.nextInt();
        
        long resultado=1;
        if(num<den){
            return false;
        }
        
        if(num==den){
            System.out.println(resultado);
        }else{
            for (int i =den+1; i <= num; i++) {
                resultado=resultado*i;
            }
            System.out.println(resultado);
        }
        
        return true;
    }
}
