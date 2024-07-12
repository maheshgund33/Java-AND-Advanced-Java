package com.firstDemo.FirstProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.firstDemo.FirstProject.game.FreeFire;
import com.firstDemo.FirstProject.game.GameDashboard;
import com.firstDemo.FirstProject.game.HillClimb;
import com.firstDemo.FirstProject.game.PUBG;
import com.firstDemo.FirstProject.game.Runner;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.firstDemo.FirstProject.game.GameDashboard;
import com.firstDemo.FirstProject.game.HillClimb;
import com.firstDemo.FirstProject.game.PUBG;
import com.firstDemo.FirstProject.game.Runner;


@Configuration
@ComponentScan("com.firstDemo.FirstProject.game")
public class PlayStoreGameAppLauncher {
	
		public static void main(String[]  args) {
		try(var context= new AnnotationConfigApplicationContext(PlayStore.class);)
		    {
			context.getBean(GameDashboard.class).up();
			
			context.getBean(Runner.class).run();		
		
		}
	}
}

