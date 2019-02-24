import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UpperLowerCase extends JFrame implements ActionListener
{
    JFrame f;
    JPanel p;
    JButton upperCase ,lowerCase;
    JTextField t;
    public UpperLowerCase()
    {
        gui();
    }

    public void gui()
    {
        f = new JFrame();
        p =new JPanel();

        t = new JTextField(20);
        p.add(t);

        upperCase = new JButton("UpperCase");
        p.add(upperCase);

        lowerCase = new JButton("LowerCase");
        p.add(lowerCase);

        f.add(p);

        f.setVisible(true);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        upperCase.addActionListener(this);
        lowerCase.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==upperCase)
        {
            String s = t.getText();
            t.setText(s.toUpperCase());
        }
        else
        {
           
            String s = t.getText();
             t.setText(s.toLowerCase()); 
        }
    }
    public static void main(String[] args) {
        UpperLowerCase obj = new UpperLowerCase();
    }
}