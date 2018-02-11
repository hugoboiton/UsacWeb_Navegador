/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstucturasDatos;

/**
 *
 * @author Hugo
 */

import java.util.ArrayList;

public class NodoArbol {
    private String Produccion;
    private String valor;
    public ArrayList<NodoArbol> hijos;
    
    public NodoArbol(String produccion , String valor) {
        this.setProduccion(produccion);
        this.setValor(valor);
        hijos = new ArrayList<NodoArbol>();
    
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
    
    
}
