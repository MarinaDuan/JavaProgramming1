package NUIGAssignment.Programming1;

import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args) {
        System.out.println("Welcome to the Movie System.");
        System.out.println("Please enter the needed movie amount: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Movie[] movArr=new Movie[n];
        for(int i=0;i< movArr.length;i++){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter the title of movie"+(i+1)+" :");
            String title = scanner.nextLine();
            System.out.println("Please enter the genre of movie"+(i+1)+" :");
            String genre = scanner.nextLine();
            System.out.println("Please enter the rating(1-5) of movie"+(i+1)+" :");
            int rating= scanner.nextInt();
            if(rating>=1 && rating<=5){
                Movie movie= new Movie(title,genre,rating);
                movArr[i]=movie;
            }

        }
        try{
            for (int i = 0; i < movArr.length; i++) {
                System.out.println(movArr[i]);
                System.out.print(movArr[i].playIt());
            }
        }catch(Exception NullPointerException){
            System.out.println("Reenter the rating of movies");
        }
    }
}
