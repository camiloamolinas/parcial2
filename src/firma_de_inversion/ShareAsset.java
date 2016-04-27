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
public abstract class ShareAsset implements Asset{
    protected String symbol;
    protected double totalcost;
    protected double currentPrice;

    public ShareAsset(String symbol, double totalcost, double currentPrice) {
        this.symbol = symbol;
        this.totalcost = totalcost;
        this.currentPrice = currentPrice;
    }
         
    
}
