package org.example.example4;

public class LordOfRings {

    private String bookName;
    private String pageOfName;
    private String subjectOfTheBook;

    @AuthorAnnotation(authorName = "J.R.R Tolkien", dateOfBirth = "03/01/1890")
    private String author;

    public LordOfRings() {
    }

    public LordOfRings(String bookName, String pageOfName, String subjectOfTheBook) {
        this.bookName = bookName;
        this.pageOfName = pageOfName;
        this.subjectOfTheBook = subjectOfTheBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPageOfName() {
        return pageOfName;
    }

    public void setPageOfName(String pageOfName) {
        this.pageOfName = pageOfName;
    }

    public String getSubjectOfTheBook() {
        return subjectOfTheBook;
    }

    public void setSubjectOfTheBook(String subjectOfTheBook) {
        this.subjectOfTheBook = subjectOfTheBook;
    }
}
