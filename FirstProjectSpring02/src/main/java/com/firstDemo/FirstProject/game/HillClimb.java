package com.firstDemo.FirstProject.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HillClimb  implements GameDashboard{
	
	public void up(){
		System.out.println("Speed UP ");	
	}
	public void down() {
		System.out.println("Speed Down ");
	}
	public void left() {
		System.out.println("Backward ");
	}
	public void right()
	{
		System.out.println(" Forward");
	}	
	
}
