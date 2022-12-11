import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.Border;
import java.sql.*;
public class Shop extends JFrame implements ActionListener,ItemListener 
{  

	JFrame f,f2,f3;
	JPanel p5,p6,p7,p8,p9,p10,p11,p12,p13,psh;
	JLabel ln,lmbno,lbi,lcd,le,lCt,lS,lPn,lPP,lq,lT;
	JLabel lv,lf,lc,lo,lbl1,l1, l2;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12, t13, t14, t15, t16, t17, t18, t19, t20, t21,t22;
	Choice ch,ch1,ch2,ch3;                                                            
	List l;
	ImageIcon img;
	JPanel prdpanel,namePanel,itpanel;
	JTextArea ta, ta1;

	JTabbedPane jt;
	//JTable jtb;
	JButton bc,batc,bgbp,be,bi,bd,bpreset,bsub, back, bback, bhis,bcheck,blogo, bhistory;
	Border bordhead,borderprdct;
	Color col1,colo;
	Font fnl,fnh ;
	

	int i=1;
      
    	public Shop()  
    	{

		f=new JFrame("Grocery Shop Management User Page");
		f2=new JFrame("CHECK AND SUBMIT ORDER");
		f3=new JFrame("CHECK HISTORY");
		bordhead = BorderFactory.createLineBorder(Color.white,5);
		borderprdct = BorderFactory.createLineBorder(Color.white,2);
		col1 = new Color(255,255,255,255);
		colo = new Color(255,0,0,1);
		fnl = new Font("San-Serif",Font.PLAIN ,30);
		fnh = new Font("Serif",Font.BOLD ,60);
  		p5 = new JPanel();
		p5.setLayout(null);
		p5.setBounds(0,100,1920,1080);
		p5.setBackground(Color.pink);
		psh = new JPanel();
		psh.setLayout(null);
		psh.setBackground(Color.BLACK);
		psh.setBounds(0,0,1920,100);

		
		
		prdpanel = new JPanel();
		prdpanel.setBounds(390,140,1170,380);
		prdpanel.setBackground(Color.BLACK);

		namePanel = new JPanel();
		namePanel.setBounds(20,140,300,250);
		namePanel.setBackground(Color.BLACK);

		itpanel = new JPanel();
		itpanel.setBounds(380,540,800,210);
		itpanel.setBackground(Color.BLACK);

		p6 = new JPanel();
		p6.setLayout(null);
		p6.setBackground(Color.pink);

		p7 = new JPanel();
		p7.setLayout(null);
		p7.setBackground(Color.pink);
		

		lbl1=new JLabel("Qty");
		lbl1.setFont(fnl);
		lbl1.setBorder(borderprdct);
		lbl1.setForeground(Color.white);
		lbl1.setBounds(900,590,70,40);
		
		l1=new JLabel("Enter the Name ");
		l1.setBounds(20,80,300,40);
		l1.setFont(fnl);
		l2=new JLabel("Enter the mobile number ");
		l2.setBounds(20,160,400,40);
		l2.setFont(fnl);

		lbi= new JLabel("Bill ID:");

		lbi.setBounds(0,0,300,80);
		lcd= new JLabel("Customer Details:");
		lcd.setBounds(0,50,300,80);

		ln= new JLabel("Name");
		ln.setBounds(40,150,100,60);
		ln.setFont(fnl);
		ln.setForeground(Color.white);

		t1= new JTextField(20);
		t1.setBounds(40,210,260,40);
		t1.setFont(fnl);
		
		lmbno= new JLabel("Mobile Number");
		lmbno.setBounds(40,260,300,60);
		lmbno.setFont(fnl);
		lmbno.setForeground(Color.white);
		
		t2= new JTextField(20);
		t2.setFont(fnl);
		t2.setBounds(40,320,260,40);

		//le= new JLabel("E-mail");
		//le.setBounds(20,170,300,80);

		lCt= new JLabel("Grocery Item Category");
		lCt.setBounds(600,5,750,90);
		lCt.setBorder(bordhead);
		lCt.setBackground(Color.red);
		lCt.setForeground(Color.WHITE);
		lCt.setFont(fnh);

		

		lv= new JLabel("Vegetables");
		lv.setFont(fnl);
		lv.setBorder(borderprdct);
		lv.setForeground(col1);
		lv.setBounds(400,150,250,60);
		ch=new Choice();
		ch.setBounds(400,480,250,20);
		ImageIcon veg = new ImageIcon("vegs.jpg");
		JLabel vegpic = new JLabel("",veg,JLabel.CENTER);
		vegpic.setBounds(400,220, 250, 250);
		ImageIcon frt = new ImageIcon("fruits.jpg");
		JLabel frtpic = new JLabel("",frt,JLabel.CENTER);
		frtpic.setBounds(700,220, 250, 250);
		
		ImageIcon cer = new ImageIcon("cereals.jpg");
		JLabel cerpic = new JLabel("",cer,JLabel.CENTER);
		cerpic.setBounds(1000,220, 250, 250);
		
		ImageIcon oil = new ImageIcon("oils.jpg");
		JLabel oilpic = new JLabel("",oil,JLabel.CENTER);
		oilpic.setBounds(1300,220, 250, 250);
		
		
		lf= new JLabel("Fruits");
		lf.setFont(fnl);
		lf.setBorder(borderprdct);
		lf.setForeground(col1);

		lf.setBounds(700,150,250,60);
		ch1=new Choice();
		ch1.setBounds(700,480,250,40);
		

		lc= new JLabel("Cereals");
		lc.setFont(fnl);
		lc.setForeground(col1);

		lc.setBorder(borderprdct);
		lc.setBounds(1000,150,250,60);
		ch2=new Choice();
		ch2.setBounds(1000,480,250,20);

		lo= new JLabel("Oils");
		lo.setForeground(col1);
		lo.setFont(fnl);
		lo.setBorder(borderprdct);
		lo.setBounds(1300,150,250,60);
		ch3=new Choice();
		ch3.setBounds(1300,480,250,20);

		lS= new JLabel("Search");

		lPn= new JLabel("Product Name");
		lPn.setBounds(400,550,300,30);
		lPn.setFont(fnl);
		lPn.setForeground(Color.WHITE);
		lPn.setBorder(borderprdct);
		
		lPP= new JLabel("Product Price");
		lPP.setBounds(400,650,300,30);
		lPP.setFont(fnl);
		lPP.setForeground(Color.WHITE);
		lPP.setBorder(borderprdct);
		
		lq= new JLabel("Quantity");
		lq.setBounds(800,550,300,30);
		lq.setFont(fnl);
		lq.setForeground(Color.WHITE);
		lq.setBorder(borderprdct);
		
		lT= new JLabel("Total Amount"); 
		lT.setBounds(800,650,300,30);
		lT.setFont(fnl);
		lT.setForeground(Color.WHITE);
		lT.setBorder(borderprdct);

		

		t3= new JTextField(20);
		t3.setBounds(20,120,200,40);

		t21= new JTextField(20);
		t21.setBounds(20,200,200,40);

		t4= new JTextField(20);

		t5= new JTextField(20);
		t5.setBounds(400,600,300,30);
		t5.setFont(fnl);
		t5.setEditable(false);

		t6= new JTextField(20);
		//price
		t6.setBounds(400,690,300,30);
		t6.setFont(fnl);
		t6.setEditable(false);
		
		
		
		t7= new JTextField(20);
		t7.setBounds(800,690,300,30);
		t7.setFont(fnl);
		t7.setEditable(false);

		t8= new JTextField(20);
		t8.setBounds(800,690,300,30);
		t8.setFont(fnl);
		t9= new JTextField(20);
		t10= new JTextField(20);
		t11= new JTextField(20);
		t12= new JTextField(20);
		
		t13= new JTextField(20);
		t14= new JTextField(20);
		t15= new JTextField(20);
		t16= new JTextField(20);
		
		t17= new JTextField(20);
		t18= new JTextField(20);
		t19= new JTextField(20);
		t20= new JTextField(20);
		t22= new JTextField(20);

		ta= new JTextArea();
		ta.setBounds(500,150,500,500);
		
		ta1= new JTextArea();
		ta1.setBounds(500,150,500,500);

		ch.add("Lady Finger");
		ch.add("Bitter Guard");
		ch.add("Guard");
		ch.add("Cauliflower");
		ch.add("Corriender");
		ch.add("Pudina");
		
		ch1.add("Mango");
		ch1.add("Pomegranate");
		ch1.add("Banana");
		ch1.add("Apple");

		ch2.add("Rice");
		ch2.add("Wheat");
		ch2.add("Jwar");

		ch3.add("Mustard Oil");
		ch3.add("Coconut Oil");
		ch3.add("Sunflower Oil");
		ch3.add("Groundnut Oil");

		ch.addItemListener(this);
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
		
		bi = new JButton ("-");
		bi.setFont(fnl);
		bi.setBounds(800,590,70,40);
		bi.addActionListener(this);	
		
		bd = new JButton ("+");
		bd.setFont(fnl);
		bd.setBounds(1000,590,70,40);
		bd.addActionListener(this);  
        
		
		bc= new JButton("Clear");
		bc.addActionListener(this);
		bc.setBounds(1350,700,300,40);
		bc.setFont(fnl);
		bc.setBackground(Color.BLACK);
		bc.setForeground(Color.WHITE);
        
		batc= new JButton("Add to Cart");
		batc.addActionListener(this);
		batc.setBounds(1350,650,300,40);
		batc.setFont(fnl);
		batc.setBackground(Color.black);
      	  	batc.setForeground(Color.white);
		
		bgbp= new JButton("Generate Bill & Print");
		bgbp.addActionListener(this);
		bgbp.setBounds(20,410,305,40);
		bgbp.setFont(fnl);
		bgbp.setBorder(borderprdct);
		bgbp.setBackground(Color.white);
		bgbp.setForeground(Color.BLACK);
		
		bhistory= new JButton("HISTORY");
		bhistory.addActionListener(this);
		bhistory.setBounds(20,410,305,40);
		bhistory.setFont(fnl);
		bhistory.setBorder(borderprdct);
		bhistory.setBackground(Color.white);
		bhistory.setForeground(Color.BLACK);

		bsub= new JButton("Submit your order");
		bsub.addActionListener(this);
		bsub.setBounds(500,700,500,100);
		bsub.setFont(fnl);
		bsub.setBackground(Color.black);
		bsub.setForeground(Color.WHITE);

		bcheck= new JButton("Check");
		bcheck.addActionListener(this);
		bcheck.setBounds(1350,600,300,40);
		bcheck.setFont(fnl);
		bcheck.setBackground(Color.black);
		bcheck.setForeground(Color.WHITE);

		blogo= new JButton("LOGOUT");
		blogo.addActionListener(this);
		blogo.setBounds(1350,550,300,40);
		blogo.setFont(fnl);
		blogo.setBackground(Color.black);
		blogo.setForeground(Color.WHITE);
		
		be= new JButton("Exit");
		be.setBackground(Color.black);
		be.setFont(fnl);
		be.setForeground(Color.WHITE);
		be.addActionListener(this);
		be.setBounds(1350,750,300,40);

		back= new JButton("Go Back");
		back.setBackground(Color.black);
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		back.setBounds(20,320,300,40);

		bback= new JButton("Go Back");
		bback.setBackground(Color.black);
		bback.setForeground(Color.WHITE);
		bback.addActionListener(this);
		bback.setBounds(20,320,300,40);


		bhis= new JButton("Enter");
		bhis.setFont(fnl);
		bhis.setBackground(Color.black);
		bhis.setForeground(Color.WHITE);
		bhis.addActionListener(this);
		bhis.setBounds(20,280,300,40);

		
		
		ImageIcon ph1 = new ImageIcon("pshop.jpg");
		JLabel phot1 = new JLabel("",ph1,JLabel.CENTER);
		phot1.setBounds(0,0, 1920, 1080);
      
		
		p5.add(vegpic);
		p5.add(frtpic);
		p5.add(cerpic);
		p5.add(oilpic);
		p5.add(ln);
		p5.add(t1);
		p5.add(lmbno);
		p5.add(t2);
		psh.add(lCt);

		p5.add(lv);
		p5.add(ch);
		p5.add(lf);
		p5.add(ch1);
		p5.add(lc);
		p5.add(ch2);
		p5.add(lo);
		p5.add(ch3);
		p5.add(namePanel);
		p5.add(prdpanel);

		
		p5.add(lS);
		p5.add(t4);
		p5.add(lPn);
		p5.add(t5);
		p5.add(lPP);
		p5.add(t6);
		p5.add(lq);
		p5.add(bd);
		p5.add(lbl1);
		//p5.add(tq);
		p5.add(bi);
		
		p5.add(lT);
		p5.add(t7);
		
		p5.add(bc);
		p5.add(blogo);
		p5.add(bcheck);
		p5.add(batc);
		//p6.add(bgbp);
		p5.add(bhistory);
		p5.add(be);
		p5.add(psh);
		p5.add(itpanel);
		p6.add(bsub);
		p6.add(ta);
		
		p6.add(bback);

		p7.add(l1);
		p7.add(l2);
		p7.add(ta1);
		p7.add(t3);
		p7.add(t21);
		/*p7.add(t17);
		p7.add(t18);
		p7.add(t19);
		p7.add(t20);*/
		p7.add(bhis);
		p7.add(back);
		
		p5.add(phot1);
		
		f.add(p5);
		f.add(psh);
		f2.add(p6);
		f3.add(p7);
		
		//f.add(sp);

		f.setSize(3900,1080);
		f.setVisible(true);
       		f.setResizable(false);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f2.setSize(3900,1080);
        f2.setResizable(false);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f3.setSize(3900,1080);
        f3.setResizable(false);
		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent act)
		{
			if(act.getSource()==bc) 
			{                                                    
				t5.setText("");
				t6.setText("");
				t7.setText("");
				t8.setText("");
				t9.setText("");
				t10.setText("");
				t11.setText("");
				t12.setText("");
				t22.setText("");
			}
			
			
			if(act.getSource()==be) 
			{                                                    
				System.exit(0);
			}
			if(act.getSource()==back) 
			{                                                    
				f.setVisible(true);
				f2.setVisible(false);
				f3.setVisible(false);
			}
			if(act.getSource()==bback) 
			{                                                    
				f.setVisible(true);
				f2.setVisible(false);
				f3.setVisible(false);
			}
			if(act.getSource()==bhis) 
			{                                                    
				String op1 = "The items you ordered are:\n"+t17.getText()+"\n"+t18.getText()+"\n"+t19.getText()+"\n"+t20.getText()+"\n";
				ta1.setText(op1);
			}
			if(act.getSource()==bhistory) 
			{                    
				f3.setVisible(true);
			}
			/*if(act.getSource()==bgbp) 
			{                                                    
				
			}*/
			if (act.getSource()==bcheck) {
					f2.setVisible(true);
				}
			if (act.getSource()==blogo) {
					f.setVisible(false);
					new as6();
				}
			if(act.getSource()==bsub) 
			{       
				String n  = t1.getText();                                             
				String en  = t9.getText();
				String nm  = t10.getText();
				String br  = t11.getText();
				String br1 = t12.getText();
				int sm = Integer.parseInt(t2.getText());

				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/Dbdemo1",
					"root" , "root1");
		
					PreparedStatement pstmt = con.prepareStatement("insert into registration2 values(?,?,?,?,?,?)");
					pstmt.setString(1, n);
					pstmt.setInt(2, sm);
					pstmt.setString(3, en);
					pstmt.setString(4, nm);
					pstmt.setString(5, br);
					pstmt.setString(6, br1);
					
					
					
					int i = pstmt.executeUpdate();
					if(i!=0){
						JOptionPane.showMessageDialog(f,"your order is placed succesfully!!!");
						f2.setVisible(false);
					}
					
					else{

						JOptionPane.showMessageDialog(f,"ERROR!!!");
						f2.setVisible(false);

					con.close();
					t1.setText("");
					t2.setText("");
					t9.setText("");
					t10.setText("");
					t11.setText("");
					t12.setText("");
				}
			
				}
				catch(Exception e)
				{ 
					System.out.println(e.getMessage()); }
			    }
				
			if(act.getSource()==bhis) 
			{
				String n= t3.getText();
				int sm = Integer.parseInt(t21.getText());
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/Dbdemo1",
					"root" , "root1");
		
					PreparedStatement pstmt = con.prepareStatement("select * from registration2 where name= ? AND mobile =?");
					pstmt.setString(1, n);
					pstmt.setInt(2, sm);
				
					ResultSet rs1  = pstmt.executeQuery();
					if(!rs1.next())

					JOptionPane.showMessageDialog(f,"NO SUCH RECORD EXIST!!");
					
					else{
					t17.setText(rs1.getString(3));
					t18.setText(rs1.getString(4));
					t19.setText((rs1.getString(5)));
					t20.setText((rs1.getString(6)));
					}
					con.close();
				}
				catch(Exception e)
				{ System.out.println(e.getMessage()); }
			}
                                                    
			if(act.getSource()==bd) 
			{                                                    

				lbl1.setText(""+i);
				++i;
				t22.setText(lbl1.getText());	
			}

			if(act.getSource()==bi) 
			{                                                    
			
         			lbl1.setText(""+i);

				if (i>1) {
                    		i--;
				t22.setText(lbl1.getText());
                	}
                else{
                    JOptionPane.showMessageDialog(f, "Quantity cannot ne zero");
                }
         			
			}
				double n3=Double.parseDouble(t13.getText());
				double s1=Double.parseDouble(t22.getText());
				double n4=Double.parseDouble(t14.getText());
				double s2=Double.parseDouble(t22.getText());
				double n5=Double.parseDouble(t15.getText());
				double s3=Double.parseDouble(t22.getText());
				double n6=Double.parseDouble(t16.getText());
				double s4=Double.parseDouble(t22.getText());
	
				double s5 = n3*s1;
				double s6 = n4*s2;
				double s7 = n5*s3;
				double s8 = n6*s4;
				double s9=s5+s6+s7+s8;
				t7.setText(String.valueOf(s9));
				
			if(act.getSource()==batc) 
			{                                                    
				String op = "The items you selected are:\n"+t9.getText()+"  price:- "+t13.getText()+"\n"+t10.getText()+"  price:- "+t14.getText()+"\n"+t11.getText()+"  price:- "+t15.getText()+"\n"+t12.getText()+"  price:- "+t16.getText()+"\n"+"Total amount:- "+t7.getText()+"\n";
				ta.setText(op);
			}
			
	}

	public void itemStateChanged(ItemEvent it)
		{
			if(it.getSource()== ch)
			t5.setText(ch.getSelectedItem());
			t9.setText(ch.getSelectedItem());
			
			if(ch.getSelectedItem()=="LadyFinger")
			{
				t6.setText("45");
			}
			if(ch.getSelectedItem()=="BitterGuard")
			{
				t6.setText("60");
			}
			if(ch.getSelectedItem()=="Guard")
			{
				t6.setText("25");
			}
			if(ch.getSelectedItem()=="Cauliflower")
			{
				t6.setText("11");
			}
			if(ch.getSelectedItem()=="Corriender")
			{
				t6.setText("21");
			}
			if(ch.getSelectedItem()=="Pudina")
			{
				t6.setText("41");
			}
			double n1=Double.parseDouble(t6.getText());
			t13.setText(String.valueOf(n1));

			if(it.getSource()== ch1)
			t5.setText(ch1.getSelectedItem());
			t10.setText(ch1.getSelectedItem());
			
			if(ch1.getSelectedItem()=="Mango")
			{
				t6.setText("100");
			}
			if(ch1.getSelectedItem()=="Pomegranate")
			{
				t6.setText("140");
			}
			if(ch1.getSelectedItem()=="Banana")
			{
				t6.setText("110");
			}
			if(ch1.getSelectedItem()=="Apple")
			{
				t6.setText("120");
			}
			
			double n2=Double.parseDouble(t6.getText());
			t14.setText(String.valueOf(n2));


			if(it.getSource()== ch2)
			t5.setText(ch2.getSelectedItem());
			t11.setText(ch2.getSelectedItem());
			
			if(ch2.getSelectedItem()=="Rice")
			{
				t6.setText("33");
			}
			if(ch2.getSelectedItem()=="Wheat")
			{
				t6.setText("50");
			}
			if(ch2.getSelectedItem()=="Jwar")
			{
				t6.setText("15");
			}
			
			double n3=Double.parseDouble(t6.getText());
			t15.setText(String.valueOf(n3));
			


			if(it.getSource()== ch3)
			t5.setText(ch3.getSelectedItem());
			t12.setText(ch3.getSelectedItem());
			if(ch3.getSelectedItem()=="Mustard Oil")
			{
				t6.setText("30");
			}
			if(ch3.getSelectedItem()=="Coconut Oil")
			{
				t6.setText("40");
			}
			if(ch3.getSelectedItem()=="Sunflower Oil")
			{
				t6.setText("10");
			}
			if(ch3.getSelectedItem()=="Groundnut Oil")
			{
				t6.setText("20");
			}
			
			double n4=Double.parseDouble(t6.getText());
			t16.setText(String.valueOf(n4));

		}
		
	   	
}
   
