/**
 * Números reales
 * Descripción: leer e imprimir un número real
 * Fecha:7 de febrero del 2017
 * Autor:Adriaán Obando Leitón
 * Fecha de modificación: 07-02-17d
 * Modificado por: Adrián Obando Leitón
 */
package ejerciciosBasicos;

//Librerias
import java.io.*;

public class Real {//Aquí inicia el programa
    public static void main(String[]args)throws IOException{
    //variables
    float real;
    
    //variables de entrada y salida
    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    PrintStream imprimir = System.out;
    
    //código
    imprimir.println("Digite un numero real: ");
    real = Float.parseFloat(leer.readLine());
    imprimir.println("El número real es: "+real);

    }
    
    
}//Aqui termina el programa
