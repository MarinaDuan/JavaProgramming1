package NUIGAssignment.Programming1;

public class SalesAgent extends SalesEmployee{
    public SalesAgent() {
        super();
    }
    // subclass SalesAgent
    public SalesAgent(String firstName, String lastName, String ppsNumber) {
       super(firstName, lastName, ppsNumber);
    }
    //overload, customize the calculateCommission()
    @Override
    public void calculateCommission() {
        this.commission=(double)this.sales*0.10;
    }
}
