package Main.src;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {
    Card[] deck=new Card[45];
    int TCindex;

    public Deck(){
        generateDeck();
        shuffle();
        TCindex=0;
    }



    private void shuffle(){

    }

    private void generateDeck(){
        ArrayList<Card> starter=new ArrayList<Card>(Arrays.asList(Card.values()));
        int i=0;
        for (int ic=0;ic<starter.size();ic++){
            for (int dc=0;dc<starter.get(ic).numInDeck;dc++){
                deck[i]=starter.get(ic);
                i++;
            }
        }
    }


}

