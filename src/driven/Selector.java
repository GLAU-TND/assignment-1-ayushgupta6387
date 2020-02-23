package driven;

import fields.Person;
import node.MyLinkedList;

import java.util.Scanner;

public class Selector {
    Scanner scanner = new Scanner(System.in);
    Person person = null;

    public Person addDetails() {
        System.out.print("You have chosen to add a new contact: \n" +
                "Please enter the name of the Person\n" +
                "First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name : ");
        String lastName = scanner.nextLine();
        MyLinkedList<Long> contactList = new MyLinkedList<>();
        char choice = 'y';
        return person;
    }
}
