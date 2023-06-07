package TaskOne;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Jar <T> {
    ArrayDeque<T> stack;

    public Jar() {
        stack = new ArrayDeque<>();
    }

    public void add (T element) {
        stack.push(element);
    }

    public T remove () {
       return stack.pop();
    }
}
