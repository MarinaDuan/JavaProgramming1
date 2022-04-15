package NUIGAssignment.Programming1;

public class PersonTest {
    public static void main(String[] args) {
        Person[] arr=new Person[2];
        arr[0]=new Person("Aaron",22, 'M');
        arr[1]=new Person("Brian",24,'M');
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i].toString());
        }
        arr[0].setAge(24);
        arr[1].setAge(28);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i].toString());
        }
    }
}
