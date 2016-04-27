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
public class DividentStock extends Stock{
    
    protected double dividends;

    public DividentStock(double dividends, int totalShares, String symbol, double totalcost, double currentPrice) {
        super(totalShares, symbol, totalcost, currentPrice);
        this.dividends = dividends;
    }
    
    
    
    @Override
    public double getMarketValue(){
        double resultado = 0;
        resultado = super.getMarketValue() + this.dividends;
             
        return resultado;
    }

    public double getDividends() {
        return dividends;
    }

    public void setDividends(double dividends) {
        this.dividends = dividends;
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
