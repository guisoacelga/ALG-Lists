package UE1_TodoLinkedList_Unterricht;

public class TodoLinkedList {
    // *** Membervariablen ***
    private Node first;
    private Node last;

    // *** Get-Methoden (Set-Methoden nicht notwendig) ***

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    // *** Operationen ***

    public void appendTodoText(String todoText) {
        // Eine Methode void appendTodoText(String todoText) zum Hinzufügen einer Aufgabe
        // an die letzte Stelle der verketteten Liste.

        // Knoten erstellen
        Node newNode = new Node();
        newNode.setTodoText(todoText);

        // Fall 1: Liste ist noch leer
        if (first == null)
        {
            first = newNode;
            newNode.setNext(null);
            last = first;
        }
        // Fall 2: Liste ist nicht leer
        else
        {
            last.setNext(newNode);
            last = newNode;
        }
    }

    public void deleteLastTodoText() {
        // Eine Methode void deleteLastTodoText() zum Löschen der Aufgabe,
        // die sich an der letzten Stelle der verketteten Liste befindet.

        // Fall 1: Liste ist leer
        if (first == null)
        {
            // Ist nichts zu tun
            return;
        }
        // Fall 2: Liste besteht aus einem Knoten
        else if (first == last)
        {
            first = null;
            last = null;
        }
        // Fall 3: Liste besteht aus zumindest 2 Knoten
        else
        {
            Node currentNode = first;

            // Vorgänger finden
            while (currentNode.getNext() != last)
            {
                currentNode = currentNode.getNext();  // weiterspringen
            }

            currentNode.setNext(null);  // Referenz auf letzten Knoten aufheben
            last = currentNode;  // Last neu setzen
        }
    }

    public String getTodoTextAtIndex(int index) {
        // Eine Methode String getTodoTextAtIndex(int index) zum Holen einer Aufgabe
        // an einer bestimmten Stelle der verketteten Liste.
        // ACHTUNG: Index beginnt bei 0

        // Starten bei first
        Node currentNode = first;
        int counter = 0;

        // Weiterhüpfen
        while (counter < index)
        {
            // Liste ist schon am Ende
            if (currentNode.getNext() == null)
                return null;
            else
                currentNode = currentNode.getNext();  // weiterspringen

            counter++;
        }

        return currentNode.getTodoText();
    }
}
