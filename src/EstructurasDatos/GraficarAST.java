/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDatos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.print.DocFlavor;

/**
 *
 * @author Hugo
 */
public class GraficarAST {
 NodoArbol arbol;
 int numero;
 public GraficarAST(NodoArbol ar,String nom){
 
        this.arbol=ar;
        numero=1; 
        Graficar(recorrido(arbol ,0),nom); 
 }
 String recorrido(NodoArbol raiz,int id){
            int var;
            String cuerpo="";
            for (NodoArbol hijos : raiz.hijos) { 
                 var = incremento();
                cuerpo += "\""+id+"_" + raiz.getProduccion() + "\"->\""+var+"_"+hijos.getProduccion()+"\""+"\n";
                cuerpo += recorrido(hijos, var)+"\n";   
                
            }
          return cuerpo; 
    }
   int incremento()
    {
        return numero++;
    }
   
public void Graficar(String cadena,String cad){
        FileWriter fichero = null;
        PrintWriter pw = null;
        String nombre=cad;
        String archivo=nombre+".dot";
        try {
            fichero = new FileWriter(archivo);
            pw = new PrintWriter(fichero);
            pw.println("digraph G {node[shape=box, style=filled, color=Gray95]; edge[color=blue];rankdir=UD \n");
            pw.println(cadena);
            pw.println("\n}");
            fichero.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            String cmd = "dot.exe -Tpng "+nombre+".dot -o"+nombre+".png"; //Comando de apagado en linux
            Runtime.getRuntime().exec(cmd); 
        } catch (IOException ioe) {
                System.out.println (ioe);
        }
       
       
    }
 
}
