package UE1_TodoLinkedList_Loesung;

public class TodoLinkedList {
    // *** Membervariablen ***
    private Node first;
    private Node last;

    // *** Get-Methoden (Set-Methoden nicht notwendig) ***

    public Node getFirst() {
        return this.first;
    }

    public Node getLast() {
        return this.last;
    }

    // *** Operationen ***

    public void appendTodoText(String todoText) {
        // New node created
        Node newNode = new Node(todoText);

        // List is still empty
        if (first == null) {
            first = newNode;
            last = newNode;
        }
        // List is not empty
        else {
            // The previous node now points to the new node
            last.setNext(newNode);
            // Last must be set again on the new node at the end
            last = newNode;
        }
    }

    public void deleteLastTodoText() {
        // Do nothing
        if (first == null)
            return;

        // Wenn first = last, dann gibt es nur ein Element
        if (first == last) {
            first = null;
            last = null;
        } else {
            // If first = last, then there is only one element
            Node prevNode = first;

            while (prevNode.getNext() != last)
                prevNode = prevNode.getNext();

            prevNode.setNext(null);
            last = prevNode;
        }
    }

    public String getTodoTextAtIndex(int index) {
        int counter = 0;    // Info: counter / index starts at 0 (not 1)
        Node currentNode = first;

        // Loop until you are at the desired position in the linked list
        // Attention: The index could also be invalid (e.g. larger than the number of elements in the list)
        while (counter != index && currentNode != null) {
            currentNode = currentNode.getNext();
            counter++;
        }

        // It could be that nothing was found. Then return zero.
        if (currentNode == null)
            return null;
        else
            return currentNode.getTodoText();
    }

    // Advanced method where you can delete at a certain point
    public void deleteTodoTextAtIndex(int index) {
        int counter = 0;
        Node currentNode = first;
        Node prevNode = null;

        // Find previous nodes of nodes at position index
        while (counter < index && currentNode != null) {
            counter++;
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }

        // Node not found
        if (currentNode == null)
            return;

        // The first node is to be deleted
        if (currentNode == first) {
            first = currentNode.getNext();
        }

        // The last node is to be deleted
        if (currentNode == last) {
            last = prevNode;
        }

        if (prevNode != null) {
            prevNode.setNext(currentNode.getNext());
        }
    }
}
