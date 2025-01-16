package com.example.learn_spring_framework;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.MarioGame;
import com.example.learn_spring_framework.game.PacManGame;
import com.example.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasic {

	public static void main(String[] args) {
		//var game = new MarioGame();
		var game = new PacManGame(); //1. Object Creation
		//var game = new SuperContraGame();
		var gameRunner = new GameRunner(game); //2. Object Creation + Wiring of Dependencies
		// Game is a Dependency of GameRunner
		
		gameRunner.run();
		
	}

}
