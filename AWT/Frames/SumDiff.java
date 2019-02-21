import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SumDiff extends JFrame implements ActionListener
{
	JFrame f;
	JPanel p;
	JTextField t1;
	JTextField t2;
	JTextField result;
	JButton sum;
	JButton diff;
	
     public SumDiff() 
	{
		f = new JFrame();
		p = new JPanel();
		
		t1 = new JTextField(20);
		p.add(t1);
		
		t2 = new JTextField(20);
		p.add(t2);
		
		result = new JTextField(20);
		result.setEditable(false);
		p.add(result);
		
		sum = new JButton("SUM");
		p.add(sum);
		
		diff = new JButton("DIff");
		p.add(diff);

		f.add(p);
		
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sum.addActionListener(this);
		diff.addActionListener(this);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sum) {
		int a = Integer.parseInt(t1.getText());
		int b = Integer.parseInt(t2.getText());
		int summ = a + b;
		 result.setText(summ+"");
		}
		else
		{
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			int diff = a - b;
			 result.setText(diff+"");
		}
		
	}
	public static void main(String[] args) {
		SumDiff obj = new SumDiff();
	}
	
}
