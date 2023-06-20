package A04_HotelReservation;

public enum Season {

    SPRING(2),
    SUMMER(4),
    AUTUMN(1),
    WINTER(3);

    private int priceMultiplication;

    Season(int priceMultiplication) {
        this.priceMultiplication = priceMultiplication;
    }

    public int getPriceMultiplication() {
        return priceMultiplication;
    }
}
