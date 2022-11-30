package Java_Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student_mark {
    private JTextField textstudentname;
    private JTextField textmark1;
    private JTextField textmark2;
    private JTextField textmark3;
    private JTextField textmark4;
    private JTextField textavg;
    private JTextField texttotal;
    private JTextField textgrade;
    private JButton calButton;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student_mark");
        frame.setContentPane(new Student_mark().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student_mark() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int m1,m2,m3,m4,total;
                double avg;
                String s;
                s=String.valueOf(textstudentname);
                m1=Integer.parseInt(textmark1.getText());
                m2=Integer.parseInt(textmark2.getText());
                m3=Integer.parseInt(textmark3.getText());
                m4=Integer.parseInt(textmark4.getText());
                total=m1+m2+m3+m4;
                texttotal.setText(String.valueOf(total));
                avg=(m1+m2+m3+m4)/4;
                textavg.setText(String.valueOf(avg));
                if(avg>=50){
                    textgrade.setText("Pass");
                }
                else{
                    textgrade.setText("Fail");
                }

            }

        });
    }
}
