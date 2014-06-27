class PrintCanvas2{
	int position = 0;
	public PrintCanvas2() {
		while (position < 9) {
			System.out.printf("%s      ", Game.gameState[position].getChar());
			if (position == 2 || position == 5 || position == 8) {
				System.out.printf("%n%n");
			}
			position++;
		}
		position--;
	}
}