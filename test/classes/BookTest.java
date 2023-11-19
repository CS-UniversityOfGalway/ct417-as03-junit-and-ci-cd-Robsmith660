package classes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BookTest {
	
	Genre genre = new Fantasy();
	Book book = new Book("The Alchemist", "Paulo Coelho", 1988, 4, 163, genre);
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testBook() {
	    assertEquals("The Alchemist", book.getTitle());
	    assertEquals("Paulo Coelho", book.getAuthor());
	    assertEquals(4, book.getRating());
	    assertEquals(163, book.getNoPages());
	}

	@Test
	void testGetNoPagesInvalidInput() {
		Integer nullValue = null;
	    assertThrows(IllegalArgumentException.class, () -> new Book("The Alchemist", "Paulo Coelho", 1988, 4, nullValue, genre));
	}


	@Test
	void testGetAuthor() {
		String longAuthorName = "A".repeat(50);
		assertThrows(Exception.class, () -> new Book("The Alchemist", longAuthorName, 1988, 4, 163, genre));
	}

	@Test
	void testToString() {
		Book book = new Book("The Alchemist", "Paulo Coelho", 1988, 4, 163, genre);
		String expectedToString = book.title + " by " + book.getAuthor() + " price at = " + book.getPrice();
		assertEquals(expectedToString, book.toString());
	}

	// TO-NOT-DO ;)
	@Test
	void testOf() {
		fail("Not yet implemented");
	}
	
}
