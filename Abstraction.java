interface olaCustomer{
    void bookCabs();
    void findARide();
    void rentCab();
    void rateDriver();
    void scheduleCab();
    void addMoneyToWallet();
    void raiseTicket();
    void signup();
    void signin();
}

interface olaDriver{
    void acceptBooking();
    void getCustomerLocation();
    void getAvailableLocation();
    void getMyCommission();
    void raiseMoneyTransferRequest();
    void callCustomer();
    void setUpYourVehicle();
    void CustomerFeedback();
}

interface olaOwner{
    void getDriverRecord();
    void getReportByDriverID();
    void getReportByRegion();
    void getTotalRevenue();
    void getCustomerFeedback();
    void addDriver();
    void removeDriver();
    void changeDriverStatus();
}

public class Abstraction implements olaOwner,olaDriver,olaCustomer{
    public static void main(String[] args) {
        olaCustomer cust = new Abstraction();
        
        olaDriver drv = new Abstraction();

        olaOwner own = new Abstraction();
        
    }
    public void bookCabs(){

    }
    public void findARide(){

    }
    public void rentCab(){

    }
    public void rateDriver(){

    }
    public void scheduleCab(){

    }
    public void addMoneyToWallet(){

    }
    public void raiseTicket(){

    }
    public void signup(){

    }
    public void signin(){

    }
    public void acceptBooking(){

    }
    public void getCustomerLocation(){

    }
    public void getAvailableLocation(){

    }
    public void getMyCommission(){

    }
    public void raiseMoneyTransferRequest(){

    }
    public void callCustomer(){

    }
    public void setUpYourVehicle(){

    }
    public void CustomerFeedback(){

    }
    public void getDriverRecord(){

    }
    public void getReportByDriverID(){

    }
    public void getReportByRegion(){

    }
    public void getTotalRevenue(){

    }
    public void getCustomerFeedback(){

    }
    public void addDriver(){

    }
    public void removeDriver(){

    }
    public void changeDriverStatus(){

    }
}
