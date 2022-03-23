package site.metacoding.searchtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SearchtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchtestApplication.class, args);
	}

}
