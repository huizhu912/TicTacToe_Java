import java.lang.Math;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class checkGameState {
	public static int[][] winSet = {{0,1,2},
									{2,5,8},
									{0,3,6},	
									{6,7,8},
									{1,4,7},
									{3,4,5},
									{0,4,8},
									{2,4,6}};
	
	public static int[][] numWinSet = new int[winSet.length][2];
								
	protected int startpoint = 0;
	protected static int numPlayer1 = 0;
	protected static int numPlayer2 = 0;
	protected int maxNum;
							  

	public void checkWinSet() {	
			int[] tempWinSet = winSet[startpoint];
			if (foundEmptySpotInWinSet(tempWinSet) == false) {
				if (foundWinner(numWinSet[startpoint][0], numWinSet[startpoint][1]) == true) {
					whoIsWinner(maxNum);
					InterfaceGame.control = false;
					//System.exit(1);
				}
				else {
					if (++startpoint < winSet.length) {						
						checkWinSet();
					}
					else {	
						if (foundEmptySpotInGame() == false) {
							System.out.println("nP1 = " + numWinSet[startpoint - 1][0]);
							System.out.println("nP2 = " + numWinSet[startpoint - 1][1]);
							new PrintCanvas2();
							new printNumWinSet();
							System.out.println("Stalemate! No winner for this round.");	
							InterfaceGame.labelPanel.add(new JLabel("Stalemate! No winner for this round."));	
							InterfaceGame.control = false;
							//System.exit(1);
						}
						else {
							whoIsNextPlayer();
						}
						
					}
				}
			}
			else {
			
			//check numPlayer1 within the current winset
			//if numPlayer1 = 0, then randomly pick an indexNum and assign to indexPlayer2
			//if numPlayer1 = 1, create a new array with indexPlayer1 excluded, then randomly select an indexNum and assign to indexPlayer2, refer to SolutionPlayer2.java
			//if numPlayer1 = 2, return the indexNum for '_' and assign to indexPlayer2, place 'O' in that position
				if (SolutionForPlayer2.specialCase == true)	{
					System.out.println("special case!");
					found2Connects.getIndexP2(startpoint);
				}
				
				else	
					{
						if (++startpoint < winSet.length) {
							checkWinSet();
						}
						else {
					//figure out whose turn to play the game;
							System.out.println("nP1 = " + numWinSet[startpoint - 1][0]);
							System.out.println("nP2 = " + numWinSet[startpoint - 1][1]);
							whoIsNextPlayer();
						}
					}
						
			}
		
	}
		

	
	public boolean foundEmptySpotInWinSet(int[] array) {
		boolean status = false;
		for (int indexVal : array) {
			if (Game.gameState[indexVal].getChar() == '_') {
				//numPlayer1 = 0;
				//numPlayer2 = 0;
				status = true;
				//break;
			}
			else {
				countNum(indexVal);
			}
		}
		Summary();
		return status;
	}
	
	public boolean foundEmptySpotInGame() {
		boolean foundemptyspot = false;
		for (int i = 0; i < Game.gameState.length; i++) {
			if (Game.gameState[i].getChar() == '_') {
				foundemptyspot = true;
				break;
			}
		}
		return foundemptyspot;
	}
	
	public boolean foundWinner(int nP1, int nP2) {
		boolean answer = false;
		maxNum = Math.max(nP1, nP2);	
		if (maxNum == 3) {
			answer = true;
		}
		return answer;
	}
	
	
	public void countNum (int i) {
		if (Game.gameState[i].getChar() == 'X') {
			numPlayer1++;
		}
		else if (Game.gameState[i].getChar() == 'O') {
			numPlayer2++;
		}	
	}
	
	public void whoIsWinner(int n) {
		System.out.println("numPlayer1 = " + numWinSet[startpoint][0]);
		System.out.println("numPlayer2 = " + numWinSet[startpoint][1]);
		if (n == numWinSet[startpoint][0]) {
			new PrintCanvas2();
			new printNumWinSet();
			System.out.println("You are the winner!");
			InterfaceGame.labelPanel.add(new JLabel("You are the winner!"));
		}
		else if (n == numWinSet[startpoint][1]){
			new PrintCanvas2();
			new printNumWinSet();
			System.out.println("You lost!");
			InterfaceGame.labelPanel.add(new JLabel("You lost!"));
		}
	}

	public void Summary() {
		numWinSet[startpoint][0] = numPlayer1;
		numWinSet[startpoint][1] = numPlayer2;
		numPlayer1 = 0;
		numPlayer2 = 0;
	}
	
	public void whoIsNextPlayer() {
			if (Game.turn == 1) {
				System.out.println("It's now your turn to play the game.");
				InterfaceGame.labelPanel.add(new JLabel("It's now your turn to play the game."));				
			}
			else if(Game.turn == 2) {
				System.out.println("It's now Player2's turn to play the game.");
				InterfaceGame.labelPanel.add(new JLabel("It's now Player2's turn to play the game."));
			}	
	}
}