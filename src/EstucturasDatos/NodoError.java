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
public class NodoError {
    private int linea;
    private int columna;
    private String tipo;
    private String mensaje;
    private String Archivo;
    
    public NodoError(int linea ,int colum,String tipo,String mensaje,String archivo)
    {
        setLinea(linea);
        setColumna(colum);
        setTipo(tipo);
        setArchivo(archivo);
        setMensaje(mensaje);
    }

    /**
     * @return the linea
     */
    public int getLinea() {
        return linea;
    }

    /**
     * @param linea the linea to set
     */
    public void setLinea(int linea) {
        this.linea = linea;
    }

    /**
     * @return the columna
     */
    public int getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the Archivo
     */
    public String getArchivo() {
        return Archivo;
    }

    /**
     * @param Archivo the Archivo to set
     */
    public void setArchivo(String Archivo) {
        this.Archivo = Archivo;
    }
    
}
