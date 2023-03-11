
public class Course {
    private String name;
    private String[] students;
    private int numberOfStudents;

    Course (String name) {
        this.name=name;
        numberOfStudents=0;
        students = new String[50];
    }
    public String getName () {
        return name;
    }

    public int getNumberOfStudents () {
        return numberOfStudents;
    }
    public String[] getStudents () {
        return students;
    }

    public void addStudents (String student) {
        students[numberOfStudents++]= student;
    }
    public static void main (String[] args) {
        Course ap = new Course ("AP");
        ap.addStudents("Mohsen");
        ap.addStudents("Mohsen1");
        ap.addStudents("Mohsen2");
        String [] list = ap.getStudents();

        for (int i =0 ; i < ap.numberOfStudents ; i++)
            System.out.println(list[i]);
    }
}
