package interfaces;

public class Library {

    public static void main(String[] args) {
        Product book = new Book();
        book.setName("Hanti kanti");

        System.out.println(book.getName());
    }
}
