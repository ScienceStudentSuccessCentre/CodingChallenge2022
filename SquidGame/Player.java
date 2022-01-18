package SquidGame;

import java.util.Random;

/**
 * The Player class models a player in the game. It maintains information about the player
 * @attribute bag
 * @attribute id
 * @attribute marblesDrawed
 * @attribute isEvenOrOdd
 *
 * @method getID()
 * @method getNumberOfMarblesLeft()
 * @method getIsEvenOrOdd()
 * @method drawMarbles()
 * @method guessEvenOrOdd()
 * @method modifyMarbleQuantity(int)
 * @method toString()
 */
public class Player{
    private Marbles bag;
    private int id;
    private int marblesDrawed;
    private String isEvenOrOdd;
    

    /**
     * Initializes players object with an id and a default marble bag
     * 
     * @param integer sets the player id 
     */
    //Player constructor to initialize a player with an ID
    public Player(int id) {
        //enter code here, look carefully at the class attributes
    }


    /**
     * Getter for the player ID
     * 
     * @return player id
     */

    public int getID() {
        return 0; //modify this line
    }
    
    /**
     * Getter for the player's number of marbles
     * 
     * @return number of marbles in the player's marble bag
     */
    public int getNumberOfMarblesLeft() {
        return 0; //modify this line
    }

    /**
     * @return A string representing whether the quantity of marbles drawn is even or odd
     */
    public String getIsEvenOrOdd() {
        //enter code here
        return ""; //this line is here to avoid errors
    }

    /**
     * Draws a random number of marbles based on the amount of marbles available
     * NOTE: This method may be uses to draw marbles for betting as well
     * 
     * @return the number of marbles randomly chosen
     */ 
    public int drawMarbles() {
        Random rand = new Random(); 
        //enter code here
        //create a random number between 1 and te number of marbles left
        return 0; //this line is here to avoid errors
    }

    /**
     * @return a guess about whether the quantity of marbles the
     *         other player made is even or odd   
     */
    public String guessEvenOrOdd() {
        Random rand = new Random();
         //enter code here
         //pick 0 or 1 randomly and make a guess based on that
        return ""; //this line is here to avoid errors
    }

    /**
     * Modifies the number of marbles in the player's marble bag
     *
     * @param int representing the numer of marbles to add (positive argument) or to substract (negative argument)
     */
    public void modifyMarbleQuantity(int marbleNumber) {
        //enter code here
    }


    /**
     * 
     * Gives a string representation of a player object that includes
     * the id and a representation of the marbles the player has
     * 
     * @return A string representation of the player
     */
    //returns a string representation of the player
    public String toString() {

        //you can be creative here as to how you want to represent a player and te amount of mrbles the player has
        return ""; //this line is here to avoid any errors
    }

}