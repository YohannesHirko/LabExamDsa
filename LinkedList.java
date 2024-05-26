public class LinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n){
            element = e;
            next = n;
        }
        public E getElement() {return element;}
        public Node<E> getNext() {return next;}
        public void setNext(Node<E> n) {next = n;}
    }
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public LinkedList(){}
    public int size(){return size;}
    public boolean isEmpty(){return size == 0;}
    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }
    public void addFirst(E e) {
        head = new Node<>(e,head);
        if (size == 0)
            tail = head;
        size++;
    }
    //question 1
    public Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
