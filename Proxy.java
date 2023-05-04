import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;


public class Proxy extends JFrame 
{
	public JLabel background;
	public ImageIcon img; 
	
	public Proxy(){
		
		setSize(700,450);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	ImageIcon img =new ImageIcon("train.jpg");
	Image pic=img.getImage();
	Image temp_pic=pic.getScaledInstance(700,450,Image.SCALE_SMOOTH);
	img =new ImageIcon(temp_pic); 
	 background=new JLabel("",img, JLabel.CENTER);
	background.setBounds(0,0,700,450);
	background.setVisible(true);
	add(background);
	
	
	
	}

	

	public static void main (String [] args)
	{
	Proxy l1=new Proxy();
	l1.show();
	}
}
	
	
	
	