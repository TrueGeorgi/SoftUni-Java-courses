package A03_RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {
    Random random = new Random();

    public T getAndRemoveRandomElement() {
        int randomInt = random.nextInt(size());
        return remove(randomInt);
    }
}
