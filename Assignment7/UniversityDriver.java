package NUIGAssignment.Programming1;

import java.io.*;
import java.util.ArrayList;

public class UniversityDriver {
    public static void main(String args){
        ArrayList<University> university=new ArrayList<>();
        university.add(new University("NUIG","Galway"));
        university.get(0).addDisciplines("Software Engineering",21211);
        university.get(0).addDisciplines("Intro of Software Engineering",12355);
        university.get(0).addDisciplines("Programming1",214566);

        university.add(new University("UCD","Dublin"));
        university.get(1).addDisciplines("Cyber Security",45667);
        university.get(1).addDisciplines("Human Computer Interaction",76888);
        university.get(1).addDisciplines("Business Analysis",89999);

        university.add(new University("UCC","Cork"));
        university.get(2).addDisciplines("Computer Science",96785);
        university.get(2).addDisciplines("Algorithm",78888);
        university.get(2).addDisciplines("Programming2",78988);
        //display
        for(University u : university){
            System.out.println(u.toString());
            System.out.println(u.getDisciplinesList());
        }

        // Serialization
        try {

            // Saving of object in a file
            FileOutputStream fileStream = new FileOutputStream("universitiesData.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);

            // Method for serialization of object
            os.writeObject(university);
            os.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

        // Deserialization
        try {

            // Reading the object from a file
            FileInputStream file = new FileInputStream("universities.ser");
            ObjectInputStream os = new ObjectInputStream(file);

            // Method for deserialization of object
            ArrayList<University> universitiesDeserialized = (ArrayList<University>)os.readObject();
            for (University uni:universitiesDeserialized){
                System.out.println(uni.toString());
                System.out.println(uni.getDisciplinesList());
            }
            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
