package com.Nagendra.boot.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

	@Autowired
	Laptop lap;
	public  void test() {
		lap.compile();
	}
 
	public void samle() {
		System.out.println("Check Git");
	}
	
	

}
