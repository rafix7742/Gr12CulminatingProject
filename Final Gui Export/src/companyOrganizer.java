
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafik
 */
public class companyOrganizer{
    public static String companyName;
    public static double netIncome;
    public static double netSales;
    public static double grossProfit;
    public static double avgTotalAssets;
    public static double avgShareEqt;
    public static double marketSharePrice;
    public static double eps;
    public static double currentAssets;
    public static double currentLiab;
    public static double cogs;
    public static double avgInv;
    public static double creditSales;
    public static double totalAssets;
    public static double totalLiab;
    public static double dividends;
    
    public static ArrayList<String> companyNames = new ArrayList<String>();
    public static ArrayList<Double> liquidity = new ArrayList<Double>();
    public static ArrayList<Double> solvency = new ArrayList<Double>();
    public static ArrayList<Double> profitability = new ArrayList<Double>();
    
    public static double[] ratios = new double [12];

    public static double profitabilityScore;
    public static double solvencyScore;
    public static double liquidityScore;
    public companyOrganizer (String companyName,double profitability, double liquidity, double solvency){
         companyName = this.companyName;
         profitability = profitabilityScore;
         liquidity = solvencyScore;
         solvency = profitabilityScore;
    }
    public static ArrayList<companyOrganizer> companies = new ArrayList<companyOrganizer>();
   /*
    @Override
    public int compareTo(companyOrganizer o) {
    }
        */
    //attempted to use implements comparable for company objects, this did not work very well
    
}
