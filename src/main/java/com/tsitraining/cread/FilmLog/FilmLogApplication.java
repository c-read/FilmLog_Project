package com.tsitraining.cread.FilmLog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
@RestController
@RequestMapping("/films")
public class FilmLogApplication
{

	@Autowired
	private FilmRepository filmRepository;

/*	@Autowired
	private ActorRepository actorRepository;*/

	public static void main(String[] args)
	{
		SpringApplication.run(FilmLogApplication.class, args);
	}

/*	@GetMapping("/getcat")
	public String catResponse()
	{
		Actor actor = new Actor("Billy Connoly", LocalDate.of(1968,1,1));

		return "";
	}*/

	@GetMapping("/all")
	public @ResponseBody Iterable<Film> getAllUsers()
	{
		return filmRepository.findAll();
	}

	@GetMapping("/id/{film_id}")
	public @ResponseBody Film findById(@PathVariable("film_id") int film_id)
	{
		Film film = filmRepository.findById(film_id).orElse(null);
		return film;
	}

	@PostMapping("/addFilm")
	public @ResponseBody String addAFilm (@RequestParam String title,
										  @RequestParam int language_id, @RequestParam int length)
	{
		Film savedFilm = new Film(title, language_id, length);
		filmRepository.save(savedFilm);
		return "saved";

	}

	@DeleteMapping("/deleteFilm")
	public @ResponseBody String deleteFilm(@RequestParam("film_id") int film_id)
	{
		//Film film = filmRepository.findById(film_id).orElse(null);
		filmRepository.deleteById(film_id);
		//filmRepository.delete(film);
		return "deleted";
	}

	@PutMapping("/updateFilm")
	public @ResponseBody String updateFilm(@RequestParam("film_id") int film_id, @RequestParam String title,
										   @RequestParam int length)
	{
		Film film = filmRepository.findById(film_id).orElse(null);
		film.setTitle(title);
		film.setLength(length);
		filmRepository.save(film);
		return "updated";
	}



/*	@PostMapping("/addFilm")
	public @ResponseBody String addAFilm (@RequestBody Film savedFilm)
	{
		filmRepository.save(savedFilm);
		return "saved";
	}*/


}
