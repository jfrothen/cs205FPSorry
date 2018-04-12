public class Pawn {
	public Object currentNode; //FIX THIS FOR BETTER POINTER TO MAP LOCATION
	public int distanceFromHome; //acts as relative progress check
    public boolean isOut; //is out of home
	public boolean isSafe; //is in the safety zone at least
    public boolean isHome; //is home
	public int colorID; //integer representing the color of the player

	
	Pawn(int color) {
		this.colorID = color;
		locationID = 0;
		isOut = false;
		//set currentNode equal to the correct node based on the color
		isSafe = false;
		
		System.out.println("Pawn created, color = " + this.colorID);
	}

	public Move testMove(int steps, boolean is7) { //FIX THIS AS ABOVE

	    switch(steps) {
            case 1:
            case 2: {
                if (!isOut && !is7) {
                    return currentNode.nextNode(); //FIX THIS
                }
            }
            case 3:
            case 4:
            case 5:
            case 6:
            case 7: //note: no actual
            case 8:
            case 12: {
                if (!isOut) {
                    return null;
                }
                else if (locationID + )
                break;
            }

        }


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
            //GOES THROUGH THE STEPS OF THE MAP TO DERIVE THE NEW NODE
            //MUST FIX
        }

	    return endNode;
    }
	
	
}

