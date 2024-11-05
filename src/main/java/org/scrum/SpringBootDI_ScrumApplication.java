package org.scrum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringBootDI_ScrumApplication
{
	private static Logger logger = Logger.getLogger(SpringBootDI_ScrumApplication.class.getName());
	
	public static void main(String[] args) {
		logger.info("Loading ... :: SpringBoot - ScrumApplication Default Settings ...  ");
		ApplicationContext ctx = SpringApplication.run(SpringBootDI_ScrumApplication.class, args);
	}
	
}