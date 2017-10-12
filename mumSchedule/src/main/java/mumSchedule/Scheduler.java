package mumSchedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"mumScheduler.controllers", "mumScheduler.service"})
public class Scheduler {

	public static void main(String[] args) {
		SpringApplication.run(Scheduler.class, args);
	}
}
