package Main.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {
    final int DECKSIZE=45;
    Card[] deck=new Card[DECKSIZE];
    ArrayList<Integer> randomizer=new ArrayList<Integer>();
    int TCindex;

    public Deck(){
        generateDeck();
        TCindex=0;
        for (int i=0;i<DECKSIZE;i++){
            randomizer.add(i);
        }
        shuffle();
    }



    private void shuffle(){
        Collections.shuffle(randomizer);
        Card[] tempdeck=new Card[DECKSIZE];
        for (int j=0;j<DECKSIZE;j++){
            tempdeck[j]=deck[randomizer.get(j)];
        }
        for (int k=0;k<DECKSIZE;k++){
            deck[k]=tempdeck[k];
        }
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


    public static void main(String[] args){
        Deck testdeck=new Deck();
        System.out.println(Arrays.toString(testdeck.deck));
    }

}

