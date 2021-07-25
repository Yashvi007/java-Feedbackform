import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;

public class MiniProject extends JFrame implements ActionListener, ItemListener
{
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,msg, msg2;
	TextField t1;
	CheckboxGroup c1,c2,c3,c4,c6,c5,c7,c8,c9,c10;
	Button b1;
	Choice c;
	Checkbox d1,d2,d3,d4,d5,d6,d7,d8,d9,d0,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,d22,d23,d24,d25,d26,d27,d28,d29,d30,d31,d32,d33,d34,d35,d36,d37,d38,d39,d40,d41,d42,d43,d44,d45,d46,d47;
	JPanel p1, p2, p3, p4, p5, p6, p7, p8,p9,p10,p11,p12,p13,p14,p15,p16;

	public static Connection conn;

	MiniProject() 
	{
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		p7 = new JPanel();
		p8 = new JPanel();
		p9 = new JPanel();
		p10 = new JPanel();
		p11 = new JPanel();
		p12 = new JPanel();
		p13 = new JPanel();
		p14 = new JPanel();
		p15 = new JPanel();
		p16 = new JPanel();
		

		l1 = new JLabel();
		l2 = new JLabel();
		l3= new JLabel();
		l4= new JLabel();
		l5= new JLabel();
		l6= new JLabel();
		l7= new JLabel();
		l8= new JLabel();
		l9= new JLabel();
		l10= new JLabel();
		l11= new JLabel();
		l = new JLabel();
		
		p1.add(new JLabel("======HEYY ONEPLUS USER WELCOME TO THE FEEDBACK FORM======"));
		
		t1 = new TextField("");
		p2.setLayout(new GridLayout(2,2));
		p2.add(new JLabel("Name:"));	
		p2.add(t1);
		p2.add(new JLabel("Barcode: "));
		p2.add(new TextField());

		c = new Choice();
		c.addItem("OnePlus 7T pro");
		c.addItem("OnePlus 7T");
		c.addItem("OnePlus 7");
		c.addItem("OnePlus 6T");
		c.addItem("OnePlus 6");
		c.addItem("OnePlus 5T");
		c.addItem("OnePlus 5");
		c.addItem("OnePlus 3");
		c.addItem("OnePlus 2");
		c.addItem("OnePlus 1");
		c.addItemListener(this);
		p3.setLayout(new GridLayout(2,2));
		p3.add(new JLabel("Select your model:"));
		p3.add(c);	
		p3.add(l1);
		
		p4.setLayout(new GridLayout(2,1));
		p4.add(new JLabel("RATE THE FOLLOWING SPECS IN THE ORDER:-"));
		p4.add(new JLabel("5=EXCELLENT 4=GOOD 3=SATISFACTORY 2=DISAPPOINTED 1=POOR"));
		
		p5.add(new JLabel("DESIGN: "));
		c1 = new CheckboxGroup();
		d1=new Checkbox("5", c1, false);
		d2=new Checkbox("4", c1, false);
		d3=new Checkbox("3", c1, false);
		d4=new Checkbox("2", c1, false);
		d5=new Checkbox("1", c1, false);   
		p5.add(d1);  
		p5.add(d2);   
		p5.add(d3);   
		p5.add(d4);   
		p5.add(d5);       
		d1.addItemListener(this);
		d2.addItemListener(this);
		d3.addItemListener(this);
		d4.addItemListener(this);
		d5.addItemListener(this);
		p5.add(l2);

		p6.add(new JLabel("FRONT CAMERA: "));
		c2 = new CheckboxGroup();
		d6=new Checkbox("5", c2, false);
		d7=new Checkbox("4", c2, false);
		d8=new Checkbox("3", c2, false);
		d9=new Checkbox("2", c2, false);
		d0=new Checkbox("1", c2, false); 
		p6.add(d6);  
		p6.add(d7);   
		p6.add(d8);   
		p6.add(d9);   
		p6.add(d0);  
		d6.addItemListener(this);
		d7.addItemListener(this);
		d8.addItemListener(this);
		d9.addItemListener(this);
		d0.addItemListener(this);
		p6.add(l3);
		
		p7.add(new JLabel("REAR CAMERA: "));
		c3 = new CheckboxGroup();
		d11=new Checkbox("5", c3, false);
		d12=new Checkbox("4", c3, false);
		d13=new Checkbox("3", c3, false);
		d14=new Checkbox("2", c3, false);
		d15=new Checkbox("1", c3, false); 
		p7.add(d11);  
		p7.add(d12);   
		p7.add(d13);   
		p7.add(d14);   
		p7.add(d15);  
		d11.addItemListener(this);
		d12.addItemListener(this);
		d13.addItemListener(this);
		d14.addItemListener(this);
		d15.addItemListener(this);
		p7.add(l4);
		
		p8.add(new JLabel("DASH CHARGING: "));
		c4 = new CheckboxGroup();
		d16=new Checkbox("5", c4, false);
		d17=new Checkbox("4", c4, false);
		d18=new Checkbox("3", c4, false);
		d19=new Checkbox("2", c4, false);
		d20=new Checkbox("1", c4, false); 
		p8.add(d16);  
		p8.add(d17);   
		p8.add(d18);   
		p8.add(d19);   
		p8.add(d20);  
		d16.addItemListener(this);
		d17.addItemListener(this);
		d18.addItemListener(this);
		d19.addItemListener(this);
		d20.addItemListener(this);
		p8.add(l5);

		p9.add(new JLabel("STORAGE: "));
		c5 = new CheckboxGroup();
		d21=new Checkbox("5", c5, false);
		d22=new Checkbox("4", c5, false);
		d23=new Checkbox("3", c5, false);
		d24=new Checkbox("2", c5, false);
		d25=new Checkbox("1", c5, false); 
		p9.add(d21);  
		p9.add(d22);   
		p9.add(d23);   
		p9.add(d24);   
		p9.add(d25);  
		d21.addItemListener(this);
		d22.addItemListener(this);
		d23.addItemListener(this);
		d24.addItemListener(this);
		d25.addItemListener(this);
		p9.add(l6);

		p10.add(new JLabel("SENSORS: "));
		c6 = new CheckboxGroup();
		d26=new Checkbox("5", c6, false);
		d27=new Checkbox("4", c6, false);
		d28=new Checkbox("3", c6, false);
		d29=new Checkbox("2", c6, false);
		d30=new Checkbox("1", c6, false); 
		p10.add(d26);  
		p10.add(d27);   
		p10.add(d28);   
		p10.add(d29);   
		p10.add(d30);  
		d26.addItemListener(this);
		d27.addItemListener(this);
		d28.addItemListener(this);
		d29.addItemListener(this);
		d30.addItemListener(this);
		p10.add(l7);
		
		p11.add(new JLabel("SOUND AND DISPLAY: "));
		c7 = new CheckboxGroup();
		d31=new Checkbox("5", c7, false);
		d32=new Checkbox("4", c7, false);
		d33=new Checkbox("3", c7, false);
		d34=new Checkbox("2", c7, false);
		d35=new Checkbox("1", c7, false); 
		p11.add(d31);  
		p11.add(d32);   
		p11.add(d33);   
		p11.add(d34);   
		p11.add(d35);  
		d31.addItemListener(this);
		d32.addItemListener(this);
		d33.addItemListener(this);
		d34.addItemListener(this);
		d35.addItemListener(this);
		p11.add(l8);
		

		p12.add(new JLabel("BATTERY PERFORMANCE: "));
		c8 = new CheckboxGroup();
		d36=new Checkbox("5", c8, false);
		d37=new Checkbox("4", c8, false);
		d38=new Checkbox("3", c8, false);
		d39=new Checkbox("2", c8, false);
		d40=new Checkbox("1", c8, false); 
		p12.add(d36);  
		p12.add(d37);   
		p12.add(d38);   
		p12.add(d39);   
		p12.add(d40);  
		d36.addItemListener(this);
		d37.addItemListener(this);
		d38.addItemListener(this);
		d39.addItemListener(this);
		d40.addItemListener(this);
		p12.add(l9);

		p13.add(new JLabel("NETWORK CONNECTIVITY: "));
		c9 = new CheckboxGroup();
		d41=new Checkbox("5", c9, false);
		d42=new Checkbox("4", c9, false);
		d43=new Checkbox("3", c9, false);
		d44=new Checkbox("2", c9, false);
		d45=new Checkbox("1", c9, false); 
		p13.add(d41);  
		p13.add(d42);   
		p13.add(d43);   
		p13.add(d44);   
		p13.add(d45);  
		d41.addItemListener(this);
		d42.addItemListener(this);
		d43.addItemListener(this);
		d44.addItemListener(this);
		d45.addItemListener(this);
		p13.add(l10);
		
		p14.add(new JLabel("DO YOU HAVE ANY PROBLEM IF ANY: "));
		c10 = new CheckboxGroup();
		d46=new Checkbox("YES", c10, false);
		d47=new Checkbox("NO", c10, false);
		
		p14.add(d46);  
		p14.add(d47);   
		
		d46.addItemListener(this);
		d47.addItemListener(this);
		
		p14.add(l11);

		p15.setLayout(new GridLayout(2,2));
		p15.add(new JLabel("DETAILED DESCRIPTION:"));	
		p15.add(new TextField());
		p15.add(new JLabel("WHAT ARE YOUR SUGGESTIONS? "));
		p15.add(new TextField());

		b1=new Button("SUBMIT");
		b1.addActionListener(this);
		p16.add(b1);
		p16.add(l);
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		add(p7);
		add(p8);
		add(p9);
		add(p10);
		add(p11);
		add(p12);
		add(p13);
		add(p14);
		add(p15);
		add(p16);
		

		setVisible(true);
		setSize(500, 700);
		setLayout(new GridLayout(16, 1));	//change grid ka x according to the no. of panels i.e that '6'
	}
	
