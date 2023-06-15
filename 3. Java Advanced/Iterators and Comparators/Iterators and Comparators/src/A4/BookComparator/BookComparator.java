package A4.BookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book one, Book two) {
        int result = one.getTitle().compareTo(two.getTitle());

        if (result == 0) {
            result = Integer.compare(one.getYear(), two.getYear());
        }

        return result;
    }
}
