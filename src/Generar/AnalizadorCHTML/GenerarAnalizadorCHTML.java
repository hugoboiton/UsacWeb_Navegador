/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generar.AnalizadorCHTML;

/**
 *
 * @author Hugo
 */
public class GenerarAnalizadorCHTML {
    public static void main(String[] args) {
        generarAnalizador();
    }
     private static void generarAnalizador()
    {
        try {
            String ruta ="src/Analizador/CHTML";
            String opcFlex[]={ruta + "lexicoCHTML.flex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            String opcCUP[]={"-destdir" , ruta , "-parser" , "parserCHTML" , ruta+"sintacticoCHTML.cup" };
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
