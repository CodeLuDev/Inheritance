package entity;

public final class Student extends Person{

    private String course;

    public Student(String name, String surname, int idDocument, String civilStatus, String course) {
        super(name, surname, idDocument, civilStatus);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", IdDocument=" + IdDocument +
                ", civilStatus='" + civilStatus + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
