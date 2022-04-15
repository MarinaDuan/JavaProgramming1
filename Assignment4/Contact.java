package NUIGAssignment.Programming1;

public class Contact {
    // Data Members
    private String name; // The name of contact
    private long number; // The gender of this person
    // Default no argument construction
    public Contact(){
        name="";
        number=0L;
    }

    // Overloaded Construction
    public Contact(String name, long number) {
        this.name = name;
        this.number = number;
    }
    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
    //override toString
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
