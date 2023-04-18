import java.lang.reflect.Array;

public class ArrayCreator<T> {



    public static <T> T[] create (int length, T item) {

    }


    public static <T> T[] create (Class<T> clazz, int length, T item) {

        T[] arr = (T[]) Array.newInstance(clazz, length);

    }
}
