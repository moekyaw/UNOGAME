/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNOGames;

/**
 *
 * @author Moe Kyaw Kyaw
 */
public class UNOCard {

    private String Color;
    private String CardType;
    private int CardValue;

    private String image;

    public UNOCard() {

    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the CardType
     */
    public String getCardType() {
        return CardType;
    }

    /**
     * @param CardType the CardType to set
     */
    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    /**
     * @return the CardValue
     */
    public int getCardValue() {
        return CardValue;
    }

    /**
     * @param CardValue the CardValue to set
     */
    public void setCardValue(int CardValue) {
        this.CardValue = CardValue;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "card(" + "color=" + Color + ",type=" + CardType + ", CardValue=" + CardValue + ", Image=" + image + ')' + "\n";
    }

}
