/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakenladdertest;

import static snakenladdertest.Board.getBoardInstance;
import static snakenladdertest.Dice.getDiceInstance;

/**
 *
 * @author manish
 */
public class Player {
    
    static Board board = getBoardInstance();
    private boolean startRule=false; 
    Dice dice = getDiceInstance();
    
    private int scorer =0;
    
    public void calculatePlayerValue(int diceValue)
	{
            
            if (diceValue==6 && startRule==false){
                startRule=true;
                return;
            }else if (startRule==false){
                return;
                
            }else{

             this.scorer =  this.scorer+ diceValue;
             if(this.scorer > board.WINPOINT)
             {
                     this.scorer = this.scorer - diceValue;
                     return;
             }

             if(board.getSnakeEndPoint(this.scorer)!=0)
             {
                     System.out.println("swallowed by snake");
                     this.scorer= board.getSnakeEndPoint(this.scorer);
             }

             if(0!=board.getLadderTopPoint(this.scorer))
             {
                     System.out.println("climb up the ladder");
                     this.scorer= board.getLadderTopPoint(this.scorer);
             }
             return;
               
            }  
	}
    
        public int getPlayerScorer(){
            return this.scorer;
        }
        
        public boolean isWin()
	{
		return board.WINPOINT == this.scorer;
	}
}
