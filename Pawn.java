public class Pawn {
	public Object currentNode; //FIX THIS FOR BETTER POINTER TO MAP LOCATION
	public int locationID; //acts as relative progress check
    public boolean isOut;
	public boolean isSafe;
	public int colorID;
	
	Pawn(int color) {
		this.colorID = color;
		locationID = 0;
		isOut = false;
		//set currentNode equal to the correct node based on the color
		isSafe = false;
		
		System.out.println("Pawn created, color = " + this.colorID);
	}

	public Object testMove(int draw) { //FIX THIS AS ABOVE
	    //first handle if pawn is still in home
	    if (!isOut && (draw == 1 || draw == 2 ) {
	        return firstNode; //MAKE THIS RETURN THE FIRST NODE OFF THE THING
        }
        else if (!isOut) {
	        return null;
        }
        //next handle if pawn is too close to home to go anywhere
        else if (locationID + draw > 65) {
	        return null;
        }

        else {

        }



	    return endNode;
    }
	
	
}
