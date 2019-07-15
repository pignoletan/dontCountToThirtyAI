import java.util.Scanner;

public class DontCountToThirty {

	public static void main(String[] args) {
		Count theCount = new Count();
		Scanner input = new Scanner(System.in);

		System.out.println("**Notice to the human**");
		System.out.println("The count will start at 0.");
		System.out.println("The human and the computer will take turns incrementing the count by either 1, 2, or 3.");
		System.out.println("The human's turn will be first.");
		System.out.println("If the human counts to 30, the human will lose!");
		System.out.println("If, by some fluke, the computer counts to 30, the computer will lose.");
		
		boolean finished = false;
		while (!finished) {
			//player's turn
			System.out.print("Please pick either 1, 2, or 3:");
			String aLine = input.nextLine();
			int playerChoice = 0;
			try {
				playerChoice = Integer.parseInt(aLine);
			} catch (NumberFormatException e) {
				System.out.println("Foolish human! You may not input decimals, letters, or special characters!");
				continue;
			}
			if (playerChoice == 1
					||playerChoice == 2
					||playerChoice == 3) {
				theCount.incCount(playerChoice);
			} else {
				System.out.println("That number is cheating! How dare you!");
				continue;
			}
			if (theCount.isGameFinished()) {
				System.out.println("Ha ha ha ha ha!!!");
				finished = true;
				continue;
			}
			//computer's turn
			if (theCount.getCurCount() % 4 == 1) { //taunt the player when winning
				System.out.println("A foolish move from an irrational being!");
			} else {
				System.out.println("An interesting ploy...");
			}
			int opponentChoice = Opponent.takeATurn(theCount.getCurCount());
			theCount.incCount(opponentChoice);
			if (theCount.isGameFinished()) {
				System.out.println("No... this is impossible!");
				System.out.println("(The computer has deleted its memory)");
				finished = true;
			}
		}
	}

}
