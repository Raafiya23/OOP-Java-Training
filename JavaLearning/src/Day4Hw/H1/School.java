package Day4Hw.H1;

class Person{
    String name;
    int dob;

    void personDisplay(){
        System.out.println("Name: "+name);
        System.out.println("Date of Birth: "+dob);
    }
}

class Teacher extends Person{
    int salary;
    String subject;

    void teacherDisplay(){
        System.out.println("---- Teacher Details ----");
        personDisplay();
        System.out.println("Salary: "+salary);
        System.out.println("Subject: "+subject);
    }

}

class Student extends Person{
    int stuId;

    void displayStu(){
        personDisplay();
        System.out.println("Student ID: "+stuId);
    }
}

class CollegeStudent extends Student{
    String clgName;
    int year;

    void displayClgStu(){
        displayStu();
        System.out.println("College name: "+clgName);
        System.out.println("Year: "+year);
    }
}

public class School {
    public static void main(String[] args){
        Person person = new Person();
        person.name = "Raafiya";
        person.dob = 23-03-2006;

        Teacher teacher = new Teacher();
        teacher.name = "Conrad";
        teacher.dob = 06-01-1985;
        teacher.subject = "JAVA";
        teacher.salary = 30000;

        Student student = new Student();
        student.name = "Raafiya";
        student.dob = 23-03-2006;
        student.stuId = 41;

        CollegeStudent clgstu = new CollegeStudent();
        clgstu.name = "Raafiya";
        clgstu.dob = 23-03-2006;
        clgstu.stuId = 41;
        clgstu.clgName = "MSAJCE";
        clgstu.year = 3;

        System.out.println("---- Person ----");
        person.personDisplay();

        System.out.println("\n ---- Teacher ----");
        teacher.teacherDisplay();

        System.out.println("\n ---- Student ----");
        student.displayStu();

        System.out.println("\n ---- College Student ----");
        clgstu.displayClgStu();
    }
}
