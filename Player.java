
public class Player {
	
	private int color;
	private Pawn[] pawnArray;
	
	Player(int color) {
		this.color = color;
		pawnArray = new Pawn[]{new Pawn(color), new Pawn(color), new Pawn(color), new Pawn(color)};
		
		System.out.println("Player created with color =  " + this.color);
		
	}
	
}


