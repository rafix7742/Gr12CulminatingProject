
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hayou1838
 */
public class CompanyInput extends javax.swing.JFrame {

    /**
     * Creates new form Frame2
     */
       //ArrayList<Double[ ] > companyValues = new ArrayList<Double[ ] >();
    
    
    public CompanyInput() {
        if(redirect.speedBump == 1){
            this.setVisible(false);
            new Leaderboard().setVisible(true);
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        Background = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        confirmbtn = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        companyName = new javax.swing.JTextField();
        profitability1 = new javax.swing.JLabel();
        profitMarginPannel = new javax.swing.JPanel();
        gpmText5 = new javax.swing.JLabel();
        netIncometxt = new javax.swing.JTextField();
        netSalestxt = new javax.swing.JTextField();
        fractionbar9 = new javax.swing.JLabel();
        grossProfitMarginPannel = new javax.swing.JPanel();
        gpmText2 = new javax.swing.JLabel();
        grossProfittxt = new javax.swing.JTextField();
        netSalestxt2 = new javax.swing.JTextField();
        fractionbar2 = new javax.swing.JLabel();
        assetTurnoverPannel = new javax.swing.JPanel();
        gpmText9 = new javax.swing.JLabel();
        netSalestxt3 = new javax.swing.JTextField();
        avgTotalAssetstxt = new javax.swing.JTextField();
        fractionbar10 = new javax.swing.JLabel();
        returnOnAssetsPannel = new javax.swing.JPanel();
        gpmText10 = new javax.swing.JLabel();
        netIncometxt2 = new javax.swing.JTextField();
        avgTotalAssetstxt2 = new javax.swing.JTextField();
        fractionbar11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        gpmText11 = new javax.swing.JLabel();
        netIncometxt3 = new javax.swing.JTextField();
        avgShareEqttxt = new javax.swing.JTextField();
        fractionbar12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        gpmText4 = new javax.swing.JLabel();
        currentAssetstxt = new javax.swing.JTextField();
        currentLiabtxt = new javax.swing.JTextField();
        fractionbar5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        gpmText1 = new javax.swing.JLabel();
        currentAssetstxt2 = new javax.swing.JTextField();
        currentLiabtxt2 = new javax.swing.JTextField();
        fractionbar1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        gpmText8 = new javax.swing.JLabel();
        cogstxt = new javax.swing.JTextField();
        avgInvtxt = new javax.swing.JTextField();
        fractionbar8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        gpmText7 = new javax.swing.JLabel();
        creditSalestxt = new javax.swing.JTextField();
        avgGrossRectxt = new javax.swing.JTextField();
        fractionbar7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        gpmText6 = new javax.swing.JLabel();
        totalLiabtxt = new javax.swing.JTextField();
        totalAssetstxt = new javax.swing.JTextField();
        fractionbar6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        gpmText12 = new javax.swing.JLabel();
        marketSharePricetxt = new javax.swing.JTextField();
        epstxt = new javax.swing.JTextField();
        fractionbar13 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        gpmText13 = new javax.swing.JLabel();
        dividendtxt = new javax.swing.JTextField();
        netIncometxt4 = new javax.swing.JTextField();
        fractionbar14 = new javax.swing.JLabel();
        clearFeildsbtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        toF1fromF2 = new javax.swing.JMenuItem();
        toF3fromF3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(204, 204, 255));
        Background.setLayout(null);

        title.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Please insert company infromation");
        Background.add(title);
        title.setBounds(0, 0, 630, 70);

        confirmbtn.setText("OK");
        confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbtnActionPerformed(evt);
            }
        });
        Background.add(confirmbtn);
        confirmbtn.setBounds(530, 60, 100, 30);

        name.setText("Company Name:");
        Background.add(name);
        name.setBounds(20, 70, 130, 14);

        companyName.setText("Facebook");
        companyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyNameActionPerformed(evt);
            }
        });
        Background.add(companyName);
        companyName.setBounds(120, 60, 400, 30);

        profitability1.setText("Profitability Ratios:");
        Background.add(profitability1);
        profitability1.setBounds(10, 100, 110, 30);

        profitMarginPannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        profitMarginPannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpmText5.setText("Profit Margin:");
        profitMarginPannel.add(gpmText5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 30));

        netIncometxt.setText("Net Income");
        netIncometxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netIncometxtActionPerformed(evt);
            }
        });
        profitMarginPannel.add(netIncometxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, 30));

        netSalestxt.setText("Net Sales");
        netSalestxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netSalestxtActionPerformed(evt);
            }
        });
        profitMarginPannel.add(netSalestxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, 30));

        fractionbar9.setText("____________________");
        profitMarginPannel.add(fractionbar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 130, 20));

        Background.add(profitMarginPannel);
        profitMarginPannel.setBounds(0, 140, 270, 90);

        grossProfitMarginPannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        grossProfitMarginPannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpmText2.setText("Gross Profit Margin:");
        grossProfitMarginPannel.add(gpmText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 30));

        grossProfittxt.setText("Gross Profit");
        grossProfittxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grossProfittxtActionPerformed(evt);
            }
        });
        grossProfitMarginPannel.add(grossProfittxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 120, 30));

        netSalestxt2.setText("Net Sales");
        netSalestxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netSalestxt2ActionPerformed(evt);
            }
        });
        grossProfitMarginPannel.add(netSalestxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 120, 30));

        fractionbar2.setText("____________________");
        grossProfitMarginPannel.add(fractionbar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 120, 20));

        Background.add(grossProfitMarginPannel);
        grossProfitMarginPannel.setBounds(0, 230, 270, 90);

        assetTurnoverPannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        assetTurnoverPannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpmText9.setText("Asset Turnover:");
        assetTurnoverPannel.add(gpmText9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 30));

        netSalestxt3.setText("Net Sales");
        netSalestxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netSalestxt3ActionPerformed(evt);
            }
        });
        assetTurnoverPannel.add(netSalestxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 120, 30));

        avgTotalAssetstxt.setText("Average Total Assets");
        avgTotalAssetstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avgTotalAssetstxtActionPerformed(evt);
            }
        });
        assetTurnoverPannel.add(avgTotalAssetstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 120, 30));

        fractionbar10.setText("____________________");
        assetTurnoverPannel.add(fractionbar10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 130, 20));

        Background.add(assetTurnoverPannel);
        assetTurnoverPannel.setBounds(0, 320, 270, 90);

        returnOnAssetsPannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        returnOnAssetsPannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpmText10.setText("Return on Assets:");
        returnOnAssetsPannel.add(gpmText10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 30));

        netIncometxt2.setText("Net Income");
        netIncometxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netIncometxt2ActionPerformed(evt);
            }
        });
        returnOnAssetsPannel.add(netIncometxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, 30));

        avgTotalAssetstxt2.setText("Average Total Assets");
        avgTotalAssetstxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avgTotalAssetstxt2ActionPerformed(evt);
            }
        });
        returnOnAssetsPannel.add(avgTotalAssetstxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 120, 30));

        fractionbar11.setText("____________________");
        returnOnAssetsPannel.add(fractionbar11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 120, 20));

        Background.add(returnOnAssetsPannel);
        returnOnAssetsPannel.setBounds(0, 410, 270, 90);

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpmText11.setText("Return on Equity:");
        jPanel12.add(gpmText11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 30));

        netIncometxt3.setText("Net Income");
        netIncometxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netIncometxt3ActionPerformed(evt);
            }
        });
        jPanel12.add(netIncometxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, 30));

        avgShareEqttxt.setText("Avg Shareholder's Eqt");
        avgShareEqttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avgShareEqttxtActionPerformed(evt);
            }
        });
        jPanel12.add(avgShareEqttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 120, 30));

        fractionbar12.setText("____________________");
        jPanel12.add(fractionbar12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 140, 20));

        Background.add(jPanel12);
        jPanel12.setBounds(0, 500, 270, 90);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpmText4.setText("Working Capital:");
        jPanel2.add(gpmText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 30));

        currentAssetstxt.setText("Current Assets");
        currentAssetstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentAssetstxtActionPerformed(evt);
            }
        });
        jPanel2.add(currentAssetstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 120, 30));

        currentLiabtxt.setText("Current Liabilities");
        currentLiabtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentLiabtxtActionPerformed(evt);
            }
        });
        jPanel2.add(currentLiabtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 120, 30));

        fractionbar5.setText("__");
        jPanel2.add(fractionbar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 130, 20));

        Background.add(jPanel2);
        jPanel2.setBounds(360, 140, 430, 90);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpmText1.setText("Current Ratio:");
        jPanel1.add(gpmText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 30));

        currentAssetstxt2.setText("Current Assets");
        currentAssetstxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentAssetstxt2ActionPerformed(evt);
            }
        });
        jPanel1.add(currentAssetstxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 120, 30));

        currentLiabtxt2.setText("Current Liabilities");
        currentLiabtxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentLiabtxt2ActionPerformed(evt);
            }
        });
        jPanel1.add(currentLiabtxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 120, 30));

        fractionbar1.setText("________________");
        jPanel1.add(fractionbar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 130, 20));

        Background.add(jPanel1);
        jPanel1.setBounds(360, 230, 270, 90);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpmText8.setText("Inventory Turnover:");
        jPanel6.add(gpmText8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 30));

        cogstxt.setText("Cost of Goods Sold");
        cogstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cogstxtActionPerformed(evt);
            }
        });
        jPanel6.add(cogstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 120, 30));

        avgInvtxt.setText("Average inventory");
        avgInvtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avgInvtxtActionPerformed(evt);
            }
        });
        jPanel6.add(avgInvtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 120, 30));

        fractionbar8.setText("________________");
        jPanel6.add(fractionbar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 130, 20));

        Background.add(jPanel6);
        jPanel6.setBounds(360, 320, 270, 90);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpmText7.setText("Receivables Turnover:");
        jPanel5.add(gpmText7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 30));

        creditSalestxt.setText("Net Credit Sales");
        creditSalestxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditSalestxtActionPerformed(evt);
            }
        });
        jPanel5.add(creditSalestxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 120, 30));

        avgGrossRectxt.setText("Avg Gross receivables");
        avgGrossRectxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avgGrossRectxtActionPerformed(evt);
            }
        });
        jPanel5.add(avgGrossRectxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 120, 30));

        fractionbar7.setText("________________");
        jPanel5.add(fractionbar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 120, 20));

        Background.add(jPanel5);
        jPanel5.setBounds(360, 410, 270, 90);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpmText6.setText("Debt Total Assets:");
        jPanel4.add(gpmText6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 30));

        totalLiabtxt.setText("Total Liabilities");
        totalLiabtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalLiabtxtActionPerformed(evt);
            }
        });
        jPanel4.add(totalLiabtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 120, 30));

        totalAssetstxt.setText("Total Assets");
        totalAssetstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalAssetstxtActionPerformed(evt);
            }
        });
        jPanel4.add(totalAssetstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 120, 30));

        fractionbar6.setText("_________________");
        jPanel4.add(fractionbar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 140, 20));

        Background.add(jPanel4);
        jPanel4.setBounds(810, 480, 270, 90);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpmText12.setText("Price-Earnings Ratio:");
        jPanel7.add(gpmText12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 30));

        marketSharePricetxt.setText("Market Price per share");
        marketSharePricetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marketSharePricetxtActionPerformed(evt);
            }
        });
        jPanel7.add(marketSharePricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 120, 30));

        epstxt.setText("Earnings Per Share");
        epstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epstxtActionPerformed(evt);
            }
        });
        jPanel7.add(epstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 120, 30));

        fractionbar13.setText("____________________");
        jPanel7.add(fractionbar13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 140, 20));

        Background.add(jPanel7);
        jPanel7.setBounds(0, 590, 270, 90);

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpmText13.setText("Payout Ratio:");
        jPanel13.add(gpmText13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 30));

        dividendtxt.setText("Cash Dividends");
        dividendtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividendtxtActionPerformed(evt);
            }
        });
        jPanel13.add(dividendtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, 30));

        netIncometxt4.setText("Net Income");
        netIncometxt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netIncometxt4ActionPerformed(evt);
            }
        });
        jPanel13.add(netIncometxt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, 30));

        fractionbar14.setText("________________");
        jPanel13.add(fractionbar14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 140, 20));

        Background.add(jPanel13);
        jPanel13.setBounds(0, 680, 270, 90);

        clearFeildsbtn.setText("Clear Feilds");
        clearFeildsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFeildsbtnActionPerformed(evt);
            }
        });
        Background.add(clearFeildsbtn);
        clearFeildsbtn.setBounds(700, 50, 100, 50);

        jMenu1.setText("Go to");

        jMenuItem2.setText("Help");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        toF1fromF2.setText("Frame 1");
        toF1fromF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toF1fromF2ActionPerformed(evt);
            }
        });
        jMenu1.add(toF1fromF2);

        toF3fromF3.setText("Frame 3");
        toF3fromF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toF3fromF3ActionPerformed(evt);
            }
        });
        jMenu1.add(toF3fromF3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 1282, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toF1fromF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toF1fromF2ActionPerformed
        this.setVisible(false);
        new Introduction().setVisible(true);
    }//GEN-LAST:event_toF1fromF2ActionPerformed

    private void toF3fromF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toF3fromF3ActionPerformed
        this.setVisible(false);
        new Leaderboard().setVisible(true);
    }//GEN-LAST:event_toF3fromF3ActionPerformed

    private void avgInvtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avgInvtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avgInvtxtActionPerformed

    private void cogstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cogstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cogstxtActionPerformed

    private void avgGrossRectxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avgGrossRectxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avgGrossRectxtActionPerformed

    private void creditSalestxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditSalestxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditSalestxtActionPerformed

    private void totalAssetstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalAssetstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalAssetstxtActionPerformed

    private void totalLiabtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalLiabtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalLiabtxtActionPerformed

    private void currentLiabtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentLiabtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentLiabtxtActionPerformed

    private void currentAssetstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentAssetstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentAssetstxtActionPerformed

    private void currentLiabtxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentLiabtxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentLiabtxt2ActionPerformed

    private void currentAssetstxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentAssetstxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentAssetstxt2ActionPerformed

    private void companyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyNameActionPerformed
            companyName.setToolTipText("Insert the name of the company you want to calculate");
    }//GEN-LAST:event_companyNameActionPerformed

    private void confirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbtnActionPerformed
       
        new redirect().setVisible(true);
        this.setVisible(false);
        confirmbtn.setToolTipText("make sure you check all the ratios! You don't want to remove this after all your hard work!");
         
         try{
          companyOrganizer.netIncome = Double.parseDouble(netIncometxt.getText());
          companyOrganizer.netSales = Double.parseDouble(netSalestxt.getText());
          companyOrganizer.grossProfit = Double.parseDouble(grossProfittxt.getText());
          companyOrganizer.avgTotalAssets = Double.parseDouble(avgTotalAssetstxt.getText());
          companyOrganizer.avgShareEqt = Double.parseDouble(avgShareEqttxt.getText());
          companyOrganizer.marketSharePrice = Double.parseDouble(marketSharePricetxt.getText());
          companyOrganizer.eps = Double.parseDouble(epstxt.getText());
          companyOrganizer.currentAssets = Double.parseDouble(currentAssetstxt.getText());
          companyOrganizer.currentLiab = Double.parseDouble(currentLiabtxt.getText());
          companyOrganizer.cogs = Double.parseDouble(cogstxt.getText());
          companyOrganizer.avgInv = Double.parseDouble(avgInvtxt.getText());
          companyOrganizer.creditSales = Double.parseDouble(creditSalestxt.getText());
          companyOrganizer.totalAssets = Double.parseDouble(totalAssetstxt.getText());
          companyOrganizer.totalLiab = Double.parseDouble(totalLiabtxt.getText());
          companyOrganizer.dividends = Double.parseDouble(dividendtxt.getText());

          
         //netIncometxt4.setText(String.valueOf(s));
         
         
         }catch(Exception e){
             
         }
        
    }//GEN-LAST:event_confirmbtnActionPerformed

    private void avgShareEqttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avgShareEqttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avgShareEqttxtActionPerformed

    private void netIncometxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netIncometxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_netIncometxt3ActionPerformed

    private void avgTotalAssetstxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avgTotalAssetstxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avgTotalAssetstxt2ActionPerformed

    private void netIncometxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netIncometxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_netIncometxt2ActionPerformed

    private void avgTotalAssetstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avgTotalAssetstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avgTotalAssetstxtActionPerformed

    private void netSalestxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netSalestxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_netSalestxt3ActionPerformed

    private void netSalestxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netSalestxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_netSalestxt2ActionPerformed

    private void grossProfittxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grossProfittxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grossProfittxtActionPerformed

    private void netSalestxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netSalestxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_netSalestxtActionPerformed

    private void netIncometxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netIncometxtActionPerformed
        
    }//GEN-LAST:event_netIncometxtActionPerformed

    private void marketSharePricetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marketSharePricetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marketSharePricetxtActionPerformed

    private void epstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_epstxtActionPerformed

    private void dividendtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividendtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dividendtxtActionPerformed

    private void netIncometxt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netIncometxt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_netIncometxt4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setVisible(false);
        new HelpFrame().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void clearFeildsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFeildsbtnActionPerformed
        // TODO add your handling code here:
         netIncometxt4.setText(String.valueOf(""));
         dividendtxt.setText(String.valueOf(""));
         marketSharePricetxt.setText(String.valueOf(""));
         netIncometxt.setText(String.valueOf(""));
         netSalestxt.setText(String.valueOf(""));
         grossProfittxt.setText(String.valueOf(""));
         epstxt.setText(String.valueOf(""));
         netSalestxt2.setText(String.valueOf(""));
         netSalestxt3.setText(String.valueOf(""));
         avgTotalAssetstxt.setText(String.valueOf(""));
         netIncometxt2.setText(String.valueOf(""));
         avgTotalAssetstxt2.setText(String.valueOf(""));
         netIncometxt3.setText(String.valueOf(""));
         avgShareEqttxt.setText(String.valueOf(""));
         companyName.setText(String.valueOf(""));
         currentAssetstxt2.setText(String.valueOf(""));
         currentLiabtxt2.setText(String.valueOf(""));
         totalLiabtxt.setText(String.valueOf(""));
         totalAssetstxt.setText(String.valueOf(""));
         creditSalestxt.setText(String.valueOf(""));
         avgGrossRectxt.setText(String.valueOf(""));
         cogstxt.setText(String.valueOf(""));
         avgInvtxt.setText(String.valueOf(""));
         currentAssetstxt.setText(String.valueOf(""));
         currentLiabtxt.setText(String.valueOf(""));
         //epstxt.setText(String.valueOf(Calculations.netIncome));
        
    }//GEN-LAST:event_clearFeildsbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CompanyInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompanyInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompanyInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompanyInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompanyInput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel assetTurnoverPannel;
    private javax.swing.JTextField avgGrossRectxt;
    private javax.swing.JTextField avgInvtxt;
    private javax.swing.JTextField avgShareEqttxt;
    private javax.swing.JTextField avgTotalAssetstxt;
    private javax.swing.JTextField avgTotalAssetstxt2;
    private javax.swing.JButton clearFeildsbtn;
    private javax.swing.JTextField cogstxt;
    private javax.swing.JTextField companyName;
    private javax.swing.JButton confirmbtn;
    private javax.swing.JTextField creditSalestxt;
    private javax.swing.JTextField currentAssetstxt;
    private javax.swing.JTextField currentAssetstxt2;
    private javax.swing.JTextField currentLiabtxt;
    private javax.swing.JTextField currentLiabtxt2;
    private javax.swing.JTextField dividendtxt;
    private javax.swing.JTextField epstxt;
    private javax.swing.JLabel fractionbar1;
    private javax.swing.JLabel fractionbar10;
    private javax.swing.JLabel fractionbar11;
    private javax.swing.JLabel fractionbar12;
    private javax.swing.JLabel fractionbar13;
    private javax.swing.JLabel fractionbar14;
    private javax.swing.JLabel fractionbar2;
    private javax.swing.JLabel fractionbar5;
    private javax.swing.JLabel fractionbar6;
    private javax.swing.JLabel fractionbar7;
    private javax.swing.JLabel fractionbar8;
    private javax.swing.JLabel fractionbar9;
    private javax.swing.JLabel gpmText1;
    private javax.swing.JLabel gpmText10;
    private javax.swing.JLabel gpmText11;
    private javax.swing.JLabel gpmText12;
    private javax.swing.JLabel gpmText13;
    private javax.swing.JLabel gpmText2;
    private javax.swing.JLabel gpmText4;
    private javax.swing.JLabel gpmText5;
    private javax.swing.JLabel gpmText6;
    private javax.swing.JLabel gpmText7;
    private javax.swing.JLabel gpmText8;
    private javax.swing.JLabel gpmText9;
    private javax.swing.JPanel grossProfitMarginPannel;
    private javax.swing.JTextField grossProfittxt;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField marketSharePricetxt;
    private javax.swing.JLabel name;
    private javax.swing.JTextField netIncometxt;
    private javax.swing.JTextField netIncometxt2;
    private javax.swing.JTextField netIncometxt3;
    private javax.swing.JTextField netIncometxt4;
    private javax.swing.JTextField netSalestxt;
    private javax.swing.JTextField netSalestxt2;
    private javax.swing.JTextField netSalestxt3;
    private javax.swing.JPanel profitMarginPannel;
    private javax.swing.JLabel profitability1;
    private javax.swing.JPanel returnOnAssetsPannel;
    private javax.swing.JLabel title;
    private javax.swing.JMenuItem toF1fromF2;
    private javax.swing.JMenuItem toF3fromF3;
    private javax.swing.JTextField totalAssetstxt;
    private javax.swing.JTextField totalLiabtxt;
    // End of variables declaration//GEN-END:variables

    private void setLabel(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}