
package view;

import modelView.Calculator;
import modelView.Operation;

public class Window extends javax.swing.JFrame {

    private String numberString;
    private String operation = "null";
    private double number, firstNumber, secondNumber, result;
    private boolean active = true;
    private boolean dot = true;
    
    static trigoWindow trigo = new trigoWindow();
    static Hist his = new Hist();
    
    public Window() {
        
        initComponents();
        this.setTitle("Calculator");
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CButton = new javax.swing.JButton();
        piButton = new javax.swing.JButton();
        eButton = new javax.swing.JButton();
        CEButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        expButton = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eigth = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        rootButton = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        sumButton = new javax.swing.JButton();
        logButton = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        restButton = new javax.swing.JButton();
        lnButton = new javax.swing.JButton();
        signButton = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        dotButton = new javax.swing.JButton();
        equalButton = new javax.swing.JButton();
        numberLabel = new javax.swing.JLabel();
        showLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        trigoButton = new javax.swing.JButton();
        historial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(5, 5));

        CButton.setBackground(new java.awt.Color(51, 51, 51));
        CButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        CButton.setForeground(new java.awt.Color(255, 255, 255));
        CButton.setText("C");
        CButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CButton);

        piButton.setBackground(new java.awt.Color(51, 51, 51));
        piButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        piButton.setForeground(new java.awt.Color(255, 255, 255));
        piButton.setText("π");
        piButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piButtonActionPerformed(evt);
            }
        });
        jPanel1.add(piButton);

        eButton.setBackground(new java.awt.Color(51, 51, 51));
        eButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        eButton.setForeground(new java.awt.Color(255, 255, 255));
        eButton.setText("e");
        eButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eButtonActionPerformed(evt);
            }
        });
        jPanel1.add(eButton);

        CEButton.setBackground(new java.awt.Color(51, 51, 51));
        CEButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        CEButton.setForeground(new java.awt.Color(255, 255, 255));
        CEButton.setText("CE");
        CEButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CEButton);

        divideButton.setBackground(new java.awt.Color(51, 51, 51));
        divideButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        divideButton.setForeground(new java.awt.Color(255, 255, 255));
        divideButton.setText("÷");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });
        jPanel1.add(divideButton);

        expButton.setBackground(new java.awt.Color(51, 51, 51));
        expButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        expButton.setForeground(new java.awt.Color(255, 255, 255));
        expButton.setText("x^y");
        expButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expButtonActionPerformed(evt);
            }
        });
        jPanel1.add(expButton);

        seven.setBackground(new java.awt.Color(102, 0, 0));
        seven.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        seven.setForeground(new java.awt.Color(255, 255, 255));
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        jPanel1.add(seven);

        eigth.setBackground(new java.awt.Color(102, 0, 0));
        eigth.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        eigth.setForeground(new java.awt.Color(255, 255, 255));
        eigth.setText("8");
        eigth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eigthActionPerformed(evt);
            }
        });
        jPanel1.add(eigth);

        nine.setBackground(new java.awt.Color(102, 0, 0));
        nine.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        nine.setForeground(new java.awt.Color(255, 255, 255));
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        jPanel1.add(nine);

        multiplyButton.setBackground(new java.awt.Color(51, 51, 51));
        multiplyButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        multiplyButton.setForeground(new java.awt.Color(255, 255, 255));
        multiplyButton.setText("×");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });
        jPanel1.add(multiplyButton);

        rootButton.setBackground(new java.awt.Color(51, 51, 51));
        rootButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        rootButton.setForeground(new java.awt.Color(255, 255, 255));
        rootButton.setText("y√(x)");
        rootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootButtonActionPerformed(evt);
            }
        });
        jPanel1.add(rootButton);

        four.setBackground(new java.awt.Color(102, 0, 0));
        four.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        four.setForeground(new java.awt.Color(255, 255, 255));
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        jPanel1.add(four);

        five.setBackground(new java.awt.Color(102, 0, 0));
        five.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        five.setForeground(new java.awt.Color(255, 255, 255));
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        jPanel1.add(five);

        six.setBackground(new java.awt.Color(102, 0, 0));
        six.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        six.setForeground(new java.awt.Color(255, 255, 255));
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        jPanel1.add(six);

        sumButton.setBackground(new java.awt.Color(51, 51, 51));
        sumButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        sumButton.setForeground(new java.awt.Color(255, 255, 255));
        sumButton.setText("+");
        sumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sumButton);

        logButton.setBackground(new java.awt.Color(51, 51, 51));
        logButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        logButton.setForeground(new java.awt.Color(255, 255, 255));
        logButton.setText("log");
        logButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logButton);

        one.setBackground(new java.awt.Color(102, 0, 0));
        one.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        one.setForeground(new java.awt.Color(255, 255, 255));
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        jPanel1.add(one);

        two.setBackground(new java.awt.Color(102, 0, 0));
        two.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        two.setForeground(new java.awt.Color(255, 255, 255));
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        jPanel1.add(two);

        three.setBackground(new java.awt.Color(102, 0, 0));
        three.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        three.setForeground(new java.awt.Color(255, 255, 255));
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        jPanel1.add(three);

        restButton.setBackground(new java.awt.Color(51, 51, 51));
        restButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        restButton.setForeground(new java.awt.Color(255, 255, 255));
        restButton.setText("-");
        restButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restButtonActionPerformed(evt);
            }
        });
        jPanel1.add(restButton);

        lnButton.setBackground(new java.awt.Color(51, 51, 51));
        lnButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        lnButton.setForeground(new java.awt.Color(255, 255, 255));
        lnButton.setText("ln");
        lnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnButtonActionPerformed(evt);
            }
        });
        jPanel1.add(lnButton);

        signButton.setBackground(new java.awt.Color(51, 51, 51));
        signButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        signButton.setForeground(new java.awt.Color(255, 255, 255));
        signButton.setText("+/-");
        signButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signButtonActionPerformed(evt);
            }
        });
        jPanel1.add(signButton);

        zero.setBackground(new java.awt.Color(102, 0, 0));
        zero.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        zero.setForeground(new java.awt.Color(255, 255, 255));
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        jPanel1.add(zero);

        dotButton.setBackground(new java.awt.Color(51, 51, 51));
        dotButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        dotButton.setForeground(new java.awt.Color(255, 255, 255));
        dotButton.setText(".");
        dotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotButtonActionPerformed(evt);
            }
        });
        jPanel1.add(dotButton);

        equalButton.setBackground(new java.awt.Color(255, 51, 0));
        equalButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        equalButton.setText("=");
        equalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalButtonActionPerformed(evt);
            }
        });
        jPanel1.add(equalButton);

        numberLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        numberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numberLabel.setText("0");

        showLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        showLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jPanel2.setLayout(new java.awt.GridLayout(1, 3));

        trigoButton.setBackground(new java.awt.Color(255, 51, 0));
        trigoButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        trigoButton.setText("Trigonometría");
        trigoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trigoButtonActionPerformed(evt);
            }
        });
        jPanel2.add(trigoButton);

        historial.setBackground(new java.awt.Color(255, 51, 0));
        historial.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        historial.setText("Historial");
        historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialActionPerformed(evt);
            }
        });
        jPanel2.add(historial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        
        if(numberLabel.getText().equals("0")){
            numberString = "0";
        }else{
            numberString += "0";
        }
        
        numberLabel.setText(numberString);
        active = true;
        
    }//GEN-LAST:event_zeroActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        
        if(numberLabel.getText().equals("0")){
            numberString = "1";
        }else{
            numberString += "1";
        }
        
        numberLabel.setText(numberString);
        active = true;
        
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        
        if(numberLabel.getText().equals("0")){
            numberString = "2";
        }else{
            numberString += "2";
        }
        
        numberLabel.setText(numberString);
        active = true;
        
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        
        if(numberLabel.getText().equals("0")){
            numberString = "3";
        }else{
            numberString += "3";
        }
        
        numberLabel.setText(numberString);
        active = true;
        
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        
        if(numberLabel.getText().equals("0")){
            numberString = "4";
        }else{
            numberString += "4";
        }
        
        numberLabel.setText(numberString);
        active = true;
        
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        
        if(numberLabel.getText().equals("0")){
            numberString = "5";
        }else{
            numberString += "5";
        }
        
        numberLabel.setText(numberString);
        active = true;
        
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        
        if(numberLabel.getText().equals("0")){
            numberString = "6";
        }else{
            numberString += "6";
        }
        
        numberLabel.setText(numberString);
        active = true;
        
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        
        if(numberLabel.getText().equals("0")){
            numberString = "7";
        }else{
            numberString += "7";
        }
        
        numberLabel.setText(numberString);
        active = true;
        
    }//GEN-LAST:event_sevenActionPerformed

    private void eigthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eigthActionPerformed
        
        if(numberLabel.getText().equals("0")){
            numberString = "8";
        }else{
            numberString += "8";
        }
        
        numberLabel.setText(numberString);
        active = true;
        
    }//GEN-LAST:event_eigthActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        
        if(numberLabel.getText().equals("0")){
            numberString = "9";
        }else{
            numberString += "9";
        }
        
        numberLabel.setText(numberString);
        active = true;
        
    }//GEN-LAST:event_nineActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        
        if(active == true){
            
            firstNumber = this.getFirstNumber();
            showLabel.setText(numberString + " ÷ ");
            numberString = "";
            operation = "dvt";
            
            active = false;
            
        }
    }//GEN-LAST:event_divideButtonActionPerformed

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        
        if(active == true){
            
            firstNumber = this.getFirstNumber();
            showLabel.setText(numberString + " × ");
            numberString = "";
            operation = "mult";
            
            active = false;
            
        }
        
    }//GEN-LAST:event_multiplyButtonActionPerformed

    private void sumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumButtonActionPerformed
        
        if(active == true){
            
            firstNumber = this.getFirstNumber();
            showLabel.setText(numberString + " + ");
            numberString = "";
            operation = "sum";
            
            active = false;
            
        }
        
    }//GEN-LAST:event_sumButtonActionPerformed

    private void restButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restButtonActionPerformed
        
        if(active == true){
            
            firstNumber = this.getFirstNumber();
            showLabel.setText(numberString + " - ");
            numberString = "";
            operation = "rest";
            
            active = false;
            
        }
        
    }//GEN-LAST:event_restButtonActionPerformed

    private void rootButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootButtonActionPerformed
        
        if(active == true){
            
            firstNumber = this.getFirstNumber();
            showLabel.setText(" √ " + numberString);
            numberString = "";
            operation = "root";
            
            active = false;
            
        }
        
    }//GEN-LAST:event_rootButtonActionPerformed

    private void expButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expButtonActionPerformed
        
        if(active == true){
            
            firstNumber = this.getFirstNumber();
            showLabel.setText(numberString + " ^ ");
            numberString = "";
            operation = "exp";
            
            active = false;
            
        }
        
    }//GEN-LAST:event_expButtonActionPerformed

    private void logButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logButtonActionPerformed
        
        if(active == true){
            
            firstNumber = this.getFirstNumber();
            showLabel.setText("log(" + numberString + ")");
            numberString = "";
            operation = "log";
            
            active = false;
            
        }
        
    }//GEN-LAST:event_logButtonActionPerformed

    private void lnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnButtonActionPerformed
        
        if(active == true){
            
            firstNumber = this.getFirstNumber();
            showLabel.setText("ln(" + numberString + ")");
            numberString = "";
            operation = "ln";
            
            active = false;
            
        }
        
    }//GEN-LAST:event_lnButtonActionPerformed

    @SuppressWarnings("ConvertToStringSwitch")
    private void equalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalButtonActionPerformed
        
         if(operation.equals("null")){
            
            numberLabel.setText(numberString);
            
        }else if(operation.equals("sum")){
            
            secondNumber = Double.parseDouble(numberString);
            result = Operation.Sum(firstNumber, secondNumber);
            numberLabel.setText(String.format("% .5f", result));
            numberString = String.valueOf(result);
            showLabel.setText(firstNumber + " + " + secondNumber);
            
            operation = "null";
            
            Calculator.save(result);
            
        }else if(operation.equals("mult")){
            
            secondNumber = Double.parseDouble(numberString);
            result = Operation.Multiply(firstNumber, secondNumber);
            numberLabel.setText(String.format("% .5f", result));
            numberString = String.valueOf(result);
            showLabel.setText(firstNumber + " × " + secondNumber);
            
            operation = "null";
            
            Calculator.save(result);
            
        }else if(operation.equals("rest")){
            
            secondNumber = Double.parseDouble(numberString);
            result = Operation.Rest(firstNumber, secondNumber);
            numberLabel.setText(String.format("% .5f", result));
            numberString = String.valueOf(result);
            showLabel.setText(firstNumber + " - " + secondNumber);
            
            operation = "null";
            
            Calculator.save(result);
            
        }else if(operation.equals("dvt")){
            
            secondNumber = Double.parseDouble(numberString);
            
            if(secondNumber == 0){
                
                numberLabel.setText("Math ERROR");
                
            }else{
               
                result = Operation.Divide(firstNumber, secondNumber);
                numberLabel.setText(String.format("% .5f", result));
                numberString = String.valueOf(result);
                showLabel.setText(firstNumber + " ÷ " + secondNumber);
                
                operation = "null";
                
                Calculator.save(result);
                
            }      
        }else if(operation.equals("root")){
            
            secondNumber = Double.parseDouble(numberString);
            
            if(firstNumber < 0){
                
                numberLabel.setText("Math ERROR");
                
            }else{
               
                result = Operation.Root(firstNumber, secondNumber);
                numberLabel.setText(String.format("% .5f", result));
                numberString = String.valueOf(result);
                showLabel.setText(secondNumber + " √ " + firstNumber);
            
                operation = "null";
                
                Calculator.save(result);
                
            }      
        }else if(operation.equals("log")){
            
            if(firstNumber <= 0){
                
                numberLabel.setText("Math ERROR");
                
            }else{
               
                result = Operation.Log(firstNumber);
                numberLabel.setText(String.format("% .5f", result));
                numberString = String.valueOf(result);
            
                operation = "null";
                
                Calculator.save(result);
                
            }      
        }else if(operation.equals("ln")){
            
            if(firstNumber <= 0){
                
                numberLabel.setText("Math ERROR");
                
            }else{
               
                result = Operation.ln(firstNumber);
                numberLabel.setText(String.format("% .5f", result));
                numberString = String.valueOf(result);
            
                operation = "null";
                
                Calculator.save(result);
                
            }      
        }else if(operation.equals("exp")){
            
            secondNumber = Double.parseDouble(numberString);
            result = Operation.Exp(firstNumber, secondNumber);
            numberLabel.setText(String.format("% .5f", result));
            numberString = String.valueOf(result);
            showLabel.setText(firstNumber + " ^ " + secondNumber);
            
            operation = "null";
            
            Calculator.save(result);
            
        }
    }//GEN-LAST:event_equalButtonActionPerformed

    private void dotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotButtonActionPerformed
        
        if(dot == true){
            
            if(numberString.equals("")){
                
                numberString = "0.";
                
            }else{
                
                numberString += ".";
                
            }
            
            numberLabel.setText(numberString);
            dot = false;
            
        }
    }//GEN-LAST:event_dotButtonActionPerformed

    private void signButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signButtonActionPerformed
        
        if(numberString.charAt(0) != '-'){
            
            numberString = "-" + numberString;
            
        }else{
            
            numberString = numberString.substring(1, numberString.length());
            
        }
        
        numberLabel.setText(numberString);
        
    }//GEN-LAST:event_signButtonActionPerformed

    private void CButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CButtonActionPerformed
        
        showLabel.setText("");
        numberLabel.setText("0");
        numberString = "";
        
        operation = "null";
        active = true;
        dot = true;
        
    }//GEN-LAST:event_CButtonActionPerformed

    private void CEButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEButtonActionPerformed
        
        int size = numberString.length();
        
        if (size > 0){
            
            if (size==0){
                
                numberString = "0";
                
            }else{
            
            numberString = numberString.substring(0, numberString.length()-1);
            
            }
        
            numberLabel.setText(numberString);
        
        }
    }//GEN-LAST:event_CEButtonActionPerformed

    private void piButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piButtonActionPerformed
        
        if(numberLabel.getText().equals("0")){
            numberString = "π";
        }
        
        numberLabel.setText(numberString);
        numberString = "3.141592654";
        active = true;
        
    }//GEN-LAST:event_piButtonActionPerformed

    private void eButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eButtonActionPerformed
        
        if(numberLabel.getText().equals("0")){
            numberString = "e";
        }
        
        numberLabel.setText(numberString);
        numberString = "2.718281828";
        active = true;
        
    }//GEN-LAST:event_eButtonActionPerformed

    private void trigoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trigoButtonActionPerformed
        
        trigo.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_trigoButtonActionPerformed

    private void historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialActionPerformed
        
        his.setVisible(true);
        
    }//GEN-LAST:event_historialActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new Window().setVisible(true);
        });
    }
    
    public double getFirstNumber(){
        
        number = Double.parseDouble(numberString);
        return number;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CButton;
    private javax.swing.JButton CEButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton dotButton;
    private javax.swing.JButton eButton;
    private javax.swing.JButton eigth;
    private javax.swing.JButton equalButton;
    private javax.swing.JButton expButton;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton historial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton lnButton;
    private javax.swing.JButton logButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton nine;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JButton one;
    private javax.swing.JButton piButton;
    private javax.swing.JButton restButton;
    private javax.swing.JButton rootButton;
    private javax.swing.JButton seven;
    private javax.swing.JLabel showLabel;
    private javax.swing.JButton signButton;
    private javax.swing.JButton six;
    private javax.swing.JButton sumButton;
    private javax.swing.JButton three;
    private javax.swing.JButton trigoButton;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
