package adressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adress {
    private List<Contact> contacts;

    public Adress() {
        this.contacts = new ArrayList<>();
    }

    // Public method to add a contact
    public void addContact(Scanner scanner) {
        System.out.println("Enter the name of the contact:");
        String name = scanner.next();

        System.out.println("Enter the email of the contact:");
        String email = scanner.next();

        System.out.println("Enter the phone number of the contact:");
        long phoneNumber = scanner.nextLong();

        Contact newContact = new Contact();
        newContact.setName(name);
        newContact.setEmail(email);
        newContact.setNumber(phoneNumber);

        contacts.add(newContact);

        System.out.println("Contact added successfully!");
    }

    // Public method to remove a contact
    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    // Public method to remove all contacts
    public void removeAllContacts() {
        contacts.clear();
    }

    // Public method to visualize contacts
    public void visualizeContacts() {
        for (Contact contato : contacts) {
            System.out.println(contato.toString());
        }
    }

    // Public method to edit a contact
    public void editContact(Contact contact) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the new name of the contact:");
        String newName = scanner.next();
        contact.setName(newName);

        System.out.println("Contact edited successfully!");
    }

    public void closeAdress() {
        System.out.println("Goodbye!");
    }
}
