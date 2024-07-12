package com.firstDemo.FirstProject.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PUBGQualifier")
public class PUBG implements GameDashboard {
	
	public void up(){
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Step Down towards your Knee");
	}
	
	public void left() {
		System.out.println("Go Left");
	}
	
	public void right() {
		System.out.println("Go Right");
	}
}

