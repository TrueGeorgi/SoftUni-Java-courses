import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Stack {

    List<Integer> stack;

    public Stack () {
        this.stack = new ArrayList<>();
    }

    public void push (int element) {
        stack.add(element);
    }

    public int pop () {
        isEmpty();
        int element = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return element;
    }

    public int peek () {
        isEmpty();
        return stack.get(stack.size() - 1);
    }

    public void forEach (Consumer<Integer> consumer) {
        for (int i = 0; i < stack.size(); i++) {
            consumer.accept(stack.get(i));
        }
    }

    private void isEmpty () {
        if (stack.size() == 0) {
            throw new IndexOutOfBoundsException("The Stack is empty!");
        }
    }
}
