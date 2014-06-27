import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class findNextButton {
	public static String actionCommand;
	
	public findNextButton(int i) {
		InterfaceGame1.labelPanel.add(new JLabel("findNextButton() starts."));
		//InterfaceGame1.Button0.setText("O");
		//InterfaceGame1.Button8.setText("O");
		//actionCommand = InterfaceGame1.Button6.getActionCommand();
		//InterfaceGame1.labelPanel.add(new JLabel("action command is: " + actionCommand));
		//actionCommand = InterfaceGame1.Button7.getActionCommand();
		//InterfaceGame1.labelPanel.add(new JLabel("action command is: " + actionCommand));
		
		if (Integer.toString(i).equals("8")) {
			InterfaceGame1.Button0.setText("O");
			InterfaceGame1.labelPanel.add(new JLabel("Button0 is reset."));
			InterfaceGame1.labelPanel.add(new JLabel("findNextButton() end."));
		}
		else if (InterfaceGame1.Button1.getActionCommand().equals(Integer.toString(i+1))) {
			InterfaceGame1.Button1.setText("O");
			InterfaceGame1.labelPanel.add(new JLabel("Button1 is reset."));
			InterfaceGame1.labelPanel.add(new JLabel("findNextButton() end."));
		}
		else if (InterfaceGame1.Button2.getActionCommand().equals(Integer.toString(i+1))) {
			InterfaceGame1.Button2.setText("O");
			InterfaceGame1.labelPanel.add(new JLabel("Button2 is reset."));
			InterfaceGame1.labelPanel.add(new JLabel("findNextButton() end."));
		}
		else if (InterfaceGame1.Button3.getActionCommand().equals(Integer.toString(i+1))) {
			InterfaceGame1.Button3.setText("O");
			InterfaceGame1.labelPanel.add(new JLabel("Button3 is reset."));
			InterfaceGame1.labelPanel.add(new JLabel("findNextButton() end."));
		}
		else if (InterfaceGame1.Button4.getActionCommand().equals(Integer.toString(i+1))) {
			InterfaceGame1.Button4.setText("O");
			InterfaceGame1.labelPanel.add(new JLabel("Button4 is reset."));
			InterfaceGame1.labelPanel.add(new JLabel("findNextButton() end."));
		}
		else if (InterfaceGame1.Button5.getActionCommand().equals(Integer.toString(i+1))){
			InterfaceGame1.Button5.setText("O");
			InterfaceGame1.labelPanel.add(new JLabel("Button5 is reset."));
			InterfaceGame1.labelPanel.add(new JLabel("findNextButton() end."));
		}
		else if (InterfaceGame1.Button6.getActionCommand().equals(Integer.toString(i+1))) {
			InterfaceGame1.Button6.setText("O");
			InterfaceGame1.labelPanel.add(new JLabel("Button6 is reset."));
			InterfaceGame1.labelPanel.add(new JLabel("findNextButton() end."));
		}
		else if (InterfaceGame1.Button7.getActionCommand().equals(Integer.toString(i+1))) {
			InterfaceGame1.Button7.setText("O");
			InterfaceGame1.labelPanel.add(new JLabel("Button7 is reset."));
			InterfaceGame1.labelPanel.add(new JLabel("findNextButton() end."));
		}
		else if(InterfaceGame1.Button8.getActionCommand().equals(Integer.toString(i+1))) {
			InterfaceGame1.Button8.setText("O");
			InterfaceGame1.labelPanel.add(new JLabel("Button8 is reset."));	
			InterfaceGame1.labelPanel.add(new JLabel("findNextButton() end."));
		}
	
	}
		
}