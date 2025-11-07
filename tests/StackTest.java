import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @org.junit.jupiter.api.Test
    void push() {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        assertEquals(5, s.peek());
        s.push(4);
        assertEquals(4, s.peek());
        s.push(3);
        assertEquals(3, s.peek());
    }

    @org.junit.jupiter.api.Test
    void pop() {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(5);
        assertEquals(5, s.pop());
        assertEquals(4, s.pop());
    }

    @org.junit.jupiter.api.Test
    void peek() {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(5);
        assertEquals(5, s.peek());
        s.pop();
        assertEquals(4, s.peek());
    }

    @org.junit.jupiter.api.Test
    void size() {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(5);
        assertEquals(2, s.size());
        s.pop();
        assertEquals(1, s.size());
        s.pop();
        assertEquals(0, s.size());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        assertFalse(s.isEmpty());
        s.pop();
        assertTrue(s.isEmpty());
    }
}