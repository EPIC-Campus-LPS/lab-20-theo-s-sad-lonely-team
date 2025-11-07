public class Stack<E> {
    private ListElement<E> head;
    private int size;

    /**
     * Push an element onto the end of the stack
     * @param element the element to push onto the stack
     */
    void push(E element) {
        ListElement<E> newElem = new ListElement<>(element);
        if(head == null) {
            head = newElem;
            size++;
            return;
        }
        ListElement<E> tail = head.traverseEnd();
        tail.setNext(newElem);
        newElem.setPrev(tail);

        size++;
    }

    /**
     * Remove last element from stack
     * @return the data from the element that was popped
     */
    E pop() {
        ListElement<E> tail = head.traverseEnd();
        if(tail.hasPrev()) {
            tail.getPrev().setNext(null);
        } else {
            head = null;
        }
        tail.setPrev(null);

        size--;

        return tail.getData();

    }

    /**
     * View data in the last element of the stack
     * @return data of the last element
     */
    E peek() {
        ListElement<E> tail = head.traverseEnd();
        return tail.getData();
    }

    /**
     * Get size of stack
     * @return size of stack
     */
    int size() {
        return size;
    }

    /**
     * Check if stack is empty
     * @return if stack is empty
     */
    boolean isEmpty() {
        return size == 0;
    }
}
