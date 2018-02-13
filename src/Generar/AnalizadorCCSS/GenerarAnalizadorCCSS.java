/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generar.AnalizadorCCSS;

/**
 *
 * @author Hugo
 */
public class GenerarAnalizadorCCSS {
    public static void main(String[] args) {
        generarAnalizador();
    }
    private static void generarAnalizador()
    {
        try {
            String ruta ="src/Analizador/CCSS/";
            String opcFlex[]={ruta + "/lexicoCCSS.flex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            String opcCUP[]={"-destdir" , ruta , "-parser" , "parserCCSS" , ruta+"sintacticoCCSS.cup" };
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
