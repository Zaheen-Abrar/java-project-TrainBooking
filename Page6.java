import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
public class Page6 extends JFrame {

    

       
		JPanel p1,buttonPanel;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2;
	JButton b1,b2,b3,registerb;
	JPasswordField f1;
	String usn,pass;
	ImageIcon img;
	
	
	public Page6()
	{
	super(" Business class seats ");
	this.setSize(700,450);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	p1=new JPanel();
	   p1.setSize(new Dimension(700, 450));
         p1.setBackground(Color.blue);
         p1.setLayout(null);
		 
		  JLabel label = new JLabel("Business Class Seats");
         label.setHorizontalAlignment(JLabel.CENTER);
		 label.setForeground(Color.white);
         label.setBounds(0, 0, 700, 50); 
         p1.add(label);
		

        
          JPanel buttonPanel = new JPanel(new GridLayout(3, 5)); 
		  buttonPanel.setBounds(350,50,350,300);
		  p1.add(buttonPanel);
        for (int i = 1; i <= 15; i++) {
            JButton button = new JButton("B" + i);
            button.setPreferredSize(new Dimension(20, 20));
			
            buttonPanel.add(button);
        
		button.addActionListener(new ActionListener()
		  {
		 
		 public void actionPerformed(ActionEvent e)
		 {
			 
		 Busi z1=new Busi();
	       z1.setVisible(true);
		 
			
		}
		});
		
		
		}
       

        JButton backButton = new JButton("Back");
        backButton.setBounds(550,352, 110, 30); 
		backButton.setForeground(Color.red);
        p1.add(backButton);
		
		
		 backButton.addActionListener(new ActionListener()
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
