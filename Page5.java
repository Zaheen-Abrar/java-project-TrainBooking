import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
public class Page5 extends JFrame {

    

       
		JPanel p1,buttonPanel;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2;
	JButton b1,b2,b3,registerb;
	JPasswordField f1;
	String usn,pass;
	ImageIcon img;
	
	
	public Page5()
	{
	super(" Economy class seats ");
	this.setSize(700,450);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	// p1=new JPanel();
	   // p1.setSize(new Dimension(700, 450));
         // p1.setBackground(Color.blue);
         // p1.setLayout(null);
		 String imagePath = "arrange.PNG";

       
        ImageIcon icon = new ImageIcon(imagePath);

       
        JLabel ilabel = new JLabel(icon);

        
        ilabel.setSize(icon.getIconWidth(), icon.getIconHeight());
        ilabel.setLocation(0, 0);

        
        getContentPane().add(ilabel);
		 
		  JLabel label = new JLabel("Economy Class Seats");
         label.setHorizontalAlignment(JLabel.CENTER);
		 label.setForeground(Color.black);
         label.setBounds(0, 0, 700, 50); 
         ilabel.add(label);
		

        
          JPanel buttonPanel = new JPanel(new GridLayout(3, 5)); 
		  buttonPanel.setBounds(350,50,350,300);
		  ilabel.add(buttonPanel);
        for (int i = 1; i <= 15; i++) {
            JButton button = new JButton("E" + i);
            button.setPreferredSize(new Dimension(20, 20));
			
            buttonPanel.add(button);
        
				 button.addActionListener(new ActionListener()
		  {
		 
		 public void actionPerformed(ActionEvent e)
		 {
			 
		 Facility z1=new Facility();
	       z1.setVisible(true);
		 
			
		}
		});
		
		}
       

        JButton backButton = new JButton("Back");
        backButton.setBounds(550,352, 110, 30); 
		backButton.setForeground(Color.red);
        ilabel.add(backButton);
		
		
		 backButton.addActionListener(new ActionListener()
		  {
		 
		 public void actionPerformed(ActionEvent e)
		 {
			 
		 Page4 z1=new Page4();
	       z1.setVisible(true);
		 
			
		}
		});
		
		

		
		


		this.add(ilabel);
		
    }
}
