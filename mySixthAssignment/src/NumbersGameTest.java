
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
    
        String betType = JOptionPane.showInputDialog("Select your bet type. \nIt can be either \"Straight\" or \"Box\" ");
        
        input = JOptionPane.showInputDialog("Insert your bet amount");
        
        betAmount = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Insert your player numbers");
        
        playerNumbers = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Insert the winning numbers");
        
        winningNumbers = Integer.parseInt(input);
        
        
    }
    
}
