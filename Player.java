
public class Player {
	
	private int color;
	private Pawn[] pawnArray;
	
	Player(int color) {
		this.color = color;
		pawnArray = new Pawn[]{new Pawn(color), new Pawn(color), new Pawn(color), new Pawn(color)};
		
		System.out.println("Player created with color =  " + this.color);
		
	}

	public List<Object> getMoveList(int draw) {
		List<Object> moveList = new List();

		switch (draw){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 8:
			case 12: {
				for (Pawn thisPawn : pawnArray) {
					moveList.push(thisPawn.testMove(draw));
				}
				break;
			}
			}
		}
	}
	
}


