public class ExamStack<E> {
    public static final int CAPACITY = 1000;
    private E[] data;
    private int t;

    public ExamStack() {
        this(1000);
    }

    public ExamStack(int capacity) {
        this.t = -1;
        this.data = (E[]) new Object[capacity];
    }

    public int size() {
        return this.t + 1;
    }

    public boolean isEmpty() {
        return this.t == -1;
    }

    public void push(E e) throws IllegalStateException {
        if (this.size() == this.data.length) {
            throw new IllegalStateException("Stack is full");
        } else {
            this.data[++this.t] = e;
        }
    }

    public E top() {
        return this.isEmpty() ? null : this.data[this.t];
    }

    public E pop() {
        if (this.isEmpty()) {
            return null;
        } else {
            E answer = this.data[this.t];
            this.data[this.t] = null;
            --this.t;
            return answer;
        }
    }
}
