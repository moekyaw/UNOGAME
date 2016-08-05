/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoplay;

import UNOGames.UNODesk;
import UNOGames.UNOGame;

/**
 *
 * @author Moe Kyaw Kyaw
 */
public class UNOPLAY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UNODesk desk = new UNODesk();
        /* show cards*/
         desk.ShowCard();

        /* shuffle cards*/
       //desk.Shuffle();

        UNOGame game = new UNOGame();
        game.handToCard();
        System.out.println(game);
    }
    
}
