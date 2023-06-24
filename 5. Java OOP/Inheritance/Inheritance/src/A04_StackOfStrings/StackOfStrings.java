package A04_StackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {

    private List<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push (String item) {
        data.add(item);
    }

    public String pop() throws NoSuchFieldException {
        if (data.isEmpty()) {
            throw new NoSuchFieldException("Cannot push when the list is empty.");
        }
        return data.remove(data.size() -1 );
    }

    public String peek() throws NoSuchFieldException {
        if (data.isEmpty()) {
            throw new NoSuchFieldException("Cannot peek when the list is empty.");
        }
        return data.get(data.size() - 1);
    }

    public boolean isEmpty () {
        return data.size() == 0;
    }
}
