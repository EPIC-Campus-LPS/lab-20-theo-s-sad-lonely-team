public class ListElement<E> {
    private E data;
    private ListElement<E> prev;
    private ListElement<E> next;

    public ListElement(E data) {
        this.data = data;
    }

    public ListElement<E> getNext() {
        return next;
    }

    public void setNext(ListElement<E> next) {
        this.next = next;
    }

    /**
     * Check if element has a next
     * @return if the ListElement has an element after it
     */
    public boolean hasNext() {
        return next != null;
    }

    public ListElement<E> getPrev() {
        return prev;
    }

    public void setPrev(ListElement<E> prev) {
        this.prev = prev;
    }

    /**
     * Check if element has a previous
     * @return if the ListElement has an element before it
     */
    public boolean hasPrev() {
        return prev != null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    /**
     *
     * @return pointer to the last element in the linked list
     */
    public ListElement<E> traverseEnd() {
        if(hasNext()) {
            return next.traverseEnd();
        } else {
            return this;
        }
    }
}
