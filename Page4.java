import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Page4 extends JFrame 
{
	
	JPanel label,p2;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2;
	JButton b1,b2,b3,registerb;
	JPasswordField f1;
	String usn,pass;
	ImageIcon img;
	
	
	public Page4()
	{
	super(" SEAT TYPE ");
	this.setSize(700,450);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	String imagePath = "economy.png";

       
        ImageIcon icon = new ImageIcon(imagePath);

       
        JLabel label = new JLabel(icon);

        
        label.setSize(icon.getIconWidth(), icon.getIconHeight());
        label.setLocation(0,0);

        
        getContentPane().add(label);
	
	// label=new JPanel();
	   // label.setSize(new Dimension(700, 450));
         // label.setBackground(Color.blue);
         // label.setLayout(null);
		 
		 	l1=new JLabel("Select seat type");
	 l1.setFont(new Font("Serif", Font.BOLD, 22));
        l1.setForeground(Color.blue);
        l1.setBounds(200, 20, 300, 40);
		add(l1);
      label.add(l1);
	  
	 
		 	l2=new JLabel("Economy");
	 l2.setFont(new Font("Serif", Font.BOLD, 22));
        l2.setForeground(Color.white);
        l2.setBounds(25, 250, 200, 40);
	
      label.add(l2);  
	  
	   	l3=new JLabel("Business");
	 l3.setFont(new Font("Serif", Font.BOLD, 22));
        l3.setForeground(Color.white);
        l3.setBounds(245, 250, 200, 40);
	
      label.add(l3);
	  
	  	 l4=new JLabel("First class");
	     l4.setFont(new Font("Serif", Font.BOLD, 30));
         l4.setForeground(Color.white);
         l4.setBounds(460, 250, 200, 40);
	     label.add(l4);
	  
	  b1 = new JButton("1000tk");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.black);
		b1.setBounds(20,300, 200, 40);
		//b1.addActionListener(this);
		label.add(b1);
		
		b2 = new JButton("3000tk");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.black);
		b2.setBounds(240,300,200,40);
		label.add(b2);
	  
	  b3= new JButton("6000tk");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.black);
		b3.setBounds(460,300,200,40);
		label.add(b3);
		
		registerb=new JButton("Back");
		registerb.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		registerb.setForeground(Color.red);
		registerb.setBounds(550,350, 110, 30);
		label.add(registerb);
		
		
		 registerb.addActionListener(new ActionListener()
		  {
		 
		 public void actionPerformed(ActionEvent e)
		 {
			 
		 Page8 z1=new Page8();
	       z1.setVisible(true);
		 
			
		}
		});
		
		b1.addActionListener(new ActionListener()
		  {
		 
		 public void actionPerformed(ActionEvent e)
		 {
			 
		 Page5 z1=new Page5();
	       z1.setVisible(true);
		 
			
		}
		});
		
				b2.addActionListener(new ActionListener()
		  {
		 
		 public void actionPerformed(ActionEvent e)
		 {
			 
		 Page6 z1=new Page6();
	       z1.setVisible(true);
		 
			
		}
		});
		
				b3.addActionListener(new ActionListener()
		  {
		 
		 public void actionPerformed(ActionEvent e)
		 {
			 
		 Page7 z1=new Page7();
	       z1.setVisible(true);
		 
			
		}
		});
	  
	  this.add(label);
	}
}
	  