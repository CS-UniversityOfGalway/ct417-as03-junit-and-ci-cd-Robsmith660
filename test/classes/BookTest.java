package classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BookTest {

	// You should refer to the WK09 Security Testing for details regarding the Input-Test Type
	// Feel free to use any inputs, as long as they are logical.
	//
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	// TODO: Normal input testing - use the expected values when instantiating the object 
	@Test
	void testBook() {
		fail("Not yet implemented");
	}

	// TODO: Invalid input testing - you should not be able to use null as page number
	@Test
	void testGetNoPages() {
		fail("Not yet implemented");
	}

	// TODO: Boundary input testing - How can you test for the maximum number of pages that you can
	// assign to the variable (clue: you can exploit the limit associated with the respective Java variable type OR
	// use various input values that can be associated with the logical limit of the variable)
	@Test
	void testGetAuthor() {
		fail("Not yet implemented");
	}

	// TODO: Use getters to construct the output string - given the Normal input, you should pass this unit test
	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	// TO-NOT-DO ;)
	@Test
	void testOf() {
		fail("Not yet implemented");
	}
	
}
