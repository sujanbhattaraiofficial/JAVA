import javax.swing.*;

import java.awt.*;

class Frame
{
    private JFrame f;
    private JPanel p;
    private  JLabel l;
    private JButton b;


     public void Frame()
    {
    	gui();
    }

    public void gui()
    {
    	f = new JFrame("Welcome");
    	f.setVisible(true);
    	f.setSize(600,400);
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p = new JPanel();
        p.setBackground(Color.GREEN);
        
        l = new JLabel("Sujan Bhattarai");
        b = new JButton("GoTo");
        
        p.add(l);
        p.add(b);
        
        f.add(p);
    	
    }
    
    public static void main(String[] args){
           Frame obj =  new Frame();
    }
}