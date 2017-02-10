/**
 * Mayor
 * Descripción: ver el mayor de dos numeros
 * Fecha:7 de febrero del 2017
 * Autor:Adriaán Obando Leitón
 * Fecha de modificación: 07-02-17d
 * Modificado por: Adrián Obando Leitón
 */
package ejerciciosBasicos;

//Librerias
import java.io.*;

public class Mayor {//Aqui inicia el programa
    public static void main(String[]args)throws IOException{
        //variables 
        int num1, num2;
        //variables de entrada y salida
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;
        //codigo
        imprimir.println("Digite dos numeros separados por enter: ");
        num1 = Integer.parseInt(leer.readLine());
        num2 = Integer.parseInt(leer.readLine());
        if (num1 > num2) {
            imprimir.println(num1 + " es el mayor ");
        } else if (num2 > num1) {
            imprimir.println(num2 + " es el mayor ");
        } else {
            imprimir.println("son iguales ");
        }

    }
}//Aqui termina
