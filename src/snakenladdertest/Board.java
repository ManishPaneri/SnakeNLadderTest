/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakenladdertest;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author manish
 */
public class Board {
        private static Board board;
        final static int WINPOINT = 100;
	private static final Map<Integer,Integer> snake = new HashMap<Integer,Integer>();
	private static final Map<Integer,Integer> ladder = new HashMap<Integer,Integer>();
	
	static {
		snake.put(99,54);
		snake.put(70,55);
		snake.put(52,42);
		snake.put(25,2);
		snake.put(95,72);
		
		ladder.put(6,25);
		ladder.put(11,40);
		ladder.put(60,85);
		ladder.put(46,90);
		ladder.put(17,69);
	}
        
        
        private Board(){}
        
        public static Board getBoardInstance(){
            return board;
        }
        
       public static int getSnakeEndPoint(int a){
           if (snake.get(a)!=null){
                  return snake.get(a); 
           };
          return 0;
       } 
        
       public static int getLadderTopPoint(int a){
            if (ladder.get(a)!=null){
                  return ladder.get(a); 
           };
          return 0;
          
       } 
        
}
