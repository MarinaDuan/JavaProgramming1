package NUIGAssignment.Programming1;

import java.util.ArrayList;
import java.util.Scanner;
public class SalesTest {
    public static void main(String[] args) {
        //creat the arraylist
        ArrayList list = new ArrayList();
        //set SalesPerson details
        SalesPerson s1 = new SalesPerson("Alice", "Garcia", "1134356A");
        //set SalesAgent details
        SalesAgent s2 = new SalesAgent("Shelby", "Bowman", "1111111A");
        //add SalesPerson to the arraylist list
        list.add(s1);
        //add SalesAgent to the arraylist list
        list.add(s2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sales of p1:");
        Double sale1 = scanner.nextDouble();
        s1.sales = sale1;
        s1.calculateCommission();
        System.out.println(s1.toString());
        System.out.println("Please enter the sales of p2:");
        Double sale2 = scanner.nextDouble();
        s2.sales = sale2;
        s2.calculateCommission();
        System.out.println(s2.toString());
    }
}