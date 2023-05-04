import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;


public class Page1 extends JFrame                                                                           
{  
	
	JPanel label,p2;

	JLabel l1,l2,l3,imgL;         
	JTextField t1,t2;       
	JButton b1,b2,registerb;   
	JPasswordField f1;    



 	String usn,pass;

	public	ImageIcon img;
	           
	public Page1()
	{
	        
	
	
	super(" LOCO HUNT ");
	this.setSize(700,450);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	

        
        String imagePath = "logo.png";

       
        ImageIcon icon = new ImageIcon(imagePath);

       
        JLabel label = new JLabel(icon);

        
        label.setSize(icon.getIconWidth(), icon.getIconHeight());
        label.setLocation(0, 0);

        
        getContentPane().add(label);
    
	
	// label=new JPanel();
	   // label.setSize(new Dimension(700, 450));
         // label.setBackground(Color.blue);
         // label.setLayout(null);
		 
		
	
	l1=new JLabel("User Name");
	  l1.setFont(new Font("Serif", Font.PLAIN, 15));
         l1.setForeground(Color.black);
         l1.setBounds(350, 100, 80, 40);
       label.add(l1);
	   
	   l2=new JLabel("Password");
	 l2.setFont(new Font("Serif", Font.PLAIN, 15));
        l2.setForeground(Color.black);
        l2.setBounds(350, 150, 80, 40);
	    label.add(l2);
l3=new JLabel("Welcome to LocoHunt");
	l3.setFont(new Font("Serif", Font.BOLD, 20));
        l3.setBounds(350, 20, 200, 50);
		l3.setForeground(Color.black);
        label.add(l3);	
	
	t1=new JTextField();
	t1.setBounds(440, 100, 100, 40);
        label.add(t1);
		
		
	f1=new JPasswordField();
	 f1.setBounds(440, 150, 100, 40);
        label.add(f1);
		
		
		b1 = new JButton("Login");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.black);
		b1.setBounds(360, 200, 80, 25);
		
		label.add(b1);
		
		
		b2 = new JButton("clear");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.black);
		b2.setBounds(450,200,100,25);
		label.add(b2);
		
		registerb=new JButton("Register");
		registerb.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		registerb.setForeground(Color.black);
		registerb.setBounds(550,350, 110, 30);
		label.add(registerb);
		
		 b2.addActionListener(new ActionListener(){
		 
		 public void actionPerformed(ActionEvent e)
		 {
			 t1.setText("");
			 f1.setText("");
			
		}
		
		 });
		 
		  b1.addActionListener(new ActionListener()
		  {
		 
		 public void actionPerformed(ActionEvent e)
		 {
			 String usn=t1.getText();
			 String pass=f1.getText();
			 
			 if(usn.equals("zaheen") && pass.equals("456"))
			 { 
		 JOptionPane.showMessageDialog(null,"LOGIN SUCCESSFUL");
		 Page8 z1=new Page8();
	       z1.setVisible(true);
		 
			
		}
		
		else{
			JOptionPane.showMessageDialog(null,"LOGIN FAILED");
			
		}

		  }
	});
	
	registerb.addActionListener(new ActionListener(){
		 
		 public void actionPerformed(ActionEvent e)
		 {
			 Page2 pg2= new Page2();
		 pg2.setVisible(true);	
			
		}
		
		 });
	
	this.add(label);
	 
}
}


