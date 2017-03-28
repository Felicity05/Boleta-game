package numbersPackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Compute the possible ways to win when playing the "Boleta Game"(a.k "The Numbers Game"), 
 * and display the amount earned for each dollar wagered as well as a notification message.
 *
 * @author Arelys Alvarez Padilla.
 */
public class NumbersGame {

    //instance variables  
    private String betType;                     //type of bet either "Straight" or "Box"
    private double betAmount;                   //desired bet amount
    private int playerNumbers;                  //player numbers enter by the user 3-digit numbers
    private int winningNumber;                  //winning numbers enter by the user 3-digit numbers
    private double amountEarned;                //amount earned for each dollar wagered
    private String message;                     //messages to show the lucky of the player

    /**
     * Constructs a NumbersGame object.
     *
     * @param betType type of bet either "Straight" or "Box"
     * @param betAmount the amount bet
     * @param playerNumbers the numbers used to play 3-digit numbers
     * @param winningNumber the winning number 3-digit numbers
     */
    public NumbersGame(String betType, double betAmount, int playerNumbers, int winningNumber) {
        this.betType = betType;
        this.betAmount = betAmount;
        this.playerNumbers = playerNumbers;
        this.winningNumber = winningNumber;
    }

    /**
     * Displays the data enter by the user.
     *
     * @return all the data entered by the user
     */
    public String getData() {
        String dataSet = "\n\nYour bet type is: " + betType
                + String.format("\n\nYour bet amount is: $%.2f", betAmount)
                + "\n\nYour playing number is: " + playerNumbers
                + "\n\nThe winning number is: " + winningNumber;
        return dataSet;
    }

    /**
     * Determine whether there is an “exact order” match.
     *
     * @return the exact order when the player numbers and the winning numbers
     * are equals
     */
    public boolean IsExactOrder() {
        boolean exactOrder;        // check if the player number is exactly equal to the winning number
        exactOrder = (playerNumbers == winningNumber);
        return exactOrder;
    }

    /**
     * Determine whether there is an “any order” match with different numbers.
     *
     * @return any order match after evaluate all the conditions possibles to
     * match the numbers
     */
    public boolean IsAnyOrder() {
        //firstDigit = playerNumbers/100
        //secondDigit = (playerNumbers/10)%10
        //thirdDigit = playerNumbers%10
        //all the possible combinations between player number and winning numbers to win 
        boolean order1 = playerNumbers == winningNumber;
        boolean order2 = playerNumbers / 100 == winningNumber / 100 && ((playerNumbers % 10 == (winningNumber / 10) % 10)) && (playerNumbers / 10) % 10 == winningNumber % 10;
        boolean order3 = playerNumbers % 10 == winningNumber / 100 && playerNumbers / 100 == (winningNumber / 10) % 10 && (playerNumbers / 10) % 10 == winningNumber % 10;
        boolean order4 = playerNumbers % 10 == winningNumber / 100 && (playerNumbers / 10) % 10 == (winningNumber / 10) % 10 && playerNumbers / 100 == winningNumber / 100;
        boolean order5 = playerNumbers / 100 == (winningNumber / 10) % 10 && (playerNumbers / 10) % 10 == winningNumber / 100 && playerNumbers % 10 == winningNumber % 10;
        boolean order6 = playerNumbers / 100 == winningNumber % 10 && (playerNumbers / 10) % 10 == winningNumber / 100 && playerNumbers % 10 == (winningNumber / 10) % 10;
        boolean anyOrder = order1 || order2 || order3 || order4 || order5 || order6;      //check the order of the player numbers and the winning numbers to see if there is any match
        return anyOrder;
    }

    /**
     * Determine whether a Box bet contains duplicate numbers.
     *
     * @return the duplicates if there is duplicates numbers in the player
     * numbers
     */
    public boolean HasDuplicates() {
        //check for duplicates in the player numbers
        boolean duplicates = ((playerNumbers / 10) % 10 == playerNumbers % 10)
                || (playerNumbers / 100 == playerNumbers % 10)
                || (playerNumbers / 100 == (playerNumbers / 10) % 10);
        return duplicates;
    }

    /**
     * Make all the computations to check if the person win or lose, and if the
     * person win show how much the person won and a message.
     */
    public void computeAmountEarned() {
        if (betType.equalsIgnoreCase("Straight"))           //boolean method to check bet type
        {
            if (IsExactOrder()) {
                amountEarned = betAmount * 600;             //player wins $600 for each $1 wagered
                message = String.format("\nYour numbers are exactly the same ;) Congratulations, You won!!! \n\nThe amount you earned is: $%.2f", amountEarned);
            } else {
                amountEarned = 0;                          //player loses, does not earn any mony 
                message = String.format("\nSorry, you lost :( The amount you earned is: $%.2f. Try again next time!", amountEarned);
            }
        } else {   // box bet
            if (IsAnyOrder()) {                            //boolean method to check the order of the player numbers and the winning numbers
                if (HasDuplicates()) {                     //boolean method to check if the player numbers contains duplicates numbers
                    amountEarned = betAmount * 200;        //player wins $200 for each $1 wagered
                    message = String.format("\nYou have a duplicate. Congratulations, you won!!! \n\nThe amount you earned is: $%.2f", amountEarned);
                } else {
                    amountEarned = betAmount * 100;        //player wins $100 for each $1 wagered
                    message = String.format("\nCongratulations, You won!!! \n\nThe amount you earned is: $%.2f", amountEarned);
                }
            } else {
                amountEarned = 0;                          //player loses, does not earn any mony 
                message = String.format("\nSorry, you are not lucky today :( The amount you earned is: $%.2f. Try again next time!", amountEarned);
            }
        }
    }

    /**
     * Get the amount earned by the player.
     *
     * @return the amount earned
     */
    public double getAmountEarned() {
        return amountEarned;       
    }

    /**
     * Display the message to the player.
     *
     * @return a message to the player explaining what happened in the game
     */
    public String getMessage() {
        return message;       
    }
}
