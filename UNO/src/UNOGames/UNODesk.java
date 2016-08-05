/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNOGames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Moe Kyaw Kyaw
 */
public class UNODesk {

    List<UNOCard> desk = new ArrayList<UNOCard>();
    String [] status={"waiting","started","ended"};
    public UNODesk() {
        CreateUNOCard();
        System.out.println("Game is "+status[1]);
        
    }

    public UNOCard removeCardFromDesk() {
        return desk.remove(0);
    }

    public UNOCard createDiscardPile() {
        removeCardFromDesk();
        return desk.get(0);
    }

    /* Showing remaining DeskCards*/
    public int showRemainingDeskCard() {
        return desk.size();
    }

    public void CreateUNOCard() {

        String[] Color = {"RED", "YELLOW", "GREEN", "BLUE"};
        String[] CardType = {"NORMAL", "SKIP", "TAKETWO", "REVERSE"};
        int[] CardValue = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 20};

        int cardno = 48;
        int color = 4;

        for (int num = 0; num < 2; num++) {
            for (color = 0; color < Color.length; color++) {

                for (cardno = 0; cardno < 12; cardno++) {
                    UNOCard card = new UNOCard();
                    card.setColor(Color[color]);
                    card.setCardType(CardType[0]);
                    switch (cardno) {
                        case 0:
                            card.setCardValue(1);
                            break;

                        case 1:
                            card.setCardValue(2);
                            break;
                        case 2:

                            card.setCardValue(3);
                            break;
                        case 3:

                            card.setCardValue(4);
                            break;
                        case 4:

                            card.setCardValue(5);
                            break;
                        case 5:

                            card.setCardValue(6);
                            break;
                        case 6:

                            card.setCardValue(7);
                            break;
                        case 7:

                            card.setCardValue(8);
                            break;
                        case 8:

                            card.setCardValue(9);
                            break;
                        case 9:
                            card.setCardValue(20);
                            card.setCardType(CardType[1]);
                            break;
                        case 10:
                            card.setCardValue(20);
                            card.setCardType(CardType[2]);
                            break;
                        case 11:
                            card.setCardValue(20);
                            card.setCardType(CardType[3]);
                            break;

                        default:
                            break;

                    }
                    desk.add(card);

                }
            }
        }

        /* set 0 To four Color Card*/
        for (color = 0; color < Color.length; color++) {
            UNOCard card = new UNOCard();
            card.setColor(Color[color]);
            card.setCardType(CardType[0]);
            card.setCardValue(0);
            desk.add(card);

        }

        /* set WildCard To four Color Card*/
        for (color = 0; color < Color.length; color++) {
            UNOCard card = new UNOCard();
            card.setColor("WILD");
            card.setCardType("WILDCARD");
            card.setCardValue(20);
            desk.add(card);
        }

        /* set TakeFour To four Color Card*/
        for (color = 0; color < Color.length; color++) {
            UNOCard card = new UNOCard();
            card.setColor("TAKEFOUR");
            card.setCardType("TAKEFOUR");
            card.setCardValue(20);
            desk.add(card);
        }

        /*Shuffling Cards*/
        // Collections.shuffle(desk);         
        //  System.out.println(desk);
        // System.out.println(desk.size());           
    }

    public void ShowCard() {
        System.out.println(desk);
    }

    /*Shuffling Cards*/
    public void Shuffle() {
        Collections.shuffle(desk);
        System.out.println(desk);
    }

}
