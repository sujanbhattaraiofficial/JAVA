
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InsertValuesUsingAwt extends JFrame implements ActionListener {
	
	 JTextField username1;
	 JPasswordField password1;
	JButton passQuery;
	JFrame f;
	
	public InsertValuesUsingAwt()
	{
		gui();
	}
	public void gui()
	{
		f=new JFrame();
		JPanel p = new JPanel();
		
		username1 = new JTextField(20);
		p.add(username1);
		
		password1 = new JPasswordField(20);
		p.add(password1);
		password1.setEchoChar('*');
		
		passQuery = new JButton("passQuery");
		p.add(passQuery);
		f.add(p);
		
		f.setVisible(true);
		f.setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		passQuery.addActionListener(this);
		
	}
	
	
	

	public static void main(String[] args) {
		InsertValuesUsingAwt onbj = new InsertValuesUsingAwt();
		
		
		
		
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Connection myConn = null;
        PreparedStatement myStmt = null;
		ResultSet myRs = null; 
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gces","root","");
				System.out.println("Sucessfull");
				
				String sql = "insert into employee(username,password)"+"values(?,?)";
				String user = username1.getText();
				String pass = password1.getText();
				
				myStmt=myConn.prepareStatement(sql);
				myStmt.setString(1, user);
				myStmt.setString(2, pass);
				myStmt.execute();
				
			} catch (SQLException e1) 
			{
				System.out.println("error");
			}
			
			
			
			
		
		
		
		
	}

}
