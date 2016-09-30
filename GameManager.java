package hexTileTester;

public class GameManager {
	private static Intersection[] grid = new Intersection[1];

	public static Intersection[] getGrid() {
		return grid;
	}

	public static void setGrid(Intersection[] grid) {
		GameManager.grid = grid;
	}
}
