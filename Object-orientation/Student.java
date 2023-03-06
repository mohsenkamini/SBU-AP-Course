public class Student {
    private String name;
    private int sid;

    Student (String n , int id) {
        name=n;
        sid=id;
    }
    void display () {
        System.out.println("Student's name: " + name + " ID: " + sid);
    }
}