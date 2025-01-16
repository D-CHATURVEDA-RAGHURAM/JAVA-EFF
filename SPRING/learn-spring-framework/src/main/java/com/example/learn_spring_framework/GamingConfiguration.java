package com.example.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.GamingConsole;
import com.example.learn_spring_framework.game.PacManGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game()
	{
		var game = new PacManGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game)
	{
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	//var game = new MarioGame();
			 //1. Object Creation
			//var game = new SuperContraGame();
//			var gameRunner = new GameRunner(game); //2. Object Creation + Wiring of Dependencies
			// Game is a Dependency of GameRunner
			
//			gameRunner.run();
}
