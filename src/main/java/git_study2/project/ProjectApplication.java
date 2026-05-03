package git_study2.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {
	public static void main(String[] args) {
		System.out.println("new line");
		System.out.println("Yangi narsa qo'shildi");
		System.out.println("A");

		for (int i = 0; i < 5; i++) {
			System.out.println(i);

		}

		SpringApplication.run(ProjectApplication.class, args);
	}

}
