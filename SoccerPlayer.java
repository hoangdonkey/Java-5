public class SoccerPlayer {
	private String name;
	private int number;
	private int xLocation;
	private int yLocation;

	public SoccerPlayer(String a, int b , int c, int d) {
		name = a;
		number = b;
		xLocation = c;
		yLocation = d;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public int getXlocation() {
		return xLocation;
	}

	public int getYlocation() {
		return yLocation;
	}
} 