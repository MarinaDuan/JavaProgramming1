package NUIGAssignment.Programming1;

class Person {
    // Data Members
    private int age; // The age of this person
    private String name; // The name of this person
    private char gender; // The gender of this person
    // Default no argument construction
    public Person() {
        this("Unassigned",0,'U');
        // invokes overloaded constructor
    }
    // Overloaded Construction
    public Person(String personName,int personAge,char personGender) {
            name = personName;
            age = personAge;
            gender = personGender;
        }
        // Returns The age of this person.
        public int getAge() { return age; }
        // Returns The gender of this person.
        public char getGender() { return gender; }
        // Returns The name of this person.
        public String getName() { return name; }
        // Sets The age of this person.
        public void setAge(int personAge) { age = personAge; }
        // Sets The gender of this person.
        public void setGender(char personGender) { gender = personGender;}
        // Sets The name of this person.
        public void setName(String personName) { name = personName; }
        @Override
        public String toString() { return getName() + " " + getAge() + " " + getGender(); }
}

