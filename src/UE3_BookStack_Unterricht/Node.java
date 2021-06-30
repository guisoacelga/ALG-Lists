package UE3_BookStack_Unterricht;

public class Node
{
    // *** Membervariablen ***
    private final String bookTitle;
    private Node next;

    // *** Konstruktor ***

    public Node(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }

    // *** Getter- und Setter-Methoden ***

    public String getBookTitle()
    {
        return this.bookTitle;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public Node getNext()
    {
        return this.next;
    }


}
