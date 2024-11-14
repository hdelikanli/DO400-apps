@Test
public void checkingOutDecreasesNumberOfBookCopiesFromInventory()

	throws BookNotAvailableException {
	// Given
	inventory.add(new Book("book1"));
	inventory.add(new Book("book1"));

	// When
	library.checkOut("someStudentId", "book1");

	// Then

	assertEquals(1, inventory.countCopies("book1"));
}

