package Logic;

public class HumanPlayer extends Player {
    private String name;
    private Game thisGame;

    public boolean hasDrawn() {
        return drawn;
    }

    public void setDrawn(boolean drawn) {
        this.drawn = drawn;
    }

    private boolean drawn;

    public HumanPlayer(String name, Color inColor, Board inBoard, Game thisGame) {
        super(inColor, inBoard);
        this.thisGame = thisGame;
        this.name = name;
        System.out.println(name + " entered the arena for Team " + inColor.toString() + "!\n");
    }

    @Override
    public boolean play() {
        drawn = false;
        while(!drawn) {
            System.out.println("Draw a card or quit.");
        }

        generateMoves();

        boolean pawnSelected = false;

        while(!pawnSelected) {
            System.out.println("Select a pawn");
        }
        refreshHighlight();

        boolean spaceSelected = false;

        while (spaceSelected) {
            System.out.println("Select a move");
        }

        for (Move m : potentialMovesList.get(0)) {

        }


        currentDraw = thisBoard.thisDeck.draw();
        System.out.println("You drew " + currentDraw.toString());
        generateMoves();
        //CHOOSE HOW THE HUMAN SELECTS AN OPTION AND THEN IMPLEMENT THIS
        if (finishedPawnList.size() == 4) {
            System.out.println("You win!!!");
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void draw() {
        currentDraw = thisBoard.thisDeck.draw();
        drawn = true;
        refreshHighlight();
    }

    public void selectPawn(Pawn p) {
        p.select();
        refreshHighlight();
    }
}
