import java.util.Scanner;

public class A10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
            int originalPokePower = pokePower;
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int victims = 0;
        while (pokePower >= distance) {
            victims++;
            pokePower -= distance;
            if (pokePower == originalPokePower / 2) {
                if (exhaustionFactor != 0) {
                    pokePower /= exhaustionFactor;
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(victims);
    }
}
