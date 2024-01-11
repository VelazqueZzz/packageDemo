package bookpack;


public class BookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("java","shildt",2011);
        books[1] = new Book("java1","shildt1",2012);
        books[2] = new Book("java2","shildt2",2013);
        books[3] = new Book("java3","shildt3",2014);
        books[4] = new Book("java4","shildt4",2015);

        for (int i = 0; i < books.length; i++) {
            books[i].show();

        }
    }
}