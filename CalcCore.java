package lab_0502_MVC_week10;

import java.text.DecimalFormat;
import javax.swing.JTextField;

public class CalcCore {
//MVC裡面的Model --處理核心功能
    private JTextField display;
    private JTextField display2;

    private boolean start = true;  //輸入一個數之後，將數字黏起來用，判斷用
    private double total = 0;   //每一個階段運算後的結果都會累計到並放到total
    private char previous_operator = '=';  //char 字元
    //紀錄使用者按下的運算子按鈕 +-*/= 初值設定為'='等號

    private final int PRECISION = 10;  // 精度   
    private final DecimalFormat formatter = new DecimalFormat();
    //DecimalFormat 調整數字格式
    
    
    public CalcCore() {
        formatter.setMaximumFractionDigits(PRECISION);    //用多少就是小數後取幾位
        formatter.setGroupingUsed(false);   //不要讓三個位數一個逗點顯示

    }
    
    
    
    //寫好顯示畫面數字display, display2的設定程式，開放給控制程式使用
    public void setSharedDisplay(JTextField display) {
        //等於這邊的display
        this.display = display;
    }

    
    public void setSharedDisplay2(JTextField display2) {

        this.display2 = display2;
    }

    public void setDigit(String digit) {
        if (start) {
            display.setText(digit);//當第一個數字輸入時start=true，這時只要將此第一個數字直接顯示在dispaly即可，第二個以後的數字要黏起來，要用下面else的指令才能辦到
            start = false;//第二個以後的數字要黏起來，把start = false 就可以去執行else的指令
        } else {
            display.setText(display.getText() + digit);//將digit數字與前面的已經輸入的數字合併起來形成新的兩位數以上的數字
        }
    }

    
    
    public void setDot() {
        if (start) {
            display.setText("0.");
            start = false;
        } else {
            display.setText(display.getText() + ".");
        }
    }

    
    
    public void setOperator(String opr) {
        //使用者按下運算子按鈕+-*/=時，就是要執行運算，前一次的運算子被紀錄在previous_operator

        double number = Double.parseDouble(display.getText());
        display2.setText(display2.getText() + display.getText());

        switch (previous_operator) {
            case '+': //若是previous_operator是'+'，就要執行加法
                total += number;
                break;
            case '-':
                total -= number;
                break;
            case '*':
                total *= number;
                break;
            case '/':
                total /= number;
                break;
            case '=':
                total = number;
                break;
            default:
                break;
        }
        display.setText(formatter.format(total));//把數字轉成文字
        start = true;
        if (opr.equals("=")) {
            display2.setText("");
        } else {
            display2.setText(display2.getText() + opr);
        }
        previous_operator = opr.charAt(0);

    }

    
    public void clearEntry() {
        display.setText("0");
        start = true;
    }

    
    public void clearAll() {
        display.setText("0");
        display2.setText("");
        start = true;
        previous_operator = '=';
        total = 0;
    }

    /*
    public static void main(String[] args) {
        
    }
     */
}
