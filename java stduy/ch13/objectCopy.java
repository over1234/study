package ch13;

public class objectCopy {
    public static void main(String[] args)
    {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("삼국지1", "침착맨", 12000);
        library[1] = new Book("삼국지2", "침착맨", 12000);
        library[2] = new Book("삼국지3", "침착맨", 12000);
        library[3] = new Book("삼국지4", "침착맨", 12000);
        library[4] = new Book("삼국지5", "침착맨", 12000);


        copyLibrary[0] = new Book("삼국지1", "침착맨", 12000);
        copyLibrary[1] = new Book("삼국지2", "침착맨", 12000);
        copyLibrary[2] = new Book("삼국지3", "침착맨", 12000);
        copyLibrary[3] = new Book("삼국지4", "침착맨", 12000);
        copyLibrary[4] = new Book("삼국지5", "침착맨", 12000);

        System.arraycopy(library, 0, copyLibrary, 0, 5);

        copyLibrary[0].setAuthor("생택쥐페리");
        copyLibrary[0].setName("어린왕자");

        for (Book book : library) {
            book.showInfo();
            System.out.println(
                    "-----------------------------------------------------------------------------------------------------------------");
        }

        System.out.println(
                "***************************************************************************************************************");

        for (Book book : copyLibrary) {
            
            book.showInfo();
            System.out.println(
                    "-----------------------------------------------------------------------------------------------------------------");
        }

    }
}
