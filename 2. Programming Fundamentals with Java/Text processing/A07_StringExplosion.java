import java.util.Scanner;

public class A07_StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      StringBuilder sb = new StringBuilder(scanner.nextLine());
      int bomb = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (bomb > 0 && sb.charAt(i) != '>') {
                sb.deleteCharAt(i);
                bomb--;
                i--;
            } else if (sb.charAt(i) == '>') {
                bomb += Integer.parseInt(String.valueOf(sb.charAt(i+1)));
            }
        }
        System.out.println(sb);
    }
}
