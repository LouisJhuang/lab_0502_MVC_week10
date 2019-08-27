
package lab_0502_MVC_week10;

import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CasioForm extends javax.swing.JFrame {
/**
 * 計算機Form
 */
//MVC裡面的View
    public CasioForm() {
        initComponents();
        
        //確認改風格用，原本例外情況有許多種
        //在GUI這邊設定用任何風格的話，效果會打折扣
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //如果採用windows風格，滑鼠最後一下按鍵，會對應鍵盤的enter  要特別注意
            
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            //Nimbus 風格
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }

    
    
    public JPanel getPanel(){
        //回傳值為 JPanel
        //回傳jPanelDigitArea用
        return  jPanelDigitArea;
    }
    
    
    public JTextField getSharedDisplay(){
        //回傳值為 JPanel
        //回傳jPanelDigitArea用
        return this.display;
    }
    
    
    public JTextField getSharedDisplay2(){
        //回傳值為 JTextField
        //回傳display2用
        return this.display2;
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDigitArea = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnMutiplier = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        display2 = new javax.swing.JTextField();
        display = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelDigitArea.setLayout(new java.awt.GridLayout(5, 4));

        jButton19.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton19.setBorderPainted(false);
        jButton19.setEnabled(false);
        jButton19.setFocusable(false);
        jPanelDigitArea.add(jButton19);

        btnC.setFont(new java.awt.Font("微軟正黑體", 1, 28)); // NOI18N
        btnC.setText("C");
        btnC.setBorderPainted(false);
        jPanelDigitArea.add(btnC);

        btnCE.setFont(new java.awt.Font("微軟正黑體", 1, 28)); // NOI18N
        btnCE.setText("CE");
        btnCE.setBorderPainted(false);
        jPanelDigitArea.add(btnCE);

        jButton18.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton18.setBorderPainted(false);
        jButton18.setEnabled(false);
        jPanelDigitArea.add(jButton18);

        btn7.setFont(new java.awt.Font("微軟正黑體", 1, 28)); // NOI18N
        btn7.setText("7");
        btn7.setBorderPainted(false);
        jPanelDigitArea.add(btn7);

        btn8.setFont(new java.awt.Font("微軟正黑體", 1, 28)); // NOI18N
        btn8.setText("8");
        btn8.setBorderPainted(false);
        jPanelDigitArea.add(btn8);

        btn9.setFont(new java.awt.Font("微軟正黑體", 1, 28)); // NOI18N
        btn9.setText("9");
        btn9.setBorderPainted(false);
        jPanelDigitArea.add(btn9);

        btnPlus.setFont(new java.awt.Font("微軟正黑體", 1, 28)); // NOI18N
        btnPlus.setText("+");
        btnPlus.setBorderPainted(false);
        jPanelDigitArea.add(btnPlus);

        btn4.setFont(new java.awt.Font("微軟正黑體", 1, 28)); // NOI18N
        btn4.setText("4");
        btn4.setBorderPainted(false);
        jPanelDigitArea.add(btn4);

        btn5.setFont(new java.awt.Font("微軟正黑體", 1, 28)); // NOI18N
        btn5.setText("5");
        btn5.setBorderPainted(false);
        jPanelDigitArea.add(btn5);

        btn6.setFont(new java.awt.Font("微軟正黑體", 1, 28)); // NOI18N
        btn6.setText("6");
        btn6.setBorderPainted(false);
        jPanelDigitArea.add(btn6);

        btnMinus.setFont(new java.awt.Font("微軟正黑體", 1, 28)); // NOI18N
        btnMinus.setText("-");
        btnMinus.setBorderPainted(false);
        jPanelDigitArea.add(btnMinus);

        btn1.setFont(new java.awt.Font("微軟正黑體", 1, 28)); // NOI18N
        btn1.setText("1");
        btn1.setBorderPainted(false);
        jPanelDigitArea.add(btn1);

        btn2.setFont(new java.awt.Font("微軟正黑體", 1, 28)); // NOI18N
        btn2.setText("2");
        btn2.setBorderPainted(false);
        jPanelDigitArea.add(btn2);

        btn3.setFont(new java.awt.Font("微軟正黑體", 1, 28)); // NOI18N
        btn3.setText("3");
        btn3.setBorderPainted(false);
        jPanelDigitArea.add(btn3);

        btnMutiplier.setFont(new java.awt.Font("微軟正黑體", 1, 28)); // NOI18N
        btnMutiplier.setText("*");
        btnMutiplier.setBorderPainted(false);
        jPanelDigitArea.add(btnMutiplier);

        btn0.setFont(new java.awt.Font("微軟正黑體", 1, 28)); // NOI18N
        btn0.setText("0");
        btn0.setBorderPainted(false);
        jPanelDigitArea.add(btn0);

        btnDot.setFont(new java.awt.Font("微軟正黑體", 1, 28)); // NOI18N
        btnDot.setText(".");
        btnDot.setBorderPainted(false);
        jPanelDigitArea.add(btnDot);

        btnEqual.setFont(new java.awt.Font("微軟正黑體", 1, 28)); // NOI18N
        btnEqual.setText("=");
        btnEqual.setBorderPainted(false);
        jPanelDigitArea.add(btnEqual);

        btnDivide.setFont(new java.awt.Font("微軟正黑體", 1, 28)); // NOI18N
        btnDivide.setText("/");
        btnDivide.setBorderPainted(false);
        jPanelDigitArea.add(btnDivide);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "casio", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微軟正黑體", 0, 14))); // NOI18N
        jPanel2.setLayout(new java.awt.GridLayout(2, 0));

        display2.setEditable(false);
        display2.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        display2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(display2);

        display.setEditable(false);
        display.setFont(new java.awt.Font("微軟正黑體", 1, 30)); // NOI18N
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setText("0");
        display.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(display);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDigitArea, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDigitArea, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
/*
    //小main刪掉  因為這邊要程式跟gui分開做
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CasioForm().setVisible(true);
            }
        });
    }
*/

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMutiplier;
    private javax.swing.JButton btnPlus;
    private javax.swing.JTextField display;
    private javax.swing.JTextField display2;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelDigitArea;
    // End of variables declaration//GEN-END:variables
}
