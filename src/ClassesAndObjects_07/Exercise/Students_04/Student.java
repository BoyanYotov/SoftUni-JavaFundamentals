package ClassesAndObjects_07.Exercise.Students_04;

public class Student {
    private String name;
    private String surname;
    private double grade;

    public Student(String name, String surname, double grade){
        this.name = name;
        this.surname = surname;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
