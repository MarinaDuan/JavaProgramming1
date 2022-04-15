package NUIGAssignment.Programming1;

public abstract class SalesEmployee {
    private String firstName;
    private String lastName;
    private static int bikeEmployeeNumber;
    private String ppsNumber;
    protected double sales;
    protected double commission;
    private static int employeeNumber;
    // Default no argument construction,since string datatype has default value:null
    public SalesEmployee(){
        firstName="";
        lastName="";
        ppsNumber="";

    }
    // Overloaded Construction
    public SalesEmployee(String firstName, String lastName, String ppsNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ppsNumber = ppsNumber;
        //use increment the static bikeEmployeeNumber in the constructor and assign the value to employeeNumber
        this.employeeNumber =++SalesEmployee.bikeEmployeeNumber;
    }
    // Returns The firstname of this person.
    public String getFirstName() {
        return firstName;
    }
    // Set The firstname of this person.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    // Returns The lastname of this person.
    public String getLastName() {
        return lastName;
    }
    // Set The lastname of this person.
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // Returns The ppsNumber of this person.
    public String getPpsNumber() {
        return ppsNumber;
    }
    // Set The ppsNumber of this person.
    public void setPpsNumber(String ppsNumber) {
        this.ppsNumber = ppsNumber;
    }

    public static int getEmployeeNumber() {
        return bikeEmployeeNumber;
    }


    @Override
    public String toString() {
        return "SalesEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bikeEmployeeNumber=" + bikeEmployeeNumber +
                ", ppsNumber='" + ppsNumber + '\'' +
                ", sales=" + sales +
                ", commission=" + commission +
                ", employeeNumber=" + employeeNumber +
                '}';
    }
    public abstract void calculateCommission();

}
