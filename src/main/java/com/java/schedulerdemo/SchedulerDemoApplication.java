package com.java.schedulerdemo;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
// @EnableScheduling
public class SchedulerDemoApplication {
	// @Autowired
	// private SchedulerConfig scheduler;

	public static void main(String[] args) {
		SpringApplication.run(SchedulerDemoApplication.class, args);
	}

	// @Scheduled(fixedRate = 2000, scheduler = "myScheduler")
	public void doSomething() {

		System.out.println("local time: " + LocalTime.now());

	}

	@Scheduled(cron = "*/2 * * * * *")
	// @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
	// @Async
	public void scheduleTask() {
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"dd-MM-yyyy HH:mm:ss.SSS");

	String strDate = dateFormat.format(new Date());

		System.out.println(
				"Cron job Scheduler1: Job running at - "
						+ strDate);
	}

	@Scheduled(cron = "*/2 * * * * *")
	// @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
	// @Async
	public void scheduleTask2() {
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"dd-MM-yyyy HH:mm:ss.SSS");

	String strDate = dateFormat.format(new Date());

		System.out.println(
				"Cron job Scheduler2: Job running at - "
						+ strDate);
	}

}
