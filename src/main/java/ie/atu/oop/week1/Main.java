package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Tickets first = new Tickets("summer concert","Alice",50);
        StudentTicket second = new StudentTicket("summer concert " , "Bob " ,50 , "g00234") ;
        VIPTicket third = new VIPTicket("summer concert", "bob" , 50);

        EarlyBirdTicket fourth = new EarlyBirdTicket("summer concert", "john" , 50);
        EarlyBirdTicket fifth = new EarlyBirdTicket("summer concert", "sam" , 7);

        System.out.println(first.getEventName());
        System.out.println("standard ticket " + first);
        System.out.println("Student ticket " +second);
        System.out.println("Student ID: " + second.getStudentID());
        System.out.println("VIP ticket " + third);
        System.out.println("VIP Benefits: " + third.getBenefit());
        System.out.println("EarlyBird ticket " + fourth);
        System.out.println("EarlyBird ticket " + fifth);
    }
}