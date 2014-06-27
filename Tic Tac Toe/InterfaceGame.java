// JFrame extender, JFrame -> pane -> JPanel -> GridLayout -> JButton

import java.awt.*;
import java.awt.event.*;
//import java.awt.GridLayout;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
import javax.swing.*;
//import javax.swing.JButton;
//import javax.swing.JLabel;
import java.lang.Character;

class InterfaceGame extends JFrame implements ActionListener {
	
	private GridLayout Glayout; // Main layout.
	private GridLayout Llayout;
	
	private JPanel buttonPanel; // Panel for the buttons.
	protected static JPanel labelPanel;
	//private JTextField display;
	protected static JLabel label;
	//static char c1 = 'X';
	//static char c2 = 'O';
	static String s = "Press a button to start the game.";
	static String l = null;
	static int actionCommand;
	public static Game pReceiver;
	static boolean control = true;
	static JButton selectedButton;
	protected static JButton Button0 = new JButton("");
	protected static JButton Button1 = new JButton("");
	protected static JButton Button2 = new JButton("");
	protected static JButton Button3 = new JButton("");
	protected static JButton Button4 = new JButton("");
	protected static JButton Button5 = new JButton("");
	protected static JButton Button6 = new JButton("");
	protected static JButton Button7 = new JButton("");
	protected static JButton Button8 = new JButton("");
	
	private JButton b = new JButton("fake button");
	Dimension buttonSize = b.getPreferredSize();
	
	
	public InterfaceGame () {
		super("Tic Tac Toe Game");
		
		Glayout = new GridLayout(3,3);
		Llayout = new GridLayout(0,1);
		
		//layout.setAlignment(GridLayout.CENTER); // Centering main layout.
		
		//display = new JTextField(16); // Text field is size 16 in order to push the buttons panel down under it with the centered layout.
	
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(Glayout); // Buttons panel is a 3x3 grid.		
		
		buttonPanel.setPreferredSize(new Dimension((int)(buttonSize.getWidth() * 2.5)+20, (int)(buttonSize.getHeight() * 3.5)+20 * 2));
		buttonPanel.add(Button0); // Adding buttons to the button panel.
		buttonPanel.add(Button1);
		buttonPanel.add(Button2);
		buttonPanel.add(Button3);
		buttonPanel.add(Button4);
		buttonPanel.add(Button5);
		buttonPanel.add(Button6);
		buttonPanel.add(Button7);
		buttonPanel.add(Button8);
		
		Button0.addActionListener(this);
		Button0.setActionCommand("0");
		Button1.addActionListener(this);
		Button1.setActionCommand("1");
		Button2.addActionListener(this);
		Button2.setActionCommand("2");
		Button3.addActionListener(this);
		Button3.setActionCommand("3");
		Button4.addActionListener(this);
		Button4.setActionCommand("4");
		Button5.addActionListener(this);
		Button5.setActionCommand("5");
		Button6.addActionListener(this);
		Button6.setActionCommand("6");
		Button7.addActionListener(this);
		Button7.setActionCommand("7");
		Button8.addActionListener(this);
		Button8.setActionCommand("8");
		
	
		//add(display); // Adding the display to the UI component.
		//add(buttonPanel, BorderLayout.NORTH); // Add the buttons panel to the UI component.
		
		labelPanel = new JPanel();
		labelPanel.setLayout(Llayout);
		label = new JLabel(s);	
		labelPanel.add(label);
		//add(labelPanel, BorderLayout.SOUTH);
		
		addComponentsToPane(this.getContentPane());
		 
	}
		
		public void addComponentsToPane(Container pane) {
			pane.add(buttonPanel, new BorderLayout().NORTH);
			pane.add(labelPanel, new BorderLayout().SOUTH);
		}
		
		public void actionPerformed(ActionEvent e) {
			JButton theButton = (JButton)e.getSource();	
			selectedButton = theButton;
			//theButton.setText("X"); 
			//Game.cReceiver = theButton.getLabel().charAt(0); // send placement char to BE
			Game.cReceiver = 'X';
			s = e.getActionCommand();
			actionCommand = Integer.parseInt(s); //index
			labelPanel.add(new JLabel("index = " + actionCommand));
			
			if ((Game.count < 9) && (control == true)) {
				pReceiver.Placement1();
				Game.gameStatus();
				Game.gamePrint();
				new printNumWinSet();
				if (control == true) {
					pReceiver.Placement2();	
					Game.gameStatus();
					Game.gamePrint();
					new printNumWinSet();
				}
			}
		}
	
		
	//public static void main(String[] args) {
			//InterfaceGame interfaceGame = new InterfaceGame();
			//interfaceGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//interfaceGame.setSize(200, 200);
			//interfaceGame.setVisible(true);	
			//interfaceGame.Button0.setText(Character.toString(c1));
			//interfaceGame.Button1.setText(Character.toString(c2));
	//}
	
	
}