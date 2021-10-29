package com.tsitraining.cread.FilmLog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@RestController
public class FilmLogApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(FilmLogApplication.class, args);
	}

	@GetMapping("/getcat")
	public String catResponse()
	{
		Actor actor = new Actor("Billy Connoly",);

		return cat.getJsonObjectOfCat();
	}

}
