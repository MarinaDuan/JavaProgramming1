package NUIGAssignment.Programming1;

import NUIGAssignment.EnterpriseJavaProgramming.Assignment1.question2.Octagon;

public class OctagonDriver {
    public static void main(String[] args){
        Octagon oct1=new Octagon();
        oct1.updateFromConsole();
        oct1.writeToConsole();
        Octagon oct2=new Octagon();
        oct2.updateFromConsole();
        oct2.writeToConsole();
        switch (oct1.compareTo(oct2)){
            case -1:
                System.out.println("Octagon 1 is smaller than oct2 in area");
                break;
            case 0:
                System.out.println("Octagon 1 is equal to oct2 in area");
                break;
            case 1:
                System.out.println("Octagon 1 is bigger than oct2 in area");
                break;
        }
    }
}
