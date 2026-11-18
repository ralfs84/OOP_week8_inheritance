package ie.atu.oop.week1;

public class CustomerTest
{

    public static void main(String[] args) {
        Customer first = new Customer("john","earth","1212512",123,true);

        System.out.println(first);

        Customer second = new Customer();
        second.setName("guy");
        second.setAddress("somewhere");
        second.setPhoneNumber("123456789");
        second.setCustomerNumber(412);
        second.setMailingList(false);

        System.out.println(second);
    }
}
