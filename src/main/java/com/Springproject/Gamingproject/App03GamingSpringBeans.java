package com.Springproject.Gamingproject;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Springproject.Gamingproject.game.GameRunner;
import com.Springproject.Gamingproject.game.GamingConsole;
import com.Springproject.Gamingproject.game.MarioGame;
import com.Springproject.Gamingproject.game.PacmanGame;
import com.Springproject.Gamingproject.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
//		//var game = new MarioGame();
//		var game = new PacmanGame();
//		//var game = new SuperContraGame();
//		var gameRunner = new GameRunner(game);
//		
//		gameRunner.run();
		
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
