package entity;

public class Person {

    protected String name;
    protected String surname;
    protected int IdDocument;
    protected String civilStatus;

    public Person(String name, String surname, int idDocument, String civilStatus) {
        this.name = name;
        this.surname = surname;
        IdDocument = idDocument;
        this.civilStatus = civilStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIdDocument() {
        return IdDocument;
    }

    public void setIdDocument(int idDocument) {
        IdDocument = idDocument;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    //method
    public void changeCivilStatus(String newStatus) {
        setCivilStatus(newStatus);
    }
}
