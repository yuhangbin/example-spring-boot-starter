package com.yu.echo.app;

import com.yu.echo.EchoBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yuhangbin
 * @date 2022/3/6
 **/
@SpringBootApplication
public class EchoApplication implements CommandLineRunner {

	@Autowired
	private EchoBot echoBot;

	public static void main(String[] args) {
		SpringApplication.run(EchoApplication.class, args);
	}

	@Override public void run(String... args) throws Exception {
		echoBot.echo(args[0]);
	}
}
