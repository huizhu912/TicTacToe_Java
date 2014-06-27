// JFrame extender, JFrame -> JPanel -> GridLayout -> JButton

import java.awt.*;
//import java.awt.GridLayout;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
import javax.swing.*;
//import javax.swing.JButton;
//import javax.swing.JLabel;
import java.lang.Character;

class Interface extends JFrame { //implements ActionListener {
	
	private GridLayout Glayout; // Main layout.
	private GridLayout Llayout;
	
	private JPanel buttonPanel; // Panel for the buttons.
	private JPanel labelPanel;
	//private JTextField display;
	protected JLabel label;
	static char c1 = 'X';
	static char c2 = 'O';
	String s = "Press a button to start the game.";
	protected JButton Button0 = new JButton("");
	protected JButton Button1 = new JButton("");
	protected JButton Button2 = new JButton("");
	protected JButton Button3 = new JButton("");
	protected JButton Button4 = new JButton("");
	protected JButton Button5 = new JButton("");
	protected JButton Button6 = new JButton("");
	protected JButton Button7 = new JButton("");
	protected JButton Button8 = new JButton("");
	
	private JButton b = new JButton("fake button");
	Dimension buttonSize = b.getPreferredSize();
	
	
	public Interface () {
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
			
	public static void main(String[] args) {
			Interface interfaceGame = new Interface();
			interfaceGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			interfaceGame.setSize(200, 200);
			interfaceGame.setVisible(true);	
			interfaceGame.Button0.setText(Character.toString(c1));
			interfaceGame.Button1.setText(Character.toString(c2));
		}
}