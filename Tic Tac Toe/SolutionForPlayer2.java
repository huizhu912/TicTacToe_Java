class SolutionForPlayer2 {
	public static int[] pool0 = {1, 3, 4};
	public static int[] pool2 = {1, 4, 5};
	public static int[] pool8 = {4, 5, 7};
	public static int[] pool6 = {3, 4, 7};
	public static int[] pool1 = {0, 2, 4};
	public static int[] pool5 = {2, 4, 8};
	public static int[] pool7 = {4, 6, 8};
	public static int[] pool3 = {0, 4, 6};
	public static int[] pool4 = {0, 1, 2, 3, 5, 6, 7, 8};
	int randomIndex;
	int[] newpool;
	public static boolean specialCase = false;
	

	public SolutionForPlayer2(String poolname) {
		switch (poolname){
			case "pool0": checkPool(pool0);
						  break;
					
			case "pool1": checkPool(pool1);
						  break;
			
			case "pool2": checkPool(pool2);
						  break;
			
			case "pool3": checkPool(pool3);
						  break;
						  
			case "pool4": checkPool(pool4);
						  break;

			case "pool5": checkPool(pool5);
						  break;

			case "pool6": checkPool(pool6);
						  break;

			case "pool7": checkPool(pool7);
						  break;

			case "pool8": checkPool(pool8);
						  break;
			
			default: System.out.println("Invalid poolname"); 
					 break;
		}
	}
	
	public void checkPool(int[] array) {
		randomIndex = new ShuffleArray(array).randomGameIndex;
		char c = Game.gameState[randomIndex].getChar(); 
			if (c != '_') {
				newPool(array, randomIndex);//the spot is filled; randomly select from the array with the current random index value excluded
				if (newpool.length > 0) {
					checkPool(newpool);
				}
				else {
					//numWinSet[startpoint][2]  == 2?
					//i = 0, while(i < 8)), if checkGameState.numPlayer1WinSet[i] == 2 , blockPlayer1(pick WinSet[i] and find out the index of '_' and place 'O' at that spot)
					specialCase = true;
					System.out.println("special case!");
					new TriggerPlayer2();
				}
			}
			else {
				TriggerPlayer2.fillP2(randomIndex);
			}
			Player2Status(Game.indexPlayer2);
	}
	
	public void newPool(int[] array, int randomIndex) {  
			int newlen = array.length - 1;
			int[] np = new int[newlen];
			int j = 0;
			while (j < newlen) {
				for (int i = 0; i < array.length; i++){
					if (array[i] != randomIndex) {
						np[j] = array[i];
						j++;
					} 
				}
			}
			newpool = np;
	}
	

	public static void Player2Status(int i) {
		System.out.printf("Player2 has made placement at (%d, %d).%n", Game.gameState[i].getRow(), Game.gameState[i].getCol());
	}
}

