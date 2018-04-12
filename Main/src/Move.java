/*
 Returns a move, containing fields used to rank relative quality of the move in various AI
  */
public Class Move {
    public boolean bounced; //did this move bounce a player
    public int whomBounced; //which player bounced (winning players are better targets)
    public boolean slid; //if went over a slide
    public boolean gotSafe; //if got
    public boolean gotHome;
    public boolean gotOut;
}