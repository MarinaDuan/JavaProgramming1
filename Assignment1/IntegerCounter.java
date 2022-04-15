package NUIGAssignment.Programming1;

import java.util.Scanner;

public class IntegerCounter {
    static int countDigit(int n) {
        int count = 0;
        while (n!=0) {
            n = n / 10;
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("This program counts the number of digits in an integer enter by the user.");
        System.out.println("Enter -1 to exit");
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Please enter the number:");
            int n = scanner.nextInt();
            if(n==-1){
                System.out.println("Program Terminated...");
                System.exit(-1);
            }
            System.out.println("Number of digits in " + n + " is: " + countDigit(n));
        }
    }
}
