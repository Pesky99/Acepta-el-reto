import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alumno
 */
public class P576 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio());
    }

    public static boolean ejercicio() {
        //variables
        
        int restoHoras;
        final int MINUTO = 60;
        final int HORAS = 3600;
        int tiempo;
        int horas;
        int minutos;
        int segundos;
        int contador = 0;
        int nDefiniciones;
        int segundosTotales=0;
        tiempo = sc.nextInt();
        if (tiempo == 0) {
            return false;
        }
         do{
             nDefiniciones=sc.nextInt();
             if(nDefiniciones>0){
             segundosTotales=segundosTotales+(nDefiniciones*tiempo); 
             }
             
         }while(nDefiniciones!=0);
        horas = segundosTotales / HORAS;
        restoHoras = segundosTotales % HORAS;
        minutos = restoHoras / MINUTO;
        segundos = restoHoras % MINUTO;
        
            String mostrar = "";

            if (horas <= 9 && horas >= 0) {
                mostrar += "0" + horas + ":";
            } else {
                mostrar += horas + ":";
            }
            if (minutos <= 9 && minutos >= 0) {
                mostrar += "0" + minutos + ":";
            } else {
                mostrar += minutos + ":";
            }
            if (segundos <= 9 && segundos >= 0) {
                mostrar += "0" + segundos;
            } else {
                mostrar += segundos;
            }
            System.out.println(mostrar);
            contador++;
        
        
        return true;
    }
}