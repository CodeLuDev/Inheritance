package entity;

public final class Teacher extends Employee{

    private String teachingDepartment;

    public Teacher(String name, String surname, int idDocument, String civilStatus, int yearOfIncorporation, int officeNumber, String teachingDepartment) {
        super(name, surname, idDocument, civilStatus, yearOfIncorporation, officeNumber);
        this.teachingDepartment = teachingDepartment;
    }

    public String getTeachingDepartment() {
        return teachingDepartment;
    }

    public void setTeachingDepartment(String teachingDepartment) {
        this.teachingDepartment = teachingDepartment;
    }

    //method
    public void changeTeachingDepartment(String newDepartment) {
        setTeachingDepartment(newDepartment);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", IdDocument=" + IdDocument +
                ", civilStatus='" + civilStatus + '\'' +
                ", yearOfIncorporation=" + yearOfIncorporation +
                ", officeNumber=" + officeNumber +
                ", teachingDepartment='" + teachingDepartment + '\'' +
                '}';
    }
}
