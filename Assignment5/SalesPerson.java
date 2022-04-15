package NUIGAssignment.Programming1;

public class SalesPerson extends SalesEmployee{
    public SalesPerson(){
        super();
    }
    //Subclass SalesPerson
    public SalesPerson(String firstName, String lastName, String ppsNumber) {
        super(firstName, lastName, ppsNumber);
    }
    //overload, customize the calculateCommission()
    @Override
    public void calculateCommission() {
        this.commission=(double)this.sales*0.15;
    }
}
