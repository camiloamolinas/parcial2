/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firma_de_inversion;

/**
 *
 * @author Estudiante
 */
public class MutualFund extends ShareAsset {
    
    protected double totalShares;
    
        public MutualFund(double totalShares, String symbol, double totalcost, double currentPrice){
        super(symbol, totalcost, currentPrice);
        this.totalShares = totalShares;
    }
    
    @Override
    public double getMarketValue(){
       double resultado = 0;
       resultado = this.totalShares * this.currentPrice;
       
     return resultado; 

    }
    
    @Override
    public double getProfit(){
        double resultado = 0;
        resultado = ( (this.totalShares * this.currentPrice) - this.totalcost );
        
        return resultado;
        
    }
    
    
    
}
