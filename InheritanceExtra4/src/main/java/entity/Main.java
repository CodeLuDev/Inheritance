package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //creating people
        Teacher teacher = new Teacher("Aldo","Ningo",5689741,"Single",2015,5,"Math");
        ServiceStaff serviceStaff = new ServiceStaff("Momo","Gin",45712566,"Married",2010,1,"Library");
        Student student1 = new Student("Nino","Kon",855523694,"Single","Math");
        Student student2 = new Student("Ben","Liop",144475236,"Single","Math");
        Student student3 = new Student("Clara","Zui",89612488,"Single","Math");
        Student student4 = new Student("Mao","Dertu",74441023,"Single","Math");

        //creating list of people
        List<Person> personOfUniversity = new ArrayList<>();
        personOfUniversity.add(teacher);
        personOfUniversity.add(serviceStaff);
        personOfUniversity.add(student1);
        personOfUniversity.add(student2);
        personOfUniversity.add(student3);
        personOfUniversity.add(student4);

        System.out.println("Welcome to our university, choose an option from the menu below!");

        int option;
        do {
            System.out.println("\n1. Change civil status" +
                    "\n2. Office reassignment to an employee" +
                    "\n3. Enrollment of a student in a new course" +
                    "\n4. Change of department of a professor" +
                    "\n5. Section transfer of an employee of the service staff" +
                    "\n6. Print all the information of each person in the faculty" +
                    "\n7. Exit");
            System.out.print("Enter an option: ");
            option = read.nextInt();

            int idToSearch;
            boolean idNotFound = true;
            switch (option) {
                case 1:
                    read.nextLine();

                    do {
                        System.out.print("\nEnter Id document: ");
                        idToSearch = read.nextInt();
                        System.out.print("Enter new civil status: ");
                        String newStatus = read.next();

                        for (Person person: personOfUniversity) {
                            if (person.getIdDocument() == idToSearch) {
                                person.changeCivilStatus(newStatus);
                                idNotFound = false;
                                break;
                            }
                        }
                        if (idNotFound) {
                            System.out.println("This document id is not registered in our registry.");
                        }
                    } while (idNotFound);
                    break;

                case 2:
                    read.nextLine();

                    do {
                        System.out.print("\nEnter Id document: ");
                        idToSearch = read.nextInt();
                        System.out.print("Enter new office number: ");
                        int newOffice = read.nextInt();

                        for (Person person: personOfUniversity) {
                            if (person.getIdDocument() == idToSearch && person instanceof Employee) {
                                ((Employee) person).changeOfficeNumber(newOffice);
                                idNotFound = false;
                                break;
                            }
                        }
                        if (idNotFound) {
                            System.out.println("This document id is not registered in our registry.");
                        }

                    } while (idNotFound);
                    break;

                case 3:
                    read.nextLine();

                    System.out.print("\nEnter your name: ");
                    String newName = read.nextLine();

                    System.out.print("Enter your surname: ");
                    String newSurname = read.nextLine();

                    System.out.print("Enter your id document: ");
                    int newId = read.nextInt();

                    System.out.print("Enter your civil status: ");
                    String newCivilStatus = read.next();

                    System.out.print("Enter which course you want to enter: ");
                    String newCourse = read.next();

                    Student student = new Student(newName,newSurname,newId,newCivilStatus,newCourse);
                    personOfUniversity.add(student);

                    break;

                case 4:
                    read.nextLine();

                    do {
                        System.out.print("\nEnter Id document: ");
                        idToSearch = read.nextInt();
                        System.out.print("Enter new department: ");
                        String newDepartment = read.next();

                        for (Person person: personOfUniversity) {
                            if (person.getIdDocument() == idToSearch && person instanceof Teacher) {
                                ((Teacher) person).changeTeachingDepartment(newDepartment);
                                idNotFound = false;
                                break;
                            }
                        }
                        if (idNotFound) {
                            System.out.println("This document id is not registered in our registry.");
                        }

                    } while (idNotFound);
                    break;

                case 5:
                    read.nextLine();

                    do {
                        System.out.print("\nEnter Id document: ");
                        idToSearch = read.nextInt();
                        System.out.print("Enter new section: ");
                        String newSection = read.next();

                        for (Person person: personOfUniversity) {
                            if (person.getIdDocument() == idToSearch && person instanceof ServiceStaff) {
                                ((ServiceStaff) person).changeAssignedSection(newSection);
                                idNotFound = false;
                                break;
                            }
                        }
                        if (idNotFound) {
                            System.out.println("This document id is not registered in our registry.");
                        }

                    } while (idNotFound);
                    break;

                case 6:
                    read.nextLine();

                    for (Person person: personOfUniversity) {
                        System.out.println(person.toString());
                    }
                    break;

                case 7:
                    System.out.println("\nBye!");
                    break;

                default:
                    System.out.print("\nThis option is not valid, enter a new one: ");
                    option = read.nextInt();
            }

        } while (option != 7);
    }
}
