package com.cromero.learnspringframework;

import com.cromero.learnspringframework.enterprise.example.MyWebController;
import com.cromero.learnspringframework.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner gameRunner = context.getBean(GameRunner.class);
		gameRunner.run();

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnVaueFromBusinessService());

	}

}
