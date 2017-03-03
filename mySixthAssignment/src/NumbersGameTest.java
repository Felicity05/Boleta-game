
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arelysalvarezpadilla
 */
public class NumbersGameTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double betAmount;
        int playerNumbers;
        int winningNumbers;
        String input;
    
        String betType = JOptionPane.showInputDialog("Select your bet type. \n\nIt can be either \"Straight\" or \"Box\" ");
        
        input = JOptionPane.showInputDialog("Insert your bet amount");
        
        betAmount = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Insert your player numbers. \n3-digit number");
        
        playerNumbers = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Insert the winning numbers. \n3-digit number");
        
        winningNumbers = Integer.parseInt(input);
        
        //game
        NumbersGame myGame = new NumbersGame(betType, betAmount, playerNumbers, winningNumbers);
        
        
        //getting all the data
        System.out.println("Here is your information:" + myGame.getData());
        
        System.out.println("" + myGame.GuessResult());
    }
    
    
}
