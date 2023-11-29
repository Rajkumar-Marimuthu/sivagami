package com.rojatech.lms.sivagami;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.rojatech.lms.sivagami.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SivagamiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SivagamiApplication.class, args);
	}

}
