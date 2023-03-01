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
public class P101{

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio());
    }

    public static boolean ejercicio() {

        String e = "ESOTERICO";
        String d = "DIABOLICO";
        String n = "NO";
        int tamaño;
        boolean veso=true;
        
        
        tamaño = sc.nextInt();
        if (tamaño == 0) {
            return false;
        }

        if (tamaño >= 2 && tamaño <= 1024) {
            
            int valores[] = new int[tamaño * tamaño];
            int valoresO[]= new int [tamaño*tamaño];
            for (int i = 0; i < valores.length; i++) {
                valores[i] = sc.nextInt();
                valoresO[i]=valores[i];
            }
            Arrays.sort(valoresO);
            for (int i = 0, j=1; i < tamaño*tamaño; i++, j++) {
                if(valoresO[i]==j){
                    veso=true;
                }else{
                    veso=false;
                }
            }
            
            int sumaF = 0;
            int sumaFN = 0;
            boolean filas = true;

            for (int i = 0; i < tamaño; i++) {
                for (int j = 0 + (i * tamaño); j < tamaño + (i * tamaño); j++) {
                    sumaF = sumaF + valores[j];
                }
                if (i == 0) {
                    sumaFN = sumaF;
                }
                if (sumaFN != sumaF) {
                    filas = false;
                    break;
                }
                sumaF = 0;
            }

            if (filas == true) {
                int sumaC = 0;
                int sumaCN = 0;
                boolean columnas = true;

                for (int i = 0; i < tamaño; i++) {
                    for (int j = 0 + (i); j < valores.length; j += tamaño) {
                        sumaC = sumaC + valores[j];
                    }
                    if (i == 0) {
                        sumaCN = sumaC;
                    }
                    if (sumaCN != sumaC) {
                        columnas = false;
                        break;
                    }
                    sumaC = 0;
                }

                if (columnas == true) {

                    int sumaD = 0;
                    int sumaD2 = 0;

                    for (int i = 0; i < valores.length; i += tamaño + 1) {
                        sumaD = sumaD + valores[i];
                    }
                    for (int i = tamaño - 1; i <= tamaño * (tamaño - 1); i += tamaño - 1) {
                        sumaD2 = sumaD2 + valores[i];
                    }
                    if (sumaFN == sumaCN && sumaFN == sumaD && sumaD == sumaD2) {

                        int sumaE = valores[0] + valores[tamaño - 1] + valores[tamaño * (tamaño - 1)] + valores[valores.length - 1];
                        int CM2 = 4 * sumaFN / tamaño;
                        int division = tamaño / 2;
                        
                        
                        if (sumaE == CM2 && veso == true) {
                            if (tamaño % 2 != 0) {
                                int medioI = valores[division] + valores[tamaño * division] + valores[(tamaño + 2) * division] + valores[valores.length - division - 1];
                                int medio = valores[tamaño * division + division] * 4;

                                if (medioI == CM2 && medio == CM2) {
                                    System.out.println(e);
                                }

                            } else if (tamaño % 2 == 0) {
                                int medioP = valores[division - 1] + valores[division] + valores[tamaño * (division - 1)] + valores[(tamaño * division) - 1] + valores[tamaño * division] + valores[tamaño * division + (tamaño - 1)] + valores[valores.length - division - 1] + valores[valores.length - division];
                                int medio2 = valores[tamaño * (division - 1) + division] + valores[tamaño * (division - 1) + division - 1] + valores[tamaño * division + division] + valores[tamaño * division + (division - 1)];

                                if (medioP == 2 * CM2 && medio2 == CM2) {
                                    System.out.println(e);
                                }
                            }
                        } else if (filas == true && columnas == true && sumaD == sumaD2 && sumaFN == sumaCN && sumaFN == sumaD) {
                            System.out.println(d);
                        }
                    } else {
                        System.out.println(n);
                    }
                } else {
                    System.out.println(n);
                }
            } else {
                System.out.println(n);
            }
        }
        return true;

    }

}