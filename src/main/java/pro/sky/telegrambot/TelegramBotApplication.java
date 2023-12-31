package pro.sky.telegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Arrays;

@SpringBootApplication
@EnableScheduling
public class TelegramBotApplication {

	public static void main(String[] args) {SpringApplication.run(TelegramBotApplication.class, args);
	}

}
