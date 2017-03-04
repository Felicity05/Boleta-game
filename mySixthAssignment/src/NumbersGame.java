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
        return false;
    }
    
     
    //determine whether there is an “exact order” match
    public boolean IsExactOrder()
    {
        boolean exactOrder;
        exactOrder = (playerNumbers == winningNumber);
        return exactOrder;
    }
    
    
    //determine whether there is an “any order” match with different numbers
   public boolean IsAnyOrder()
    {
//        boolean anyOrder = (playerNumbers == winningNumber||
//                    playerNumbers/100 == winningNumber/100 ||
//                    playerNumbers%10 == winningNumber%10);
        int userNumber = this.playerNumbers;
        int luckyNumber = this.winningNumber;
        boolean playerWon = false;
        
        while (userNumber > 0)
        {
            int currentNumber = userNumber % 10;
            
            while (luckyNumber > 0)
            {
                int testNumber = luckyNumber % 10;
                
                if (currentNumber == testNumber)
                {
                    playerWon = true;
                    break;
                }
                    
                else
                    playerWon = false;
                
                System.out.println();
                
                luckyNumber = luckyNumber / 10;
                    
            }
            userNumber = userNumber / 10;
        }   
        
        
        return playerWon;
    }
    
    //determine whether a Box bet contains duplicate numbers
    public boolean HasDuplicates()
    {
        return true;
    }
   

    }

    
    
    
    
