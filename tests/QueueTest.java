import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @org.junit.jupiter.api.Test
    void add() {
        Queue<Integer> q = new Queue<>();
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(5, q.remove());
        assertEquals(4, q.remove());
        assertEquals(3, q.remove());
        assertEquals(2, q.remove());
        assertEquals(1, q.remove());
    }

    @org.junit.jupiter.api.Test
    void remove() {
        Queue<Integer> q = new Queue<>();
        q.add(5);
        assertEquals(5, q.remove());
        q.add(4);
        q.add(3);
        assertEquals(4, q.remove());
        assertEquals(3, q.remove());
    }

    @org.junit.jupiter.api.Test
    void peek() {
        Queue<Integer> q = new Queue<>();
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(5, q.peek());
        q.remove();
        assertEquals(4, q.peek());
        q.remove();
        assertEquals(3, q.peek());
        q.remove();
        assertEquals(2, q.peek());
        q.remove();
        assertEquals(1, q.peek());
        q.remove();
    }

    @org.junit.jupiter.api.Test
    void size() {
        Queue<Integer> q = new Queue<>();
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(5, q.size());
        q.remove();
        assertEquals(4, q.size());
        q.remove();
        assertEquals(3, q.size());
        q.remove();
        assertEquals(2, q.size());
        q.remove();
        assertEquals(1, q.size());
        q.remove();
        assertEquals(0, q.size());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        Queue<Integer> q = new Queue<>();
        assertTrue(q.isEmpty());
        q.add(1);
        assertFalse(q.isEmpty());
        q.remove();
        assertTrue(q.isEmpty());
    }
}