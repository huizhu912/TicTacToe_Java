class Player {
	int row;
	int col;
	char character;
	int flag;
	int index = 0;
	
	public Player(int i, int j, char c) {
		this.row = i;
		this.col = j;
		this.character = c;
		this.flag = 0;
	}
	
	public int getRow() {
		return this.row;
	}
	
	public int getCol() {
		return this.col;
	}
	
	public char getChar() {
		return this.character;
	}
	
	public void setChar(char c) {
		this.character = c;
		if (this.character == 'X') {
			this.flag = 1; //flag = 1 , player1 
			//Game.turn = 1;
		}
		else if (this.character == 'O') {
			this.flag = 2; //flag = 2, player2
			//Game.turn = 2;
		}
		else if (this.character == '_') {
			this.flag = 0; //flag = 0, not selected spot
		}
	    else {
			System.out.println("Invalid input character.");
		}
	}
	
	public int getFlag() {
		return this.flag;
	}
}