class TriggerPlayer2 {
	protected static String poolname;
	
	public TriggerPlayer2() {
		//if 2Player2[i] == 2, fill the spot to connect
		//new checkNumPlayer1InWinSet();
		//i = 0, while(i < 8)), if checkGameState.numPlayer1WinSet[i] == 2 , blockPlayer1(pick WinSet[i] and find out the index of '_' and place 'O' at that spot)
		
		found2Connects f2c = new found2Connects(checkGameState.numWinSet);
		if (f2c.found2connects == true) {
			fillP2(f2c.indexP2);
			SolutionForPlayer2.Player2Status(found2Connects.indexP2);
		}
		else { 
			if (SolutionForPlayer2.specialCase == false){
				poolname = "pool";
				poolname = poolname.concat(Integer.toString(Game.indexPlayer1));
				System.out.println(poolname);
				new SolutionForPlayer2(poolname);
			}
			else {
				//select the first winSet with empty spot to fill
				new checkGameState().checkWinSet();
				fillP2(found2Connects.indexP2);
				SolutionForPlayer2.specialCase = false;
				
			}
		}
	}
	
	public static void fillP2(int i) {
		Game.indexPlayer2 = i;
		Game.gameState[Game.indexPlayer2].setChar('O');
		if (InterfaceGame.Button0.getActionCommand().equals(Integer.toString(Game.indexPlayer2))) {
			InterfaceGame.Button0.setText("O");
		}
		else if (InterfaceGame.Button1.getActionCommand().equals(Integer.toString(Game.indexPlayer2))) {
			InterfaceGame.Button1.setText("O");
		}
		else if (InterfaceGame.Button2.getActionCommand().equals(Integer.toString(Game.indexPlayer2))) {
			InterfaceGame.Button2.setText("O");
		}
		else if (InterfaceGame.Button3.getActionCommand().equals(Integer.toString(Game.indexPlayer2))) {
			InterfaceGame.Button3.setText("O");
		}
		else if (InterfaceGame.Button4.getActionCommand().equals(Integer.toString(Game.indexPlayer2))) {
			InterfaceGame.Button4.setText("O");
		}
		else if (InterfaceGame.Button5.getActionCommand().equals(Integer.toString(Game.indexPlayer2))) {
			InterfaceGame.Button5.setText("O");
		}
		else if (InterfaceGame.Button6.getActionCommand().equals(Integer.toString(Game.indexPlayer2))) {
			InterfaceGame.Button6.setText("O");
		}
		else if (InterfaceGame.Button7.getActionCommand().equals(Integer.toString(Game.indexPlayer2))) {
			InterfaceGame.Button7.setText("O");
		}
		else if(InterfaceGame.Button8.getActionCommand().equals(Integer.toString(Game.indexPlayer2))) {
			InterfaceGame.Button8.setText("O");
		}
	}
	
}