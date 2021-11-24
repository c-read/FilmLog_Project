package com.tsitraining.cread.FilmLog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;

class FilmLogApplicationTests {
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
	public void testFilmGetLanguageIdMethod()
	{
		Film film = new Film("LOTR", 1, 180);
		assertEquals("failed", 1, film.getLanguage_id());
	}

	@Test
	public void testFilmGetLengthMethod()
	{
		Film film = new Film("LOTR", 1, 180);
		assertEquals("failed", 180, film.getLength());
	}

}
