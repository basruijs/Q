import java.util.ArrayList;

public class QueueImplementation implements Queue{
    ArrayList<Integer> queue = new ArrayList<>();
    @Override
    public void add(int value) {
        queue.add(value);
    }

    @Override
    public int remove() {
        int result = queue.get(0);
        queue.remove(0);
        return result;
    }

    @Override
    public int peek() {
        return queue.get(0);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void print() {
        for (Integer integer : queue) {
            System.out.println(integer);
        }
    }

    @Override
    public void clear() {
        int size=queue.size();
        for (int i = 0; i < size; i++) {
            queue.remove(0);
        }
    }

    @Override
    public void clear(int n) {
        for (int i = 0; i < n; i++) {
            queue.remove(0);
        }
    }

    @Override
    public void printReverse() {
        for (int i = queue.size()-1; i >= 0; i--) {
            System.out.println(queue.get(i));
        }
    }

    @Override
    public void jumpTheQueue(int n, int value) {
        queue.set(n,value);
    }

    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < queue.size(); i++) {
            string.append(queue.get(i)).append(",");
        }
        return String.valueOf(string);
    }

    @Override
    public boolean equals(Queue q) {
        boolean result = true;
        Queue q1 = this;
        int size = q1.size();
        if(q.size()!=q1.size()){
            return false;
        } else {
            for (int i = 0; i <size; i++) {
                if(q.peek()!=q1.peek()){
                    result = false;
                }
                q1.add(q1.remove());
                q.add(q.remove());
            }
        }
        return result;
    }

    @Override
    public int indexOf(int value) {
        return queue.indexOf(value);
    }

    @Override
    public int lastIndexOf(int value) {
        return queue.lastIndexOf(value);
    }
}
