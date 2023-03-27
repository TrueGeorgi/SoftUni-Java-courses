import java.util.Scanner;

public class Clock_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = 0;
        int min = 0;
        for (int i = 0; i <= 23; i++) {
            h = i;
            for (int j = 0; j < 60; j++) {
                min = j;
                System.out.printf("%d:%d%n",h,min);
            }
        }
    }
}
