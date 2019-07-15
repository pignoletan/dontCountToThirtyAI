import java.util.Random;

public class Opponent {
	
	//based on curCount, decide to increment the count by either 1, 2, or 3
	public static int takeATurn(int curCount) {
		int remainder = curCount % 4;
		int result = 0;
		if (remainder == 1) {
			Random rand = new Random();
			result = rand.nextInt(3);
			result++;
		} else {
			if (remainder == 0) {
				remainder = 4;
			}
			result = 5 - remainder;
		}
		return result;
	}
	
}
