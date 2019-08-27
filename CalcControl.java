package lab_0502_MVC_week10;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcControl implements ActionListener, KeyEventDispatcher {
//MVC裡面的Controller -- 處理監聽
    //計算機核心 與 casio 畫面
    private CasioForm casio;
    private CalcCore core;

    //跟輸出有關的元件display, display2
    //跟監聽有關的元件
    private JPanel panelBtnArea;
    private JTextField display;
    private JTextField display2;

    public CalcControl() {
        //建構子

        casio = new CasioForm();
        casio.setVisible(true);
        //取得jPanelBtns, display, display2元件
        panelBtnArea = casio.getPanel();
        display = casio.getSharedDisplay();
        display2 = casio.getSharedDisplay2();

        //把display display2 指定給計算機核心物件
        core = new CalcCore();
        core.setSharedDisplay(display);   //display丟進core
        core.setSharedDisplay2(display2);  //display2丟進core

        for (Object obj : panelBtnArea.getComponents()) {
            if (obj instanceof JButton) {
                JButton btn = (JButton) obj;
                btn.addActionListener(this);
            }
        }

        //把keyEventDispatcher加入到KeyboardFocusManager中，依我們的方式去處理鍵盤事件
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String btnName = ae.getActionCommand();
        System.out.println("action:" + btnName);
        
        switch (btnName) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                core.setDigit(btnName);
                break;
            case "+":
                core.setOperator("+");
                break;
            case "-":
                core.setOperator("-");
                break;
            case "*":
                core.setOperator("*");
                break;
            case "/":
                core.setOperator("/");
                break;
            case "=":
                core.setOperator("=");
                break;
            case "CE":
                core.clearEntry();
                break;
            case "C":
                core.clearAll();
                break;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent ke) {
        //System.out.println(ke);
        //System.out.println("keyCode:" + ke.getKeyCode());
        //System.out.println("KeyCode代表的名字:" + KeyEvent.getKeyText(ke.getKeyCode()));
        //System.out.println("KeyChar:" + ke.getKeyChar());

        if (ke.getID() == KeyEvent.KEY_PRESSED) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                core.setOperator("=");
            }
        } else if (ke.getID() == KeyEvent.KEY_TYPED) {
            String k = String.format("%c", ke.getKeyChar());
            System.out.println(k);
            switch (k) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    core.setDigit(k);
                    break;
                case ".":
                    core.setDot();
                    break;
                case "+":
                    core.setOperator("+");
                    break;
                case "-":
                    core.setOperator("-");
                    break;
                case "*":
                    core.setOperator("*");
                    break;
                case "/":
                    core.setOperator("/");
                    break;
                case "=":
                    core.setOperator("=");
                    break;
                default:
                    break;
            }
        }
        // return true or false 對我們的功能沒有影響
        // Pass the KeyEvent to the next KeyEventDispatcher in the chain
        return false;
    }

    public static void main(String[] args) {
        new CalcControl();
    }

}
