import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class Page2 extends JFrame
{
	
	JPanel p1,label;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b1,b2;
	JComboBox c1;
	public	ImageIcon img;
	public Page2()
	{
		
		
		
		
		super("REGISTER FORM");
		this.setSize(700,450);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	 
        String imagePath = "register.png";

       
        ImageIcon icon = new ImageIcon(imagePath);

       
        JLabel label = new JLabel(icon);

        
        label.setSize(icon.getIconWidth(), icon.getIconHeight());
        label.setLocation(0, 0);

        
        getContentPane().add(label);
	
	 p1=new JPanel();
	  p1.setSize(new Dimension(700, 30));
         p1.setBackground(Color.red);
         p1.setLayout(null);
		
	 //label=new JPanel();
	 //label.setSize(new Dimension(700, 420));
        //label.setBackground(Color.blue);
        //label.setLayout(null);
		
		l6=new JLabel("REGISTER FORM");
	l6.setFont(new Font("Serif", Font.BOLD, 20));
        l6.setBounds(280, 10, 200, 20);
        p1.add(l6);
		
		
		l1=new JLabel("FIRST NAME");
	 l1.setFont(new Font("Serif", Font.PLAIN, 15));
        l1.setForeground(Color.black);
        l1.setBounds(350, 35, 200, 30);
       label.add(l1);
		
		
	l2=new JLabel("LAST NAME");
	 l2.setFont(new Font("Serif", Font.PLAIN, 15));
        l2.setForeground(Color.black);
        l2.setBounds(350, 70, 200, 30);
       label.add(l2);
		
		
		l3=new JLabel("USER NAME");
	 l3.setFont(new Font("Serif", Font.PLAIN, 15));
        l3.setForeground(Color.black);
        l3.setBounds(350, 105, 200, 30);
       label.add(l3);

	l4=new JLabel("PASSWORD");
	 l4.setFont(new Font("Serif", Font.PLAIN, 15));
        l4.setForeground(Color.black);
        l4.setBounds(350, 130, 200, 30);
       label.add(l4);
		
		l5=new JLabel(" RETYPE PASS");
	 l5.setFont(new Font("Serif", Font.PLAIN, 15));
        l5.setForeground(Color.black);
        l5.setBounds(350, 175, 200, 30);
       label.add(l5);
		
		
	l7=new JLabel(" BIRTH DATE");
	 l7.setFont(new Font("Serif", Font.PLAIN, 15));
        l7.setForeground(Color.black);
        l7.setBounds(350, 210, 200, 30);
       label.add(l7);
		
		l8=new JLabel(" ADDRESS");
	 l8.setFont(new Font("Serif", Font.PLAIN, 15));
        l8.setForeground(Color.black);
        l8.setBounds(350, 245, 200, 30);
       label.add(l8);
		
		t1=new JTextField();
	t1.setBounds(555, 35, 100, 30);
       label.add(t1);
		
		t2=new JTextField();
	 t2.setBounds(555, 70, 100, 30);
       label.add(t2);
		
		t3=new JTextField();
	 t3.setBounds(555,105 , 100, 30);
       label.add(t3);
		
		t4=new JTextField();
	 t4.setBounds(555, 140, 100, 30);
       label.add(t4);
		
		t5=new JTextField();
	 t5.setBounds(555, 175, 100, 30);
       label.add(t5);
 	
		c1 =new JComboBox();
		c1.setBounds(555, 210, 100, 30);
		label.add(c1);
		
		t6=new JTextField();
	 t6.setBounds(555, 245, 100, 60);
       label.add(t6);
		
			b1 = new JButton("CANCEL");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.green);
		b1.setBounds(360, 315, 90, 30);
		//b1.addActionListener(this);
		label.add(b1);
	
		b2 = new JButton("REGISTER");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.green);
		b2.setBounds(450,315,100,30);
		label.add(b2);
		//b2.addActionListener(this);
		
	 label.add(p1);		
        //this.add(label);
		}
}
