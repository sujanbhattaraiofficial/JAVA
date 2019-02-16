
import java.awt.*;
import java.awt.event.*;

public class MouseEventHandling extends Frame implements MouseListener{
	int x=0 , y=0;
	String s =" ";
	
	public MouseEventHandling()
	{
		gui();
		
	}
	
	public void gui()
	{
		
		setVisible(true);
		setSize(300,300);
		addMouseListener(this);
		addWindowListener(new MyWindowAdapter(this));
		
	}
	public static void main(String[] args) {
		MouseEventHandling obj = new MouseEventHandling();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		s="mouseClicked";
		repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		s="mouseEntered";
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		s="mouseExited";
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		s="mousePressed";
		repaint();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		s="mouseReleased";
		repaint();
		
	}
	
	public void paint(Graphics g)
	{
		g.drawString(s + "Mouse Event at"+ " " +x+ " " +y, 70, 60);
	}

}

class MyWindowAdapter extends WindowAdapter{
	
	MouseEventHandling obj = null;
	
	MyWindowAdapter(MouseEventHandling obj){
		this.obj = obj;
	}
	
	public void windowClosing(WindowEvent we){
		obj.dispose();
	}
}
