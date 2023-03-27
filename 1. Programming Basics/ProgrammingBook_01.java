import java.util.Scanner;

public class ProgrammingBook_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricePerPage = Double.parseDouble(scanner.nextLine());
        double pricePerCover = Double.parseDouble(scanner.nextLine());
        int percentDiscountPrintPaper = Integer.parseInt(scanner.nextLine());
        double designerPrice = Double.parseDouble(scanner.nextLine());
        int percentPaidByTeam = Integer.parseInt(scanner.nextLine());

        double priceCopy = (pricePerPage * 899) + (pricePerCover * 2);
        double priceAfterDiscount = priceCopy - (priceCopy * (percentDiscountPrintPaper * 1.0 / 100));
        double priceAfterDesigner = priceAfterDiscount + designerPrice;
        double avtonomShouldPay = priceAfterDesigner - (priceAfterDesigner * (percentPaidByTeam * 1.0 / 100));



        System.out.printf("Avtonom should pay %.2f BGN.", Math.abs(avtonomShouldPay));

    }
}
