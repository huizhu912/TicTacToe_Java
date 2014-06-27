import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class AL extends JFrame implements ActionListener {
        TextField text = new TextField(20);
        Button b;
        private int numClicks = 0;
		
		public static void main(String[] args) {
                AL myFrame = new AL("My first window");
				myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                myFrame.setSize(350,100);
                myFrame.setVisible(true);
        }

        public AL(String title) {

                super(title);
                setLayout(new FlowLayout());
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                b = new Button("Click me");
                add(b);
                add(text);
                b.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e) {
                numClicks++;
                text.setText("Button Clicked " + numClicks + " times");
        }
}
