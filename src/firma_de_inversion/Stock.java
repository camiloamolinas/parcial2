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
public class Stock extends ShareAsset{
    
    protected int totalShares; 
    
    public Stock(int totalShares, String symbol, double totalcost, double currentPrice){
        super(symbol, totalcost, currentPrice);
        this.totalShares = totalShares;
    }

    @Override
    public double getMarketValue() {
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

    
    
    
    
    public int getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(double totalcost) {
        this.totalcost = totalcost;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    
    
    
    
    
    
}
