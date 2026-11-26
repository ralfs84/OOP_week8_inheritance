package ie.atu.oop.week1;

public class VIPTicket extends Tickets{

    public VIPTicket(String eventName, String holderName, double basePrice) {
        super(eventName, holderName, basePrice);

    }

    @Override
    public double calculatePrice()
    {
        return getBasePrice() + 25;

    }

    public String getBenefit()
    {
        return("Priority entry and reserved seating");
    }
}
