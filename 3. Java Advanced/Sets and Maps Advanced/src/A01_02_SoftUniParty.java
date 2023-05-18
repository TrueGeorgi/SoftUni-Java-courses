import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class A01_02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        String guestListInput = scanner.nextLine();

        while (!guestListInput.equals("PARTY")) {

            if (guestListInput.length() == 8) {
                if (guestListInput.charAt(0) >= 48 && guestListInput.charAt(0) <= 57) {
                    vip.add(guestListInput);
                } else {
                    regular.add(guestListInput);
                }
            }

            guestListInput = scanner.nextLine();
        }

        String guestsComing = scanner.nextLine();

        while (!guestsComing.equals("END")) {
            vip.remove(guestsComing);
            regular.remove(guestsComing);
            guestsComing = scanner.nextLine();
        }

        System.out.println(vip.size() + regular.size());

        for (String vipGuest : vip) {
            System.out.println(vipGuest);
        }

        for (String regularGuest : regular) {
            System.out.println(regularGuest);
        }
    }
}
