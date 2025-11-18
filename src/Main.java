
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookRepository repo = new BookRepository();
        repo.addSampleData();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Система учёта книг ===");
            System.out.println("1. Все книги (полный список)");
            System.out.println("2. Поиск книг по издательству");
            System.out.println("3. Авторы с количеством книг ≥ N");
            System.out.println("0. Выход");
            System.out.print("→ ");

            int choice = sc.nextInt();
            sc.nextLine(); // чистим буфер

            if (choice == 0) break;

            switch (choice) {
                case 1 -> {
                    repo.getAllBooks().forEach(System.out::println);
                }
                case 2 -> {
                    System.out.print("Введите название издательства: ");
                    String pub = sc.nextLine();
                    repo.findBooksByPublisher(pub).forEach(System.out::println);
                }
                case 3 -> {
                    System.out.print("Минимальное количество публикаций: ");
                    int n = sc.nextInt();
                    repo.filterAuthorsByPublications(n).forEach(System.out::println);
                }
            }
        }
    }
}