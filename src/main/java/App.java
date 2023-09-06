public class App {
    public static void main(String[] args) {
        Book book1 = new Book("Book 1", "A Classic Novel", 3, 1, "Author 1");
        Book book2 = new Book("Book 2", "A Literary Masterpiece", 1, 2, "Author 2");

        System.out.println("Checkout result for Mark Twain on book1: " + book1.checkOut("Mark Twain"));
        System.out.println("Checkout result for Charles Dickens on book1: " + book1.checkOut("Charles Dickens"));

        System.out.println("Checkin result for Mark Twain on book1: " + book1.checkIn("Mark Twain"));
        System.out.println("Checkin result for Samuel Clemens on book1: " + book1.checkIn("Samuel Clemens"));

        System.out.println("Checkout result for Mark Twain on book2: " + book2.checkOut("Mark Twain"));
        System.out.println("Checkout result for Charles Dickens on book2: " + book2.checkOut("Charles Dickens"));

        System.out.println("Checkin result for Mark Twain on book2: " + book2.checkIn("Mark Twain"));
        System.out.println("Checkout result for Charles Dickens on book2: " + book2.checkOut("Charles Dickens"));
    }
}
