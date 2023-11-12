package adressBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Adress myAdress = new Adress();

        Contact contact1 = new Contact();
        contact1.setName("Chandler");
        contact1.setEmail("Chandler@gmail.com");
        contact1.setNumber(5585997234728L);

        Contact contact2 = new Contact();
        contact2.setName("Joey");
        contact2.setEmail("Joey@gmail.com");
        contact2.setNumber(5585997203231L);

        System.out.println("Welcome Pedro!");
        System.out.println("This is your Adress Book");
        System.out.println("Choose one option:");

        System.out.println("--------------------------------");

        System.out.println("1. Show Contacts");
        System.out.println("2. Add Contact");
        System.out.println("3. Remove Contact");
        System.out.println("4. Edit Contacts");
        System.out.println("5. Go out");

        int option = scanner.nextInt();

        if (option == 1) {
            contact1.showContactString();
            System.out.println("---------------------------------------");
            contact2.showContactString();
        } else if (option == 2) {
            myAdress.addContact(scanner);
        } else if (option == 3) {
            System.out.println("Choose one option for remove contacts");
            System.out.println("-----------------------------------------------");
            System.out.println("1. remove contact1: " + contact1.name());
            System.out.println("2. remove contact2: " + contact2.name());
            System.out.println("3. remove all contacts");

            int optionToRemove = scanner.nextInt();

            if (optionToRemove == 1) {
                myAdress.removeContact(contact1);
                System.out.println("Contact1: " + contact1 + " removed");
            } else if (optionToRemove == 2) {
                myAdress.removeContact(contact2);
                System.out.println("Contact2: " + contact2 + " removed");
            } else if (optionToRemove == 3) {
                myAdress.removeAllContacts();
                System.out.println("All contacts removed");
            }
        } else if (option == 4) {
            System.out.println("Choose one contact to edit");
            System.out.println("-------------------------------------------------");
            System.out.println("1. Contact1: " + contact1.name());
            System.out.println("2. Contact2: " + contact2.name());

            int optionToEdit = scanner.nextInt();

            if (optionToEdit == 1) {
                myAdress.editContact(contact1);
            } else if (optionToEdit == 2) {
                myAdress.editContact(contact2);
            }
        } else if (option == 5) {
            myAdress.closeAdress();
        }

        scanner.close();
    }
}
