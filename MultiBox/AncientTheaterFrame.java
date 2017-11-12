/*  
*Author: Paraskevakos G. | 2017 
*/

package MultiBox;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class AncientTheaterFrame extends JFrame 
{

	/**
	 *private attributes
	 */	
	private JPanel panel;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run() 
			{
				try 
				{
					AncientTheaterFrame frame = new AncientTheaterFrame();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}// end main function

		/**
		 * Create the frame.
		 */
	public AncientTheaterFrame() 
	{
			
			
		// äçìéïõñãßá obgect myTheater
		MultidimensionalTheater myTheater = new MultidimensionalTheater(4, 8);
		setTitle("\u0395\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE \u039A\u03C1\u03AC\u03C4\u03B7\u03C3\u03B7\u03C2 \u0398\u03AD\u03C3\u03B5\u03C9\u03BD"); // "ÅöáñìïãÞ ÊñÜôçóçò ÈÝóåùí"
		setBounds(100, 100, 1268, 707);
        setSize(1240,720);
        setLocationRelativeTo(null);
        setResizable(false);
		setFont(new Font("Times New Roman", Font.PLAIN, 12));
		setBackground(new Color(51, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// absolute Layout manager
        panel = new JPanel();
        setContentPane(panel);
        panel.setLayout(null); 
		
		
		//"ÈÝáôñï Áõëáßá", ðåäßï ðïõ åìöáíßæåôáé ùò header
		JLabel label = new JLabel("\u2202\u03AD\u03B1\u03C4\u03C1\u03BF \u0391\u03C5\u03BB\u03B1\u03AF\u03B1");
		label.setForeground(new Color(0, 51, 0));
		label.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(294, 11, 658, 93);
		panel.add(label);
		
		// "ÓÊÇÍÇ", ðåäßï ðïõ åìöáíßæåôáé êÜôù áðü ôï header
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		textField.setText("\u03A3\u039A\u0397\u039D\u0397");
		textField.setBackground(new Color(0, 102, 102));
		textField.setBounds(195, 84, 834, 93);
		textField.setColumns(10);
		panel.add(textField);
		
		//ðåäßï ðïõ åìöáíßæåé ôçí êáôÜóôáóç ôçò èÝóçò
		JLabel lblOutput = new JLabel("");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblOutput.setBounds(442, 577, 352, 41);
		panel.add(lblOutput);
		
	
		/**
		 * ÈÝóåéò èåÜôñïõ
		 */
		//èÝóç A1
		JButton btnA1 = new JButton("\u0398\u0395\u03A3\u0397 A1");
		btnA1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnA1.setBounds(476, 240, 131, 58);
		btnA1.setBackground(Color.GREEN);
		panel.add(btnA1);
		
		btnA1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnA1.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(0,0); //ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò A1!"); //åìöÜíéóå ìÞíõìá
					btnA1.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(0,0); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnA1.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò A1"); //åìöÜíéóå ìÞíõìá
				}
			}
		}); //end btnA1.addActionListener(new ActionListener()
		
		//èÝóç A2	
		JButton btnA2 = new JButton("\u0398\u0395\u03A3\u0397 A2");
		btnA2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnA2.setBounds(617, 240, 131, 58);
		btnA2.setBackground(Color.GREEN);
		panel.add(btnA2);
		
		btnA2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnA2.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(0,1); //ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò A2!"); //åìöÜíéóå ìÞíõìá
					btnA2.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(0,1); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnA2.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò A2"); //åìöÜíéóå ìÞíõìá
				}
			}
		}); //end btnA2.addActionListener(new ActionListener()
		
		//èÝóç B1
		JButton btnB1 = new JButton("\u0398\u0395\u03A3\u0397 B1");
		btnB1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnB1.setBounds(336, 309, 131, 58);
		btnB1.setBackground(Color.GREEN);
		panel.add(btnB1);
		
		btnB1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnB1.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(1,0);//ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò B1!"); //åìöÜíéóå ìÞíõìá
					btnB1.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(1,0); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnB1.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò B1"); //åìöÜíéóå ìÞíõìá
				}
			}
		}); //end btnB1.addActionListener(new ActionListener()
		
		//èÝóç B2
		JButton btnB2 = new JButton("\u0398\u0395\u03A3\u0397 B2");
		btnB2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnB2.setBounds(476, 309, 131, 58);
		btnB2.setBackground(Color.GREEN);
		panel.add(btnB2);
		
		btnB2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnB2.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(1,1); //ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò B2!"); //åìöÜíéóå ìÞíõìá
					btnB2.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(1,1); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnB2.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò B2"); //åìöÜíéóå ìÞíõìá
				}
			}
		}); //end btnB2.addActionListener(new ActionListener()
		
		//èÝóç B3
		JButton btnB3 = new JButton("\u0398\u0395\u03A3\u0397 B3");
		btnB3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnB3.setBounds(617, 309, 131, 58);
		btnB3.setBackground(Color.GREEN);
		panel.add(btnB3);
		
		btnB3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnB3.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(1,2); //ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò B3!"); //åìöÜíéóå ìÞíõìá
					btnB3.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(1,2); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnB3.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò B3"); //åìöÜíéóå ìÞíõìá
				}
			}
		}); //end btnB3.addActionListener(new ActionListener()
		
		//èÝóç B4
		JButton btnB4 = new JButton("\u0398\u0395\u03A3\u0397 B4");
		btnB4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnB4.setBounds(757, 309, 131, 58);
		btnB4.setBackground(Color.GREEN);
		panel.add(btnB4);
		
		btnB4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnB4.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(1,3); //ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò B4!"); //åìöÜíéóå ìÞíõìá
					btnB4.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(1,3); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnB4.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò B4"); //åìöÜíéóå ìÞíõìá
				}
			}
		}); //end btnB4.addActionListener(new ActionListener()
		
		//èÝóç C1
		JButton btnC1 = new JButton("\u0398\u0395\u03A3\u0397 C1");
		btnC1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnC1.setBounds(195, 378, 131, 58);
		btnC1.setBackground(Color.GREEN);
		panel.add(btnC1);
		
		btnC1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnC1.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(2,0); //ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò C1!"); //åìöÜíéóå ìÞíõìá
					btnC1.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	 
				else 
				{
					myTheater.makeFree(2,0); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnC1.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò C1"); //åìöÜíéóå ìÞíõìá
				}
			}
		}); //end btnC1.addActionListener(new ActionListener()
		
		//èÝóç C2
		JButton btnC2 = new JButton("\u0398\u0395\u03A3\u0397 C2");
		btnC2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnC2.setBounds(336, 378, 131, 58);
		btnC2.setBackground(Color.GREEN);
		panel.add(btnC2);
		
		btnC2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnC2.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(2,1); //ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò C2!"); //åìöÜíéóå ìÞíõìá
					btnC2.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(2,1); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnC2.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò C2"); //åìöÜíéóå ìÞíõìá
				}
			}
		}); //end btnC2.addActionListener(new ActionListener()
		
		//èÝóç C3
		JButton btnC3 = new JButton("\u0398\u0395\u03A3\u0397 C3");
		btnC3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnC3.setBounds(476, 378, 131, 58);
		btnC3.setBackground(Color.GREEN);
		panel.add(btnC3);
		
		btnC3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnC3.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(2,2); //ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò C3!"); //åìöÜíéóå ìÞíõìá
					btnC3.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(2,2); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnC3.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò C3"); //åìöÜíéóå ìÞíõìá
				}
			}
		}); //end btnC3.addActionListener(new ActionListener()
		
		//èÝóç C4
		JButton btnC4 = new JButton("\u0398\u0395\u03A3\u0397 C4");
		btnC4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnC4.setBounds(617, 378, 131, 58);
		btnC4.setBackground(Color.GREEN);
		panel.add(btnC4);
		
		btnC4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnC4.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(2,3); //ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò C4!"); //åìöÜíéóå ìÞíõìá
					btnC4.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(2,3); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnC4.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò C4"); //åìöÜíéóå ìÞíõìá
				}
			}
		}); //end btnC4.addActionListener(new ActionListener()
		
		//èÝóç C5
		JButton btnC5 = new JButton("\u0398\u0395\u03A3\u0397 C5");
		btnC5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnC5.setBackground(Color.GREEN);
		btnC5.setBounds(757, 378, 131, 58);
		panel.add(btnC5);
		
		btnC5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnC5.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(2,4);//ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò C5!"); //åìöÜíéóå ìÞíõìá
					btnC5.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(2,4); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnC5.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò C5"); //åìöÜíéóå ìÞíõìá
				}
			}
		}); //end btnC5.addActionListener(new ActionListener()
		
		//èÝóç C6
		JButton btnC6 = new JButton("\u0398\u0395\u03A3\u0397 C6");
		btnC6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnC6.setBackground(Color.GREEN);
		btnC6.setBounds(898, 378, 131, 58);
		panel.add(btnC6);
		
		btnC6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnC6.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(2,5); //ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò C6!"); //åìöÜíéóå ìÞíõìá
					btnC6.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(2,5); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnC6.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò C6"); //åìöÜíéóå ìÞíõìá
				}
			}
		}); //end btnC6.addActionListener(new ActionListener()
		
		//èÝóç D1
		JButton btnD1 = new JButton("\u0398\u0395\u03A3\u0397 D1");
		btnD1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnD1.setBackground(Color.GREEN);
		btnD1.setBounds(54, 447, 131, 58);
		panel.add(btnD1);
		
		btnD1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnD1.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(3,0); //ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò D1!"); //åìöÜíéóå ìÞíõìá
					btnD1.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(3,0);//ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnD1.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò D1"); //åìöÜíéóå ìÞíõìá
				}
			}
		}); //end btnD1.addActionListener(new ActionListener()
		
		//èÝóç D2
		JButton btnD2 = new JButton("\u0398\u0395\u03A3\u0397 D2");
		btnD2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnD2.setBackground(Color.GREEN);
		btnD2.setBounds(195, 447, 131, 58);
		panel.add(btnD2);
		
		btnD2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnD2.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(3,1); //ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò D2!"); //åìöÜíéóå ìÞíõìá
					btnD2.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(3,1); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnD2.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò D2"); //åìöÜíéóå ìÞíõìá
				}
			}
		}); //end btnD2.addActionListener(new ActionListener()
		
		//èÝóç D3
		JButton btnD3 = new JButton("\u0398\u0395\u03A3\u0397 D3");
		btnD3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnD3.setBackground(Color.GREEN);
		btnD3.setBounds(336, 447, 131, 58);
		panel.add(btnD3);
		
		btnD3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnD3.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(3,2); //ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò D3!"); //åìöÜíéóå ìÞíõìá
					btnD3.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(3,2); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnD3.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò D3"); //åìöÜíéóå ìÞíõìá
				}
			}
		}); //end btnD3.addActionListener(new ActionListener()
		
		//èÝóç D4
		JButton btnD4 = new JButton("\u0398\u0395\u03A3\u0397 D4");
		btnD4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnD4.setBackground(Color.GREEN);
		btnD4.setBounds(476, 447, 131, 58);
		panel.add(btnD4);
		
		btnD4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnD4.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(3,3); //ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò D4!"); //åìöÜíéóå ìÞíõìá
					btnD4.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(3,3); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnD4.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò D4"); //åìöÜíéóå ìÞíõìá
				}
			}
		}); //end btnD4.addActionListener(new ActionListener()
		
		//èÝóç D5
		JButton btnD5 = new JButton("\u0398\u0395\u03A3\u0397 D5");
		btnD5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnD5.setBackground(Color.GREEN);
		btnD5.setBounds(617, 447, 131, 58);
		panel.add(btnD5);
		
		btnD5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnD5.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(3,4); //ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò D5!"); //åìöÜíéóå ìÞíõìá
					btnD5.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(3,4); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnD5.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò D5"); //åìöÜíéóå ìÞíõìá
				}
			}
		}); //end btnD5.addActionListener(new ActionListener()
		
		//èÝóç D6
		JButton btnD6 = new JButton("\u0398\u0395\u03A3\u0397 D6");
		btnD6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnD6.setBackground(Color.GREEN);
		btnD6.setBounds(757, 447, 131, 58);
		panel.add(btnD6);
		
		btnD6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnD6.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(3,5); //ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò D6!"); //åìöÜíéóå ìÞíõìá
					btnD6.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(3,5); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnD6.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò D6");//åìöÜíéóå ìÞíõìá
				}
			}
		}); //end btnD6.addActionListener(new ActionListener()
		
		//èÝóç D7
		JButton btnD7 = new JButton("\u0398\u0395\u03A3\u0397 D7");
		btnD7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnD7.setBackground(Color.GREEN);
		btnD7.setBounds(898, 447, 131, 58);
		panel.add(btnD7);
		
		btnD7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (btnD7.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(3,6); //ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò D7!"); //åìöÜíéóå ìÞíõìá
					btnD7.setBackground(Color.RED);// Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(3,6);//ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnD7.setBackground(Color.GREEN);// Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò D7");//åìöÜíéóå ìÞíõìá
				}
			}
		});//end btnD7.addActionListener(new ActionListener()
		
		//èÝóç D8
		JButton btnD8 = new JButton("\u0398\u0395\u03A3\u0397 D8");
		btnD8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnD8.setBackground(Color.GREEN);
		btnD8.setBounds(1038, 447, 131, 58);
		panel.add(btnD8);
		
		btnD8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
				if (btnD8.getBackground()== Color.GREEN) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé ðñÜóéíï
				{
					myTheater.makeBook(3,7); //ÊÜëåóå ôçí makeBook() êáé äÝóìåõóå ôçí èÝóç
					lblOutput.setVisible(true); //üñéóå ôï ðåäßï JLabel lblOutput ïñáôü
					lblOutput.setText("Åðéôõ÷Þò ÄÝóìåõóç ôçò èÝóçò D8!"); //åìöÜíéóå ìÞíõìá
					btnD8.setBackground(Color.RED); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå êüêêéíï
				}	
				else 
				{
					myTheater.makeFree(3,7); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnD8.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("ÁðïäÝóìåõóç èÝóçò D8"); //åìöÜíéóå ìÞíõìá
				}	
			}
		}); //end btnD8.addActionListener(new ActionListener()
		
		
		
		//Êïõìðß ãéá áêýñùóç üëùí ôùí êñáôçìÝíùí èÝóåùí
		JButton btnClear = new JButton("\u0391\u03BA\u03CD\u03C1\u03C9\u03C3\u03B7 \u03CC\u03BB\u03C9\u03BD \u03C4\u03C9\u03BD \u03BA\u03C1\u03B1\u03C4\u03AE\u03C3\u03B5\u03C9\u03BD");
		btnClear.setFont(new Font("Arial", Font.BOLD, 12));
		btnClear.setBackground(new Color(0, 191, 255));
		btnClear.setBounds(476, 516, 272, 23);
		panel.add(btnClear);
		
		btnClear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
					
				if (btnA1.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(0,0); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnA1.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnA2.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(0,1); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnA2.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnB1.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(1,0); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnB1.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnB2.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(1,1); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnB2.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnB3.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(1,2); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnB3.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnB4.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(1,3); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnB4.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnC1.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(2,0); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnC1.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnC2.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(2,1); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnC2.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnC3.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(2,2); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnC3.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnC4.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(2,3); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnC4.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï 
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnC5.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(2,4); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnC5.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnC6.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(2,5); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnC6.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnD1.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(3,0); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnD1.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnD2.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(3,1); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnD2.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnD3.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(3,2); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnD3.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnD4.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(3,3); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnD4.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnD5.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(3,4); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnD5.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnD6.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(3,5); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnD6.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnD7.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{ 
					myTheater.makeFree(3,6); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnD7.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				if (btnD8.getBackground()== Color.RED) //åÜí ôï ÷ñþìá ôïõ êïõìðéïý åéíáé êüêêéíï
				{
					myTheater.makeFree(3,7); //ÊÜëåóå ôçí makeFree() êáé åëåõèÝñùóå ôçí èÝóç
					btnD8.setBackground(Color.GREEN); // Üëëáîå ôï ÷ñþìá ôïõ êïõìðéïý óå ðñÜóéíï
					lblOutput.setText("¼ëåò ïé êñáôÞóåéò áêõñþèçêáí!"); //åìöÜíéóå ìÞíõìá
				}
				
			}
		});//end btnClear.addActionListener
		
	} //end constructor AncientTheaterFrame
	
} //end class AncientTheaterFrame