	public void itemStateChanged(ItemEvent e)
	{	
		if(e.getItemSelectable()==c)
			l1.setText("You have selected: " +c.getSelectedItem());


		if(e.getItemSelectable() == d1)
			l2.setText("You have selected: Excellent");
	
		if(e.getItemSelectable()==d2)
			l2.setText("You have selected: GOOD");
	
		if(e.getItemSelectable()==d3)
			l2.setText("You have selected: SATISFACTORY");
	
		if(e.getItemSelectable()==d4)
			l2.setText("You have selected: DISAPPOINTED");

		if(e.getItemSelectable()==d5)
			l2.setText("You have selected: POOR");


		if(e.getItemSelectable()==d6)
			l3.setText("You have selected: Excellent");
	
		if(e.getItemSelectable()==d7)
			l3.setText("You have selected: GOOD");
	
		if(e.getItemSelectable()==d8)
			l3.setText("You have selected: SATISFACTORY");
	
		if(e.getItemSelectable()==d9)
			l3.setText("You have selected: DISAPPOINTED");

		if(e.getItemSelectable()==d0)
			l3.setText("You have selected: POOR");
		
		if(e.getItemSelectable()==d11)
			l4.setText("You have selected: Excellent");
	
		if(e.getItemSelectable()==d12)
			l4.setText("You have selected: GOOD");
	
		if(e.getItemSelectable()==d13)
			l4.setText("You have selected: SATISFACTORY");
	
		if(e.getItemSelectable()==d14)
			l4.setText("You have selected: DISAPPOINTED");

		if(e.getItemSelectable()==d15)
			l4.setText("You have selected: POOR");

		if(e.getItemSelectable()==d16)
			l5.setText("You have selected: Excellent");
	
		if(e.getItemSelectable()==d17)
			l5.setText("You have selected: GOOD");
	
		if(e.getItemSelectable()==d18)
			l5.setText("You have selected: SATISFACTORY");
	
		if(e.getItemSelectable()==d19)
			l5.setText("You have selected: DISAPPOINTED");

		if(e.getItemSelectable()==d20)
			l5.setText("You have selected: POOR");
		
		if(e.getItemSelectable()==d21)
			l6.setText("You have selected: Excellent");
	
		if(e.getItemSelectable()==d22)
			l6.setText("You have selected: GOOD");
	
		if(e.getItemSelectable()==d23)
			l6.setText("You have selected: SATISFACTORY");
	
		if(e.getItemSelectable()==d24)
			l6.setText("You have selected: DISAPPOINTED");

		if(e.getItemSelectable()==d25)
			l6.setText("You have selected: POOR");
		
		if(e.getItemSelectable()==d26)
			l7.setText("You have selected: Excellent");
	
		if(e.getItemSelectable()==d27)
			l7.setText("You have selected: GOOD");
	
		if(e.getItemSelectable()==d28)
			l7.setText("You have selected: SATISFACTORY");
	
		if(e.getItemSelectable()==d29)
			l7.setText("You have selected: DISAPPOINTED");

		if(e.getItemSelectable()==d30)
			l7.setText("You have selected: POOR");

		if(e.getItemSelectable()==d31)
			l8.setText("You have selected: Excellent");
	
		if(e.getItemSelectable()==d32)
			l8.setText("You have selected: GOOD");
	
		if(e.getItemSelectable()==d33)
			l8.setText("You have selected: SATISFACTORY");
	
		if(e.getItemSelectable()==d34)
			l8.setText("You have selected: DISAPPOINTED");

		if(e.getItemSelectable()==d35)
			l8.setText("You have selected: POOR");
		
		if(e.getItemSelectable()==d36)
			l9.setText("You have selected: Excellent");
	
		if(e.getItemSelectable()==d37)
			l9.setText("You have selected: GOOD");
	
		if(e.getItemSelectable()==d38)
			l9.setText("You have selected: SATISFACTORY");
	
		if(e.getItemSelectable()==d39)
			l9.setText("You have selected: DISAPPOINTED");

		if(e.getItemSelectable()==d40)
			l9.setText("You have selected: POOR");

		if(e.getItemSelectable()==d41)
			l10.setText("You have selected: Excellent");
	
		if(e.getItemSelectable()==d42)
			l10.setText("You have selected: GOOD");
	
		if(e.getItemSelectable()==d43)
			l10.setText("You have selected: SATISFACTORY");
	
		if(e.getItemSelectable()==d44)
			l10.setText("You have selected: DISAPPOINTED");

		if(e.getItemSelectable()==d45)
			l10.setText("You have selected: POOR");

		if(e.getItemSelectable()==d46)
			l11.setText("You have selected: YES");

		if(e.getItemSelectable()==d47)
			l11.setText("You have selected: NO");		
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String fileName = "Store_Data.txt"; 
	        String sput = t1.getText(); 
	        appendUsingFileOutputStream(fileName, sput+ "\n" ); 
	  
	       	l.setText("YOUR RESPONSE HAS BEEN RECORDED");
			System.exit(0);
		}
	}

	public static void appendUsingFileOutputStream(String fileName, String data) {
		OutputStream os = null;
		try {
			os = new FileOutputStream(new File(fileName), true);
			os.write(data.getBytes(), 0, data.length());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[])
	{
		MiniProject ob = new MiniProject();
	}
}