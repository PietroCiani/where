package com.project.where;

import com.project.where.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class WhereApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhereApplication.class, args);
	}

	@GetMapping
	public List<User> hello() {
		return List.of(
				new User("Zio","Pera", "zio.pera@letsgoski.com")
		);
	}
}
