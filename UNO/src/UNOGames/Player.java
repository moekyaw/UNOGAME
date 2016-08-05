/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNOGames;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Moe Kyaw Kyaw
 */
public class Player {

    private int playerId;
    private String name;
    //UNOGame game=new UNOGame();

    private List<UNOCard> cardInHand = new ArrayList<UNOCard>();

    public Player(int playerId, String name) {
        this.playerId = playerId;
        this.name = name;
    }

    public Player() {

    }

    /**
     * @return the playerId
     */
    public int getPlayerId() {
        return playerId;
    }

    /**
     * @param playerId the playerId to set
     */
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cardInHand
     */
    /**
     * @return the cardInHand
     */
    public List<UNOCard> getCardInHand() {
        return cardInHand;
    }

    /**
     * @param cardInHand the cardInHand to set
     */
    public void setCardInHand(List<UNOCard> cardInHand) {
        this.cardInHand = cardInHand;
    }

    public void addToHand(UNOCard card) {
        cardInHand.add(card);
    }

    @Override
    public String toString() {
        return "Cards in hand" + " " + "card(" + "id=" + playerId + ",Name=" + name + "\n" + getCardInHand() + ')' + "\n";

    }

}
