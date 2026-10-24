public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@somewhere.com", 'm');
        Book dummyBook = new Book("Java for dummies", authors, 19.99, 99);
        System.out.println(dummyBook);
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("Name is: " + dummyBook.getName());
        System.out.println("Price is: " + dummyBook.getPrice());
        System.out.println("Qty is: " + dummyBook.getQty());
        System.out.println("Authors are: " + dummyBook.getAuthorNames());
        System.out.println("Author details:");
        for (Author a : dummyBook.getAuthors()) {
            System.out.println(a);
        }
    }
}