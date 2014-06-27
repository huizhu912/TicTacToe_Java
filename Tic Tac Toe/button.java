import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class button extends JFrame implements ActionListener {
        TextField text = new TextField(20);
        Button b;
        private int numClicks = 0;
		
		public static void main(String[] args) {
                button aButton = new button("My first window");
				aButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                aButton.setSize(350,100);
                aButton.setVisible(true);
        }

        public button(String title) {
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
