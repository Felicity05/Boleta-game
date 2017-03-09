/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arelysalvarezpadilla
 */
public class NumbersGame {

    //instance variables  
    private String betType;
    private double betAmount;
    private int playerNumbers;
    private int winningNumber;
    private double amountEarned;

    public NumbersGame(String betType, double betAmount, int playerNumbers, int winningNumber) {
        this.betType = betType;
        this.betAmount = betAmount;
        this.playerNumbers = playerNumbers;
        this.winningNumber = winningNumber;
    }

    //returning the data 
    public String getData() {
        String dataSet = "\n\nYour bet type is: " + betType
                + String.format("\n\nYour bet amount is: $%.2f", betAmount) //fix the format to leave just 2 digits
                + "\n\nYour playing number is: " + playerNumbers
                + "\n\nThe winning number is: " + winningNumber;
        return dataSet;
    }

    //determine whether there is an “exact order” match
    public boolean IsExactOrder() {
        boolean exactOrder;
        exactOrder = (playerNumbers == winningNumber);
        return exactOrder;
    }

    //determine whether there is an “any order” match with different numbers
    public boolean IsAnyOrder() {
        //private int firstDigit = playerNumbers/100;
        // private int secondDigit = (playerNumbers/10)%10;
        //private int thirdDigit = playerNumbers%10;
        boolean order1 = playerNumbers == winningNumber;
        boolean order2 = playerNumbers / 100 == winningNumber / 100 && ((playerNumbers % 10 == (winningNumber / 10) % 10)) && (playerNumbers / 10) % 10 == winningNumber % 10;
        boolean order3 = playerNumbers % 10 == winningNumber / 100 && playerNumbers / 100 == (winningNumber / 10) % 10 && (playerNumbers / 10) % 10 == winningNumber % 10;
        boolean order4 = playerNumbers % 10 == winningNumber / 100 && (playerNumbers / 10) % 10 == (winningNumber / 10) % 10 && playerNumbers / 100 == winningNumber / 100;
        boolean order5 = playerNumbers / 100 == (winningNumber / 10) % 10 && (playerNumbers / 10) % 10 == winningNumber / 100 && playerNumbers % 10 == winningNumber % 10;
        boolean order6 = playerNumbers / 100 == winningNumber % 10 && (playerNumbers / 10) % 10 == winningNumber / 100 && playerNumbers % 10 == (winningNumber / 10) % 10;
        boolean anyOrder;
        return anyOrder = order1 || order2 || order3 || order4 || order5 || order6;
    }

    //determine whether a Box bet contains duplicate numbers
    public boolean HasDuplicates() {
        boolean duplicates = ((playerNumbers / 10) % 10 == playerNumbers % 10)
                || (playerNumbers / 100 == playerNumbers % 10)
                || (playerNumbers / 100 == (playerNumbers / 10) % 10);
        return duplicates;
    }

}
