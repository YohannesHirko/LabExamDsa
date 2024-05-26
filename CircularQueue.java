public class CircularQueue<E> {
        private E[] data;
        private int f;
        private int sz;
        private int r;

        public CircularQueue() {
            this(100);
        }
        private void calculateLast(){
            r = (f + sz) % data.length;
            System.out.println("rear" + r);
        }

        public CircularQueue(int capacity) {
            this.f = 0;
            this.sz = 0;
            this.data = (E[]) new Object[capacity];
        }

        public int size() {
            return this.sz;
        }

        public boolean isEmpty() {
            return this.sz == 0;
        }
        private E front() {return data[f];}
        public E rear() {return data[r];}

        public void enqueue(E e) {
            if (this.sz == this.data.length) {
                throw new IllegalStateException("Queue is Full");
            } else {
                int avail = (this.f + this.sz) % this.data.length;
                this.data[avail] = e;
                ++this.sz;
                System.out.println(this.data[avail]);
                calculateLast();
            }
        }

        public E first() {
            return this.isEmpty() ? null : this.data[this.f];
        }

        public E dequeue() {
            if (this.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            } else {
                E first = this.data[this.f];
                this.data[this.f] = null;
                this.f = (this.f + 1) % this.data.length;
                --this.sz;
                calculateLast();
                return first;
            }
        }

        public void rotate() {
            E currentFront = this.data[this.f];
            this.f = (this.f + 1) % this.data.length;
            int backSlot = (this.f + this.sz) % this.data.length;
            this.data[backSlot] = currentFront;
            System.out.printf("%s", this.first());
            System.out.println(this.data[backSlot]);
        }
}

