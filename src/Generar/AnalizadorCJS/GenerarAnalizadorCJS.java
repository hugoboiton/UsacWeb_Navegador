/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generar.AnalizadorCJS;

/**
 *
 * @author Hugo
 */
public class GenerarAnalizadorCJS {
    public static void main(String[] args) {
     generarAnalizador();
    }
     private static void generarAnalizador()
    {
        try {
            String ruta ="src/Analizador/CJS/";
            String opcFlex[]={ruta + "lexicoCJS.flex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            String opcCUP[]={"-destdir" , ruta , "-parser" , "parserCJS" , ruta+"sintacticoCJS.cup" };
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
