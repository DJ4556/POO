
package view;

import modelView.Calculator;
import modelView.Operation;

public class trigoWindow extends javax.swing.JFrame {

    private String numberString;
    private String operation = "null";
    private double number, firstNumber, secondNumber, result;
    private boolean active = true;
    private boolean dot = true;
    
    static Window arit = new Window();
    static Hist his = new Hist();
    
    public trigoWindow() {
        
        initComponents();
        this.setTitle("Calculator");
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CButton = new javax.swing.JButton();
        CEButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        sumButton = new javax.swing.JButton();
        restButton = new javax.swing.JButton();
        piButton = new javax.swing.JButton();
        eButton = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eigth = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        arcsenButton = new javax.swing.JButton();
        senButton = new javax.swing.JButton();
        cscButton = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        arccosButton = new javax.swing.JButton();
        cosButton = new javax.swing.JButton();
        secButton = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        arctanButton = new javax.swing.JButton();
        tanButton = new javax.swing.JButton();
        cotButton = new javax.swing.JButton();
        signButton = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        dotButton = new javax.swing.JButton();
        equalButton = new javax.swing.JButton();
        numberLabel = new javax.swing.JLabel();
        showLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        aritmetica = new javax.swing.JButton();
        Historial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(234, 234));
        jPanel1.setPreferredSize(new java.awt.Dimension(581, 399));
        jPanel1.setLayout(new java.awt.GridLayout(5, 7));

