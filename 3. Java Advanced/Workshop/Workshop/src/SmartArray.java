import java.util.function.Consumer;

public class SmartArray {

    private static final int Initial_Capacity = 4;

    int[] smartArray;
    int size;

    public SmartArray() {
        this.smartArray = new int[Initial_Capacity];
    }

    public void add(int element) {
        if (size == smartArray.length) {
            smartArray = increaseArray();
        }
        smartArray[size] = element;
        size++;
    }

    public int get(int index) {
        isOutOfBounds(index);
        return smartArray[index];
    }

    public int remove(int index) {
        isOutOfBounds(index);
        int toBeRemove = smartArray[index];
        for (int i = index; i < size; i++) {
            smartArray[i] = smartArray[i+1];
        }
        size--;
        if (size == smartArray.length / 4) {
            smartArray = shrink();
        }
        return toBeRemove;
    }

    public boolean contains (int element) {
        for (int i = 0; i < size; i++) {
            if (element == smartArray[i]) {
                return true;
            }
        }
        return false;
    }

    public void add (int index, int element) {
        isOutOfBounds(index);
        if (size == smartArray.length) {
            smartArray = increaseArray();
        }

        for (int i = size; i > index; i--) {
            smartArray[i] = smartArray[i-1];
        }
        size++;
        smartArray[index] = element;
    }

    public void forEach (Consumer<Integer> consumer) {
        for (int i = 0; i < size; i++) {
            consumer.accept(smartArray[i]);
        }
    }

    private void isOutOfBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bound for length " + size);
        }
    }

    private int[] increaseArray() {
        int[] newArray = new int[smartArray.length * 2];
        for (int i = 0; i < smartArray.length; i++) {
            newArray[i] = smartArray[i];
        }
        return newArray;
    }

    private int[] shrink() {
        int[] newArray = new int[smartArray.length / 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = smartArray[i];
        }
        return newArray;
    }
}
