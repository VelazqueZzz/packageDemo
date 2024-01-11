package bookpackext;

public class UseBook {
    public static void main(String[] args) {
        bookpack.Book books[] = new bookpack.Book[5];

        books[0] = new bookpack.Book("Java22","Shildt22",2021);
        books[1] = new bookpack.Book("Java23","Shildt23",2022);
        books[2] = new bookpack.Book("Java24","Shildt24",2023);
        books[3] = new bookpack.Book("Java25","Shildt25",2024);
        books[4] = new bookpack.Book("Java26","Shildt26",2025);
        for (int i = 0;i< books.length;i++) books[i].show();
    }
}
