package com.oasisinfobyte.numberguessing;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		
		int round=1;
		int totalRounds=0;
		int totalAttempts=0;
		
		System.out.println("NUMBER GUESSING GAME");
		System.out.println();
		System.out.println("Guess the number between 1 and 100");
		System.out.println();
		System.out.println("you have maximum 7 attempts per round");
		System.out.println();
		
		boolean playAgain=true;
		
		while(playAgain) {
			
			int number=random.nextInt(100)+1;
			
			int attempts=0;
			boolean guessedCorrectly=false;
			
			System.out.println("ROUND"+round);
			System.out.println();
			
			while(attempts<7 && !guessedCorrectly) {
				System.out.println("Enter your guess:");
				int guess=sc.nextInt();
				
				attempts++;
				
				System.out.println("Attempt: "+attempts +"/7");
				if (guess>number) {
					System.out.println("Too High!");
				}else if(guess<number) {
					System.out.println("Too low");
				}else {
					guessedCorrectly=true;
					
					System.out.println("Correct");
					System.out.println("Congratulations! You guessed the number");
					System.out.println("You guessed it in "+attempts+" attempts.");
				}
				System.out.println();
			}
			if(!guessedCorrectly) {
				
				System.out.println("You lost!");
				System.out.println("The correct number was: "+number);
				
			}
			totalRounds++;
			totalAttempts+=attempts;
			
			System.out.println();
			System.out.println("Round "+round+" - guessed in "+attempts+" attempts");
			System.out.println("Do you want to play again?(yes/no): ");
			String answer=sc.next();
			
			if(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("y")) {
				playAgain=true;
				round++;
				
				System.out.println();
				System.out.println("starting a new round");
				System.out.println();
			}else {
				playAgain=false;
			}
		}
		System.out.println();
		System.out.println("GAME SUMMARY");
		System.out.println();
		
		System.out.println("Total rounds played: "+totalRounds);
		System.out.println("Total attempts made: "+totalAttempts);
		
		System.out.println();
		System.out.println("Thankyou for playing");
		
		sc.close();
	}

}

