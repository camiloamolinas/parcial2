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
public class Desincriptador  {

   
    public int codigo(int codigo){
        int resultado = 100;
        
        switch(codigo){
        case 65: resultado = 0;
                   break;
        case 66: resultado = 1;
                   break;
        case 67: resultado = 2;
                   break;
        case 68: resultado = 3;
                   break;
        case 69: resultado = 4;
                   break;
        case 70: resultado = 5;
                   break;
        case 71: resultado = 6;
                   break;
        case 72: resultado = 7;
                   break;
        case 73: resultado = 8;
                   break;
        case 74: resultado = 9;
                   break;
        case 75: resultado = 10;
                   break;
        case 76: resultado = 11;
                   break;
        case 77: resultado = 12;
                   break;
        case 78: resultado = 13;
                   break;
        case 79: resultado = 14;
                   break;
        case 80: resultado = 15;
                   break;
        case 81: resultado = 16;
                   break;
        case 82: resultado = 17;
                   break;
        case 83: resultado = 18;
                   break;
        case 84: resultado = 19;
                   break;
        case 85: resultado = 20;
                   break;
        case 86: resultado = 21;
                   break;
        case 87: resultado = 22;
                   break;
        case 88: resultado = 23;
                   break;
        case 89: resultado = 24;
                   break;
        case 90: resultado = 25;
                   break;

        default: System.out.println("Codigo Erroneo");
            break;
        }
        
        return resultado;
    }
    
    
    public int desincriptar(int codigo){
        int resultado = 0;
        int p;
        boolean evaluador = false;
        //System.out.println("ya casi entro AL FOR");
            
        int i= 47;
            while( i != 58 ){   
            //System.out.println("ENTRE AL FOR");
            if(i == codigo){
                evaluador = true;
                //System.out.println("ciclo  " + codigo + " = " + i + "  " + evaluador);
            }
            i++;
        }
            
            switch(codigo){
                case 44: evaluador = true;
                        break;
                case 10: evaluador = true;
                        break;
                case 13: evaluador = true;
                        break;
            }
            
            
            if(evaluador == false){
        //System.out.println("codigo " + (char)codigo + "  " + codigo );
        codigo = this.codigo(codigo);
        //System.out.println("codigo funcion" + (char)codigo + "  " + codigo );
        p = (codigo - 3) % 26;
        //System.out.println("resultado " + (char)p + "  " + p );
        resultado = this.letra(p);
            } else { 
                //System.out.println("ESTOY AQUI EN ELSE");
                resultado = codigo;
                
            }
            
        return resultado;
    }
    
    
    public int letra(int p){
        int resultado = 0;
        
        switch(p){
        case 0: resultado = 65;
                   break;
        case 1: resultado = 66;
                   break;
        case 2: resultado = 67;
                   break;
        case 3: resultado = 68;
                   break;
        case 4: resultado = 69;
                   break;
        case 5: resultado = 70;
                   break;
        case 6: resultado = 71;
                   break;
        case 7: resultado = 72;
                   break;
        case 8: resultado = 73;
                   break;
        case 9: resultado = 74;
                   break;
        case 10: resultado = 75;
                   break;
        case 11: resultado = 76;
                   break;
        case 12: resultado = 77;
                   break;
        case 13: resultado = 78;
                   break;
        case 14: resultado = 79;
                   break;
        case 15: resultado = 80;
                   break;
        case 16: resultado = 81;
                   break;
        case 17: resultado = 82;
                   break;
        case 18: resultado = 83;
                   break;
        case 19: resultado = 84;
                   break;
        case 20: resultado = 85;
                   break;
        case 21: resultado = 86;
                   break;
        case 22: resultado = 87;
                   break;
        case 23: resultado = 88;
                   break;
        case 24: resultado = 89;
                   break;
        case 25: resultado = 90;
                   break;
        
        default: System.out.println("Letra Invalida " + p );
                    break;
       }
        return resultado;
    }
    
}
