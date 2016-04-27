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
 * @author Camilo
 */
public class CreadorObjetos {

  public void crear() throws Exception, FileNotFoundException, IOException {
      System.out.println("ENTRE A CREEAR");
      
File file = new File("datos_des.txt");    
/*FileReader leer1 = new FileReader(file);
FileWriter escribir = null;
BufferedReader leer = new BufferedReader(leer1);
BufferedWriter val = null;*/


ArrayList<Cash> cash = new  ArrayList<Cash>();
Cash cash_objeto = null;

ArrayList<Stock> stock = new  ArrayList<Stock>();
Stock stock_objeto = null;

ArrayList<DividentStock> divStock = new  ArrayList<DividentStock>();
DividentStock divStock_objeto = null;

    int numLineas = 0;
    int i = 0;
 
//---------------------------------------------------------------------------------

Scanner f = new Scanner(file);
f.useDelimiter(",");
String  comparador1 = f.next();
f.next();
String comparador2 = f.next();
for(int j = 0; j <4  ; j++){
    f.next();
}
String comparador3 = f.next();

//---------------------------------------------------------------------------------

    /*int x = 1;
     String dat = null;
    int indicador = 0;
    FileInputStream file1;
        file1 = new FileInputStream("datos_des.txt");

   /* while( (a = file1.read()) != -1) {
        
        if(a == 10){
            numLineas++;
        }

    }*/

Scanner sc = new Scanner(file);
sc.useDelimiter(",");
double[] almacenador = null;
String symbol;
String primera = null;

boolean t = false;
    while( 30 != numLineas){
/*String linea = null;
String[] datos_linea = null;

linea = leer.readLine();
datos_linea = linea.split(",");
        System.out.println(" split " + datos_linea[0] );*/
t = sc.hasNext();
 primera = sc.next();

t = "CASH".equals(primera) ;
 
    if( comparador1.equals(primera) ){   //datos_linea[0]
        /*almacenador = new double[1];
        System.out.println("entre");
        escribir = new FileWriter("valores.txt");
        val = new BufferedWriter(escribir );
        dat = datos_linea[1];
        val.write(dat);
        sc = new Scanner("valores.txt");
        //val.write(datos_linea[1]);
        almacenador[0] = ((double) sc.nextInt() );
        
        
        cash_objeto = new Cash(almacenador[0]);
        System.out.println("Objeto Cahs : " + cash_objeto.getAmoun());
        cash.add(cash_objeto);
        System.out.println("ARRAYLIST 1 basio = " + cash.isEmpty());
        System.out.println("Arraylist = " + cash.get(1) ) ;*/
        almacenador = new double[1];
        almacenador[0] = sc.nextDouble();
        cash_objeto = new Cash(almacenador[0]);
        cash.add(cash_objeto);
        
        
        
    }else{
        t = true;
        t = "STOCK ".equals((String)primera) ;
    
    if( comparador2.equals(primera) ){  //datos_linea[0]
       /* almacenador = new double[3];
        //val = new BufferedWriter(new FileWriter("valores.txt") );
        sc = new Scanner("valores.txt");
        
        String symbol = datos_linea[1];
        i = 0;
        while(i != 3){
            val = new BufferedWriter(new FileWriter("valores.txt") );
        val.write(datos_linea[i+2]);
        almacenador[i] = sc.nextInt();
        i++;
        }
                
        stock_objeto = new Stock((int)almacenador[2], symbol, almacenador[0],almacenador[1]);
        stock.add(stock_objeto);*/
        symbol = sc.next();
        almacenador = new double[3];
        almacenador[0] = sc.nextDouble();   // totalCost
        almacenador[1] = sc.nextDouble();   // currentPrice
        almacenador[2] = sc.nextDouble();   // totalShares
        
        stock_objeto = new Stock((int)almacenador[2], symbol, almacenador[0],almacenador[1]);
        stock.add(stock_objeto);
        System.out.println("pase por STOCK");
    } else{
        t = "DIVSTOCK ".equals((String) primera);
    
    if( comparador3.equals(primera) ){
       /* almacenador = new double[4];
        sc = new Scanner("valores.txt");
        
        String symbol = datos_linea[1];
        i = 0;
        while(i != 4){
            val = new BufferedWriter(new FileWriter("valores.txt") );
        val.write(datos_linea[i+2]);
        almacenador[i] = sc.nextInt();
        i++;
        }
                
        divStock_objeto = new DividentStock(almacenador[3], (int) almacenador[3], symbol, almacenador[0], almacenador[1]);
        divStock.add(divStock_objeto);   */
        symbol = sc.next();
        almacenador = new double[4];
        i=0;
        while( sc.hasNextInt()){
          almacenador[i] = sc.nextDouble(); 
          i++;
        }
        /*almacenador[0] = sc.nextDouble();   // totalCost
        almacenador[1] = sc.nextDouble();   // currentPrice
        almacenador[2] = sc.nextDouble();   // totalShares
        almacenador[3] = sc.nextDouble();   // Dividents*/
        
        divStock_objeto = new DividentStock(almacenador[3], (int) almacenador[2], symbol, almacenador[0], almacenador[1]);
        divStock.add(divStock_objeto);
        System.out.println("pase por DIVIDENTS");
         }  
    
       }
    }
    
      numLineas++;
    
    }

      System.out.println("Fueron creados Todos los Objetos");
      
      
      
      //-------------------------Resultados--------------------------------------
      
      PrintStream resultado = new PrintStream(new File("resultados.txt"));
      
      double aux = 0;
      double aux2 = 0;
     // i =0;
      for ( Cash c : cash){
          System.out.println("c = " + c.getAmoun());
         aux = aux + c.getMarketValue();
         aux2 = aux2 + c.getProfit();
  
      }
      /* System.out.println("ARRAYLIST basio = " + cash.isEmpty());
      Cash z = cash.get(1);
      System.out.println( "Aui esta un objeto = " + z.getAmoun());
     while(i != cash.size()){
          System.out.println("Entre al while d cash");
         Cash c = cash.get(i+1);
         aux = aux + c.getMarketValue();
         aux2 = aux2 + c.getProfit();
         i++;
      }*/
     
      resultado.println("Cash ");
      resultado.println("Total Market =  " + aux);
      resultado.println("Total Profit =  " + aux2);
      resultado.println("");
      
      aux = 0;
      aux2 = 0;
      //i = 0;
      for ( Stock s : stock){
          System.out.println("s = " + s.getSymbol());
         aux = aux + s.getMarketValue();
         aux2 = aux2 + s.getProfit();
  
      }
      /*while(i != stock.size()){
         Stock s = stock.get(i+1);
         aux = aux + s.getMarketValue();
         aux2 = aux2 + s.getProfit();
         i++;
      }
      */
      resultado.println("Stock ");
      resultado.println("Total Market =  " + aux);
      resultado.println("Total Profit =  " + aux2);
      resultado.println("");

      aux = 0;
      aux2 = 0;
      //i=0; 
      for ( DividentStock d : divStock){
         aux = aux + d.getMarketValue();
         aux2 = aux2 + d.getProfit();
          System.out.println("si entre al for divident");
  
      }
      /*while(i != divStock.size()){
         DividentStock d = divStock.get(i+1);
         aux = aux + d.getMarketValue();
         aux2 = aux2 + d.getProfit();
         i++;
      }*/
      
      resultado.println("DividentStock");
      resultado.println("Total Market =  " + aux);
      resultado.println("Total Profit =  " + aux2);
      resultado.println("");
      
      
      


  }
  
  
  
  

}
