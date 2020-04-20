import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Candidate_Details_GUI 
{
	Candidate_Details_GUI()
	{
		Frame frm = new Frame();
		Label lbl = new Label("Candidate Details", Label.CENTER);
		frm.add(lbl);
		lbl.setBounds(160,50,200,30);
	    lbl.setFont(new Font("Cambria", Font.BOLD, 20));
	    
	    Label lbl1 = new Label("NAME : ");
	    frm.add(lbl1);
	    lbl1.setBounds(100,102,120,18);
	    TextField t1 = new TextField();
	    frm.add(t1);
	    t1.setBounds(230,100,190,20);
	    
	    Label lbl2 = new Label("DATE OF BIRTH : ");
	    frm.add(lbl2);
	    lbl2.setBounds(100,132,120,18);
	    TextField t21 = new TextField();
	    frm.add(t21);
	    t21.setBounds(230,130,30,20);
	    TextField t22 = new TextField();
	    frm.add(t22);
	    t22.setBounds(270,130,30,20);
	    TextField t23 = new TextField();
	    frm.add(t23);
	    t23.setBounds(310,130,50,20);
	    
	    Label lbl3 = new Label("ADDRESS : ");
	    frm.add(lbl3);
	    lbl3.setBounds(100,162,120,18);
	    TextField t3 = new TextField();
	    frm.add(t3);
	    t3.setBounds(230,160,190,40);
	    
	    Label lbl4 = new Label("PHONE NO. : ");
	    frm.add(lbl4);
	    lbl4.setBounds(100,212,120,18);
	    TextField t4 = new TextField();
	    frm.add(t4);
	    t4.setBounds(230,210,190,20);
	    
	    Label lbl5 = new Label("EMAIL ID : ");
	    frm.add(lbl5);
	    lbl5.setBounds(100,242,120,18);
	    TextField t5 = new TextField();
	    frm.add(t5);
	    t5.setBounds(230,240,190,20);
	    
	    Label lb6 = new Label("QUALIFICATION : ");
	    frm.add(lb6);
	    lb6.setBounds(100,272,120,18);
	    Choice c = new Choice();  
		c.setBounds(230,270,190,20);  
		c.add("HIGH SCHOOL");  
		c.add("B.TECH.");  
		c.add("M.TECH.");  
		frm.add(c);
	    
	    Label lbl7 = new Label("SKILLS : ");
	    frm.add(lbl7);
	    lbl7.setBounds(100,302,120,18);
	    TextField t7 = new TextField();
	    frm.add(t7);
	    t7.setBounds(230,300,190,20);
	    
	    Label lbl8 = new Label("WORK SAMPLE");
	    frm.add(lbl8);
	    lbl8.setBounds(100,332,120,18);
	    TextField t8 = new TextField();
	    frm.add(t8);
	    t8.setBounds(230,330,190,20);
	    
	    Label lbl9 = new Label("MISC. : ");
	    frm.add(lbl9);
	    lbl9.setBounds(100,362,120,18);
	    TextField t9 = new TextField();
	    frm.add(t9);
	    t9.setBounds(230,360,190,20);
	    
	    Button b = new Button("SUBMIT");
	    frm.add(b);
	    b.setBounds(200,400,70,30);  
	    b.addActionListener(new ActionListener() 
	    {  
			public void actionPerformed(ActionEvent x) 
			{       
				String name = t1.getText();
				String dob = t21.getText()+"/"+t22.getText()+"/"+t23.getText();
				String address = t3.getText();
				String phone = t4.getText();
				String email = t5.getText();
				String qual = c.getSelectedItem();
				String skill = t7.getText();
				String link = t8.getText();
				String misc = t9.getText();
	      		FileWriter fl = null;
					try 
					{
						fl = new FileWriter("C:/Users/Rohit Kumar/Desktop/Details.csv",true);
					} catch (IOException x19) 
					{
						x19.printStackTrace();
					}
	                try 
	                {
						fl.write("\n\n\nName : ");
					} catch (IOException x18) 
	                {
						x18.printStackTrace();
					}
	                try 
	                {
						fl.write(name);
					} catch (IOException x17) 
	                {
						x17.printStackTrace();
					}
	                try 
	                {
						fl.write("\nEMAIL ID : ");
					} catch (IOException x16) 
	                {
						x16.printStackTrace();
					}
	                try 
	                {
						fl.write(email);
					} catch (IOException x15) 
	                {
						x15.printStackTrace();
					}
	                try 
	                {
						fl.write("\nPHONE NO. : ");
					} catch (IOException x14) 
	                {
						x14.printStackTrace();
					}
	                try 
	                {
						fl.write(phone);
					} catch (IOException x13) 
	                {
						x13.printStackTrace();
					}
	                try 
	                {
						fl.write("\nADDRESS : ");
					} catch (IOException x12) 
	                {
						x12.printStackTrace();
					}
	                try 
	                {
						fl.write(address);
					} catch (IOException x11) 
	                {
						x11.printStackTrace();
					}
	                try 
	                {
						fl.write("\nDATE OF BIRTH : ");
					} catch (IOException x10) 
	                {
						x10.printStackTrace();
					}
	                try 
	                {
						fl.write(dob);
					} catch (IOException x9) 
	                {
						x9.printStackTrace();
					}
	                try
	                {
						fl.write("\nQUALIFICATION : ");
					} catch (IOException x8) 
	                {
						x8.printStackTrace();
					}
	                try
	                {
						fl.write(qual);
					} catch (IOException x7) 
	                {
						x7.printStackTrace();
					}
	                try
	                {
						fl.write("\nSKILLS : ");
					} catch (IOException x6) 
	                {
						x6.printStackTrace();
					}
	                try
	                {
						fl.write(skill);
					} catch (IOException x5) 
	                {
						x5.printStackTrace();
					}
	                try
	                {
						fl.write("\nWORK SAMPLE : ");
					} catch (IOException x4) 
	                {
						x4.printStackTrace();
					}
	                try
	                {
						fl.write(link);
					} catch (IOException x3) 
	                {
						x3.printStackTrace();
					}
	                try
	                {
						fl.write("\nMISC : ");
					} catch (IOException x2) 
	                {
						x2.printStackTrace();
					}
	                try
	                {
						fl.write(misc);
					} catch (IOException x1) 
	                {
						x1.printStackTrace();
					}
	                try
	                {
						fl.close();
					} catch (IOException x1) 
	                {
						x1.printStackTrace();
					} 
			}  
	    });
	    
			frm.setTitle("Details");
			frm.setSize(500, 500);
			frm.setLayout(null);
			frm.setResizable(false);
			frm.setVisible(true);
			frm.setBackground(Color.red);
			frm.addWindowListener(new WindowAdapter()
			{  
		      public void windowClosing(WindowEvent x) 
		      {  
		              System.exit(0);  
		      }  
		    }); 
	}
	public static void main(String[] args) throws IOException
	{
		Candidate_Details_GUI details = new Candidate_Details_GUI();
	}
}
