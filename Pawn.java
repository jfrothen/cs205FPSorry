public class Pawn {
	public Object currentNode; //FIX THIS FOR BETTER POINTER TO MAP LOCATION
	public int locationID; //acts as relative progress check
	public boolean isSafe;
	public int colorID;
	
	Pawn(int color) {
		this.colorID = color;
		locationID = 0;
		//set currentNode equal to the correct node based on the color
		isSafe = false;
		
		System.out.println("Pawn created, color = " + this.colorID);
	}
	
	
}
