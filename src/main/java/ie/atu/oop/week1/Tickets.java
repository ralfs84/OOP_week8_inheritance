package ie.atu.oop.week1;

public class Tickets {
    private String eventName;
    private String holderName;
    private double basePrice;

    public Tickets(String eventName, String holderName, double basePrice) {
        this.eventName = eventName;
        this.holderName = holderName;
        this.basePrice = basePrice;
    }

    public String getEventName() {
        return eventName;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBasePrice() {
        return basePrice;
    }


   public double calculatePrice()
    {

        return basePrice;
    }

    @Override
    public String toString() {
        return

                "name: " + holderName +
                " €" + calculatePrice();
    }
}
