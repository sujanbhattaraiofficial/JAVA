import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiCasting extends JFrame implements ActionListener{
	JFrame f ;
	JButton newWindow;
	JButton closeAll;
	JPanel p;
	static int count=0;
	
     public MultiCasting()
     {
    	 gui();
     }
     
     public void gui()
     {
    	 p = new JPanel();
    	 f = new JFrame();
    	 newWindow = new JButton("New Window");
    	 closeAll = new JButton("Close All Window");
    	 p.add(newWindow);
    	 p.add(closeAll);
    	 f.setSize(700,700);
    	 f.setVisible(true);
    	 f.add(p);
    	 newWindow.addActionListener(this);
     }

	@Override
	public void actionPerformed(ActionEvent e) {
		CloseFrame cf = new CloseFrame();
		JFrame f1 = new JFrame();
		count++;
		f1.setSize(500,500);
		f1.setVisible(true);
		f1.setTitle("Window"+count);
		f1.setLocation(40*count,40*count);
		closeAll.addActionListener(cf);
		
		
	}
	
	public static void main(String[] args) {
		MultiCasting obj = new MultiCasting();
	}
	

}

class CloseFrame extends JFrame implements ActionListener
{

	
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		
		
	}
	
}

