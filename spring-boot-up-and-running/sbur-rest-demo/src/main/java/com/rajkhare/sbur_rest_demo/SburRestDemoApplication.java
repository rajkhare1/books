package com.rajkhare.sbur_rest_demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class SburRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SburRestDemoApplication.class, args);
	}

}

@Getter
@Setter
@AllArgsConstructor
class Coffee {
	private final String id;
	private String name;
	
	public Coffee (String name){
		this(UUID.randomUUID().toString(), name);
	}
}



