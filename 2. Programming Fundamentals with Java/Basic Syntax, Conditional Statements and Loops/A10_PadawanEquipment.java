import java.util.Scanner;

public class A10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfMoneyHas = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        double lightsabersCount = Math.ceil(countOfStudents * 1.1);
        int beltsCount = countOfStudents - (countOfStudents / 6);
        double totalPrice = (lightsaberPrice *lightsabersCount) +
                (robePrice * countOfStudents) + (beltPrice * beltsCount);
        if (totalPrice <= amountOfMoneyHas) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            double need = totalPrice - amountOfMoneyHas;
            System.out.printf("George Lucas will need %.2flv more.", need);
        }
    }
}
