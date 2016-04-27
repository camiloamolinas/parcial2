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
public class Cash implements Asset{
    
    protected double amoun;

    public Cash(double amoun) {
        this.amoun = amoun;
    }
    
    public Cash() {
    }
    
    @Override
    public double getMarketValue(){
        double a = 0;
        a = this.amoun;
        
        return a;
        
    }
    
    
    
    @Override
    public double getProfit(){
        double a = 0;     
        return a;
        
    }

    public double getAmoun() {
        return amoun;
    }

    public void setAmoun(double amoun) {
        this.amoun = amoun;
    }
    
    
    
    
}
