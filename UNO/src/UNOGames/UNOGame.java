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
public class UNOGame {

    int id;
    int i, j;
    int eachplayercount;
    List<Player> playerList = new ArrayList<Player>();
    UNODesk desk = new UNODesk();

    Player player1 = new Player(1, "Arial");
    Player player2 = new Player(2, "Wyne");
    Player player3 = new Player(3, "John");
    Player player4 = new Player(4, "Mike");
    Player player5 = new Player(5, "Fred");

    public UNOGame() {
        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
        playerList.add(player4);
        playerList.add(player5);
    }

    public void handToCard() {
    
        for (i = 0; i < 7; i++) {
            eachplayercount++;
            for (j = 0; j < playerList.size(); j++) {                
                playerList.get(j).addToHand(desk.removeCardFromDesk());
                    
            }
        }
        System.out.println("Discard Pile is " + desk.createDiscardPile());
        System.out.println("The remaining Desk Cards are " + desk.showRemainingDeskCard());
        System.out.println("The total card value for each player's hand is "+eachplayercount);
    }

    @Override
    public String toString() {
        return "UNOGame{" + "id=" + id + ", playerList=" + playerList + '}' + "\n";
    }

}
