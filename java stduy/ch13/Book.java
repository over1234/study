package ch13;

public class Book {
    private static int number = 100;
    private String name;
    private String author;
    private int price;
    private int Booknumber;

    public Book(String name, String author, int price) {
        this.setName(name);
        this.setAuthor(author); 
        this.setPrice(price);
        this.setBooknumber(number++);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBooknumber() {
        return Booknumber;
    }

    public void setBooknumber(int booknumber) {
        this.Booknumber = booknumber;
    }

    public void showInfo() {
        System.out.println("책 이름 : " + name + "\n저자 : " + author + "\n가격 : " + price + "\n책번호 : " + Booknumber);
    }
}
