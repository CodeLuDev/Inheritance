package entity;

public final class ServiceStaff extends Employee{

    private String assignedSection;

    public ServiceStaff(String name, String surname, int idDocument, String civilStatus, int yearOfIncorporation, int officeNumber, String assignedSection) {
        super(name, surname, idDocument, civilStatus, yearOfIncorporation, officeNumber);
        this.assignedSection = assignedSection;
    }

    public String getAssignedSection() {
        return assignedSection;
    }

    public void setAssignedSection(String assignedSection) {
        this.assignedSection = assignedSection;
    }

    //method
    public void changeAssignedSection(String newSection) {
        setAssignedSection(newSection);
    }

    @Override
    public String toString() {
        return "ServiceStaff{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", IdDocument=" + IdDocument +
                ", civilStatus='" + civilStatus + '\'' +
                ", yearOfIncorporation=" + yearOfIncorporation +
                ", officeNumber=" + officeNumber +
                ", assignedSection='" + assignedSection + '\'' +
                '}';
    }
}
