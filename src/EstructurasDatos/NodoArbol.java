/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDatos;

/**
 *
 * @author Hugo
 */

import java.util.ArrayList;

public class NodoArbol {
    private String Produccion;
    private String valor;
    private String linea;
    private String columna;
    public ArrayList<NodoArbol> hijos;
    
    public NodoArbol(String produccion , String valor,int linea , int columna) {
        this.setProduccion(produccion);
        this.setValor(valor);
        hijos = new ArrayList<NodoArbol>();
        this.setLinea(String.valueOf(linea));
        this.setColumna(String.valueOf(columna));
    }
    public void add( NodoArbol hijo){
        hijos.add(hijo);
    
    }
    /**
     * @return the Produccion
     */
    public String getProduccion() {
        return Produccion;
    }

    /**
     * @param Produccion the Produccion to set
     */
    public void setProduccion(String Produccion) {
        this.Produccion = Produccion;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the linea
     */
    public String getLinea() {
        return linea;
    }

    /**
     * @param linea the linea to set
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }

    /**
     * @return the columna
     */
    public String getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(String columna) {
        this.columna = columna;
    }
    
    
}
