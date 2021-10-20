package ch13;

public class BookArrayTest {
    public static void main(String[] args)
    {
        Book[] library = new Book[5];

        library[0] = new Book("삼국지1", "침착맨", 12000);
        library[1] = new Book("삼국지2", "침착맨", 12000);
        library[2] = new Book("삼국지3", "침착맨", 12000);
        library[3] = new Book("삼국지4", "침착맨", 12000);
        library[4] = new Book("삼국지5", "침착맨", 12000);

        for(Book book : library) {
            book.showInfo();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
        }
    }
}
