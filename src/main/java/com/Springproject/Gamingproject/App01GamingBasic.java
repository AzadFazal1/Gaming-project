package com.Springproject.Gamingproject;

import com.Springproject.Gamingproject.game.GameRunner;
import com.Springproject.Gamingproject.game.MarioGame;
import com.Springproject.Gamingproject.game.PacmanGame;
import com.Springproject.Gamingproject.game.SuperContraGame;

public class App01GamingBasic {

	public static void main(String[] args) {
		//var game = new MarioGame();
		var game = new PacmanGame();
		//var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		
		gameRunner.run();
	}

}
