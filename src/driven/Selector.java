package driven;

import fields.Person;
import node.MyLinkedList;
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

}
