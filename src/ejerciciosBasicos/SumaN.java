/**
 * Sumar hasta N
 * Descripción: sumar hasta un determinado numero
 * Fecha:7 de febrero del 2017
 * Autor:Adriaán Obando Leitón
 * Fecha de modificación: 07-02-17d
 * Modificado por: Adrián Obando Leitón
 */
package ejerciciosBasicos;

//Librerias
import java.io.*;

public class SumaN {
     public static void main(String[]args)throws IOException{//aqui inicia el programa
     
         
         //variables 
        int n,sum;
        //variables de entrada y salida
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;
        
        //codigo
         imprimir.println("Digite un numero: ");
        n=Integer.parseInt(leer.readLine());
        //NORMAL
        sum= (n*(n+1))/2;
        imprimir.println("La sumatoria de todos los numeros hasta "+n+" es: "+ sum);
        //ITERACION
        int contador;
        sum=0;
        for(contador=1;contador<=n;contador++){
        sum=sum+contador;
        }
        imprimir.println("La sumatoria de todos los numeros hasta "+n+" es: "+ sum);
     }//Aqui termina el programa
}
