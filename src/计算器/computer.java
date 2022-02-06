package 计算器;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class computer extends JFrame implements ActionListener {
    JButton b0;
    JPanel panel1, panel2;
    TextField text1;

    public static void main(String[] args) {
        computer jframe = new computer();
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }

    public computer() {
        setTitle("计算器");
        setLocation(500, 500);
        setSize(300, 320);

        Dimension dm = new Dimension(50, 50);
        Dimension tx = new Dimension(210, 40);

        panel1 = new JPanel();
        panel2 = new JPanel();

        text1 = new TextField();
        text1.setFont(new Font("", Font.BOLD, 30));
        text1.setPreferredSize(tx);

        b0 = new JButton("C");
        b0.setPreferredSize(new Dimension(50, 40));
        b0.addActionListener(this);

        panel1.add(text1);
        panel1.add(b0);

        String S = "789+456-123*0.=/";
        panel2.setLayout(new GridLayout(4, 4));

        for (int i = 0; i < 16; i++) {
            String temp = S.substring(i, i + 1);
            JButton bt = new JButton();
            bt.setText(temp);
            bt.setPreferredSize(dm);
            bt.addActionListener(this);
            panel2.add(bt);
        }

        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);

    }

    String num1 = "";
    String num2 = "";
    String operator = "";

    public void actionPerformed(ActionEvent e) {

        String click = e.getActionCommand();
        if ("C".contains(click))
            text1.setText("");
        else if (".0123456789".contains(click)) text1.setText(text1.getText() + click);
        else if ("+-*/".contains(click)) {
            num1 = text1.getText();
            operator = click;
            text1.setText("");
        } else if ("=".contains(click)) {
            num2 = text1.getText();
            Double a = Double.valueOf(num1);
            Double b = Double.valueOf(num2);
            System.out.println(a);
            System.out.println(b);
            System.out.println(operator);
            Double R = null;
            switch (operator) {
                case "+":
                    R = a + b;
                    break;

                case "-":
                    R = a - b;
                    break;
                case "*":
                    R = a * b;
                    break;
                case "/":
                    R = a / b;
                    break;
                default:
                    break;
            }
            assert R != null;
            text1.setText(R.toString());
        }
    }

}
