import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;



public class Page11 extends JFrame 
{
	
	public JPanel p1,p2;
	public JLabel l1,l2,l3,imgL;
public	JTextField t1,t2;
	public JButton b1,b2,b3,b4,registerb;
public	JPasswordField f1;
public	String usn,pass;
public	ImageIcon img;
	
	
	public  Page11()
	{
	super(" DESTINATION ");
	this.setSize(700,450);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(null);
	
	p1=new JPanel();
	    p1.setSize(new Dimension(700, 450));
         p1.setBackground(Color.blue);
         
		p1.setLayout(null);
		
	l1=new JLabel("Choose Norail Express Destination");
	 l1.setFont(new Font("Serif", Font.BOLD, 30));
        l1.setForeground(Color.white);
        l1.setBounds(200, 20, 300, 40);
		add(l1);
      p1.add(l1);
	   
	ImageIcon img =new ImageIcon("sikkim.jpg");
	imgL=new JLabel(img);
	imgL.setBounds(15,30,70,80);
	imgL.setVisible(true);
	p1.add(imgL);
	
	b1 = new JButton("Khulna");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.black);
		b1.setBounds(10, 250, 100, 25);
		p1.add(b1);
		
	
		b2 = new JButton("Barishal");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.black);
		b2.setBounds(170, 250, 120, 25);
		p1.add(b2);
		
		b3 = new JButton("Sylhet");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.black);
		b3.setBounds(340, 250, 120, 25);
		p1.add(b3);
		
			b4 = new JButton("Cumilla");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b4.setForeground(Color.black);
		b4.setBounds(480, 250, 120, 25);
		p1.add(b4);
	
	registerb=new JButton("Back");
		registerb.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		registerb.setForeground(Color.red);
		registerb.setBounds(550,350, 110, 30);
		p1.add(registerb);
		
		
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
			 
		 Page4 z1=new Page4();
	       z1.setVisible(true);
		 
			
		}
		});
		
		  b2.addActionListener(new ActionListener()
		  {
		 
		 public void actionPerformed(ActionEvent e)
		 {
			 
		 Page4 z1=new Page4();
	      z1.setVisible(true);
		 
			
		}
		});
		
		
		  b3.addActionListener(new ActionListener()
		  {
		 
		 public void actionPerformed(ActionEvent e)
		 {
			 
		 Page4 z1=new Page4();
	       z1.setVisible(true);
		 
			
		}
		});
		
		  b4.addActionListener(new ActionListener()
		  {
		 
		 public void actionPerformed(ActionEvent e)
		 {
			 
		 Page4 z1=new Page4();
	       z1.setVisible(true);
		 
			
		}
		});
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	this.add(p1);
	}
	
}
