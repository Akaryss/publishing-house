import java.util.*;

public class BookRepository {
    private List<Book> books = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();
    private List<Publisher> publishers = new ArrayList<>();

    public void addSampleData() {
        Author a1 = new Author("Лев Толстой", 85);
        Author a2 = new Author("Фёдор Достоевский", 7);
        Author a3 = new Author("Александр Пушкин", 45);

        Publisher p1 = new Publisher("АСТ");
        Publisher p2 = new Publisher("Эксмо");
        Publisher p3 = new Publisher("Азбука");

        books.add(new Book("Война и мир", a1, p1, 1869));
        books.add(new Book("Преступление и наказание", a2, p2, 1866));
        books.add(new Book("Евгений Онегин", a3, p3, 1833));
        books.add(new Book("Анна Каренина", a1, p1, 1877));
        books.add(new Book("Идиот", a2, p2, 1869));

        authors.addAll(Arrays.asList(a1, a2, a3));
        publishers.addAll(Arrays.asList(p1, p2, p3));
    }

    public List<Book> findBooksByPublisher(String publisherName) {
        List<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (b.getPublisher().getName().equalsIgnoreCase(publisherName)) {
                result.add(b);
            }
        }
        return result;
    }

    public List<Author> filterAuthorsByPublications(int minCount) {
        List<Author> result = new ArrayList<>();
        for (Author a : authors) {
            if (a.getPublicationsCount() >= minCount) {
                result.add(a);
            }
        }
        return result;
    }

    public List<Book> getAllBooks() { return books; }
}