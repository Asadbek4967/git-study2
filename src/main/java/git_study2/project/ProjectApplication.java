package git_study2.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {
	public static void main(String[] args) {
		System.out.println("new line");
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
		System.out.println("d");


		for (int i = 0; i < 5; i++) {
			System.out.println(i);

		}

		SpringApplication.run(ProjectApplication.class, args);
	}

}
