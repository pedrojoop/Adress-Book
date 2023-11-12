package adressBook;

public class Contact {
    private String name;
    private String email;
    private Long number;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long number() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void showContactString() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Number: " + number);
    }


}