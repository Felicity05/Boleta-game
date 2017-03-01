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
    
    public NumbersGame(String betType, double betAmount, int playerNumbers, int winningNumber)
    {
        this.betType = betType;
        this.betAmount = betAmount;
        this.playerNumbers = playerNumbers;
        this.winningNumber = winningNumber;
    }
   
    //returning the data 
    public String Data()
    {
        String dataSet = "Your bet type is " + betType
                        + "Your bet amount is " + betAmount
                        + "Your playing numbers are " + playerNumbers
                        + "The winning number is " + winningNumber;
        return dataSet;
    }
}
