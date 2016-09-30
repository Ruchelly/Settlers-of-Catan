package hexTileTester;

// Skeleton for testing

public class Players {
	public class Player{
		// array of integers holds value of each resource
		private int resources[] = new int[5];
		
		public int[] getResources() {
			return resources;
		}

		public void setResources(int resources[]) {
			this.resources = resources;
		}
	}
	
	// "array" of one player for testing
	public static Player players[] = new Player[1];
}
