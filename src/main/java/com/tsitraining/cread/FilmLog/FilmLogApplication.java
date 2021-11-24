package com.tsitraining.cread.FilmLog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@SpringBootApplication
@RestController
@RequestMapping("/films")
@CrossOrigin(origins = "http://localhost:3000")
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

//	@PostMapping("/addFilm")
//	public @ResponseBody String addAFilm (@RequestParam String title,
//										  @RequestParam int language_id, @RequestParam int length)
//	{
//		Film savedFilm = new Film(title, language_id, length);
//		filmRepository.save(savedFilm);
//		return "saved.";
//	}
	@PostMapping(path="/addFilm", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Film> addAFilm(@RequestBody Film newFilm){
		Film savedFilm = new Film(newFilm.getTitle(), newFilm.getLanguage_id(), newFilm.getLength());
		filmRepository.save(savedFilm);
		return new ResponseEntity<Film>(savedFilm, HttpStatus.OK);
	}

	@DeleteMapping(value = "/deleteFilm/{film_id}")
	public @ResponseBody String deleteFilm(@PathVariable("film_id") int film_id)
	{
		filmRepository.deleteById(film_id);
		return "deleted.";
	}
	//fdfd
	@PostMapping("/updateFilm/{film_id}")
	public @ResponseBody String updateFilm(@PathVariable("film_id") int film_id, @RequestParam String title,
										   @RequestParam int length)
	{
		Optional<Film> optionalFilm = filmRepository.findById(film_id);
		Film updatedFilm = optionalFilm.get();
		updatedFilm.setTitle(title);
		updatedFilm.setLength(length);
		filmRepository.save(updatedFilm);
		return "updated.";
	}



/*	@PostMapping("/addFilm")
	public @ResponseBody String addAFilm (@RequestBody Film savedFilm)
	{
		filmRepository.save(savedFilm);
		return "saved";
	}*/


}
