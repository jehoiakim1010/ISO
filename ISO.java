import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import java.awt.Window.Type;

public class ISO {

	
	private JFrame frmSecondLifeA;
	Border raisedBorder = BorderFactory.createRaisedBevelBorder();
	
	ImageIcon image;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ISO window = new ISO();
					window.frmSecondLifeA.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ISO() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frmSecondLifeA = new JFrame();
		frmSecondLifeA.setResizable(false);
		frmSecondLifeA.setLocationRelativeTo(null);
		frmSecondLifeA.setUndecorated(true);
		frmSecondLifeA.setTitle("Second Life: A 3D Desktop Role-Playing Game");
		frmSecondLifeA.getContentPane().setBackground(Color.WHITE);
		frmSecondLifeA.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 0));
		panel.setBounds(404, 0, 302, 461);
		frmSecondLifeA.getContentPane().add(panel);
		
		JButton btnDocumentation = new JButton("Documentation");
		btnDocumentation.setBackground(new Color(255, 240, 178));
		btnDocumentation.setBorder(raisedBorder);
		btnDocumentation.setBounds(51, 40, 201, 39);
		btnDocumentation.setFont(new Font("Calibri", Font.PLAIN, 13));
		btnDocumentation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        String filePath = "files/Second-Life-Thesis-checked.pdf";
				File file = new File(filePath);
				
				if (file.exists())
				{
					try 
					{
						Desktop.getDesktop().open(file);	
					} 
					catch (IOException e1) 
					{
						JOptionPane.showMessageDialog(null, "Can't Open The File");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Cannot Find The File");
				}
			}
		});
		panel.setLayout(null);
		panel.add(btnDocumentation);
		
		JButton btnPresentation = new JButton("Presentation");
		btnPresentation.setBounds(51, 119, 201, 39);
		btnPresentation.setBackground(new Color(255, 240, 178));
		btnPresentation.setBorder(raisedBorder);
		btnPresentation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Change The File Path
		        String filePath = "files/SECOND_LIFE_PRESENTATION.pptx";
				File file = new File(filePath);
				
				if (file.exists())
				{
					try 
					{
						Desktop.getDesktop().open(file);	
					} 
					catch (IOException e1) 
					{
						JOptionPane.showMessageDialog(null, "Can't Open The File");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Cannot Find The File");
				}
				
			}
		});
		btnPresentation.setFont(new Font("Calibri", Font.PLAIN, 13));
		panel.add(btnPresentation);
		
		JButton btnUserManual = new JButton("User Manual");
		btnUserManual.setBounds(51, 198, 201, 39);
		btnUserManual.setBackground(new Color(255, 240, 178));
		btnUserManual.setBorder(raisedBorder);
		btnUserManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Change The File Path
		        String filePath = "files/Second-Life-Thesis-checked.pdf";
				File file = new File(filePath);
				
				if (file.exists())
				{
					try 
					{
						Desktop.getDesktop().open(file);	
					} 
					catch (IOException e1) 
					{
						JOptionPane.showMessageDialog(null, "Can't Open The File");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Cannot Find The File");
				}
				/*
				File OriginalFile = new File("SECOND_LIFE_PRESENTATION.pptx");
				File newFile = new File("BACKUP.pptx");
				
		        Path sourceDirectory = Paths.get("files/name");
		        Path targetDirectory = Paths.get("D:/Downloads/append1000.txt");
		        
		        try {
		            Files.copy(sourceDirectory, targetDirectory,StandardCopyOption.REPLACE_EXISTING);
		        } catch (IOException ex) {
		            System.out.println(ex.toString());
		        }
		        */
		        
				/*
				if (file.exists())
				{
					try 
					{
						Desktop.getDesktop().open(file);	
					} 
					catch (IOException e1) 
					{
						JOptionPane.showMessageDialog(null, "Can't Open The File");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Cannot Find The File");
				}
				*/
			}
		});
		btnUserManual.setFont(new Font("Calibri", Font.PLAIN, 13));
		panel.add(btnUserManual);
		

	    
		JButton btnInstaller = new JButton("Installer");
		btnInstaller.setBounds(51, 277, 201, 39);
		btnInstaller.setBackground(new Color(255, 240, 178));
		btnInstaller.setBorder(raisedBorder);
		btnInstaller.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Change The File Path
		        String filePath = "files/SecondLifeInstaller.exe";
				File file = new File(filePath);
				
				if (file.exists())
				{
					try 
					{
						Desktop.getDesktop().open(file);	
					} 
					catch (IOException e1) 
					{
						JOptionPane.showMessageDialog(null, "Can't Open The File");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Cannot Find The File");
				}
				/*
				
				//this.getClass().getClassLoader().getResource("test.png"));
				/*
				  InputStream is = ISO.class.getClassLoader().getResourceAsStream("file.txt");
	  
				  
					/*
		    installerfile = new File(getClass().getResource("SecondLifeInstaller.exe").getFile());
			
			System.out.println(installerfile);
			
			if (installerfile.exists())
			{
				try 
				{
					Desktop.getDesktop().open(installerfile);	
				} 
				catch (IOException e1) 
				{
					JOptionPane.showMessageDialog(null, "Can't Open The File");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Cannot Find The File");
			}
*/

				/*
				URL installerfileurl = ISO.class.getResource("SecondLifeInstaller.exe");
				
				System.out.println(installerfileurl);
				try {
					
					Paths.get(installerfileurl.toURI()).toFile();
					
					File path = Paths.get(installerfileurl.toURI()).toFile();
					
					Process pro = Runtime.getRuntime().exec( "rundll32 url.dll,FileProtocolHandler "+path);

					pro.waitFor();
				
					
				} catch (URISyntaxException e1) {
					
					JOptionPane.showMessageDialog(null, "Cannot Find The File");
					
				} catch (IOException e1) {
					
					JOptionPane.showMessageDialog(null, "Can't Open The File");
					
					e1.printStackTrace();
				} catch (InterruptedException e1) {
					
					JOptionPane.showMessageDialog(null, "Cannot Find The File");
				}
				*/
			}
			});
		
		btnInstaller.setFont(new Font("Calibri", Font.PLAIN, 13));
		panel.add(btnInstaller);
		
		JButton BtnExit = new JButton("Exit");
		BtnExit.setBounds(51, 356, 201, 39);
		BtnExit.setBackground(new Color(255, 240, 178));
		BtnExit.setBorder(raisedBorder);
		BtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		BtnExit.setFont(new Font("Calibri", Font.PLAIN, 13));
		panel.add(BtnExit);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(1, 88, 168));
		panel_1.setBounds(0, 0, 406, 461);
		frmSecondLifeA.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTtitle = new JLabel("STI College Marikina");
		lblTtitle.setBounds(67, 46, 261, 31);
		lblTtitle.setForeground(Color.YELLOW);
		lblTtitle.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_1.add(lblTtitle);
		
		JLabel lblDescription = new JLabel("Second Life");
		lblDescription.setForeground(Color.YELLOW);
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblDescription.setBounds(116, 114, 168, 104);
		panel_1.add(lblDescription);
		
		JLabel lblDescription1 = new JLabel("A 3D Desktop");
		lblDescription1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescription1.setForeground(Color.YELLOW);
		lblDescription1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblDescription1.setBounds(67, 156, 261, 95);
		panel_1.add(lblDescription1);
		
		JLabel lblDescription1_1 = new JLabel("Role-Playing Game");
		lblDescription1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescription1_1.setForeground(Color.YELLOW);
		lblDescription1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblDescription1_1.setBounds(67, 191, 261, 95);
		panel_1.add(lblDescription1_1);
		
		JLabel lbldate = new JLabel("January 2022");
		lbldate.setForeground(Color.YELLOW);
		lbldate.setFont(new Font("Tahoma", Font.BOLD, 23));
		lbldate.setBounds(118, 342, 166, 108);
		panel_1.add(lbldate);
		frmSecondLifeA.setBounds(100, 100, 704, 458);
		frmSecondLifeA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
