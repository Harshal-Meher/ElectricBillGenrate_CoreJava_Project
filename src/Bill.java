public class Bill {
    private Customer customer;
    private int unitsConsumed;
    private double ratePerUnit;

    public Bill(Customer customer, int unitsConsumed, double ratePerUnit) {
        this.customer = customer;
        this.unitsConsumed = unitsConsumed;
        this.ratePerUnit = ratePerUnit;
    }


    public double calculateTotal(){
        return unitsConsumed*ratePerUnit;
    }

    public void printBill(){
        System.out.println("Customer id : "+customer.getId());
        System.out.println("Customer name : "+customer.getName());
        System.out.println("Customer address : "+customer.getAddress());
        System.out.println("Customer meterNo : "+customer.getMeternumber());
        System.out.println("Customer UnitConsume : "+unitsConsumed);
        System.out.println("Customer RatePerUnit : "+ratePerUnit);
        System.out.println("Total amount : "+calculateTotal());

    }

}
