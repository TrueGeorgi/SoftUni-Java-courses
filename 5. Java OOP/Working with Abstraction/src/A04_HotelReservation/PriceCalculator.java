package A04_HotelReservation;

public class PriceCalculator {

    public double totalHolidayPrice (double pricePerDay, int numberOfDays, Season season, Discount discount) {
       return numberOfDays * pricePerDay * season.getPriceMultiplication() * discount.getDiscount();
    }
}
