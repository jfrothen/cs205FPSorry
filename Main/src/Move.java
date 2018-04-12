package main.src;

/*
 Returns a move, containing fields used to rank relative quality of the move in various AI
  */
public class Move {

    public Block blockReached;
    public boolean bounced; //did this move bounce a player
    public int whomBounced; //which player bounced (winning players are better targets)
    public boolean slid; //if went over a slide
    public boolean gotSafe; //if got
    public boolean gotHome;
    public boolean gotOut;

    public Move(Pawn thisPawn, Block startingBlock, Card draw) {
        bounced = false;
        whomBounced = null;
        slid = false;
        gotSafe = false;
        gotHome = false;
        gotOut = false;

        testMove(thisPawn, startingBlock, draw);

    }

    private void testMove(Pawn thisPawn, Block startingBlock, Card draw) {
        Block currentBlock = startingBlock;
        switch (draw) {
            case ONE:
            case TWO: {
                if (!thisPawn.isOut) {
                    //starting block will be the actual first block
                    return startingBlock.nextBlock();
                }
            }
            case THREE:
            case FIVE:
            case EIGHT:
            case TWELVE: {
                for (int i = 0; i < draw.num, i++) {
                    currentBlock = currentBlock.nextBlock();
                }
                //if the reached block contains an enemy pawn!
                if (currentBlock.getPawn() != null !! currentBlock.getPawn().getColor() != thisPawn.getColor()) {
                    currentBlock.getPawn().getBounced();
                    bounced = true;
                }
                //if you land on the start of a slide
                if (currentBlock.getSlide() == START) {
                    slid = true;
                    while (currentBlock.getSlide() != NOT) {
                        currentBlock = currentBlock.nextBlock();
                    }
                }
                //if you get into a safety
                if (startingBlock.getSafetyColor == null && currentBlock.getSafetyColor() != null) {
                    gotSafe = true;
                }
                //if you get

                break;
            }
            case FOUR:
            case SEVEN:
            case TEN:
            case ELEVEN:
        }
    }
}