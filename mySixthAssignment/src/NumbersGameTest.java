
import numbersPackage.NumbersGame;
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
        double amountEarned;
        String input;
        String betType = null;

        //get the bet typre from the user 
        betType = JOptionPane.showInputDialog("Select your bet type. \n\nIt can be either \"Straight\" or \"Box\" ");

        //tests if the user type something different to "Straight" or "Box" and if so show an error message
        while (!betType.equalsIgnoreCase("Straight") && !betType.equalsIgnoreCase("Box")) {
            JOptionPane.showMessageDialog(null, "Sorry that's not a valid bet type. Insert the bet type againg.");
            betType = JOptionPane.showInputDialog("Select your bet type. \n\nIt can be either \"Straight\" or \"Box\" ");
        }

        //get all the other data from user
        input = JOptionPane.showInputDialog("Insert your bet amount");

        betAmount = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Insert your player number. \n3-digit number");

        playerNumbers = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Insert the winning number. \n3-digit number");

        winningNumbers = Integer.parseInt(input);

        //create a Game object (myGame) using these values
        NumbersGame myGame = new NumbersGame(betType, betAmount, playerNumbers, winningNumbers);

        //get all the data that the user entered
        System.out.println("Here is your information:" + myGame.getData());

        //call computeAmountEarned for myGame object to see if the player win or loses
        myGame.computeAmountEarned();

        //print a notification message to show the player what happened
        System.out.println(myGame.getMessage());

    }

}
