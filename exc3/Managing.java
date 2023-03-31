class Student {
    private int age = 0;
    private double tuition = 0.0;
    private double Gpa = 0.0;
    private String name = "";
    
    Student (String name,int age) {
        this.name=name;
        this.age=age;
    }
    public int getAge () {
        return this.age;
    }
    public void setAge(int age) {
        this.age=age;
    }

    public double getTuition () {
        return this.tuition;
    }
    public void setTuition(double tuition) {
        this.tuition=tuition;
    }
    
    public double getGpa () {
        return this.Gpa;
    }
    public void setGpa(double Gpa) {
        this.Gpa=Gpa;
    }
    
    public String getName () {
        return this.name;
    }
    public void setName(String name) {
        this.name=name;
    }
}

class Professor {
    private String name = "";
    private int age = 0;
    private double salary = 0.0;
    private int maxClasses = 0;
    Professor (String name,int age,int maxClasses) {
        this.name=name;
        this.maxClasses=maxClasses;
        this.age=age;
    }

    public String getName () {
        return this.name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getAge () {
        return this.age;
    }
    public void setAge(int age) {
        this.age=age;
    }

    public int getMaxClasses () {
        return this.maxClasses;
    }
    public void setMaxClasses(int maxClasses) {
        this.maxClasses=maxClasses;
    }

    public double getSalary () {
        return this.salary;
    }
    public void setSalary(double salary) {
        this.salary=salary;
    }

}



public class Managing {
    private double income=0.0;
    private int numberOfClasses =0;
    //private int profCount=0,stuCount=0;
    private Student[] students = new Student[0];
    private Professor[] professors = new Professor[0];
    
    Managing (int numberOfClasses) {
        this.numberOfClasses=numberOfClasses;
    }

    public int getNumberOfClasses () {
        return this.numberOfClasses;
    }
    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses=numberOfClasses;
    }

    public double getIncome () {
        return this.income;
    }
    public void setIncome(double income) {
        this.income=income;
    }
    public Student[] getStudents() {
        return students;
    }
    public Professor[] getProfessors() {
        return professors;
    }

    public void setStudents(Student[] students){
        this.students=students;
    }
    public void setProfessors(Professor[] professors) {
        this.professors=professors;
    }


    public void addProfessor (Professor p) {
        Professor[] newProfessors = new Professor[this.professors.length+1];
        System.arraycopy(this.professors,0,newProfessors,0,this.professors.length);
        newProfessors[newProfessors.length-1]=p;
        this.setProfessors(newProfessors);

    }

    public void addStudent (Student s) {
        Student[] newStudents = new Student[this.students.length+1];
        System.arraycopy(this.students,0,newStudents,0,this.students.length);
        newStudents[newStudents.length-1]=s;
        this.setStudents(newStudents);
        
    }
    public void calculateIncome () {
        double result=0.0;
        for (int i=0 ; i < this.students.length ; i++)
            result += this.students[i].getTuition();
        for (int i=0 ; i < this.professors.length ; i++)
            result -= this.professors[i].getSalary();
        this.income=result;
    }
    public boolean enoughProfessor () {
        int profMaxClasses = 0;
        for (int i=0 ; i < this.professors.length ; i++)
            profMaxClasses += this.professors[i].getMaxClasses();
        if (profMaxClasses >= this.numberOfClasses)
            return true;
        else
            return false;
    }
    public static void main (String[] args) {

        //Student[] students = new Student[100];
        //Professor[] professors = new Professor[100];
        Student mohsen = new Student("mohsen",22);
        mohsen.setTuition(21.2);
        System.out.println(mohsen.getTuition());
        Professor mosi = new Professor ("mosi",21,3);
        Professor mosi2 = new Professor ("mosi2",1,33);
        mosi.setSalary(100.2);
        mosi2.setSalary(200.4);
        Student mosi1 = new  Student ("mosi1",21);
        Student mosi3 = new Student ("mosi3",1);
        mosi1.setTuition(300.5);
        mosi3.setTuition(300.5);
        Managing sbu = new Managing (302);
        sbu.setStudents(students);
        sbu.setProfessors(professors);
        for (int i=0 ; i < 10 ; i++)
            sbu.addProfessor(mosi);
        sbu.addProfessor(mosi2);
        sbu.addStudent(mosi1);
        sbu.addStudent(mosi3);
        for (int i=0 ; i < sbu.getProfessors().length  ; i++)
            System.out.println(sbu.professors[i].getAge());
        System.out.println(sbu.students[1].getName());
        sbu.calculateIncome();
        System.out.println(sbu.getIncome());
        System.out.println(sbu.enoughProfessor());
    }
    
}
