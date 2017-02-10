/**
 * Invertir caracteres
 * Descripción: invertir el orden de los caracteresa
 * Fecha:7 de febrero del 2017
 * Autor:Adriaán Obando Leitón
 * Fecha de modificación: 07-02-17d
 * Modificado por: Adrián Obando Leitón
 */
package ejerciciosBasicos;

//Librerias
import java.io.*;

public class Invertir {//Aquí inicia el programa

    public static void main(String[] args) throws IOException {
        //variables
        char ch1, ch2, ch3;
        //variables de entrada y salida
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;
        //NORMAL
        /*imprimir.println("Digite el primer caracter: ");
        ch1 = leer.readLine().charAt(0);
        imprimir.println("Digite el segundo caracter: ");
        ch2 = leer.readLine().charAt(0);
        imprimir.println("Digite el tercero caractera: ");
        ch3 = leer.readLine().charAt(0);
        
        imprimir.println("al reves serian: ");
        imprimir.println(ch3);
        imprimir.println(ch2);
        imprimir.println(ch1);*/
        
        //CON ITERACIÓN
        char[] chs = new char[3];
        int i;
        imprimir.println("Digite tres caracteres: ");
        for (i=0; i<3; i++){
            chs[i]= leer.readLine().charAt(0);
        }
        imprimir.println("Al reves son: ");
        for (i=2; i>=0; i--){
            imprimir.println(chs[i]);
        }

    }

}//Aqui termina el programa
