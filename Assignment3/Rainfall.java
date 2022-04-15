package NUIGAssignment.Programming1;

import java.util.Scanner;

public class Rainfall {

    public static void main(String[] args){
        double[] arr= new double[12];
        double sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter rainfall in cm for month "+(i+1)+" ");
            Scanner sc=new Scanner(System.in);
            arr[i]=Integer.parseInt(sc.next());
            sum+=arr[i];
        }
        System.out.print("Annual Average Rainfall:"+String.format("%.2f",sum/arr.length));
    }
}
