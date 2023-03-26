
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
public class P252 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio()) {

        }
    }

    public static boolean ejercicio() {

        String s = sc.nextLine();

        if (s.equals("XXX")) {
            return false;
        }
        
        s = s.toLowerCase();
        String sI="";
        
        s = s.replaceAll(" ", "");
        
        for (int i = s.length()-1; i >= 0; i--) {
            sI += s.charAt(i);
        }
        
        if(s.equals(sI)){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
        
        return true;
    }
}
