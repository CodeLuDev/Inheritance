package entity;

public class Employee extends Person{

    protected int yearOfIncorporation;
    protected int officeNumber;

    public Employee(String name, String surname, int idDocument, String civilStatus, int yearOfIncorporation, int officeNumber) {
        super(name, surname, idDocument, civilStatus);
        this.yearOfIncorporation = yearOfIncorporation;
        this.officeNumber = officeNumber;
    }

    public int getYearOfIncorporation() {
        return yearOfIncorporation;
    }

    public void setYearOfIncorporation(int yearOfIncorporation) {
        this.yearOfIncorporation = yearOfIncorporation;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    //method
    public void changeOfficeNumber(int newNumOffice) {
        setOfficeNumber(newNumOffice);
    }
}
