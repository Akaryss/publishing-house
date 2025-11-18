public class Publisher {   // ←←←← вот тут точно Publisher, а не Author
    private String name;

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}