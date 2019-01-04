/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakenladdertest;

import java.util.Scanner;


/**
 *
 * @author manish
 */
public class SnakeNLadderTest {

	public static void main(String[] args) {
		SnakeNLadder s = new SnakeNLadder();
		s.startGame();
	}
}

class SnakeNLadder {
    
    	public void startGame()
	{
            int currentPlayer=-1;
            Scanner s = new Scanner(System.in);
            Player player1 = new Player();
            Player player2 = new Player();
           

            String str;
            int diceValue =0;
            do
            {
                    System.out.println(currentPlayer==-1?"\n\nFIRST PLAYER TURN":"\n\nSECOND PLAYER TURN");
                    System.out.println("Press r to roll Dice");
                    str = s.next();
                    
                    if(currentPlayer == -1)
                    {
                            diceValue =  Dice.rollDice();
                            player1.calculatePlayerValue(diceValue);
                            System.out.println("First Player :: " + player1.getPlayerScorer());
                            System.out.println("------------------");

                            if(player1.isWin())
                            {
                                    System.out.println("First player wins");
                                    return;
                            }
                    }
                    else
                    { 
                            diceValue =  Dice.rollDice();
                        
                            player2.calculatePlayerValue(diceValue);
                            System.out.println("Second Player :: " + player2.getPlayerScorer());
                            System.out.println("------------------");

                            if(player2.isWin())
                            {
                                    System.out.println("Second player wins");
                                    return;
                            }
                    }

                    currentPlayer= -currentPlayer;



            }while("r".equals(str));
	}
}