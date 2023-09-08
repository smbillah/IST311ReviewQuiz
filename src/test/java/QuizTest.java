import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuizTest {

    @Test
    public void testTheQuiz(){
        /** specifications
         * 1. Create 2 books, have 3 copies for the first book and 1 copy for the second book
         * 2. Call checkout on the first book with name = "Mark Twain"
         * 3. Call checkout on the first book with name = "Charles Dickens"
         * 4. Ensure that both of these return true (you can simply print the result)
         * 5. Call checkin on the first book with name = "Mark Twain"
         * 6. Call checkin on the first book with name = "Samuel Clemens"
         * 7. Ensure that the first result is true and the second is false
         * 8. Call checkout on the second book with name = "Mark Twain"
         * 9. Call checkout on the second book with name = "Charles Dickens"
         * 10. Ensure that the first result is true and the second is false
         * 11. Call checkin on the second book with name = "Mark Twain"
         * 12. Call checkout on the second book with name = "Charles Dickens"
         * 13. Ensure that both of these return true
         */

        // spec 1. Create 2 books, have 3 copies for the first book and 1 copy for the second book
        Book book1 = new Book("Book 1", "A Classic Novel", 3, 1, "Author 1");
        Book book2 = new Book("Book 2", "A Literary Masterpiece", 1, 2, "Author 2");

        // spec 2. Call checkout on the first book with name = "Mark Twain"
        boolean result1 = book1.checkOut("Mark Twain");

        // spec 3. Call checkout on the first book with name = "Charles Dickens"
        boolean result2 = book1.checkOut("Charles Dickens");

        // spec 4. Ensure that both of these return true; here 'true' is the expected result
        assertEquals(true, result1);
        assertEquals(true, result2);

        // spec 5. Call checkin on the first book with name = "Mark Twain"
        boolean result3 = book1.checkIn("Mark Twain");

        // spec 6. Call checkin on the first book with name = "Samuel Clemens"
        boolean result4 = book1.checkIn("Samuel Clemens");

        // spec 7. Ensure that the first result is true and the second is false
        assertEquals(true, result3);
        assertEquals(false, result4);

        // spec 8. Call checkout on the second book with name = "Mark Twain"
        boolean result5 = book2.checkOut("Mark Twain");

        // spec 9. Call checkout on the second book with name = "Charles Dickens"
        boolean result6 = book2.checkOut("Charles Dickens");

        // spec 10. Ensure that the first result is true and the second is false
        assertEquals(true, result5);
        assertEquals(false, result6);

        // spec 11. Call checkin on the second book with name = "Mark Twain"
        boolean result7 = book2.checkIn("Mark Twain");

        // spec 12. Call checkout on the second book with name = "Charles Dickens"
        boolean result8 = book2.checkOut("Charles Dickens");

        // spec 13. Ensure that both of these return true
        assertEquals(true, result7);
        assertEquals(true, result8);
    }
}
