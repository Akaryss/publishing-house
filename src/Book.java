public class Book {
    private String title;
    private Author author;
    private Publisher publisher;
    private int year;

    public Book(String title, Author author, Publisher publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    // геттеры
    public String getTitle() { return title; }
    public Author getAuthor() { return author; }
    public Publisher getPublisher() { return publisher; }
    public int getYear() { return year; }

    @Override
    public String toString() {
        return title + " — " + author.getName() + " (" + publisher.getName() + ", " + year + ")";
    }
}