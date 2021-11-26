package com.tsitraining.cread.FilmLog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;

class FilmLogApplicationTests {
	@Test
	public void testFilmGetIdMethod()
	{
		Film film = new Film(1,"LOTR","description",
				2009,1,24,4.99,
				21,9.99,"pg","features");
		assertEquals("failed", 1, film.getFilm_id());
	}

	@Test
	public void testFilmSetIdMethod()
	{
		Film film = new Film(1,"LOTR","description",
				2009,1,24,4.99,
				21,9.99,"pg","features");
		film.setFilm_id(2);
		assertEquals("failed", 2, film.getFilm_id());
	}

	@Test
	public void testFilmGetTitleMethod()
	{
		Film film = new Film("LOTR", 1, 180);
		assertEquals("failed", "LOTR", film.getTitle());
	}

	@Test
	public void testFilmSetTitleMethod()
	{
		Film film = new Film("LOTR", 1, 180);
		film.setTitle("Interstellar");
		assertEquals(true,film.getTitle() == "Interstellar");
	}

	@Test
	public void testFilmGetDescriptionMethod()
	{
		Film film = new Film(1,"LOTR","description",
				2009,1,24,4.99,
				21,9.99,"pg","features");
		assertEquals("failed", "description", film.getDescription());
	}

	@Test
	public void testFilmSetDescriptionMethod()
	{
		Film film = new Film(1,"LOTR","description",
				2009,1,24,4.99,
				21,9.99,"pg","features");
		film.setDescription("desc");
		assertEquals("failed", "desc", film.getDescription());
	}

	@Test
	public void testFilmGetLanguageIdMethod()
	{
		Film film = new Film("LOTR", 1, 180);
		assertEquals("failed", 1, film.getLanguage_id());
	}

	@Test
	public void testFilmSetLanguageIdMethod()
	{
		Film film = new Film("LOTR", 1, 180);
		film.setLanguage_id(2);
		assertEquals(true,film.getLanguage_id() == 2);
	}

	@Test
	public void testFilmGetLengthMethod()
	{
		Film film = new Film("LOTR", 1, 180);
		assertEquals("failed", 180, film.getLength());
	}

	@Test
	public void testFilmSetLengthMethod()
	{
		Film film = new Film("LOTR", 1, 180);
		film.setLength(200);
		assertEquals(true,film.getLength() == 200);
	}

	@Test
	public void testFilmGetReleaseYearMethod()
	{
		Film film = new Film(1,"LOTR","description",
				2009,1,24,4.99,
				21,9.99,"pg","features");
		assertEquals("failed", 2009, film.getReleaseYear());
	}

	@Test
	public void testFilmSetReleaseYearMethod()
	{
		Film film = new Film(1,"LOTR","description",
				2009,1,24,4.99,
				21,9.99,"pg","features");
		film.setReleaseYear(2008);
		assertEquals("failed", 2008, film.getReleaseYear());
	}

	@Test
	public void testFilmGetRentalDurationMethod()
	{
		Film film = new Film(1,"LOTR","description",
				2009,1,24,4.99,
				21,9.99,"pg","features");
		assertEquals("failed", 24, film.getRental_duration());
	}

	@Test
	public void testFilmSetRentalDurationMethod()
	{
		Film film = new Film(1,"LOTR","description",
				2009,1,24,4.99,
				21,9.99,"pg","features");
		film.setRental_duration(25);
		assertEquals("failed", 25, film.getRental_duration());
	}

	@Test
	public void testFilmGetRentalRateMethod()
	{
		Film film = new Film(1,"LOTR","description",
				2009,1,24,4.99,
				21,9.99,"pg","features");
		assertEquals(4.99,film.getRental_rate(),0);

	}

	@Test
	public void testFilmSetRentalRateMethod()
	{
		Film film = new Film(1,"LOTR","description",
				2009,1,24,4.99,
				21,9.99,"pg","features");
		film.setRental_rate(5.99);
		assertEquals(5.99,film.getRental_rate(),0);
	}

	@Test
	public void testFilmGetReplacementCostMethod()
	{
		Film film = new Film(1,"LOTR","description",
				2009,1,24,4.99,
				21,9.99,"pg","features");
		assertEquals(9.99,film.getReplacement_cost(),0);
	}

	@Test
	public void testFilmSetReplacementCostMethod()
	{
		Film film = new Film(1,"LOTR","description",
				2009,1,24,4.99,
				21,9.99,"pg","features");
		film.setReplacement_cost(10.99);
		assertEquals(10.99,film.getReplacement_cost(),0);
	}

	@Test
	public void testFilmGetRatingMethod()
	{
		Film film = new Film(1,"LOTR","description",
				2009,1,24,4.99,
				21,9.99,"pg","features");
		assertEquals("failed", "pg", film.getRating());
	}

	@Test
	public void testFilmSetRatingMethod()
	{
		Film film = new Film(1,"LOTR","description",
				2009,1,24,4.99,
				21,9.99,"pg","features");
		film.setRating("pg13");
		assertEquals("failed", "pg13", film.getRating());
	}

	@Test
	public void testFilmGetFeaturesnMethod()
	{
		Film film = new Film(1,"LOTR","description",
				2009,1,24,4.99,
				21,9.99,"pg","features");
		assertEquals("failed", "features", film.getSpecial_features());
	}

	@Test
	public void testFilmSetFeaturesMethod()
	{
		Film film = new Film(1,"LOTR","description",
				2009,1,24,4.99,
				21,9.99,"pg","features");
		film.setSpecial_features("more features");
		assertEquals("failed", "more features", film.getSpecial_features());
	}


}
