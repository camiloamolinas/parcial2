/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firma_de_inversion;
import java.io.*;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Firma_de_Inversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
                System.out.println("Version 7.1 ");
                System.out.println("");
    
                //-------------Desincriptar----------------------------------------
    int dato;
    Desincriptador des = new Desincriptador();
    CreadorObjetos creador = new CreadorObjetos();
    FileInputStream file = new FileInputStream("datos.txt");
    FileOutputStream datos_des = new FileOutputStream("datos_des.txt");

    while( (dato = file.read()) != -1) {
//System.out.println("dato " + (char)dato + "  " + dato);
    dato = des.desincriptar(dato);
//System.out.println("dato " + (char)dato + "  " + dato);
    datos_des.write(dato);

    }
    
            //-----------------Fin Desincriptacion-------------------------
            
            //-----------------Crear Objetos----------------------------
    creador.crear();
    
    datos_des.close();
    
        
    
    

    
        
    
    
    
        
        
    }
    
}
