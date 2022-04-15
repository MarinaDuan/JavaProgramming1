package NUIGAssignment.Programming1;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println("Welcome to the student System.");
        System.out.println("Please enter the student number: ");
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        Student[] stuArr=new Student[n];

        for(int i=0;i< stuArr.length;i++){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter the name:");
            String name = scanner.nextLine();
            System.out.println("Please enter the number:");
            Long idNumber= scanner.nextLong();
            Student student= new Student(name,idNumber);
            stuArr[i]=student;
            System.out.println(student.toString());
        }
    }
}
