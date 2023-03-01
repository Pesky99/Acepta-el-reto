
import java.util.Arrays;
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
public class P102 {

    public static Scanner sc = new Scanner(System.in);
    static char[] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static char[] abecedarioM = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    
    public static void main(String[] args) {
        while (ejercicio());
    }

    public static boolean ejercicio() {
        String mensaje;

        mensaje = sc.nextLine();
        int codCesar = 0;
        int vocales = 0;
        int posicionC = 0;
        boolean pos = false;

        char caracteres[] = mensaje.toCharArray();
        char cmensaje[] = new char[mensaje.length() - 1];

        if (caracteres[0] == 'p') {
            for (int i = 0, j = 1; j < caracteres.length; i++, j++) {
                cmensaje[i] = caracteres[j];
            }
            mensaje = String.valueOf(cmensaje);

            for (int i = 1; i < caracteres.length; i++) {
                if (Character.isUpperCase(caracteres[i])) {
                    caracteres[i] = Character.toLowerCase(caracteres[i]);

                    if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || caracteres[i] == 'o' || caracteres[i] == 'u') {
                        vocales++;
                    }
                    caracteres[i] = Character.toUpperCase(caracteres[i]);
                } else {
                    if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || caracteres[i] == 'o' || caracteres[i] == 'u') {
                        vocales++;
                    }
                }

            }
            for (int i = 0, j = 1; j < caracteres.length; i++, j++) {
                cmensaje[i] = caracteres[j];
            }
            mensaje = String.valueOf(cmensaje);
            if ("FIN".equals(mensaje)) {
                return false;
            }
            System.out.println(vocales);
            
        } else if (caracteres[0] != 'p') {
            for (int i = 0; i < abecedario.length; i++) {
                if (caracteres[0] == abecedario[i] || caracteres[0] == abecedarioM[i]) {
                    posicionC = i;
                    break;
                }
            }
            if (posicionC < 15) {
                for (int i = posicionC; i < 15; i++) {
                    codCesar++;
                }
            } else if (posicionC > 15) {
                for (int i = posicionC; i > 15; i--) {
                    codCesar--;
                }
            }
            for (int i = 0; i < caracteres.length; i++) {
                if (Character.isUpperCase(caracteres[i])) {
                    caracteres[i] = Character.toLowerCase(caracteres[i]);
                    pos = true;
                }
                for (int j = 0; j < abecedario.length; j++) {
                    if (caracteres[i] == abecedario[j]) {
                        if (j + codCesar < 0) {
                            caracteres[i] = abecedario[26 + (j + codCesar)];
                            break;
                        } else if (j + codCesar > 25) {
                            caracteres[i] = abecedario[0 + (-26 + (codCesar + j))];
                            break;
                        } else if (j + codCesar >= 0 && j + codCesar <= 25) {
                            caracteres[i] = abecedario[j + codCesar];
                            break;
                        }
                    }
                }
                if (pos == true) {
                    caracteres[i] = Character.toUpperCase(caracteres[i]);
                    pos = false;
                }
            }
            for (int i = 0, j = 1; j < caracteres.length; i++, j++) {
                cmensaje[i] = caracteres[j];
            }
            mensaje = String.valueOf(cmensaje);
            if ("FIN".equals(mensaje)) {
                return false;
            }
            for (int i = 1; i < caracteres.length; i++) {
                if (Character.isUpperCase(caracteres[i])) {
                    caracteres[i] = Character.toLowerCase(caracteres[i]);

                    if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || caracteres[i] == 'o' || caracteres[i] == 'u') {
                        vocales++;
                    }
                    caracteres[i] = Character.toUpperCase(caracteres[i]);
                } else {
                    if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || caracteres[i] == 'o' || caracteres[i] == 'u') {
                        vocales++;
                    }
                }
            }
            if ("FIN".equals(mensaje)) {
                return false;
            }
            System.out.println(vocales);
        }
        return true;
    }
}