        CButton.setBackground(new java.awt.Color(51, 51, 51));
        CButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        CButton.setForeground(new java.awt.Color(255, 255, 255));
        CButton.setText("C");
        CButton.setMaximumSize(new java.awt.Dimension(39, 39));
        CButton.setMinimumSize(new java.awt.Dimension(39, 39));
        CButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CButton);

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

        arcsenButton.setBackground(new java.awt.Color(51, 51, 51));
        arcsenButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        arcsenButton.setForeground(new java.awt.Color(255, 255, 255));
        arcsenButton.setText("arcsen");
        arcsenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arcsenButtonActionPerformed(evt);
            }
        });
        jPanel1.add(arcsenButton);

        senButton.setBackground(new java.awt.Color(51, 51, 51));
        senButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        senButton.setForeground(new java.awt.Color(255, 255, 255));
        senButton.setText("sen");
        senButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senButtonActionPerformed(evt);
            }
        });
        jPanel1.add(senButton);

        cscButton.setBackground(new java.awt.Color(51, 51, 51));
        cscButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        cscButton.setForeground(new java.awt.Color(255, 255, 255));
        cscButton.setText("csc");
        cscButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cscButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cscButton);

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

        arccosButton.setBackground(new java.awt.Color(51, 51, 51));
        arccosButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        arccosButton.setForeground(new java.awt.Color(255, 255, 255));
        arccosButton.setText("arccos");
        arccosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arccosButtonActionPerformed(evt);
            }
        });
        jPanel1.add(arccosButton);

        cosButton.setBackground(new java.awt.Color(51, 51, 51));
        cosButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        cosButton.setForeground(new java.awt.Color(255, 255, 255));
        cosButton.setText("cos");
        cosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cosButton);

        secButton.setBackground(new java.awt.Color(51, 51, 51));
        secButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        secButton.setForeground(new java.awt.Color(255, 255, 255));
        secButton.setText("sec");
        secButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secButtonActionPerformed(evt);
            }
        });
        jPanel1.add(secButton);

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

        arctanButton.setBackground(new java.awt.Color(51, 51, 51));
        arctanButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        arctanButton.setForeground(new java.awt.Color(255, 255, 255));
        arctanButton.setText("arctan");
        arctanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arctanButtonActionPerformed(evt);
            }
        });
        jPanel1.add(arctanButton);

        tanButton.setBackground(new java.awt.Color(51, 51, 51));
        tanButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        tanButton.setForeground(new java.awt.Color(255, 255, 255));
        tanButton.setText("tan");
        tanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanButtonActionPerformed(evt);
            }
        });
        jPanel1.add(tanButton);

        cotButton.setBackground(new java.awt.Color(51, 51, 51));
        cotButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        cotButton.setForeground(new java.awt.Color(255, 255, 255));
        cotButton.setText("cot");
        cotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cotButton);

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

        jPanel2.setPreferredSize(new java.awt.Dimension(481, 39));
        jPanel2.setLayout(new java.awt.GridLayout(1, 3));

        aritmetica.setBackground(new java.awt.Color(255, 51, 0));
        aritmetica.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        aritmetica.setText("Aritmética");
        aritmetica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aritmeticaActionPerformed(evt);
            }
        });
        jPanel2.add(aritmetica);

        Historial.setBackground(new java.awt.Color(255, 51, 0));
        Historial.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        Historial.setText("Historial");
        Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialActionPerformed(evt);
            }
        });
        jPanel2.add(Historial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(numberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void cscButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cscButtonActionPerformed
        
        if(active == true){
            
            firstNumber = this.getFirstNumber();
            showLabel.setText("csc(" + numberString + ")");
            numberString = "";
            operation = "csc";
            
            active = false;
            
        }
        
    }//GEN-LAST:event_cscButtonActionPerformed

    private void secButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secButtonActionPerformed
        
        if(active == true){
            
            firstNumber = this.getFirstNumber();
            showLabel.setText("sec(" + numberString + ")");
            numberString = "";
            operation = "sec";
            
            active = false;
            
        }
        
    }//GEN-LAST:event_secButtonActionPerformed

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
        }else if(operation.equals("sen")){
               
            result = Operation.Sen(firstNumber);
            numberLabel.setText(String.format("% .5f", result));
            numberString = String.valueOf(result);
            
            operation = "null";
            
            Calculator.save(result);
                
        }else if(operation.equals("cos")){
            
            result = Operation.Cos(firstNumber);
            numberLabel.setText(String.format("% .5f", result));
            numberString = String.valueOf(result);
            
            operation = "null";
            
            Calculator.save(result);
                
        }else if(operation.equals("tan")){
            
            result = Operation.Tan(firstNumber);
            numberLabel.setText(String.format("% .5f", result));
            numberString = String.valueOf(result);
            
            operation = "null";
            
            Calculator.save(result);
            
        }else if(operation.equals("cot")){
            
            result = Operation.Cot(firstNumber);
            numberLabel.setText(String.format("% .5f", result));
            numberString = String.valueOf(result);
            
            operation = "null";
            
            Calculator.save(result);
            
        }else if(operation.equals("sec")){
            
            result = Operation.Sec(firstNumber);
            numberLabel.setText(String.format("% .5f", result));
            numberString = String.valueOf(result);
            
            operation = "null";
            
            Calculator.save(result);
            
        }else if(operation.equals("csc")){
            
            result = Operation.Csc(firstNumber);
            numberLabel.setText(String.format("% .5f", result));
            numberString = String.valueOf(result);
            
            operation = "null";
            
            Calculator.save(result);
            
        }else if(operation.equals("arcsen")){
            
            result = Operation.Arcsen(firstNumber);
            numberLabel.setText(String.format("% .5f", result));
            numberString = String.valueOf(result);
            
            operation = "null";
            
            Calculator.save(result);
            
        }else if(operation.equals("arccos")){
            
            result = Operation.Arccos(firstNumber);
            numberLabel.setText(String.format("% .5f", result));
            numberString = String.valueOf(result);
            
            operation = "null";
            
            Calculator.save(result);
            
        }else if(operation.equals("arctan")){
            
            result = Operation.Arctan(firstNumber);
            numberLabel.setText(String.format("% .5f", result));
            numberString = String.valueOf(result);
            
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

    private void cosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosButtonActionPerformed
        
        if(active == true){
            
            firstNumber = this.getFirstNumber();
            showLabel.setText("cos(" + numberString + ")");
            numberString = "";
            operation = "cos";
            
            active = false;
            
        }
        
    }//GEN-LAST:event_cosButtonActionPerformed

    private void tanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanButtonActionPerformed
        
        if(active == true){
            
            firstNumber = this.getFirstNumber();
            showLabel.setText("tan(" + numberString + ")");
            numberString = "";
            operation = "tan";
            
            active = false;
            
        }
    }//GEN-LAST:event_tanButtonActionPerformed

    private void cotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cotButtonActionPerformed
        
        if(active == true){
            
            firstNumber = this.getFirstNumber();
            showLabel.setText("cot(" + numberString + ")");
            numberString = "";
            operation = "cot";
            
            active = false;
            
        }
        
    }//GEN-LAST:event_cotButtonActionPerformed

    private void senButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senButtonActionPerformed
        
        if(active == true){
            
            firstNumber = this.getFirstNumber();
            showLabel.setText("sen(" + numberString + ")");
            numberString = "";
            operation = "sen";
            
            active = false;
            
        }
        
    }//GEN-LAST:event_senButtonActionPerformed

    private void arcsenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arcsenButtonActionPerformed
        
        if(active == true){
            
            firstNumber = this.getFirstNumber();
            showLabel.setText("arcsen(" + numberString + ")");
            numberString = "";
            operation = "arcsen";
            
            active = false;
            
        }
        
    }//GEN-LAST:event_arcsenButtonActionPerformed

    private void arccosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arccosButtonActionPerformed
        
        if(active == true){
            
            firstNumber = this.getFirstNumber();
            showLabel.setText("arccos(" + numberString + ")");
            numberString = "";
            operation = "arccos";
            
            active = false;
            
        }
        
    }//GEN-LAST:event_arccosButtonActionPerformed

    private void arctanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arctanButtonActionPerformed
        
        if(active == true){
            
            firstNumber = this.getFirstNumber();
            showLabel.setText("arctan(" + numberString + ")");
            numberString = "";
            operation = "arctan";
            
            active = false;
            
        }
        
    }//GEN-LAST:event_arctanButtonActionPerformed

    private void aritmeticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aritmeticaActionPerformed
        
        arit.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_aritmeticaActionPerformed

    private void HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialActionPerformed
        
        his.setVisible(true);
        
    }//GEN-LAST:event_HistorialActionPerformed

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
            java.util.logging.Logger.getLogger(trigoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trigoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trigoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trigoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new trigoWindow().setVisible(true);
        });
    }
    
    public double getFirstNumber(){
        
        number = Double.parseDouble(numberString);
        return number;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CButton;
    private javax.swing.JButton CEButton;
    private javax.swing.JButton Historial;
    private javax.swing.JButton arccosButton;
    private javax.swing.JButton arcsenButton;
    private javax.swing.JButton arctanButton;
    private javax.swing.JButton aritmetica;
    private javax.swing.JButton cosButton;
    private javax.swing.JButton cotButton;
    private javax.swing.JButton cscButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton dotButton;
    private javax.swing.JButton eButton;
    private javax.swing.JButton eigth;
    private javax.swing.JButton equalButton;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton nine;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JButton one;
    private javax.swing.JButton piButton;
    private javax.swing.JButton restButton;
    private javax.swing.JButton secButton;
    private javax.swing.JButton senButton;
    private javax.swing.JButton seven;
    private javax.swing.JLabel showLabel;
    private javax.swing.JButton signButton;
    private javax.swing.JButton six;
    private javax.swing.JButton sumButton;
    private javax.swing.JButton tanButton;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
