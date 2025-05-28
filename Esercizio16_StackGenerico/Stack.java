import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> elementi = new ArrayList<>();

    public void push(T elem) {
        elementi.add(elem);
    }

    public T pop() {
        if (elementi.isEmpty()) return null;
        return elementi.remove(elementi.size() - 1);
    }

    public T peek() {
        if (elementi.isEmpty()) return null;
        return elementi.get(elementi.size() - 1);
    }

    public boolean isEmpty() {
        return elementi.isEmpty();
    }
}