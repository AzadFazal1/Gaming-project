package com.Springproject.Gamingproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Springproject.Gamingproject.game.GameRunner;
import com.Springproject.Gamingproject.game.GamingConsole;
import com.Springproject.Gamingproject.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
	
	
	
	
	
	
//	//var game = new MarioGame();
//			var game = new PacmanGame();
//			//var game = new SuperContraGame();
//			var gameRunner = new GameRunner(game);
//			
//			gameRunner.run();
		
}
