import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BgColor extends JFrame implements ActionListener
{

        JFrame f = new JFrame();
        JPanel p =new JPanel();
        JButton blue;
        JButton red;

    public BgColor()
    {
        blue = new JButton("Blue");
        p.add(blue);

        red = new JButton("Red");
        p.add(red);

        f.add(p);

        f.setSize(700,700);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        blue.addActionListener(this);
        red.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        
         if(e.getSource()==blue)
         {
            p.setBackground(Color.BLUE);
            f.add(p);
            
         }
         else
         {
            p.setBackground(Color.RED);
            f.add(p);
            
         }
    }
    public static void main(String[] args) {
        BgColor obj = new BgColor();
    }
}