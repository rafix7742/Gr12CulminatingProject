/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hamzi
 */
public class Calculations {
    public static double profMarg(double netIncome, double netSales){
        return netIncome / netSales;
    }
    
    public static double grosProfMarg(double grossProfit, double netSales){
        return grossProfit / netSales;
    }
    
    public static double assetTrnOvr(double netSales, double avgTotalAssets){
        return netSales / avgTotalAssets;
    }
    
    public static double rtrnOnAssets(double netIncome, double avgTotalAssets){
        return netIncome / avgTotalAssets;
    }
    
    public static double rtrnOnEquity(double netIncome, double avgShareEqt){
        return netIncome / avgShareEqt;
    }
    
    public static double prceErngRATIO(double marketSharePrice, double eps){
        return marketSharePrice / eps;
    }
    
    public static double wrkngCap(double currentAssets, double currentLiab){
        return currentAssets - currentLiab;
    }
    
    public static double crrtRATIO(double currentAssets, double currentLiab){
        return currentAssets / currentLiab;
    }
    
    public static double invTrnvr(double cogs, double avgInv){
        return cogs / avgInv;
    }
    
    public static double recvableTrnvr(double creditSales, double totalAssets){
        return creditSales / totalAssets;
    }
    
    public static double debtTtlAssets(double totalLiab, double totalAssets){
        return totalLiab / totalAssets;
    }
    
    public static double payoutRATIO(double dividends, double netIncome){
        return dividends / netIncome;
    }
    
    
}
