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
                + "\n\nYour playing numbers are " + playerNumbers
                + "\n\nThe winning number is " + winningNumber;
        return dataSet;
    }

    //determine bet type
    public boolean IsStraight()
    {
        return true;
    }
    
     
    //determine whether there is an “exact order” match
    public boolean IsExactOrder()
    {
        boolean exactOrder;
        exactOrder = (playerNumbers == winningNumber);
        return exactOrder;
    }
    
    
    //determine whether there is an “any order” match
    public boolean IsAnyOrder()
    {
        return false;
    }
    
    //determine whether a Box bet contains duplicate numbers
    public boolean HasDuplicates()
    {
        return false;
    }
    
    
    //all the coputations to determine if the person won or lost
    /*public double GuessResult() {
        if ("Straight".equals(betType)) //boolean method
        {
            if (playerNumbers == winningNumber) {
                betType = "Straight";
                amountEarned = 600 * betAmount;    //player wins $600 for each $1 wagered
                System.out.printf("\nThe amount you earned is: $%.2f", amountEarned);
            } else {
                amountEarned = 0;
                System.out.println("\nSorry, you lost. Try again next time!");
            }
        } else // Box bet
        {
            System.out.println(""); //boolean method 
        }
         {
            if ("all three numbers match in any order" or  or )   //boolean method
            {
                //player wins
                if ("player’s number contains duplicates") {
                    amountEarned = 200 * betAmount;    //player wins $200 for each $1 wagered
                } else {
                    amountEarned = 100 * betAmount;    //player wins $100 for each $1 wagered
                }
            }
            else
            {
                System.out.println("Sorry, you lost. Try again next time!");     
                    }
        }
        return 0;*/

    }

    
    
    
    
