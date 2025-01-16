package com.example.learn_spring_framework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.GamingConsole;
import com.example.learn_spring_framework.game.PacManGame;

public class App03GamingBasic {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
		
		
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
		
		
	}
//		//var game = new MarioGame();
//				var game = new PacManGame(); //1. Object Creation
//				//var game = new SuperContraGame();
//				var gameRunner = new GameRunner(game); //2. Object Creation + Wiring of Dependencies
//				// Game is a Dependency of GameRunner
//				
//				gameRunner.run();
//		
//		
//		
		
		
	}

}
