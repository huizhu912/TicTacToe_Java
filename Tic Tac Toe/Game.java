import javax.swing.*;

class Game {
	protected int row;
	protected int col;
	protected char c = '_'; //player1: c = 'X', player2: c = 'O'
	public static int index = 0; //index of a player in gameState
	protected static boolean isInitial = true; // initialize
	public static Player[] gameState = new Player[9];
	public static int indexPlayer1; 
	public static int indexPlayer2;
	public static PrintCanvas2 pc2;
	public static char cReceiver;
	public static InterfaceGame oReceiver;

	//public String sReceiver = null;
	public boolean readyToPlace = false;
	public static int count = 0;
	public static int turn = 1;
	
	public Game() {
		for (row = 0; row < 3; row++) {
			for (col = 0; col < 3; col++) {
				Game.gameState[index] = new Player(row, col, c);
				//System.out.printf("%s      ", gameState[index].getChar());
				index++;
			}	
		}
		isInitial = false;
		index = 0;
	}
	
	public static void gamePrint() {
		 new PrintCanvas2();
	}
	
	public static int getIndex(int x, int y) {
		for (int i = 0; i < 9; i++) {
			if ((Game.gameState[i].getRow() == x) && (Game.gameState[i].getCol() == y)) {
				index = i;
				break;
			}
		}
		return index;	
	}
	
	public void Placement1() {	
		if (turn == 1) {
			//player1Input p1Input = new player1Input();
			//this.row = p1Input.row;
			//this.col = p1Input.col;
			//this.c = p1Input.c;
			//indexPlayer1 = getIndex(this.row, this.col);
			
			indexPlayer1 = InterfaceGame.actionCommand; //send index value to BE
			this.c = cReceiver;
			
			if (Game.gameState[indexPlayer1].getChar() != '_') {
				//System.out.printf("This spot at (%d, %d) has been filled.%n", this.row, this.col);		
				InterfaceGame.labelPanel.add(new JLabel("This spot has been filled."));
				System.out.println("count = " + Game.count);
			}
			else {
				
				Game.gameState[indexPlayer1].setChar(this.c); // send placement char to BE
				InterfaceGame.selectedButton.setText(Character.toString(cReceiver));
				InterfaceGame.labelPanel.add(new JLabel("Button" + indexPlayer1 + " was set to be " + this.c));
				System.out.println("count = " + Game.count);
				//System.out.printf("Player1 has made a placement %s at (%d, %d), index = %d.%n", this.c, this.row, this.col, indexPlayer1);
				count++;
				turn = 2;
			}
		}
	}
	
	public void Placement2() {
		if (Game.turn == 2) {
			new TriggerPlayer2();
			System.out.println("count = " + Game.count);
			count++;
			turn = 1;
		}
	}
	
	public static void gameStatus() {
		new checkGameState().checkWinSet();	
	}
	
	public static void main(String[] args) {
		Game newGame = new Game();
		InterfaceGame.pReceiver = newGame;
		gamePrint();
		//gameStatus();
		
		InterfaceGame interfacegame = new InterfaceGame();
		//oReceiver = interfacegame;
		interfacegame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		interfacegame.setSize(300, 300);
		interfacegame.setVisible(true);	
	}
}
