public class Queue<E> {
    private ListElement<E> head;
    private int size;

    /**
     * Add an element onto the end of the queue
     * @param element the element to push onto the queue
     */
    void add(E element) {
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
     * Remove first element from queue
     * @return the data from the element that was removed
     */
    E remove() {
        E oldHead = head.getData();
        if(head.hasNext()) {
            head.getNext().setPrev(null);
            head = head.getNext();
        } else {
            head = null;
        }

        size--;

        return oldHead;

    }

    /**
     * View data in the first element of the queue
     * @return data of the first element
     */
    E peek() {
        return head.getData();
    }

    /**
     * Get size of queue
     * @return size of queue
     */
    int size() {
        return size;
    }

    /**
     * Check if queue is empty
     * @return if queue is empty
     */
    boolean isEmpty() {
        return size == 0;
    }
}
