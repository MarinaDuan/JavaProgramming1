package NUIGAssignment.Programming1;
//import packages
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class University implements Serializable{
    private String name;
    private String address;
    private List<Discipline> disciplines;

    //default university constructor
    public University(){
        name="unassigned";
        address="unassigned";
        List<Discipline> disciplines;
    }
    //university constructor according to the UML
    public University(String name, String address) {
        this.name = name;
        this.address = address;
        this.disciplines=new ArrayList<Discipline>();
    }
    //name getter
    public String getName() {
        return name;
    }
    //name setter
    public void setName(String name) {
        this.name = name;
    }
    //address getter
    public String getAddress() {
        return address;
    }
    //address setter
    public void setAddress(String address) {
        this.address = address;
    }
    //discipline getter
    public List<Discipline> getDisciplinesList() {
        return disciplines;
    }
    //discipline list adder
    public void addDisciplines(String name, int numEmployees) {
        Discipline discipline = new Discipline(name, numEmployees);
        disciplines.add(discipline);
    }
    //element of discipline
    public Discipline discipline(String name, int numEmployees){
        Discipline newDiscipline = new Discipline(name, numEmployees);
        return newDiscipline;
    }
    //override toString method
    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", disciplines=" + disciplines +
                '}';
    }

    //inner class
    class Discipline implements Serializable {
        private String name;
        private int numEmployees;
        //default discipline constructor
        public Discipline() {}
        //new discipline constructor
        public Discipline(String name, int numEmployees) {
            this.name = name;
            this.numEmployees = numEmployees;

        }
        //name getter
        public String getName() {
            return name;
        }
        //numEmployee getter
        public int getNumEmployees() {
            return numEmployees;
        }

        //override toString method
        @Override
        public String toString() {
            return "Discipline{" +
                    "name='" + name + '\'' +
                    ", numEmployees=" + numEmployees +
                    '}';
        }
    }
}
