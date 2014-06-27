class found2Connects {
	boolean found2connects = false;
	public static int indexP2;

	//found 2 P2 connected, connect P2 to win
	public found2Connects(int[][] array) {
			for (int i = 0; i < checkGameState.numWinSet.length; i++) {
			    int nP1 = checkGameState.numWinSet[i][0];
				int nP2 = checkGameState.numWinSet[i][1];
				if ((nP2 == 2) && (nP1 == 0)){
					getIndexP2(i); //return indexVal for P2 in winSet[i]
					//Game.indexPlayer2 = indexP2;
					found2connects = true;
					break;
				}
			}
	//found 2 P1 connected, block P1
			if (found2connects == false) {
				for (int j = 0; j < checkGameState.numWinSet.length; j++) {
					int nP1 = checkGameState.numWinSet[j][0];
					int nP2 = checkGameState.numWinSet[j][1];
						if((nP2 == 0) && (nP1 == 2)) {
							getIndexP2(j); //return indexVal for P2 in winSet[i]
							found2connects = true;
							break;				
						}
				}
			}		
	}
	
	public static void getIndexP2(int x) {
		int[] array = checkGameState.winSet[x];
		for (int indexVal : array) {
			if (Game.gameState[indexVal].getChar() == '_') {
				indexP2 = indexVal;
				break;
			}
		}
	}
}				
					
		