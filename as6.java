import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.Border;
import java.sql.*;
public class as6 implements ActionListener
{
	JFrame fp,f,f1;
	JPanel p1, p2;
	JLabel lreg2;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
	JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9 ;
	JButton b1, b2, b3, b4,bshop;
	Border bordhead;
	Color col1,colo;
	Font fnl,fnh ;
	
	public  as6()
	{
		
		f = new JFrame ("Login page");
		f1 = new JFrame ("register page");
		p1 = new JPanel();
		p1.setBackground(Color.pink);
		p1.setLayout(null);
		bordhead = BorderFactory.createLineBorder(Color.white,5);
		col1 = new Color(255, 0, 0, 100);
		colo = new Color(255,0,0,1);
		fnl = new Font("San-Serif",Font.PLAIN ,30);
		fnh = new Font("Serif",Font.BOLD ,60);

		lreg2 = new JLabel("REGISTRATION");
		lreg2.setFont(fnh);
		lreg2.setForeground(Color.white);
		lreg2.setBorder(bordhead);
		lreg2.setBounds(200,0,500,90);

		JPanel ph2 = new JPanel();
		ph2.setBackground(Color.BLACK);
		ph2.setBounds(0, 0,750,100);
		ph2.add(lreg2);

		p2 = new JPanel();
		p2.setBackground(Color.black);
		p2.setBounds(0,100,750,500);
		p2.setLayout(null);
		

		l1= new JLabel("Name");
		l2= new JLabel("Password");
		l3= new JLabel("Address");
		l4= new JLabel("Email ID");
		l5= new JLabel("Mobile num:");
		l6= new JLabel("Age");
		l7= new JLabel("Registered Name :");
		l8= new JLabel("Password :");
		l1.setBounds( 100, 10, 200, 30);
		l2.setBounds( 100, 50, 200, 30);
		l3.setBounds( 100, 90, 200, 30);
		l4.setBounds( 100, 130, 200, 30);
		l5.setBounds( 100, 170, 200, 30);
		l6.setBounds( 100, 210, 200, 30);
		l7.setBounds( 120, 120, 300, 33);
		l8.setBounds( 120, 158, 200, 30);
		l1.setForeground(Color.white);
		l2.setForeground(Color.white);
		l3.setForeground(Color.white);
		l4.setForeground(Color.white);
		l8.setForeground(Color.black);
		l5.setForeground(Color.white);
		l6.setForeground(Color.white);
		l7.setForeground(Color.black);

		l1.setBackground(Color.BLACK);
		l2.setBackground(Color.BLACK);
		l3.setBackground(Color.BLACK);
		l7.setBackground(Color.BLACK);
		l1.setFont(fnl);
		l2.setFont(fnl);
		l3.setFont(fnl);
		l4.setFont(fnl);
		l5.setFont(fnl);
		l6.setFont(fnl);
		l7.setFont(fnl);
		
		l8.setFont(fnl);
		

		b1= new JButton("Register");
		b1.addActionListener(this);
		b1.setFont(fnl);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.white);
		b1.setBounds(200, 260, 300, 30);
		
		b4= new JButton("back");
		b4.addActionListener(this);
		b4.setFont(fnl);
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.white);
		b4.setBounds(200, 300, 300, 30);

		b2= new JButton("Login");
		b2.addActionListener(this);
		b2.setFont(fnl);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.white);
		b2.setBounds(200, 225, 300, 30);
		
		b3= new JButton("REGISTER NEW");
		b3.addActionListener(this);
		b3.setFont(fnl);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.white);
		b3.setBounds(200, 270, 300, 30);
		
		ImageIcon ph1 = new ImageIcon("grocery.jpg");
		JLabel phot1 = new JLabel("",ph1,JLabel.CENTER);
		phot1.setBounds(0,0, 750, 500);
		
		ImageIcon photo2 = new ImageIcon("g2.jpg");
		JLabel phot2 = new JLabel("",photo2,JLabel.CENTER);
		phot2.setBounds(0,0, 750, 500);
		
		
		t1= new JTextField(20);
		t2= new JTextField(20);
		t3= new JTextField(20);
		t4= new JTextField(20);
		t5= new JTextField(20);
		t6= new JTextField(20);
		t7= new JTextField(20);
		t8= new JTextField(20);


		t1.setBounds(350,  10, 200, 30);
		t2.setBounds(350,  50, 200, 30);
		t3.setBounds(350,  90, 200, 30);
		t4.setBounds(350, 130, 200, 30);
		t5.setBounds(350, 170, 200, 30);
		t6.setBounds(350, 210, 200, 30);
		t7.setBounds(380, 120, 200, 30);
		t8.setBounds(380, 160, 200, 30);
		
	
		p2.add(l1);
		p2.add(t1);
		p2.add(l2);
		p2.add(t2);
		p2.add(l3);
		p2.add(t3);
		p2.add(l4);
		p2.add(t4);
		
		p2.add(l5);
		p2.add(t5);
       
		
		p2.add(b1);
		p2.add(b4);
		p1.add(b3);
		p1.add(b2);
		p2.add(l6);
		p2.add(t6);
		
		p2.add(phot1);
		
		
		p1.add(l7);
		p1.add(t7);
		p1.add(l8);
		p1.add(t8);
		p1.add(phot2);
		

		f.add(p1);
		f1.add(p2);
		f1.add(ph2);

		
		f1.setBounds(550,250,750,500);
		f.setBounds( 550,250,750,500);
		f.setVisible(true);
		f.setResizable(false);
		f1.setResizable(false);
	
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public void actionPerformed(ActionEvent ae)
		{
		
			if(ae.getSource()==b1)
			{
				String en  = t1.getText();
				String nm  = t2.getText();
				String br  = t3.getText();
				String br1 = t4.getText();
				int sm  = Integer.parseInt(t5.getText());
				int sm1 = Integer.parseInt(t6.getText());
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/Dbdemo1",
					"root" , "root1");
		
					PreparedStatement pstmt = con.prepareStatement("insert into registration1 values(?,?,?,?,?,?)");
					pstmt.setString(1, en);
					pstmt.setString(2, nm);
					pstmt.setString(3, br);
					pstmt.setString(4, br1);
					pstmt.setInt(5, sm);
					pstmt.setInt(6, sm1);

					int i = pstmt.executeUpdate();
					if(i!=0)
					JOptionPane.showMessageDialog(f,"1 record registered succesfully!!!");
					else
					JOptionPane.showMessageDialog(f,"ERROR!!!");
					con.close();
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
				}
				catch(Exception e)
				{ 
					System.out.println(e.getMessage()); }
			    }
			if(ae.getSource()==b3)
			{
				f1.setVisible(true);
				f.setVisible(false);
			}
           
			if(ae.getSource()==b4)
			{
				f.setVisible(true);
				f1.setVisible(false);
			}	
			if(ae.getSource()==b2)
			{		
				String en = t7.getText();
				String br = t8.getText();
				
			try
			{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/Dbdemo1","root" , "root1");
		
					PreparedStatement pstmt = con.prepareStatement("select * from registration1 where name= ? and pass=?");
					pstmt.setString(1, en);
					pstmt.setString(2, br);


					ResultSet rs  = pstmt.executeQuery();
					if(!rs.next())
					JOptionPane.showMessageDialog(f,"Bad credrntials!!");
					
					else{
					Shop page = new Shop();
            				page.setVisible(true);
					}
					con.close();
					t7.setText("");
					t8.setText("");
				
				}
				catch(Exception e)
				{ System.out.println(e.getMessage()); }

		}
}
		public static void  main(String [] args)
		{
			new  as6();
		}
	}