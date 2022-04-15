package NUIGAssignment.Programming1;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;

public class Student {
    private String name;
    private Long idNumber;
    //default constructor
    public Student(){
        name="";
        idNumber=0L;
    }
    //initialize constructor
    public Student(String name, long idNumber){
        this.name=name;
        this.idNumber=idNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }
}
