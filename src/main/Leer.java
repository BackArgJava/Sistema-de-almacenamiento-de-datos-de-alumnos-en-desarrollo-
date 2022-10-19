package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

// esto reemplaza al scanner, aca sera la entrada de datos
public class Leer {

    public static  String dato() {
       String sdato = null;

       //el buffered reader me permite leer de linea en linea
        /*el InputStreamReader envuelve una secuencia de bytes y la transforman en una secuencia
       de caracteres */
       try {
               BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
           sdato = entrada.readLine();
       }catch (IOException e) {
           System.out.println("Error " + e.getMessage());
       }
       return sdato;
    }
//2.
public static int datoInt(){
        try{
            return (Integer.parseInt(dato()));
        } catch (NumberFormatException error){
            return (Integer.MIN_VALUE);
        }
}
//3.
    public static float datoFloat(){
        try{
            Float f = new Float(dato());
            return (f.floatValue());
        }catch (NumberFormatException error){
            return (Float.NaN);
        }
    }

    //4.
    public static double datoDouble(){
        try{
            Double d = new Double(dato());
            return (d.doubleValue());
        }catch (NumberFormatException error){
            return (Double.NaN);

        }
    }
    //5.
     public static char datoChar(){
        try{
            char resp = dato().charAt(0);
            return resp;
        } catch (Exception error){
            return ('z');
        }

     }
     //7.-
    public static boolean datoBoolean(){
        try{
            return(Boolean.parseBoolean(dato()));
        } catch (NumberFormatException error){
            return (false);
        }
    }

}

