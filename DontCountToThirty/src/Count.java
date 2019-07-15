
public class Count {
	private int curCount = 0;
	public final int MAX_COUNT = 30;
	
	public Count() {
		curCount = 0;
	}
	
	//increments curCount by value, prints out each intermediary value, and returns curCount
	public int incCount(int value) {
		
		for (int i = 0; i < value; i++) {
			curCount++;
			System.out.println(curCount);
			if (curCount == MAX_COUNT) {
				return curCount;
			}
		}
		return curCount;
	}
	
	public int getCurCount() {
		return curCount;
	}
	
	public boolean isGameFinished() { //checks if curCount is equal to MAX_COUNT
		if (curCount >= MAX_COUNT) {
			return true;
		}
		return false;
	}
}
