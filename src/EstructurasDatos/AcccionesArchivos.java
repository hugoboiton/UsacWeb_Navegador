/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author Hugo
 */
public class AcccionesArchivos {
    private String ruta;
    private String carpeta;
    private String nombreArchivo;
    public JFileChooser abrir;
    private File fruta;
    public FileReader archivos;
    public BufferedReader leer;
       
    public AcccionesArchivos(String ruta)
    {
        this.ruta=ruta;
        this.fruta= new File(ruta);
        this.nombreArchivo="";
        if (RutaExite())
        {
          carpeta=obtenerCarpeta(ruta);
        }
    } 
    
    public boolean RutaExite ()
    {
      
      return fruta!=null;
    }
    
    public void Abrir(JFrame contenedor)
    {
       abrir= new JFileChooser(); 
       abrir.showOpenDialog(contenedor);
       this.nombreArchivo=abrir.getSelectedFile().getName();
       this.fruta=abrir.getSelectedFile();
       
    }
    
    public String leerTexto()
    {
        String texto="";
        try 
        {
            archivos= new FileReader(fruta);
            leer=new BufferedReader(archivos);
            String linea=leer.readLine();
             while(linea!= null)
             {
                 texto+=linea+"\n";
                 linea=leer.readLine();
             
             }
             leer.close();
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(), 
                    "Error ", JOptionPane.INFORMATION_MESSAGE);
        }
        return texto;
    }
    
    public void escribitTexto()
    {
    
    }
    private String obtenerCarpeta(String carpeta) {
        String car="",aux="";
        for(int i=0;i<carpeta.length();i++)
        {
            if(carpeta.charAt(i)=='\\')
            {
              car=car+aux+"\\";
              aux="";
            }
            else
            {aux=aux+carpeta.charAt(i); }
        
        }
        return car;
    }
    
    /**
     * @return the ruta
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    /**
     * @return the carpeta
     */
    public String getCarpeta() {
        return carpeta;
    }

    /**
     * @param carpeta the carpeta to set
     */
    public void setCarpeta(String carpeta) {
        this.carpeta = carpeta;
    }

    /**
     * @return the nombreArchivo
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * @param nombreArchivo the nombreArchivo to set
     */
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

   
}
