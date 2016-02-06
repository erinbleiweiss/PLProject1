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
            theCustomer.setName("");
            theCustomer.setAddress("");
            theCustomer.setCity("");
            theCustomer.setState("");
            theCustomer.setPostalCode("");
            return theCustomer;
        } else if (customerNum == 1003) {
            theCustomer.setName("");
            theCustomer.setAddress("");
            theCustomer.setCity("");
            theCustomer.setState("");
            theCustomer.setPostalCode("");
            return theCustomer;
        } else if (customerNum == 1004) {
            theCustomer.setName("");
            theCustomer.setAddress("");
            theCustomer.setCity("");
            theCustomer.setState("");
            theCustomer.setPostalCode("");
            return theCustomer;
        } else if (customerNum == 1005) {
            theCustomer.setName("");
            theCustomer.setAddress("");
            theCustomer.setCity("");
            theCustomer.setState("");
            theCustomer.setPostalCode("");
            return theCustomer;
        }

        return null;
    }


}
