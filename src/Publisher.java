public class Author {
    private String name;
    private int publicationsCount;

    public Author(String name, int publicationsCount) {
        this.name = name;
        this.publicationsCount = publicationsCount;
    }

    // геттеры
    public String getName() { return name; }
    public int getPublicationsCount() { return publicationsCount; }

    @Override
    public String toString() {
        return name + " (книг: " + publicationsCount + ")";
    }
}