package firstPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Launcher extends JFrame {
	
    static final String tbcrealmlist1 = null;
    
	// Components
	private JPanel ctpMain;
	private JPanel pnlTbc;
	private JPanel pnlWotlk;
	// JButtons for running external .exe files
	private JButton btnWotlk;
	private JButton btnTbc;
	// JTextField for showing the .exe file paths
	private JTextField txtTbc;
	private JTextField txtWotlk;
	
	// JRadioButtons
	private JRadioButton rbTbcRl1;
	private JRadioButton rbTbcRl2;
	private JRadioButton rbTbcRl3;
	private JRadioButton rbWotlkrl1;
	private JRadioButton rbWotlkrl2;
	private JRadioButton rbWotlkrl3;
	
	// Button groups for JRadionButtons 
	private final ButtonGroup btngrpTbc = new ButtonGroup();
	private final ButtonGroup btngrpWotlk = new ButtonGroup();

	
	
	// Launch the app.
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Launcher frame = new Launcher();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	// The Frame
	public Launcher() 
	{
		
		
		initComponents();
		createEvents();
		
		
	}


	// Method for creating and initializing components
		private void initComponents() 
		{
			setTitle("RealmlistLauncher");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 650, 290);
			setIconImage(Toolkit.getDefaultToolkit().getImage(Launcher.class.getResource("/realmlistLauncher/resources/icon_16.png")));
			setResizable(false);
			ctpMain = new JPanel();
			ctpMain.setBackground(SystemColor.menu);
			ctpMain.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(ctpMain);
			
			pnlTbc = new JPanel();
			pnlTbc.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "WoW - TBC", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			
			pnlWotlk = new JPanel();
			pnlWotlk.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "WoW - WotLK", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			GroupLayout gl_ctpMain = new GroupLayout(ctpMain);
			gl_ctpMain.setHorizontalGroup(
				gl_ctpMain.createParallelGroup(Alignment.TRAILING)
					.addGroup(Alignment.LEADING, gl_ctpMain.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_ctpMain.createParallelGroup(Alignment.LEADING)
							.addComponent(pnlWotlk, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
							.addComponent(pnlTbc, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))
						.addContainerGap())
			);
			gl_ctpMain.setVerticalGroup(
				gl_ctpMain.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_ctpMain.createSequentialGroup()
						.addContainerGap()
						.addComponent(pnlTbc, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(pnlWotlk, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(14, Short.MAX_VALUE))
			);
			
			btnWotlk = new JButton("PLAY");
			btnWotlk.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnWotlk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			
			txtWotlk = new JTextField();
			txtWotlk.setEditable(false);
			txtWotlk.setColumns(10);
			
			rbWotlkrl1 = new JRadioButton("RB - RLW 1");
			btngrpWotlk.add(rbWotlkrl1);
			
			rbWotlkrl2 = new JRadioButton("RB - RLW 2");
			btngrpWotlk.add(rbWotlkrl2);
			
			rbWotlkrl3 = new JRadioButton("RB - RLW 3");
			btngrpWotlk.add(rbWotlkrl3);
			GroupLayout gl_pnlWotlk = new GroupLayout(pnlWotlk);
			gl_pnlWotlk.setHorizontalGroup(
				gl_pnlWotlk.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_pnlWotlk.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_pnlWotlk.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_pnlWotlk.createSequentialGroup()
								.addComponent(rbWotlkrl1)
								.addGap(18)
								.addComponent(rbWotlkrl2)
								.addGap(18)
								.addComponent(rbWotlkrl3)
								.addPreferredGap(ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
								.addComponent(btnWotlk, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
							.addComponent(txtWotlk, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
			);
			gl_pnlWotlk.setVerticalGroup(
				gl_pnlWotlk.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_pnlWotlk.createSequentialGroup()
						.addGroup(gl_pnlWotlk.createParallelGroup(Alignment.TRAILING)
							.addGroup(Alignment.LEADING, gl_pnlWotlk.createSequentialGroup()
								.addComponent(txtWotlk, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
								.addGroup(gl_pnlWotlk.createParallelGroup(Alignment.BASELINE)
									.addComponent(rbWotlkrl1)
									.addComponent(rbWotlkrl2)
									.addComponent(rbWotlkrl3)))
							.addGroup(gl_pnlWotlk.createSequentialGroup()
								.addContainerGap(22, Short.MAX_VALUE)
								.addComponent(btnWotlk, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap())
			);
			pnlWotlk.setLayout(gl_pnlWotlk);
			
			btnTbc = new JButton("PLAY");
			
			btnTbc.setFont(new Font("Tahoma", Font.PLAIN, 18));
			
			txtTbc = new JTextField();
			txtTbc.setEditable(false);
			txtTbc.setColumns(10);
			
			rbTbcRl1 = new JRadioButton("RB - RL 1");
			btngrpTbc.add(rbTbcRl1);
			
			rbTbcRl2 = new JRadioButton("RB - RL 2");
			btngrpTbc.add(rbTbcRl2);
			
			rbTbcRl3 = new JRadioButton("RB - RL 3");
			btngrpTbc.add(rbTbcRl3);
			GroupLayout gl_pnlTbc = new GroupLayout(pnlTbc);
			gl_pnlTbc.setHorizontalGroup(
				gl_pnlTbc.createParallelGroup(Alignment.TRAILING)
					.addGroup(Alignment.LEADING, gl_pnlTbc.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_pnlTbc.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_pnlTbc.createSequentialGroup()
								.addComponent(rbTbcRl1)
								.addGap(28)
								.addComponent(rbTbcRl2)
								.addGap(27)
								.addComponent(rbTbcRl3)
								.addPreferredGap(ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
								.addComponent(btnTbc, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
							.addComponent(txtTbc, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
			);
			gl_pnlTbc.setVerticalGroup(
				gl_pnlTbc.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_pnlTbc.createSequentialGroup()
						.addContainerGap()
						.addComponent(txtTbc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_pnlTbc.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnTbc, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_pnlTbc.createParallelGroup(Alignment.BASELINE)
								.addComponent(rbTbcRl1)
								.addComponent(rbTbcRl2)
								.addComponent(rbTbcRl3)))
						.addContainerGap())
			);
			pnlTbc.setLayout(gl_pnlTbc);
			ctpMain.setLayout(gl_ctpMain);
			setResizable(false);
			
		}
	
	
	
	
	// Method for creating events
	private void createEvents()
	{	//TBC - Button (btnTbc) is pressed then run external .exe file
		btnTbc.addActionListener(new ActionListener() {
			private String tbcrl;

			public void actionPerformed(ActionEvent e) 
			{   //If statement for radiobutton
				if (rbTbcRl1.isSelected())
				{
					String tbcrl = "set realmlist logon.warmane.com";	
					
				}
				else if (rbTbcRl2.isSelected())
				{
					
					String tbcrl = tbcrealmlist1;	
				}
				
				
				// running the exe
				try {
		            Runtime runTime = Runtime.getRuntime();
		            
		            // String for .exe path
		            String wotlkexefilepath = "D:\\World of Warcraft\\Wow.exe";
		            Process process = runTime.exec(wotlkexefilepath);
		        } catch (IOException e1) {
		            e1.printStackTrace();
		            
		            
		            
		            
		            
		        }
				
				
				
				
			}
		});
		
		
	
		
	}
	private void runningExe() {
		
	}
}
