import java.util.Scanner;
public class Student {
    private String name;
    private int sid;

    //Student (String n , int id) {
    //    name=n;
    //    sid=id;
    //}
    Student (String name , int sid) {
        this.name=name;
        this.sid=sid;
    }
    void display () {
        System.out.println("Student's name: " + name + " ID: " + sid);
    }
    public static void main (String[] args) {
        TestStudent.main();
    }
}

class TestStudent {
    public static void main () 
    {
        Scanner input = new Scanner (System.in);

        int sNumber = input.nextInt();
        
        Student mohsen = new Student("mohsen",98);
        mohsen.display();

        Student [] sList = new Student[sNumber];

        for (int i=0 ; i < sList.length ; i++)
        {
            String sName = input.next();
            int sID = input.nextInt();
            sList[i]= new Student(sName,sID);
        }
        for (int i=0 ; i < sList.length ; i++)
            sList[i].display();
    }
}