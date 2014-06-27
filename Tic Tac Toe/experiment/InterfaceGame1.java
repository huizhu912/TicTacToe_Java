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

class InterfaceGame1 extends JFrame implements ActionListener {
	
	protected GridLayout Glayout; // Main layout.
	protected GridLayout Llayout;
	
	protected JPanel buttonPanel; // Panel for the buttons.
	protected static JPanel labelPanel;
	//private JTextField display;
	protected static JLabel label;
	static String p1 = "X";
	static String p2 = "O";
	static String s = "Press a button to start the game.";
	static String l = null;
	static int index;
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
	
	
	public InterfaceGame1 () {
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
                //numClicks++;
                //label.setText("Button Clicked " + numClicks + " times");
			JButton theButton = (JButton)e.getSource();	
			theButton.setText("X");
			//selectedButton = theButton;
			s = e.getActionCommand();
			label.setText("Button" + s + " has been clicked on.");
			index = Integer.parseInt(s);
			labelPanel.add(new JLabel("index = " + index));
			new findNextButton(index);
			
		}
		
		public static void main(String[] args) {
			InterfaceGame1 ig = new InterfaceGame1();
			ig.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ig.setSize(300,300);
			ig.setVisible(true);
		}
}	

