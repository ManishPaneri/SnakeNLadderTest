/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakenladdertest;

import java.util.Random;

/**
 *
 * @author manish
 */
public class Dice {
    private static Dice dice;
    
    private Dice(){
    }
    
    public static Dice getDiceInstance(){
        return dice;
    }
    
    public static int rollDice(){
        int n=0;
	Random r = new Random();
        n=r.nextInt(7);
        System.out.println("Dice Number "+ (n==0?1:n));
	return (n==0?1:n);
    }
}
