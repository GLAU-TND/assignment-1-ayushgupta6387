package driven;

import fields.Person;
import node.MyLinkedList;
import node.Node;
import regex.RegexCheck;

import java.util.Scanner;

public class Selector {
    Scanner scanner = new Scanner(System.in);
    Person person = null;
    RegexCheck check = new RegexCheck();

    public Person addDetails() {
        System.out.print("You have chosen to add a new contact: \n" +
                "Please enter the name of the Person\n" +
                "First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name : ");
        String lastName = scanner.nextLine();
        MyLinkedList<Long> contactList = new MyLinkedList<>();
        char choice = 'y';
        long contactNumber;
        while (choice == 'y') {
            System.out.print("Contact Number: ");
            contactNumber = Long.parseLong(scanner.nextLine());
            if (check.isContactNumberCorrect(contactNumber)) {
                contactList.insert(contactNumber);
            } else {
                System.out.println("Invalid Contact Number Entered");
                continue;
            }
            System.out.print("Would you like to add another contact number? (y/n): ");
            choice = (scanner.nextLine()).charAt(0);

        }
        System.out.print("Email Address: ");
        String emailId = scanner.nextLine();
        while (true) {
            if (check.isEmailCorrect(emailId)) {
                person = new Person(firstName, lastName, emailId, contactList);
                break;
            } else {
                System.out.println("Invalid Email Address Entered");
                System.out.print("Email Address: ");
                emailId = scanner.nextLine();
            }
        }
        return person;
    }

    public void print(MyLinkedList<Person> searchedContact, int match) {
        for (int i = 0; i < match; i++) {
            Person person1 = (Person) searchedContact.getNode(i).getData();
            System.out.print("-------- * -------- * -------- * --------\n" +
                    "First Name: " + person1.getFirstName() + "\n" +
                    "Last Name: " + person1.getLastName() + "\n");
            if (person1.getContactNumber().getSize() > 1) {
                System.out.print("Contact Number(s): ");
                for (int j = 0; j < person1.getContactNumber().getSize(); j++) {

                    System.out.print(person1.getContactNumber().getNode(j).getData() + (j < person1.getContactNumber().getSize() - 1 ? ", " : ""));
                }
            } else {
                System.out.print("Contact Number: " + person1.getContactNumber().getNode(0).getData());
            }
            System.out.println("\nEmail Address: " + person1.getEmailId() + "\n" +
                    "-------- * -------- * -------- * --------");
        }
    }

    public void viewContact(MyLinkedList person) {
        System.out.println("---Here are all your contacts---");
        int size = person.getSize();
        print(person, size);
    }

    public void searchContact(MyLinkedList person) {
        MyLinkedList<Person> searchedContact = new MyLinkedList<>();
        System.out.println("You could search for a contact from their first names: ");
        String elementFor = scanner.nextLine();
        int match = 0;
        for (int i = 0; i < person.getSize(); i++) {
            Person person1 = (Person) person.getNode(i).getData();
            if (elementFor.equals(person1.getFirstName())) {
                match++;
                searchedContact.insert(person1);
            }
        }
        if (match > 0) {
            System.out.println(match + " match found!");
        } else {
            System.out.println("NO RESULTS FOUND!");
        }
        print(searchedContact, match);
    }

    public void deleteContact(MyLinkedList<Person> person) {
        int i = 1;
        System.out.println("Here are all your contacts: ");
        for (int j = 0; j < person.getSize(); j++) {
            Person person1 = (Person) person.getNode(j).getData();
            System.out.println(i++ + ". " + person1.getFirstName() + " " + person1.getLastName());
        }
        System.out.println("Press the number against the contact to delete it: ");
        int number = scanner.nextInt();
        Person person2 = (Person) person.getNode(number - 1).getData();
        System.out.println(person2.getFirstName() + "'s contact deleted from list!");
        person.delete(number - 1);
    }

    public MyLinkedList<Person> sort(MyLinkedList<Person> person) {
        for (int i = 0; i < person.getSize(); i++) {
            for (int j = 1; j < person.getSize(); j++) {
                Node person1 = person.getNode(j - 1);
                Node person2 = person.getNode(j);
                Person first = (Person) person1.getData();
                Person second = (Person) person2.getData();
                if (first.getFirstName().compareTo(second.getFirstName()) >= 1) {

                }

                return person;
            }
        }
    }
}



