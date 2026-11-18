package ie.atu.oop.week1;

public class StudentTicket extends Tickets{
    private String studentID;

    public StudentTicket(String eventName, String holderName, double basePrice, String studentID) {
        super(eventName, holderName, basePrice);
        this.studentID = studentID;


    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public double calculatePrice()
    {

        return getBasePrice() * 0.8;
    }

}
