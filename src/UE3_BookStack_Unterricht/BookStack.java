package UE3_BookStack_Unterricht;

public class BookStack
{
    // *** Membervariablen ***
    private Node top;

    // *** Getter- und Setter-Methoden ***

    public Node getTop()
    {
        return this.top;
    }


    // *** Operationen ***

    public void push(String bookTitle)
    {
        // Neues Objekt oben auf den Stapel legen

        // Knoten erstellen
        Node newNode = new Node(bookTitle);

        // Knoten richtig einordnen
        newNode.setNext(top);
        top = newNode;
    }

    public String pop() throws StackEmptyException
    {
        // Liefern vom obersten Element UND entfernen vom Stapel

        if (top == null)
            throw new StackEmptyException();
        else
        {
            String tempString = top.getBookTitle();  // z.B. Dora
            top = top.getNext();  // z.B. auf Cäsar
            return tempString;  // "Dora" zurückgeliefert
        }
    }

    public int getCount()
    {
        // Anzahl an Knoten im Stack zurückliefern

        int counter = 0;
        Node currentNode = top;

        while (currentNode != null)
        {
            counter++;
            currentNode = currentNode.getNext();
        }

        return counter;
    }
}
