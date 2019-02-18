package com.flagofnepal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlagOfNepal extends JFrame
{
	public FlagOfNepal()
	{
		setSize(700,700);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		g.setColor(new Color(0,56,147));
		int[] x = {171,529,371,619,171};
		int[] y = {110,294,294,476,476};
		g.fillPolygon(x,y,5);
		g.setColor(new Color(226,20,60));
		int[] a = {190,461,311,568,190};
		int[] b = {140,279,279,461,461};
		g.fillPolygon(a,b,5);
		g.setColor(Color.white);
		g.fillOval(220,200,80,80);
		g.setColor(new Color(226,20,60));
		g.fillOval(220,185,80,80);
		g.setColor(Color.WHITE);
		int[] c = {228,234,241};
		int[] d = {249,236,249};
		g.setColor(Color.WHITE);
		g.fillOval( 220, 360, 80, 80 );
		



		
	}

	public static void main(String[] args)
    {

    FlagOfNepal gf = new FlagOfNepal();
    gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
