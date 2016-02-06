package bleiweiss.customer;

public class CustomerDB {

    public static Customer getCustomer(int customerNum) {

        Customer theCustomer = new Customer();

        if (customerNum == 1001) {
            theCustomer.setName("Barbara White");
            theCustomer.setAddress("3400 Richmond Parkway #3423");
            theCustomer.setCity("Bristol");
            theCustomer.setState("CT");
            theCustomer.setPostalCode("06010");
            return theCustomer;
        } else if (customerNum == 1002) {
            theCustomer.setName("Karl Vang");
            theCustomer.setAddress("327 Franklin Street");
            theCustomer.setCity("Edina");
            theCustomer.setState("MN");
            theCustomer.setPostalCode("55435");
            return theCustomer;
        } else if (customerNum == 1003) {
            theCustomer.setName("Ronda Chavan");
            theCustomer.setAddress("518 Commanche Dr.");
            theCustomer.setCity("Greensboro");
            theCustomer.setState("NC");
            theCustomer.setPostalCode("27410");
            return theCustomer;
        } else if (customerNum == 1004) {
            theCustomer.setName("Craig Pelton");
            theCustomer.setAddress("1019 Dean Dr.");
            theCustomer.setCity("Greendale");
            theCustomer.setState("CO");
            theCustomer.setPostalCode("80123");
            return theCustomer;
        } else if (customerNum == 1005) {
            theCustomer.setName("Arthur Dent");
            theCustomer.setAddress("42 Whale Blvd.");
            theCustomer.setCity("Paris");
            theCustomer.setState("TX");
            theCustomer.setPostalCode("75460");
            return theCustomer;
        }

        return null;
    }


}
