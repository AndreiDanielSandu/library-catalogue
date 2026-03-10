package creation.catalogues;

import creation.Book;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StubCatalogue implements LibraryCatalogue {

    private final List<Book> books = Arrays.asList(
            new Book("A Tale of Two Cities", "Charles Dickens", 1859),
            new Book("Pride and Prejudice", "Jane Austen", 1813),
            new Book("Pride and Prejudice", "Jane Austen", 1813),
            new Book("The Picture of Dorian Gray", "Oscar Wilde", 1890),
            new Book("Oliver Twist", "Charles Dickens", 1838),
            new Book("Frankenstein", "Mary Shelley", 1817),
            new Book("Brave New World", "Aldous Huxley", 1932),
            new Book("Lord of the Flies", "William Golding", 1954),
            new Book("Hamlet", "William Shakespeare", 1603),
            new Book("The Life and Opinions of Tristram Shandy, Gentleman", "Laurence Sterne", 1759)
    );

    @Override
    public List<Book> searchFor(String query) {
        return books.stream()
                .filter(b -> b.matchesAuthor(QueryParser.lastNameFrom(query)))   // QueryParser visible because same package
                .filter(b -> b.matchesAuthor(QueryParser.firstNameFrom(query)))
                .filter(b -> b.matchesTitle(QueryParser.titleFrom(query)))
                .filter(b -> b.publishedSince(QueryParser.publishedAfterFrom(query)))
                .filter(b -> b.publishedBefore(QueryParser.publishedBeforeFrom(query)))
                .collect(Collectors.toList());
    }
}