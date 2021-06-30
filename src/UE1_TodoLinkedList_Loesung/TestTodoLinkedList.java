package UE1_TodoLinkedList_Loesung;

public class TestTodoLinkedList {
    public static void printLinkedList(TodoLinkedList todoLinkedList) {
        Node currentNode = todoLinkedList.getFirst();

        System.out.print("Start LinkedList: ");
        while (currentNode != null) {
            System.out.print(currentNode.getTodoText() + "; ");
            currentNode = currentNode.getNext();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        TodoLinkedList todoLinkedList = new TodoLinkedList();

        // *** Add new elements ***
        todoLinkedList.appendTodoText("Müll rausbringen");
        todoLinkedList.appendTodoText("Für ALD lernen");
        todoLinkedList.appendTodoText("Urlaub planen");
        todoLinkedList.appendTodoText("Steuerausgleich machen");
        printLinkedList(todoLinkedList);

        // *** What's on the 5? ***
        int position = 4;
        System.out.println("Auf Position " + position + " ist: " + todoLinkedList.getTodoTextAtIndex(position));

        // *** What's on the 2? ***
        position = 1;
        System.out.println("Auf Position " + position + " ist: " + todoLinkedList.getTodoTextAtIndex(position));

        // *** Delete the last item
        todoLinkedList.deleteLastTodoText();
        printLinkedList(todoLinkedList);

        // *** Delete even more
        todoLinkedList.deleteLastTodoText();
        todoLinkedList.deleteLastTodoText();
        todoLinkedList.deleteLastTodoText();
        todoLinkedList.deleteLastTodoText();
        todoLinkedList.deleteLastTodoText();
        printLinkedList(todoLinkedList);
    }

}
