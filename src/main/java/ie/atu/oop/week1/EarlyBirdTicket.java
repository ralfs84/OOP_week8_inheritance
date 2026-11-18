package ie.atu.oop.week1;

public class EarlyBirdTicket extends Tickets{

    public EarlyBirdTicket(String eventName, String holderName, double basePrice) {
        super(eventName, holderName, basePrice);


    }

    @Override
    public double calculatePrice() {
        if (super.getBasePrice() < 10 )
        { return 0;

        }

        else
        {
            return super.getBasePrice() - 10;
        }
    }
}
