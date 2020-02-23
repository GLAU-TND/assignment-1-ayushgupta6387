package main;

import fields.Person;
import node.MyLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = false;
        MyLinkedList<Person> linkedList = new MyLinkedList<>();
        while (!loop) {
            System.out.println("Welcome to Ayush's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            int choice = scanner.nextInt();
        }
    }
