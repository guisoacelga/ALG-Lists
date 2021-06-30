package UE2_WagonLinkedList_Unterricht;

public class WagonLinkedList {
    // *** Membervariablen ***
    private Node first;
    private Node last;

    // *** Methoden ***

    public Node getFirst() {
        return this.first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    void insertWagonAtFirstPos(String wagonId) {
        // Knoten erstellen
        Node newNode = new Node();
        newNode.setWagonId(wagonId);

        // Fall 1: Liste ist leer
        if (first == null)
        {
            first = newNode;
            first.setPrev(null);  // == newNode.setPrev(null);
            last = first;
        }
        // Fall 2: Liste ist nicht leer
        else
        {
            newNode.setNext(first);
            first.setPrev(newNode);
            newNode.setPrev(null);
            first = newNode;
        }
    }

    void removeWagonFromLastPos() {
        // Fall 1: Liste ist leer
        if (first == null)
        {
            return;  // nichts machen
        }
        // Fall 2: Liste besteht aus genau einem Knoten
        else if (first == last)
        {
            first = null;
            last = null;
        }
        // Fall 3: Liste besteht aus 2 oder mehreren Knoten
        else
        {
            Node currentNode = last.getPrev();  // Zeigt auf vorletztes Element
            currentNode.setNext(null);
            last = currentNode;
        }
    }

    void printList() {
        System.out.print("* List: ");

        if (this.getFirst() == null) {
            System.out.print("<empty>");
        } else {
            Node currentNode = this.getFirst();
            while (currentNode != null) {
                System.out.print(currentNode.getWagonId() + ", ");
                currentNode = currentNode.getNext();
            }
        }

        System.out.println();
    }
}
