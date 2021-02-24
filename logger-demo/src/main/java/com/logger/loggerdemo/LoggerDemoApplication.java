package com.logger.loggerdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerDemoApplication implements ApplicationRunner{

	private static final Logger logger = LogManager.getLogger(LoggerDemoApplication.class);
	public static void main(String[] args) {
//		System.setProperty("log4j.configurationFile", "./resources/log4j2.xml");
		logger.info("App Started- testing logger");
		SpringApplication.run(LoggerDemoApplication.class, args);
		logger.info("App Started- testing logger.....");
		logger.debug("App Started- testing logger.....");
		logger.trace("App Started- testing logger.....");
		logger.error("App Started- testing logger.....");
		logger.warn("App Started- testing logger.....");
		logger.fatal("App Started- testing logger.....");
	}
	

	@Override
	public void run(ApplicationArguments args) throws Exception {
	     logger.debug("Debugging log");
	        logger.info("Info log");
	        logger.warn("Hey, This is a warning!");
	        logger.error("Oops! We have an Error. OK");
	        logger.fatal("Damn! Fatal error. Please fix me.");
		
	}

}
