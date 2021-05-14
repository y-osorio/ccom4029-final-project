public class MyStack<E> {
    private E [] stackArray;
    private static final int DEFAULT_SIZE = 52;
    private int maxSize;
    private int top;

    MyStack(int size) {
        maxSize = size;
        top = 0;
        stackArray = (E[])new Object[size];
    }
    MyStack() { this(DEFAULT_SIZE); }

    public boolean push(E it) {
        if (top >= maxSize) return false;
        stackArray[top++] = it;
        return true;
    }

    public E pop() {
        if (top == 0) return null;
        return stackArray[--top];
    }

    public E top() {
        if (top == 0) return null;
        return stackArray[top-1];
    }

    public boolean isEmpty() { return top == 0; }
}