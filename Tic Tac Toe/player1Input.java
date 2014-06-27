import java.util.Scanner;

class player1Input {
	int row;
	int col;
	char c;
	public player1Input() {
			String inputText = null;
			Scanner scanner = new Scanner(System.in);
			System.out.println("row: ");
			inputText = scanner.nextLine();
			row = Integer.parseInt(inputText);	
			System.out.println("col: ");
			inputText = scanner.nextLine();
			col = Integer.parseInt(inputText);
			System.out.println("symbol: ");
			inputText = scanner.nextLine();
			c = inputText.charAt(0);
	}

}