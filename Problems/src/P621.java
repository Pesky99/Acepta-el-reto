
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
public class P621 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void ejercicio(){
        
        int nPaginas = sc.nextInt();
        
        if(nPaginas%2==0){
            System.out.println(nPaginas+1);
        }else{
            System.out.println(nPaginas-1);
        }
    }
    public static void main(String[] args) {
        
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            ejercicio();
        }
        
    }
    
}
