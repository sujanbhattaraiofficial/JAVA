import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ActionEvent extends JFrame implements ActionListener {
	JPanel p;
	JFrame f;
	JTextField t;
	JButton b;

	public ActionEvent()
	{
		gui();
	}
	
	public void gui()
	{
		f = new JFrame();
		p = new JPanel();
		
		t = new JTextField(20);
		t.setEditable(false);
		p.add(t);

		b = new JButton("CLick Here");
		p.add(b);
		
		
		f.setVisible(true);
		f.setSize(300,300);
		f.add(p);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.addActionListener(this);
		
		
	}

	public static void main(String[] args) {
		new ActionEvent();

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		t.setText("Welcome");
		
	}

	



}