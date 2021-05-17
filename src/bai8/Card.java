package bai8;

public class Card {
    private Student student;
    private String id;
    private int borrowDate;
    private int paymentDate;
    private int bookID;

    public Card(Student student, String id, int borrowDate, int paymentDate, int bookID) {
        this.student = student;
        this.id = id;
        this.borrowDate = borrowDate;
        this.paymentDate = paymentDate;
        this.bookID = bookID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(int borrowDate) {
        this.borrowDate = borrowDate;
    }

    public int getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(int paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    @Override
    public String toString() {
        return "Card{" +
                "student=" + student +
                ", id='" + id + '\'' +
                ", borrowDate=" + borrowDate +
                ", paymentDate=" + paymentDate +
                ", bookID=" + bookID +
                '}';
    }
}
