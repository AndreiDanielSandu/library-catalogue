package creation;

public class BookSearchQueryBuilder {

    private String firstName  = null;
    private String lastName   = null;
    private String title      = null;
    private Integer publishedAfter  = null;
    private Integer publishedBefore = null;

    public BookSearchQueryBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public BookSearchQueryBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public BookSearchQueryBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public BookSearchQueryBuilder publishedAfter(Integer year) {
        this.publishedAfter = year;
        return this;
    }

    public BookSearchQueryBuilder publishedBefore(Integer year) {
        this.publishedBefore = year;
        return this;
    }

    public BookSearchQuery build() {
        return new BookSearchQuery(firstName, lastName, title, publishedAfter, publishedBefore);
    }
}
