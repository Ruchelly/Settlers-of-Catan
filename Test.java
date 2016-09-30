package hexTileTester;

public class Test {
	public static void main(String[] args){
		System.out.println("Creating HexTile object for testing");
		HexTile hexTest = new HexTile();
		
		System.out.println("Proof of concept for connecting static array in GameManager for corner handling");
		System.out.println("Initialize GameManager.grid");
		GameManager.getGrid()[0] = new Intersection();
		GameManager.getGrid()[0].setTest(5);
		
		System.out.println("Setting hexTest array equal to GameManager array");
		hexTest.getIntersections()[0] = GameManager.getGrid()[0];
		
		System.out.println("hexTest test = " + hexTest.getIntersections()[0].getTest());
		System.out.println("GameManager test = " + GameManager.getGrid()[0].getTest() + "\n");

		System.out.println("Changing via GameManager");
		GameManager.getGrid()[0].setTest(7);
		
		System.out.println("hexTest test = " + hexTest.getIntersections()[0].getTest());
		System.out.println("GameManager test = " + GameManager.getGrid()[0].getTest() + "\n");
		
		System.out.println("Changing via HexTile");
		hexTest.getIntersections()[0].setTest(2);
		
		System.out.println("hexTest test = " + hexTest.getIntersections()[0].getTest());
		System.out.println("GameManager test = " + GameManager.getGrid()[0].getTest() + "\n");
	}
}
