package NUIGAssignment.Programming1;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Contact> list=new ArrayList<Contact>();
        list.add(new Contact("Brian",111));
        list.add(new Contact("Alice",112));
        list.add(new Contact("Chin",113));
        list.add(new Contact("Dodger",114));
        //create an ArrayList listIterator and display
        System.out.println(list);
        System.out.println("ArrayList prints reversed");
        ListIterator<Contact> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //reversed display
        System.out.println("ArrayList prints reversed");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list.size());
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the name of a contact in the list");
        String removal = sc.nextLine();
        int i=0;
        //Enhanced for loop
        for(Contact currentContact : list) {
            String name=iterator.next().getName();
            //if the contact given by the user exist, show the index
            if(name.equals(removal)){
                System.out.println("Contact no: " + i);
            }
            i++;
            //if user input contact doesn't exit, inform user
            if(i==list.size() && !name.equals(removal)) {
                System.out.println("The contact is out of list");
            }
        }
        //remove the contact
        while(iterator.hasNext()){
            if(iterator.next().getName().equals(removal)){
                iterator.remove();
            }

        }
        System.out.println("ArrayList deleted");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
